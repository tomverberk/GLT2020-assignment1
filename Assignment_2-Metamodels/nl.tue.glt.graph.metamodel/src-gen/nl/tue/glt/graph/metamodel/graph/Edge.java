/**
 */
package nl.tue.glt.graph.metamodel.graph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.graph.metamodel.graph.Edge#getStyle <em>Style</em>}</li>
 *   <li>{@link nl.tue.glt.graph.metamodel.graph.Edge#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.graph.metamodel.graph.GraphPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.tue.glt.graph.metamodel.graph.Style}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see nl.tue.glt.graph.metamodel.graph.Style
	 * @see #setStyle(Style)
	 * @see nl.tue.glt.graph.metamodel.graph.GraphPackage#getEdge_Style()
	 * @model required="true"
	 * @generated
	 */
	Style getStyle();

	/**
	 * Sets the value of the '{@link nl.tue.glt.graph.metamodel.graph.Edge#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see nl.tue.glt.graph.metamodel.graph.Style
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(Style value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see nl.tue.glt.graph.metamodel.graph.GraphPackage#getEdge_Target()
	 * @model required="true"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link nl.tue.glt.graph.metamodel.graph.Edge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

} // Edge
