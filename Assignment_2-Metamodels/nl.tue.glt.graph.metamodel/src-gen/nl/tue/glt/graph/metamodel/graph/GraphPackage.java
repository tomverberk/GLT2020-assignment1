/**
 */
package nl.tue.glt.graph.metamodel.graph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nl.tue.glt.graph.metamodel.graph.GraphFactory
 * @model kind="package"
 * @generated
 */
public interface GraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://glt.tue.nl/graph";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphPackage eINSTANCE = nl.tue.glt.graph.metamodel.graph.impl.GraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link nl.tue.glt.graph.metamodel.graph.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.graph.metamodel.graph.impl.GraphImpl
	 * @see nl.tue.glt.graph.metamodel.graph.impl.GraphPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NODES = 1;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.glt.graph.metamodel.graph.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.graph.metamodel.graph.impl.NodeImpl
	 * @see nl.tue.glt.graph.metamodel.graph.impl.GraphPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SHAPE = 1;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUT_EDGES = 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.glt.graph.metamodel.graph.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.graph.metamodel.graph.impl.EdgeImpl
	 * @see nl.tue.glt.graph.metamodel.graph.impl.GraphPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__STYLE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.glt.graph.metamodel.graph.Shape <em>Shape</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.graph.metamodel.graph.Shape
	 * @see nl.tue.glt.graph.metamodel.graph.impl.GraphPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 3;

	/**
	 * The meta object id for the '{@link nl.tue.glt.graph.metamodel.graph.Style <em>Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.graph.metamodel.graph.Style
	 * @see nl.tue.glt.graph.metamodel.graph.impl.GraphPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 4;

	/**
	 * Returns the meta object for class '{@link nl.tue.glt.graph.metamodel.graph.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see nl.tue.glt.graph.metamodel.graph.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.graph.metamodel.graph.Graph#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nl.tue.glt.graph.metamodel.graph.Graph#getName()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.glt.graph.metamodel.graph.Graph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see nl.tue.glt.graph.metamodel.graph.Graph#getNodes()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Nodes();

	/**
	 * Returns the meta object for class '{@link nl.tue.glt.graph.metamodel.graph.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see nl.tue.glt.graph.metamodel.graph.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.graph.metamodel.graph.Node#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see nl.tue.glt.graph.metamodel.graph.Node#getLabel()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Label();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.graph.metamodel.graph.Node#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see nl.tue.glt.graph.metamodel.graph.Node#getShape()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Shape();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.glt.graph.metamodel.graph.Node#getOutEdges <em>Out Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Edges</em>'.
	 * @see nl.tue.glt.graph.metamodel.graph.Node#getOutEdges()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_OutEdges();

	/**
	 * Returns the meta object for class '{@link nl.tue.glt.graph.metamodel.graph.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see nl.tue.glt.graph.metamodel.graph.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.graph.metamodel.graph.Edge#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see nl.tue.glt.graph.metamodel.graph.Edge#getStyle()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Style();

	/**
	 * Returns the meta object for the reference '{@link nl.tue.glt.graph.metamodel.graph.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see nl.tue.glt.graph.metamodel.graph.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for enum '{@link nl.tue.glt.graph.metamodel.graph.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shape</em>'.
	 * @see nl.tue.glt.graph.metamodel.graph.Shape
	 * @generated
	 */
	EEnum getShape();

	/**
	 * Returns the meta object for enum '{@link nl.tue.glt.graph.metamodel.graph.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Style</em>'.
	 * @see nl.tue.glt.graph.metamodel.graph.Style
	 * @generated
	 */
	EEnum getStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphFactory getGraphFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link nl.tue.glt.graph.metamodel.graph.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.graph.metamodel.graph.impl.GraphImpl
		 * @see nl.tue.glt.graph.metamodel.graph.impl.GraphPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__NAME = eINSTANCE.getGraph_Name();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__NODES = eINSTANCE.getGraph_Nodes();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.graph.metamodel.graph.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.graph.metamodel.graph.impl.NodeImpl
		 * @see nl.tue.glt.graph.metamodel.graph.impl.GraphPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__LABEL = eINSTANCE.getNode_Label();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__SHAPE = eINSTANCE.getNode_Shape();

		/**
		 * The meta object literal for the '<em><b>Out Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUT_EDGES = eINSTANCE.getNode_OutEdges();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.graph.metamodel.graph.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.graph.metamodel.graph.impl.EdgeImpl
		 * @see nl.tue.glt.graph.metamodel.graph.impl.GraphPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__STYLE = eINSTANCE.getEdge_Style();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.graph.metamodel.graph.Shape <em>Shape</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.graph.metamodel.graph.Shape
		 * @see nl.tue.glt.graph.metamodel.graph.impl.GraphPackageImpl#getShape()
		 * @generated
		 */
		EEnum SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.graph.metamodel.graph.Style <em>Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.graph.metamodel.graph.Style
		 * @see nl.tue.glt.graph.metamodel.graph.impl.GraphPackageImpl#getStyle()
		 * @generated
		 */
		EEnum STYLE = eINSTANCE.getStyle();

	}

} //GraphPackage
