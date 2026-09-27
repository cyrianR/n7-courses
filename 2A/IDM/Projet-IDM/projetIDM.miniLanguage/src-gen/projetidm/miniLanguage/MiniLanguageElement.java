/**
 */
package projetidm.miniLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetidm.miniLanguage.MiniLanguageElement#getMinilanguage <em>Minilanguage</em>}</li>
 * </ul>
 *
 * @see projetidm.miniLanguage.MiniLanguagePackage#getMiniLanguageElement()
 * @model abstract="true"
 * @generated
 */
public interface MiniLanguageElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Minilanguage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link projetidm.miniLanguage.MiniLanguage#getMiniLanguageElement <em>Mini Language Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minilanguage</em>' container reference.
	 * @see #setMinilanguage(MiniLanguage)
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getMiniLanguageElement_Minilanguage()
	 * @see projetidm.miniLanguage.MiniLanguage#getMiniLanguageElement
	 * @model opposite="miniLanguageElement" required="true" transient="false"
	 * @generated
	 */
	MiniLanguage getMinilanguage();

	/**
	 * Sets the value of the '{@link projetidm.miniLanguage.MiniLanguageElement#getMinilanguage <em>Minilanguage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minilanguage</em>' container reference.
	 * @see #getMinilanguage()
	 * @generated
	 */
	void setMinilanguage(MiniLanguage value);

} // MiniLanguageElement
