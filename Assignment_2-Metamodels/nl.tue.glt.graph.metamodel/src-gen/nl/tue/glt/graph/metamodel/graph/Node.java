/**
 */
package nl.tue.glt.graph.metamodel.graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.graph.metamodel.graph.Node#getLabel <em>Label</em>}</li>
 *   <li>{@link nl.tue.glt.graph.metamodel.graph.Node#getShape <em>Shape</em>}</li>
 *   <li>{@link nl.tue.glt.graph.metamodel.graph.Node#getOutEdges <em>Out Edges</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.graph.metamodel.graph.GraphPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see nl.tue.glt.graph.metamodel.graph.GraphPackage#getNode_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link nl.tue.glt.graph.metamodel.graph.Node#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.tue.glt.graph.metamodel.graph.Shape}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see nl.tue.glt.graph.metamodel.graph.Shape
	 * @see #setShape(Shape)
	 * @see nl.tue.glt.graph.metamodel.graph.GraphPackage#getNode_Shape()
	 * @model required="true"
	 * @generated
	 */
	Shape getShape();

	/**
	 * Sets the value of the '{@link nl.tue.glt.graph.metamodel.graph.Node#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see nl.tue.glt.graph.metamodel.graph.Shape
	 * @see #getShape()
	 * @generated
	 */
	void setShape(Shape value);

	/**
	 * Returns the value of the '<em><b>Out Edges</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.glt.graph.metamodel.graph.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Edges</em>' containment reference list.
	 * @see nl.tue.glt.graph.metamodel.graph.GraphPackage#getNode_OutEdges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getOutEdges();

} // Node
