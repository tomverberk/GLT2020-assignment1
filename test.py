import time

class Calculator:
    ports = {}
    states = {}

    def __init__(self, ports, initial_states, state_machines):
        for port in ports:
            ports[port] = port
        cnt = 0
        while cnt < len(initial_states):
           self.states[state_machines[cnt]] = initial_states[cnt]
           cnt += 1

    def Addition(self):
        in_var = self.ports["in"]
        a = in_var[0]
        b = in_var[1]
        self.states["Addition"] = "S"
        sum = a + b
        self.ports["out"] = sum

    def Subtraction(self):
        in_var = self.ports["in"]
        c = in_var[0]
        d = in_var[1]
        self.states["Subtraction"] = "S"
        difference = c - d
        self.ports["out"] = difference

class User:
    ports = {}
    states = {}

    def __init__(self, ports, initial_states, state_machines):
        for port in ports:
            ports[port] = port
        cnt = 0
        while cnt < len(initial_states):
            self.states[state_machines[cnt]] = initial_states[cnt]
            cnt += 1

    def Add(self, a, b):
        if self.states["Add"] == "Start":
            self.states["Add"] = "Wait"
            out_var = [a, b]
            self.ports["out"] = out_var
            r = self.ports["in"]

        elif self.states["Add"] == "Wait":
            time.sleep(1.5)
            self.states["Add"] = "Start"

    def Subtract(self, c, d):
        if self.states["Subtract"] == "Start1":
            out_var = [c, d]
            self.ports["out"] = out_var
            r = self.ports["in"]
            time.sleep(1.6)
            self.states["Subtract"] == "Start1"

def makeModel():
    ports = ["in", "out"]
    initial_states = ["S", "T"]
    state_machines = ["Addition", "Subtraction"]
    c = Calculator(ports, initial_states, state_machines)

    ports = ["in", "out"]
    initial_states = ["Start", "Start1"]
    state_machines = ["Add", "Subtract"]
    u = Calculator(ports, initial_states, state_machines)

class c0:
    def __init__(self):
        return

    def sync(self, c, u):
        c.states["in"] = u.states["out"]


class c1:
    def __init__(self):
        return

    def sync(self, u, c):
        u.states["in"] = c.states["out"]

