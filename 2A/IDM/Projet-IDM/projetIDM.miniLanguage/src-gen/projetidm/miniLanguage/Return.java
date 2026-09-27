/**
 */
package projetidm.miniLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetidm.miniLanguage.Return#getName <em>Name</em>}</li>
 *   <li>{@link projetidm.miniLanguage.Return#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see projetidm.miniLanguage.MiniLanguagePackage#getReturn()
 * @model
 * @generated
 */
public interface Return extends MiniLanguageElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getReturn_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.Return#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link projetidm.miniLanguage.Input#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(Input)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getReturn_Input()
	 * @see projetidm.miniLanguage.Input#getReturn
	 * @model opposite="return" containment="true" required="true"
	 * @generated
	 */
	Input getInput();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.Return#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Input value);

} // Return
