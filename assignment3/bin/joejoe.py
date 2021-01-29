# This file is automatically generated from a slco file
# Necessary inputs:
import time
import queue


# Defining classes
# Class
class Calculator:
	ports = {}
	states = {}
	send_input = False

	def __init__(self, portsInput, initial_states, state_machines):
		for port in portsInput:
			self.ports[port] = None
		cnt = 0
		while cnt < len(initial_states):
			self.states[state_machines[cnt]] = initial_states[cnt]
			cnt += 1
			self.send_input = False

	def Main(self):
		print("Start transition system: Main...")
		if self.states['Main'] == 'S':
			in_var = self.ports["in"]
			print("Receiving from port: in")
			a = in_var[0]
			print(a)
			b = in_var[1]
			print(b)
			self.send_input = False
			if not self.send_input:
				out_var = [a + b]
				self.ports["out"] = out_var
				print("Sending to port: out")
				self.send_input = True
			self.states["Main"] = "S"


# Class
class User:
	ports = {}
	states = {}
	send_input = False

	def __init__(self, portsInput, initial_states, state_machines):
		for port in portsInput:
			self.ports[port] = None
		cnt = 0
		while cnt < len(initial_states):
			self.states[state_machines[cnt]] = initial_states[cnt]
			cnt += 1
			self.send_input = False

	def Loop(self):
		print("Start transition system: Loop...")
		if self.states['Loop'] == 'Start':
			if not self.send_input:
				out_var = [1, 2]
				self.ports["outU"] = out_var
				print("Sending to port: outU")
				self.send_input = True
			in_var = self.ports["inU"]
			if in_var is None:
				print("No input yet received, still in same state")
				return
			print("Receiving from port: inU")
			r = in_var[0]
			print(r)
			self.ports["inU"] = None
			self.send_input = False
			self.states["Loop"] = "Wait"
		elif self.states['Loop'] == 'Wait':
			time.sleep(1.5)
			print("Waited 1.5 seconds")
			self.states["Loop"] = "Start"


class Channelc0:
	def __init__(self):
		self.q = queue.Queue(maxsize=0)

	def addQueue(self, u):
		self.q.put(u.ports["outU"])

	# getQueue function between ports...
	def getQueue(self, c):
		c.ports["in"] = self.q.get()

	# sync between queues
	def sync(self, u, c):
		self.addQueue(u)
		self.getQueue(c)
		print("Sync between source: u and target: c...")

class Channelc1:
	def __init__(self):
		self.q = queue.Queue(maxsize=0)

	def addQueue(self, c):
		self.q.put(c.ports["out"])

	# getQueue function between ports...
	def getQueue(self, u):
		u.ports["inU"] = self.q.get()

	# sync between queues
	def sync(self, c, u):
		self.addQueue(c)
		self.getQueue(u)
		print("Sync between source: c and target: u...")


# Initialize the classes
def makeModel():
	portsCalculator = ["in", "out"]
	state_machinesCalculator = ["Main"]
	initial_statesCalculator = ["S"]

	portsUser = ["inU", "outU"]
	state_machinesUser = ["Loop"]
	initial_statesUser = ["Start"]

	c = Calculator(portsCalculator, initial_statesCalculator, state_machinesCalculator)
	u = User(portsUser, initial_statesUser, state_machinesUser)
	c0 = Channelc0()
	c1 = Channelc1()
	# Below you can add the commands you would like to execute on the channels


	# Can be used for the simple calculator example:
	u.Loop()
	c0.sync(u,c)
	c.Main()
	c1.sync(c, u)
	u.Loop()
	u.Loop()
makeModel()