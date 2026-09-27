/**
 */
package projetidm.miniLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Unaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetidm.miniLanguage.OperationUnaire#getOutput <em>Output</em>}</li>
 *   <li>{@link projetidm.miniLanguage.OperationUnaire#getInput <em>Input</em>}</li>
 *   <li>{@link projetidm.miniLanguage.OperationUnaire#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see projetidm.miniLanguage.MiniLanguagePackage#getOperationUnaire()
 * @model
 * @generated
 */
public interface OperationUnaire extends MiniLanguageElement {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link projetidm.miniLanguage.Output#getOperationUnaire <em>Operation Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Output)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getOperationUnaire_Output()
	 * @see projetidm.miniLanguage.Output#getOperationUnaire
	 * @model opposite="operationUnaire" containment="true" required="true"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.OperationUnaire#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link projetidm.miniLanguage.Input#getOperationUnaire <em>Operation Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(Input)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getOperationUnaire_Input()
	 * @see projetidm.miniLanguage.Input#getOperationUnaire
	 * @model opposite="operationUnaire" containment="true" required="true"
	 * @generated
	 */
	Input getInput();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.OperationUnaire#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Input value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link projetidm.miniLanguage.EnumOperationUnaire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see projetidm.miniLanguage.EnumOperationUnaire
	 * @see #setOperation(EnumOperationUnaire)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getOperationUnaire_Operation()
	 * @model
	 * @generated
	 */
	EnumOperationUnaire getOperation();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.OperationUnaire#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see projetidm.miniLanguage.EnumOperationUnaire
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(EnumOperationUnaire value);

} // OperationUnaire
