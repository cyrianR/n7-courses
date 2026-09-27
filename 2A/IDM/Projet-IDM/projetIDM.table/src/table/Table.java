/**
 */
package table;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link table.Table#getName <em>Name</em>}</li>
 *   <li>{@link table.Table#getColumnelement <em>Columnelement</em>}</li>
 *   <li>{@link table.Table#getColumnid <em>Columnid</em>}</li>
 *   <li>{@link table.Table#getFichierSource <em>Fichier Source</em>}</li>
 * </ul>
 *
 * @see table.TablePackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see table.TablePackage#getTable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link table.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Columnelement</b></em>' containment reference list.
	 * The list contents are of type {@link table.Column}.
	 * It is bidirectional and its opposite is '{@link table.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnelement</em>' containment reference list.
	 * @see table.TablePackage#getTable_Columnelement()
	 * @see table.Column#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	EList<Column> getColumnelement();

	/**
	 * Returns the value of the '<em><b>Columnid</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link table.ColumnID#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnid</em>' containment reference.
	 * @see #setColumnid(ColumnID)
	 * @see table.TablePackage#getTable_Columnid()
	 * @see table.ColumnID#getTable
	 * @model opposite="table" containment="true" required="true"
	 * @generated
	 */
	ColumnID getColumnid();

	/**
	 * Sets the value of the '{@link table.Table#getColumnid <em>Columnid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnid</em>' containment reference.
	 * @see #getColumnid()
	 * @generated
	 */
	void setColumnid(ColumnID value);

	/**
	 * Returns the value of the '<em><b>Fichier Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fichier Source</em>' attribute.
	 * @see #setFichierSource(String)
	 * @see table.TablePackage#getTable_FichierSource()
	 * @model required="true"
	 * @generated
	 */
	String getFichierSource();

	/**
	 * Sets the value of the '{@link table.Table#getFichierSource <em>Fichier Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fichier Source</em>' attribute.
	 * @see #getFichierSource()
	 * @generated
	 */
	void setFichierSource(String value);

} // Table
