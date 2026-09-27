/**
 */
package projetidm.miniLanguage.impl;

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

import projetidm.miniLanguage.Input;
import projetidm.miniLanguage.MiniLanguagePackage;
import projetidm.miniLanguage.OperationBinaire;
import projetidm.miniLanguage.OperationUnaire;
import projetidm.miniLanguage.Output;
import projetidm.miniLanguage.Parameter;
import projetidm.miniLanguage.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetidm.miniLanguage.impl.OutputImpl#getInput <em>Input</em>}</li>
 *   <li>{@link projetidm.miniLanguage.impl.OutputImpl#getType <em>Type</em>}</li>
 *   <li>{@link projetidm.miniLanguage.impl.OutputImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetidm.miniLanguage.impl.OutputImpl#getOperationBinaire <em>Operation Binaire</em>}</li>
 *   <li>{@link projetidm.miniLanguage.impl.OutputImpl#getOperationUnaire <em>Operation Unaire</em>}</li>
 *   <li>{@link projetidm.miniLanguage.impl.OutputImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputImpl extends MinimalEObjectImpl.Container implements Output {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> input;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.STR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniLanguagePackage.Literals.OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInput() {
		if (input == null) {
			input = new EObjectWithInverseResolvingEList<Input>(Input.class, this, MiniLanguagePackage.OUTPUT__INPUT,
					MiniLanguagePackage.INPUT__OUTPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniLanguagePackage.OUTPUT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MiniLanguagePackage.OUTPUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationBinaire getOperationBinaire() {
		if (eContainerFeatureID() != MiniLanguagePackage.OUTPUT__OPERATION_BINAIRE)
			return null;
		return (OperationBinaire) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationBinaire(OperationBinaire newOperationBinaire, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOperationBinaire, MiniLanguagePackage.OUTPUT__OPERATION_BINAIRE,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationBinaire(OperationBinaire newOperationBinaire) {
		if (newOperationBinaire != eInternalContainer()
				|| (eContainerFeatureID() != MiniLanguagePackage.OUTPUT__OPERATION_BINAIRE
						&& newOperationBinaire != null)) {
			if (EcoreUtil.isAncestor(this, newOperationBinaire))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperationBinaire != null)
				msgs = ((InternalEObject) newOperationBinaire).eInverseAdd(this,
						MiniLanguagePackage.OPERATION_BINAIRE__OUTPUT, OperationBinaire.class, msgs);
			msgs = basicSetOperationBinaire(newOperationBinaire, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniLanguagePackage.OUTPUT__OPERATION_BINAIRE,
					newOperationBinaire, newOperationBinaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationUnaire getOperationUnaire() {
		if (eContainerFeatureID() != MiniLanguagePackage.OUTPUT__OPERATION_UNAIRE)
			return null;
		return (OperationUnaire) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationUnaire(OperationUnaire newOperationUnaire, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOperationUnaire, MiniLanguagePackage.OUTPUT__OPERATION_UNAIRE,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationUnaire(OperationUnaire newOperationUnaire) {
		if (newOperationUnaire != eInternalContainer()
				|| (eContainerFeatureID() != MiniLanguagePackage.OUTPUT__OPERATION_UNAIRE
						&& newOperationUnaire != null)) {
			if (EcoreUtil.isAncestor(this, newOperationUnaire))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperationUnaire != null)
				msgs = ((InternalEObject) newOperationUnaire).eInverseAdd(this,
						MiniLanguagePackage.OPERATION_UNAIRE__OUTPUT, OperationUnaire.class, msgs);
			msgs = basicSetOperationUnaire(newOperationUnaire, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniLanguagePackage.OUTPUT__OPERATION_UNAIRE,
					newOperationUnaire, newOperationUnaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getParameter() {
		if (eContainerFeatureID() != MiniLanguagePackage.OUTPUT__PARAMETER)
			return null;
		return (Parameter) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(Parameter newParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParameter, MiniLanguagePackage.OUTPUT__PARAMETER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(Parameter newParameter) {
		if (newParameter != eInternalContainer()
				|| (eContainerFeatureID() != MiniLanguagePackage.OUTPUT__PARAMETER && newParameter != null)) {
			if (EcoreUtil.isAncestor(this, newParameter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParameter != null)
				msgs = ((InternalEObject) newParameter).eInverseAdd(this, MiniLanguagePackage.PARAMETER__OUTPUT,
						Parameter.class, msgs);
			msgs = basicSetParameter(newParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniLanguagePackage.OUTPUT__PARAMETER, newParameter,
					newParameter));
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
		case MiniLanguagePackage.OUTPUT__INPUT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInput()).basicAdd(otherEnd, msgs);
		case MiniLanguagePackage.OUTPUT__OPERATION_BINAIRE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOperationBinaire((OperationBinaire) otherEnd, msgs);
		case MiniLanguagePackage.OUTPUT__OPERATION_UNAIRE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOperationUnaire((OperationUnaire) otherEnd, msgs);
		case MiniLanguagePackage.OUTPUT__PARAMETER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParameter((Parameter) otherEnd, msgs);
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
		case MiniLanguagePackage.OUTPUT__INPUT:
			return ((InternalEList<?>) getInput()).basicRemove(otherEnd, msgs);
		case MiniLanguagePackage.OUTPUT__OPERATION_BINAIRE:
			return basicSetOperationBinaire(null, msgs);
		case MiniLanguagePackage.OUTPUT__OPERATION_UNAIRE:
			return basicSetOperationUnaire(null, msgs);
		case MiniLanguagePackage.OUTPUT__PARAMETER:
			return basicSetParameter(null, msgs);
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
		case MiniLanguagePackage.OUTPUT__OPERATION_BINAIRE:
			return eInternalContainer().eInverseRemove(this, MiniLanguagePackage.OPERATION_BINAIRE__OUTPUT,
					OperationBinaire.class, msgs);
		case MiniLanguagePackage.OUTPUT__OPERATION_UNAIRE:
			return eInternalContainer().eInverseRemove(this, MiniLanguagePackage.OPERATION_UNAIRE__OUTPUT,
					OperationUnaire.class, msgs);
		case MiniLanguagePackage.OUTPUT__PARAMETER:
			return eInternalContainer().eInverseRemove(this, MiniLanguagePackage.PARAMETER__OUTPUT, Parameter.class,
					msgs);
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
		case MiniLanguagePackage.OUTPUT__INPUT:
			return getInput();
		case MiniLanguagePackage.OUTPUT__TYPE:
			return getType();
		case MiniLanguagePackage.OUTPUT__NAME:
			return getName();
		case MiniLanguagePackage.OUTPUT__OPERATION_BINAIRE:
			return getOperationBinaire();
		case MiniLanguagePackage.OUTPUT__OPERATION_UNAIRE:
			return getOperationUnaire();
		case MiniLanguagePackage.OUTPUT__PARAMETER:
			return getParameter();
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
		case MiniLanguagePackage.OUTPUT__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends Input>) newValue);
			return;
		case MiniLanguagePackage.OUTPUT__TYPE:
			setType((Type) newValue);
			return;
		case MiniLanguagePackage.OUTPUT__NAME:
			setName((String) newValue);
			return;
		case MiniLanguagePackage.OUTPUT__OPERATION_BINAIRE:
			setOperationBinaire((OperationBinaire) newValue);
			return;
		case MiniLanguagePackage.OUTPUT__OPERATION_UNAIRE:
			setOperationUnaire((OperationUnaire) newValue);
			return;
		case MiniLanguagePackage.OUTPUT__PARAMETER:
			setParameter((Parameter) newValue);
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
		case MiniLanguagePackage.OUTPUT__INPUT:
			getInput().clear();
			return;
		case MiniLanguagePackage.OUTPUT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MiniLanguagePackage.OUTPUT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MiniLanguagePackage.OUTPUT__OPERATION_BINAIRE:
			setOperationBinaire((OperationBinaire) null);
			return;
		case MiniLanguagePackage.OUTPUT__OPERATION_UNAIRE:
			setOperationUnaire((OperationUnaire) null);
			return;
		case MiniLanguagePackage.OUTPUT__PARAMETER:
			setParameter((Parameter) null);
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
		case MiniLanguagePackage.OUTPUT__INPUT:
			return input != null && !input.isEmpty();
		case MiniLanguagePackage.OUTPUT__TYPE:
			return type != TYPE_EDEFAULT;
		case MiniLanguagePackage.OUTPUT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MiniLanguagePackage.OUTPUT__OPERATION_BINAIRE:
			return getOperationBinaire() != null;
		case MiniLanguagePackage.OUTPUT__OPERATION_UNAIRE:
			return getOperationUnaire() != null;
		case MiniLanguagePackage.OUTPUT__PARAMETER:
			return getParameter() != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OutputImpl
