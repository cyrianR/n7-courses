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
import projetidm.miniLanguage.Input;
import projetidm.miniLanguage.MiniLanguagePackage;
import projetidm.miniLanguage.OperationBinaire;
import projetidm.miniLanguage.OperationUnaire;
import projetidm.miniLanguage.Output;
import projetidm.miniLanguage.Return;
import projetidm.miniLanguage.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetidm.miniLanguage.impl.InputImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link projetidm.miniLanguage.impl.InputImpl#getType <em>Type</em>}</li>
 *   <li>{@link projetidm.miniLanguage.impl.InputImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetidm.miniLanguage.impl.InputImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link projetidm.miniLanguage.impl.InputImpl#getOperationBinaire <em>Operation Binaire</em>}</li>
 *   <li>{@link projetidm.miniLanguage.impl.InputImpl#getOperationUnaire <em>Operation Unaire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends MinimalEObjectImpl.Container implements Input {
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Output output;

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
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniLanguagePackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject) output;
			output = (Output) eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniLanguagePackage.INPUT__OUTPUT,
							oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Output newOutput, NotificationChain msgs) {
		Output oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MiniLanguagePackage.INPUT__OUTPUT, oldOutput, newOutput);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutput(Output newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject) output).eInverseRemove(this, MiniLanguagePackage.OUTPUT__INPUT, Output.class,
						msgs);
			if (newOutput != null)
				msgs = ((InternalEObject) newOutput).eInverseAdd(this, MiniLanguagePackage.OUTPUT__INPUT, Output.class,
						msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniLanguagePackage.INPUT__OUTPUT, newOutput,
					newOutput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MiniLanguagePackage.INPUT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MiniLanguagePackage.INPUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Return getReturn() {
		if (eContainerFeatureID() != MiniLanguagePackage.INPUT__RETURN)
			return null;
		return (Return) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturn(Return newReturn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newReturn, MiniLanguagePackage.INPUT__RETURN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturn(Return newReturn) {
		if (newReturn != eInternalContainer()
				|| (eContainerFeatureID() != MiniLanguagePackage.INPUT__RETURN && newReturn != null)) {
			if (EcoreUtil.isAncestor(this, newReturn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReturn != null)
				msgs = ((InternalEObject) newReturn).eInverseAdd(this, MiniLanguagePackage.RETURN__INPUT, Return.class,
						msgs);
			msgs = basicSetReturn(newReturn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniLanguagePackage.INPUT__RETURN, newReturn,
					newReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationBinaire getOperationBinaire() {
		if (eContainerFeatureID() != MiniLanguagePackage.INPUT__OPERATION_BINAIRE)
			return null;
		return (OperationBinaire) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationBinaire(OperationBinaire newOperationBinaire, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOperationBinaire, MiniLanguagePackage.INPUT__OPERATION_BINAIRE,
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
				|| (eContainerFeatureID() != MiniLanguagePackage.INPUT__OPERATION_BINAIRE
						&& newOperationBinaire != null)) {
			if (EcoreUtil.isAncestor(this, newOperationBinaire))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperationBinaire != null)
				msgs = ((InternalEObject) newOperationBinaire).eInverseAdd(this,
						MiniLanguagePackage.OPERATION_BINAIRE__INPUT, OperationBinaire.class, msgs);
			msgs = basicSetOperationBinaire(newOperationBinaire, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniLanguagePackage.INPUT__OPERATION_BINAIRE,
					newOperationBinaire, newOperationBinaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationUnaire getOperationUnaire() {
		if (eContainerFeatureID() != MiniLanguagePackage.INPUT__OPERATION_UNAIRE)
			return null;
		return (OperationUnaire) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationUnaire(OperationUnaire newOperationUnaire, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOperationUnaire, MiniLanguagePackage.INPUT__OPERATION_UNAIRE,
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
				|| (eContainerFeatureID() != MiniLanguagePackage.INPUT__OPERATION_UNAIRE
						&& newOperationUnaire != null)) {
			if (EcoreUtil.isAncestor(this, newOperationUnaire))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperationUnaire != null)
				msgs = ((InternalEObject) newOperationUnaire).eInverseAdd(this,
						MiniLanguagePackage.OPERATION_UNAIRE__INPUT, OperationUnaire.class, msgs);
			msgs = basicSetOperationUnaire(newOperationUnaire, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniLanguagePackage.INPUT__OPERATION_UNAIRE,
					newOperationUnaire, newOperationUnaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MiniLanguagePackage.INPUT__OUTPUT:
			if (output != null)
				msgs = ((InternalEObject) output).eInverseRemove(this, MiniLanguagePackage.OUTPUT__INPUT, Output.class,
						msgs);
			return basicSetOutput((Output) otherEnd, msgs);
		case MiniLanguagePackage.INPUT__RETURN:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetReturn((Return) otherEnd, msgs);
		case MiniLanguagePackage.INPUT__OPERATION_BINAIRE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOperationBinaire((OperationBinaire) otherEnd, msgs);
		case MiniLanguagePackage.INPUT__OPERATION_UNAIRE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOperationUnaire((OperationUnaire) otherEnd, msgs);
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
		case MiniLanguagePackage.INPUT__OUTPUT:
			return basicSetOutput(null, msgs);
		case MiniLanguagePackage.INPUT__RETURN:
			return basicSetReturn(null, msgs);
		case MiniLanguagePackage.INPUT__OPERATION_BINAIRE:
			return basicSetOperationBinaire(null, msgs);
		case MiniLanguagePackage.INPUT__OPERATION_UNAIRE:
			return basicSetOperationUnaire(null, msgs);
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
		case MiniLanguagePackage.INPUT__RETURN:
			return eInternalContainer().eInverseRemove(this, MiniLanguagePackage.RETURN__INPUT, Return.class, msgs);
		case MiniLanguagePackage.INPUT__OPERATION_BINAIRE:
			return eInternalContainer().eInverseRemove(this, MiniLanguagePackage.OPERATION_BINAIRE__INPUT,
					OperationBinaire.class, msgs);
		case MiniLanguagePackage.INPUT__OPERATION_UNAIRE:
			return eInternalContainer().eInverseRemove(this, MiniLanguagePackage.OPERATION_UNAIRE__INPUT,
					OperationUnaire.class, msgs);
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
		case MiniLanguagePackage.INPUT__OUTPUT:
			if (resolve)
				return getOutput();
			return basicGetOutput();
		case MiniLanguagePackage.INPUT__TYPE:
			return getType();
		case MiniLanguagePackage.INPUT__NAME:
			return getName();
		case MiniLanguagePackage.INPUT__RETURN:
			return getReturn();
		case MiniLanguagePackage.INPUT__OPERATION_BINAIRE:
			return getOperationBinaire();
		case MiniLanguagePackage.INPUT__OPERATION_UNAIRE:
			return getOperationUnaire();
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
		case MiniLanguagePackage.INPUT__OUTPUT:
			setOutput((Output) newValue);
			return;
		case MiniLanguagePackage.INPUT__TYPE:
			setType((Type) newValue);
			return;
		case MiniLanguagePackage.INPUT__NAME:
			setName((String) newValue);
			return;
		case MiniLanguagePackage.INPUT__RETURN:
			setReturn((Return) newValue);
			return;
		case MiniLanguagePackage.INPUT__OPERATION_BINAIRE:
			setOperationBinaire((OperationBinaire) newValue);
			return;
		case MiniLanguagePackage.INPUT__OPERATION_UNAIRE:
			setOperationUnaire((OperationUnaire) newValue);
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
		case MiniLanguagePackage.INPUT__OUTPUT:
			setOutput((Output) null);
			return;
		case MiniLanguagePackage.INPUT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MiniLanguagePackage.INPUT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MiniLanguagePackage.INPUT__RETURN:
			setReturn((Return) null);
			return;
		case MiniLanguagePackage.INPUT__OPERATION_BINAIRE:
			setOperationBinaire((OperationBinaire) null);
			return;
		case MiniLanguagePackage.INPUT__OPERATION_UNAIRE:
			setOperationUnaire((OperationUnaire) null);
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
		case MiniLanguagePackage.INPUT__OUTPUT:
			return output != null;
		case MiniLanguagePackage.INPUT__TYPE:
			return type != TYPE_EDEFAULT;
		case MiniLanguagePackage.INPUT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MiniLanguagePackage.INPUT__RETURN:
			return getReturn() != null;
		case MiniLanguagePackage.INPUT__OPERATION_BINAIRE:
			return getOperationBinaire() != null;
		case MiniLanguagePackage.INPUT__OPERATION_UNAIRE:
			return getOperationUnaire() != null;
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

} //InputImpl
