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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import projetidm.miniLanguage.EnumOperationBinaire;
import projetidm.miniLanguage.Input;
import projetidm.miniLanguage.MiniLanguagePackage;
import projetidm.miniLanguage.OperationBinaire;
import projetidm.miniLanguage.Output;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Binaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetidm.miniLanguage.impl.OperationBinaireImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link projetidm.miniLanguage.impl.OperationBinaireImpl#getInput <em>Input</em>}</li>
 *   <li>{@link projetidm.miniLanguage.impl.OperationBinaireImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationBinaireImpl extends MiniLanguageElementImpl implements OperationBinaire {
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Output output;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> input;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final EnumOperationBinaire OPERATION_EDEFAULT = EnumOperationBinaire.SUM;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EnumOperationBinaire operation = OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationBinaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniLanguagePackage.Literals.OPERATION_BINAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output getOutput() {
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
					MiniLanguagePackage.OPERATION_BINAIRE__OUTPUT, oldOutput, newOutput);
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
				msgs = ((InternalEObject) output).eInverseRemove(this, MiniLanguagePackage.OUTPUT__OPERATION_BINAIRE,
						Output.class, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject) newOutput).eInverseAdd(this, MiniLanguagePackage.OUTPUT__OPERATION_BINAIRE,
						Output.class, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniLanguagePackage.OPERATION_BINAIRE__OUTPUT,
					newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInput() {
		if (input == null) {
			input = new EObjectContainmentWithInverseEList<Input>(Input.class, this,
					MiniLanguagePackage.OPERATION_BINAIRE__INPUT, MiniLanguagePackage.INPUT__OPERATION_BINAIRE);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumOperationBinaire getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(EnumOperationBinaire newOperation) {
		EnumOperationBinaire oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniLanguagePackage.OPERATION_BINAIRE__OPERATION,
					oldOperation, operation));
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
		case MiniLanguagePackage.OPERATION_BINAIRE__OUTPUT:
			if (output != null)
				msgs = ((InternalEObject) output).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MiniLanguagePackage.OPERATION_BINAIRE__OUTPUT, null, msgs);
			return basicSetOutput((Output) otherEnd, msgs);
		case MiniLanguagePackage.OPERATION_BINAIRE__INPUT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInput()).basicAdd(otherEnd, msgs);
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
		case MiniLanguagePackage.OPERATION_BINAIRE__OUTPUT:
			return basicSetOutput(null, msgs);
		case MiniLanguagePackage.OPERATION_BINAIRE__INPUT:
			return ((InternalEList<?>) getInput()).basicRemove(otherEnd, msgs);
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
		case MiniLanguagePackage.OPERATION_BINAIRE__OUTPUT:
			return getOutput();
		case MiniLanguagePackage.OPERATION_BINAIRE__INPUT:
			return getInput();
		case MiniLanguagePackage.OPERATION_BINAIRE__OPERATION:
			return getOperation();
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
		case MiniLanguagePackage.OPERATION_BINAIRE__OUTPUT:
			setOutput((Output) newValue);
			return;
		case MiniLanguagePackage.OPERATION_BINAIRE__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends Input>) newValue);
			return;
		case MiniLanguagePackage.OPERATION_BINAIRE__OPERATION:
			setOperation((EnumOperationBinaire) newValue);
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
		case MiniLanguagePackage.OPERATION_BINAIRE__OUTPUT:
			setOutput((Output) null);
			return;
		case MiniLanguagePackage.OPERATION_BINAIRE__INPUT:
			getInput().clear();
			return;
		case MiniLanguagePackage.OPERATION_BINAIRE__OPERATION:
			setOperation(OPERATION_EDEFAULT);
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
		case MiniLanguagePackage.OPERATION_BINAIRE__OUTPUT:
			return output != null;
		case MiniLanguagePackage.OPERATION_BINAIRE__INPUT:
			return input != null && !input.isEmpty();
		case MiniLanguagePackage.OPERATION_BINAIRE__OPERATION:
			return operation != OPERATION_EDEFAULT;
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
		result.append(" (operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

} //OperationBinaireImpl
