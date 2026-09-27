/**
 */
package algorithm.impl;

import algorithm.AlgorithmPackage;
import algorithm.Catalogue;
import algorithm.Ressource;
import algorithm.RessourceFamilyElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource Family Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithm.impl.RessourceFamilyElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link algorithm.impl.RessourceFamilyElementImpl#getRessources <em>Ressources</em>}</li>
 *   <li>{@link algorithm.impl.RessourceFamilyElementImpl#getCatalogue <em>Catalogue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceFamilyElementImpl extends MinimalEObjectImpl.Container implements RessourceFamilyElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRessources() <em>Ressources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessources()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> ressources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceFamilyElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmPackage.Literals.RESSOURCE_FAMILY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ressource> getRessources() {
		if (ressources == null) {
			ressources = new EObjectWithInverseResolvingEList.ManyInverse<Ressource>(Ressource.class, this, AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__RESSOURCES, AlgorithmPackage.RESSOURCE__RESSOURCEFAMILYELEMENTS);
		}
		return ressources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalogue getCatalogue() {
		if (eContainerFeatureID() != AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__CATALOGUE) return null;
		return (Catalogue)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalogue(Catalogue newCatalogue, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCatalogue, AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__CATALOGUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatalogue(Catalogue newCatalogue) {
		if (newCatalogue != eInternalContainer() || (eContainerFeatureID() != AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__CATALOGUE && newCatalogue != null)) {
			if (EcoreUtil.isAncestor(this, newCatalogue))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCatalogue != null)
				msgs = ((InternalEObject)newCatalogue).eInverseAdd(this, AlgorithmPackage.CATALOGUE__RESSOURCEFAMILYELEMENTS, Catalogue.class, msgs);
			msgs = basicSetCatalogue(newCatalogue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__CATALOGUE, newCatalogue, newCatalogue));
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
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__RESSOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRessources()).basicAdd(otherEnd, msgs);
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__CATALOGUE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCatalogue((Catalogue)otherEnd, msgs);
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
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__RESSOURCES:
				return ((InternalEList<?>)getRessources()).basicRemove(otherEnd, msgs);
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__CATALOGUE:
				return basicSetCatalogue(null, msgs);
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
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__CATALOGUE:
				return eInternalContainer().eInverseRemove(this, AlgorithmPackage.CATALOGUE__RESSOURCEFAMILYELEMENTS, Catalogue.class, msgs);
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
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__NAME:
				return getName();
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__RESSOURCES:
				return getRessources();
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__CATALOGUE:
				return getCatalogue();
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
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__RESSOURCES:
				getRessources().clear();
				getRessources().addAll((Collection<? extends Ressource>)newValue);
				return;
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__CATALOGUE:
				setCatalogue((Catalogue)newValue);
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
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__RESSOURCES:
				getRessources().clear();
				return;
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__CATALOGUE:
				setCatalogue((Catalogue)null);
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
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__RESSOURCES:
				return ressources != null && !ressources.isEmpty();
			case AlgorithmPackage.RESSOURCE_FAMILY_ELEMENT__CATALOGUE:
				return getCatalogue() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RessourceFamilyElementImpl
