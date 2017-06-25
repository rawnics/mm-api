package com.awn.common.process.utils;

import java.util.Locale;

/**
 * DoubleUtils
 * 
 */
public final class DoubleUtils {

	/**
	 * private constructor
	 */
	private DoubleUtils() {
	}

	/**
	 * @param double1
	 *            Double
	 * @return String representation of argument. Empty string if null.
	 */
	public static String toString(final Double double1) {
		return double1 == null ? "" : double1.toString();
	}

	/**
	 * @param double1
	 *            Double
	 * @param format
	 *            String
	 * @param locale
	 *            String
	 * @return String representation of argument with specified format and
	 *         locale.
	 */
	public static String toString(final Double double1, final String format, final String locale) {
		return double1 == null ? "" : String.format(Locale.forLanguageTag(locale), format, double1);
	}

	/**
	 * @param double1
	 *            Double
	 * @param double2
	 *            Double
	 * @return the value 0 if double2 is numerically equal double1; a value less
	 *         than 0 if this double1 is numerically less than double2; and a
	 *         value greater than 0 if double1 is numerically greater than
	 *         double2. Null in case of null argument(s)
	 */
	public static Integer compareTo(final Double double1, final Double double2) {
		return double1 == null || double2 == null ? null : double1.compareTo(double2);
	}

	/**
	 * @param double1
	 *            Double
	 * @param double2
	 *            Double
	 * @return true if double1 is numerically greater than double2. Otherwise
	 *         false
	 */
	public static Boolean isGreaterThan(final Double double1, final Double double2) {
		return double1 == null || double2 == null ? null : double1.compareTo(double2) > 0 ? true : false;
	}

	/**
	 * @param double1
	 *            Double
	 * @param double2
	 *            Double
	 * @return true if double1 is numerically lower than double2. Otherwise
	 *         false
	 */
	public static Boolean isLowerThan(final Double double1, final Double double2) {
		return double1 == null || double2 == null ? null : double1.compareTo(double2) < 0 ? true : false;
	}

	/**
	 * @param double1
	 *            Double
	 * @return the absolute value of parameter
	 */
	public static Double abs(final Double double1) {
		return Math.abs(double1);
	}

	/**
	 * @param double1
	 *            Double
	 * @return the largest (closest to positive infinity) floating-point value
	 *         that less than or equal to the argument and is equal to a
	 *         mathematical integer
	 */
	public static Double floor(final Double double1) {
		return Math.floor(double1);
	}

	/**
	 * @param double1
	 *            Double
	 * @return the smallest (closest to negative infinity) floating-point value
	 *         that is greater than or equal to the argument and is equal to a
	 *         mathematical integer
	 */
	public static Double ceil(final Double double1) {
		return Math.ceil(double1);
	}

	/**
	 * @param double1
	 *            Double
	 * @return the value of the argument rounded to the nearest long value
	 */
	public static Long round(final Double double1) {
		return Math.round(double1);
	}

	/**
	 * @param double1
	 *            Double
	 * @param double2
	 *            Double
	 * @return the sum of the two arguments, handling null (ex : 3 + null = 3)
	 */
	public static Double add(final Double double1, final Double double2) {
		return double1 == null ? double2 : double2 == null ? double1 : double1 + double2;
	}

	/**
	 * @param double1
	 *            Double
	 * @param double2
	 *            Double
	 * @param double3
	 *            Double
	 * @return the sum of the three arguments, handling null (ex : 3 + 2 + null
	 *         = 5)
	 */
	public static Double add(final Double double1, final Double double2, final Double double3) {
		return double3 == null ? add(double1, double2) : add(double1, double2) + double3;
	}

	/**
	 * @param double1
	 *            Double
	 * @param double2
	 *            Double
	 * @param double3
	 *            Double
	 * @param double4
	 *            Double
	 * @return the sum of the four arguments, handling null (ex : 3 + 2 + 6 +
	 *         null = 11)
	 */
	public static Double add(final Double double1, final Double double2, final Double double3, final Double double4) {
		return double4 == null ? add(double1, double2, double3) : add(double1, double2, double3) + double4;
	}

	/**
	 * @param double1
	 *            Double
	 * @param double2
	 *            Double
	 * @param double3
	 *            Double
	 * @param double4
	 *            Double
	 * @param double5
	 *            Double
	 * @return the sum of the five arguments, handling null (ex : 3 + 2 + 6 + 1
	 *         + null = 12)
	 */
	public static Double add(final Double double1, final Double double2, final Double double3, final Double double4,
			final Double double5) {
		return double5 == null ? add(double1, double2, double3, double4)
				: add(double1, double2, double3, double4) + double5;
	}

	/**
	 * @param double1
	 *            Double
	 * @param double2
	 *            Double
	 * @return the difference between double1 and double2. Null in case of null
	 *         argument(s)
	 */
	public static Double substract(final Double double1, final Double double2) {
		return double1 == null || double2 == null ? null : double1 - double2;
	}

	/**
	 * @param double1
	 *            Double
	 * @param double2
	 *            Double
	 * @return the product between double1 and double2. Null in case of null
	 *         argument
	 */
	public static Double multiply(final Double double1, final Double double2) {
		return double1 == null || double2 == null ? null : double1 * double2;
	}

	/**
	 * @param double1
	 *            Double
	 * @param double2
	 *            Double
	 * @return the division between double1 and double2. Null in case of null
	 *         argument
	 */
	public static Double divide(final Double double1, final Double double2) {
		return double1 == null || double2 == null ? null : double1 / double2;
	}

	/**
	 * @param double1
	 *            Double
	 * @return true if argument is null or argument == 0
	 */
	public static Boolean isNullOrZeroValue(final Double double1) {
		return double1 == null || double1 == 0;
	}

}