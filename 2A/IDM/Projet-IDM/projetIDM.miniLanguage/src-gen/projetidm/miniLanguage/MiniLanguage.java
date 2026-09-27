/**
 */
package projetidm.miniLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mini Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetidm.miniLanguage.MiniLanguage#getMiniLanguageElement <em>Mini Language Element</em>}</li>
 * </ul>
 *
 * @see projetidm.miniLanguage.MiniLanguagePackage#getMiniLanguage()
 * @model
 * @generated
 */
public interface MiniLanguage extends EObject {
	/**
	 * Returns the value of the '<em><b>Mini Language Element</b></em>' containment reference list.
	 * The list contents are of type {@link projetidm.miniLanguage.MiniLanguageElement}.
	 * It is bidirectional and its opposite is '{@link projetidm.miniLanguage.MiniLanguageElement#getMinilanguage <em>Minilanguage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mini Language Element</em>' containment reference list.
	 * @see projetidm.miniLanguage.MiniLanguagePackage#getMiniLanguage_MiniLanguageElement()
	 * @see projetidm.miniLanguage.MiniLanguageElement#getMinilanguage
	 * @model opposite="minilanguage" containment="true"
	 * @generated
	 */
	EList<MiniLanguageElement> getMiniLanguageElement();

} // MiniLanguage
