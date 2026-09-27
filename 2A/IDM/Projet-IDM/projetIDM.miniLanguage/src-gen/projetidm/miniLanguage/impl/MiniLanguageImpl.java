/**
 */
package projetidm.miniLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projetidm.miniLanguage.MiniLanguage;
import projetidm.miniLanguage.MiniLanguageElement;
import projetidm.miniLanguage.MiniLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mini Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetidm.miniLanguage.impl.MiniLanguageImpl#getMiniLanguageElement <em>Mini Language Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiniLanguageImpl extends MinimalEObjectImpl.Container implements MiniLanguage {
	/**
	 * The cached value of the '{@link #getMiniLanguageElement() <em>Mini Language Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiniLanguageElement()
	 * @generated
	 * @ordered
	 */
	protected EList<MiniLanguageElement> miniLanguageElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiniLanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniLanguagePackage.Literals.MINI_LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MiniLanguageElement> getMiniLanguageElement() {
		if (miniLanguageElement == null) {
			miniLanguageElement = new EObjectContainmentWithInverseEList<MiniLanguageElement>(MiniLanguageElement.class,
					this, MiniLanguagePackage.MINI_LANGUAGE__MINI_LANGUAGE_ELEMENT,
					MiniLanguagePackage.MINI_LANGUAGE_ELEMENT__MINILANGUAGE);
		}
		return miniLanguageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MiniLanguagePackage.MINI_LANGUAGE__MINI_LANGUAGE_ELEMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMiniLanguageElement()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MiniLanguagePackage.MINI_LANGUAGE__MINI_LANGUAGE_ELEMENT:
			return ((InternalEList<?>) getMiniLanguageElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MiniLanguagePackage.MINI_LANGUAGE__MINI_LANGUAGE_ELEMENT:
			return getMiniLanguageElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MiniLanguagePackage.MINI_LANGUAGE__MINI_LANGUAGE_ELEMENT:
			getMiniLanguageElement().clear();
			getMiniLanguageElement().addAll((Collection<? extends MiniLanguageElement>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MiniLanguagePackage.MINI_LANGUAGE__MINI_LANGUAGE_ELEMENT:
			getMiniLanguageElement().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MiniLanguagePackage.MINI_LANGUAGE__MINI_LANGUAGE_ELEMENT:
			return miniLanguageElement != null && !miniLanguageElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MiniLanguageImpl
