package com.awn.common.process.utils;

/**
 * IntegerUtils
 * 
 */
public final class IntegerUtils {

	/**
	 * private constructor
	 */
	private IntegerUtils() {
	}

	/**
	 * @param int1
	 *            Integer
	 * @return String representation of argument. Empty string if null.
	 */
	public static String toString(final Integer int1) {
		return int1 == null ? "" : int1.toString();
	}

	/**
	 * @param int1
	 *            Integer
	 * @param int2
	 *            Integer
	 * @return the value 0 if int2 is numerically equal int1; a value less than
	 *         0 if this int1 is numerically less than int2; and a value greater
	 *         than 0 if int1 is numerically greater than int2. Null in case of
	 *         null argument(s).
	 */
	public static Integer compareTo(final Integer int1, final Integer int2) {
		return int1 == null || int2 == null ? null : int1.compareTo(int2);
	}

	/**
	 * @param int1
	 *            Integer
	 * @param int2
	 *            Integer
	 * @return true if int1 is numerically greater than int2. Otherwise false.
	 */
	public static Boolean isGreaterThan(final Integer int1, final Integer int2) {
		return int1 == null || int2 == null ? null : int1.compareTo(int2) > 0 ? true : false;
	}

	/**
	 * @param int1
	 *            Integer
	 * @param int2
	 *            Integer
	 * @return true if int1 is numerically lower than int2. Otherwise false.
	 */
	public static Boolean isLowerThan(final Integer int1, final Integer int2) {
		return int1 == null || int2 == null ? null : int1.compareTo(int2) < 0 ? true : false;
	}

	/**
	 * @param int1
	 *            Integer
	 * @return the absolute value of parameter
	 */
	public static Integer abs(final Integer int1) {
		return Math.abs(int1);
	}

	/**
	 * @param int1
	 *            Integer
	 * @param int2
	 *            Integer
	 * @return the sum of the two arguments, handling null (ex : 3 + null = 3)
	 */
	public static Integer add(final Integer int1, final Integer int2) {
		return int1 == null ? int2 : int2 == null ? int1 : int1 + int2;
	}

	/**
	 * @param int1
	 *            Integer
	 * @param int2
	 *            Integer
	 * @param int3
	 *            Integer
	 * @return the sum of the three arguments, handling null (ex : 3 + 2 + null
	 *         = 5)
	 */
	public static Integer add(final Integer int1, final Integer int2, final Integer int3) {
		return int3 == null ? add(int1, int2) : add(int1, int2) + int3;
	}

	/**
	 * @param int1
	 *            Integer
	 * @param int2
	 *            Integer
	 * @param int3
	 *            Integer
	 * @param int4
	 *            Integer
	 * @return the sum of the four arguments, handling null (ex : 3 + 2 + 6 +
	 *         null = 11)
	 */
	public static Integer add(final Integer int1, final Integer int2, final Integer int3, final Integer int4) {
		return int4 == null ? add(int1, int2, int3) : add(int1, int2, int3) + int4;
	}

	/**
	 * @param int1
	 *            Integer
	 * @param int2
	 *            Integer
	 * @param int3
	 *            Integer
	 * @param int4
	 *            Integer
	 * @param int5
	 *            Integer
	 * @return the sum of the five arguments, handling null (ex : 3 + 2 + 6 + 1
	 *         + null = 12)
	 */
	public static Integer add(final Integer int1, final Integer int2, final Integer int3, final Integer int4,
			final Integer int5) {
		return int5 == null ? add(int1, int2, int3, int4) : add(int1, int2, int3, int4) + int5;
	}

	/**
	 * @param int1
	 *            Integer
	 * @param int2
	 *            Integer
	 * @return the difference between int1 and int2. Null in case of null
	 *         argument(s)
	 */
	public static Integer substract(final Integer int1, final Integer int2) {
		return int1 == null || int2 == null ? null : int1 - int2;
	}

	/**
	 * @param int1
	 *            Integer
	 * @param int2
	 *            Integer
	 * @return the product between int1 and int2. Null in case of null argument
	 */
	public static Integer multiply(final Integer int1, final Integer int2) {
		return int1 == null || int2 == null ? null : int1 * int2;
	}

	/**
	 * @param int1
	 *            Integer
	 * @param int2
	 *            Integer
	 * @return the division between int1 and int2. Null in case of null argument
	 */
	public static Integer divide(final Integer int1, final Integer int2) {
		return int1 == null || int2 == null ? null : int1 / int2;
	}

	/**
	 * @param integer
	 *            Integer
	 * @return true if argument is null or argument == 0
	 */
	public static Boolean isNullOrZeroValue(final Integer integer) {
		return integer == null || integer == 0;
	}
}