/**
 */
package projetidm.miniLanguage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Operation Unaire</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see projetidm.miniLanguage.MiniLanguagePackage#getEnumOperationUnaire()
 * @model
 * @generated
 */
public enum EnumOperationUnaire implements Enumerator {
	/**
	 * The '<em><b>SUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUM_VALUE
	 * @generated
	 * @ordered
	 */
	SUM(0, "SUM", "SUM"),
	/**
	 * The '<em><b>PRODUCT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PRODUCT_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCT(1, "PRODUCT", "PRODUCT"),
	/**
	 * The '<em><b>MINIMUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MINIMUM_VALUE
	 * @generated
	 * @ordered
	 */
	MINIMUM(2, "MINIMUM", "MINIMUM"),

	/**
	 * The '<em><b>MAXIMUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_VALUE
	 * @generated
	 * @ordered
	 */
	MAXIMUM(3, "MAXIMUM", "MAXIMUM"),

	/**
	 * The '<em><b>OPPOSITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPPOSITE_VALUE
	 * @generated
	 * @ordered
	 */
	OPPOSITE(4, "OPPOSITE", "OPPOSITE"),
	/**
	 * The '<em><b>COSINUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #COSINUS_VALUE
	 * @generated
	 * @ordered
	 */
	COSINUS(5, "COSINUS", "COSINUS"),

	/**
	 * The '<em><b>SINUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINUS_VALUE
	 * @generated
	 * @ordered
	 */
	SINUS(6, "SINUS", "SINUS"),

	/**
	 * The '<em><b>SQRT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQRT_VALUE
	 * @generated
	 * @ordered
	 */
	SQRT(7, "SQRT", "SQRT"),
	/**
	 * The '<em><b>EXPONENTIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #EXPONENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	EXPONENTIAL(8, "EXPONENTIAL", "EXPONENTIAL");

	/**
	 * The '<em><b>SUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUM_VALUE = 0;

	/**
	 * The '<em><b>PRODUCT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_VALUE = 1;

	/**
	 * The '<em><b>MINIMUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINIMUM_VALUE = 2;

	/**
	 * The '<em><b>MAXIMUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAXIMUM_VALUE = 3;

	/**
	 * The '<em><b>OPPOSITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPPOSITE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPPOSITE_VALUE = 4;

	/**
	 * The '<em><b>COSINUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COSINUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COSINUS_VALUE = 5;

	/**
	 * The '<em><b>SINUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINUS_VALUE = 6;

	/**
	 * The '<em><b>SQRT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQRT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SQRT_VALUE = 7;

	/**
	 * The '<em><b>EXPONENTIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPONENTIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPONENTIAL_VALUE = 8;

	/**
	 * An array of all the '<em><b>Enum Operation Unaire</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumOperationUnaire[] VALUES_ARRAY = new EnumOperationUnaire[] { SUM, PRODUCT, MINIMUM,
			MAXIMUM, OPPOSITE, COSINUS, SINUS, SQRT, EXPONENTIAL, };

	/**
	 * A public read-only list of all the '<em><b>Enum Operation Unaire</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumOperationUnaire> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Operation Unaire</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumOperationUnaire get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumOperationUnaire result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Operation Unaire</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumOperationUnaire getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumOperationUnaire result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Operation Unaire</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumOperationUnaire get(int value) {
		switch (value) {
		case SUM_VALUE:
			return SUM;
		case PRODUCT_VALUE:
			return PRODUCT;
		case MINIMUM_VALUE:
			return MINIMUM;
		case MAXIMUM_VALUE:
			return MAXIMUM;
		case OPPOSITE_VALUE:
			return OPPOSITE;
		case COSINUS_VALUE:
			return COSINUS;
		case SINUS_VALUE:
			return SINUS;
		case SQRT_VALUE:
			return SQRT;
		case EXPONENTIAL_VALUE:
			return EXPONENTIAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EnumOperationUnaire(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //EnumOperationUnaire
