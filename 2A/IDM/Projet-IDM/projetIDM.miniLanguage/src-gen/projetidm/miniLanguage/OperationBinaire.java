/**
 */
package projetidm.miniLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Binaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetidm.miniLanguage.OperationBinaire#getOutput <em>Output</em>}</li>
 *   <li>{@link projetidm.miniLanguage.OperationBinaire#getInput <em>Input</em>}</li>
 *   <li>{@link projetidm.miniLanguage.OperationBinaire#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see projetidm.miniLanguage.MiniLanguagePackage#getOperationBinaire()
 * @model
 * @generated
 */
public interface OperationBinaire extends MiniLanguageElement {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link projetidm.miniLanguage.Output#getOperationBinaire <em>Operation Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Output)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getOperationBinaire_Output()
	 * @see projetidm.miniLanguage.Output#getOperationBinaire
	 * @model opposite="operationBinaire" containment="true" required="true"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.OperationBinaire#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link projetidm.miniLanguage.Input}.
	 * It is bidirectional and its opposite is '{@link projetidm.miniLanguage.Input#getOperationBinaire <em>Operation Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getOperationBinaire_Input()
	 * @see projetidm.miniLanguage.Input#getOperationBinaire
	 * @model opposite="operationBinaire" containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Input> getInput();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link projetidm.miniLanguage.EnumOperationBinaire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see projetidm.miniLanguage.EnumOperationBinaire
	 * @see #setOperation(EnumOperationBinaire)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getOperationBinaire_Operation()
	 * @model
	 * @generated
	 */
	EnumOperationBinaire getOperation();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.OperationBinaire#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see projetidm.miniLanguage.EnumOperationBinaire
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(EnumOperationBinaire value);

} // OperationBinaire
