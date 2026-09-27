/**
 */
package projetidm.miniLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import projetidm.miniLanguage.MiniLanguage;
import projetidm.miniLanguage.MiniLanguageElement;
import projetidm.miniLanguage.MiniLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetidm.miniLanguage.impl.MiniLanguageElementImpl#getMinilanguage <em>Minilanguage</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MiniLanguageElementImpl extends MinimalEObjectImpl.Container implements MiniLanguageElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiniLanguageElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniLanguagePackage.Literals.MINI_LANGUAGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MiniLanguage getMinilanguage() {
		if (eContainerFeatureID() != MiniLanguagePackage.MINI_LANGUAGE_ELEMENT__MINILANGUAGE)
			return null;
		return (MiniLanguage) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinilanguage(MiniLanguage newMinilanguage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newMinilanguage,
				MiniLanguagePackage.MINI_LANGUAGE_ELEMENT__MINILANGUAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinilanguage(MiniLanguage newMinilanguage) {
		if (newMinilanguage != eInternalContainer()
				|| (eContainerFeatureID() != MiniLanguagePackage.MINI_LANGUAGE_ELEMENT__MINILANGUAGE
						&& newMinilanguage != null)) {
			if (EcoreUtil.isAncestor(this, newMinilanguage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMinilanguage != null)
				msgs = ((InternalEObject) newMinilanguage).eInverseAdd(this,
						MiniLanguagePackage.MINI_LANGUAGE__MINI_LANGUAGE_ELEMENT, MiniLanguage.class, msgs);
			msgs = basicSetMinilanguage(newMinilanguage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MiniLanguagePackage.MINI_LANGUAGE_ELEMENT__MINILANGUAGE, newMinilanguage, newMinilanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MiniLanguagePackage.MINI_LANGUAGE_ELEMENT__MINILANGUAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetMinilanguage((MiniLanguage) otherEnd, msgs);
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
		case MiniLanguagePackage.MINI_LANGUAGE_ELEMENT__MINILANGUAGE:
			return basicSetMinilanguage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case MiniLanguagePackage.MINI_LANGUAGE_ELEMENT__MINILANGUAGE:
			return eInternalContainer().eInverseRemove(this, MiniLanguagePackage.MINI_LANGUAGE__MINI_LANGUAGE_ELEMENT,
					MiniLanguage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MiniLanguagePackage.MINI_LANGUAGE_ELEMENT__MINILANGUAGE:
			return getMinilanguage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MiniLanguagePackage.MINI_LANGUAGE_ELEMENT__MINILANGUAGE:
			setMinilanguage((MiniLanguage) newValue);
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
		case MiniLanguagePackage.MINI_LANGUAGE_ELEMENT__MINILANGUAGE:
			setMinilanguage((MiniLanguage) null);
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
		case MiniLanguagePackage.MINI_LANGUAGE_ELEMENT__MINILANGUAGE:
			return getMinilanguage() != null;
		}
		return super.eIsSet(featureID);
	}

} //MiniLanguageElementImpl
