/**
 */
package nl.tue.glt.graph.metamodel.graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.graph.metamodel.graph.Graph#getName <em>Name</em>}</li>
 *   <li>{@link nl.tue.glt.graph.metamodel.graph.Graph#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.graph.metamodel.graph.GraphPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nl.tue.glt.graph.metamodel.graph.GraphPackage#getGraph_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nl.tue.glt.graph.metamodel.graph.Graph#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.glt.graph.metamodel.graph.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see nl.tue.glt.graph.metamodel.graph.GraphPackage#getGraph_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

} // Graph
