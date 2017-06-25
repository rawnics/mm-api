package com.awn.common.process.utils;

/**
 * LongUtils
 * 
 */
public final class LongUtils {

	/**
	 * private constructor
	 */
	private LongUtils() {
	}

	/**
	 * @param long1
	 *            Long
	 * @return String representation of argument. Empty string if null.
	 */
	public static String toString(final Long long1) {
		return long1 == null ? "" : long1.toString();
	}

	/**
	 * @param long1
	 *            Long
	 * @param long2
	 *            Long
	 * @return the value 0 if long2 is numerically equal long1; a value less
	 *         than 0 if this long1 is numerically less than long2; and a value
	 *         greater than 0 if long1 is numerically greater than long2. Null
	 *         in case of null argument(s).
	 */
	public static Integer compareTo(final Long long1, final Long long2) {
		return long1 == null || long2 == null ? null : long1.compareTo(long2);
	}

	/**
	 * @param long1
	 *            Long
	 * @param long2
	 *            Long
	 * @return true if long1 is numerically greater than long2. Otherwise false.
	 */
	public static Boolean isGreaterThan(final Long long1, final Long long2) {
		return long1 == null || long2 == null ? null : long1.compareTo(long2) > 0 ? true : false;
	}

	/**
	 * @param long1
	 *            Long
	 * @param long2
	 *            Long
	 * @return true if long1 is numerically lower than long2. Otherwise false
	 */
	public static Boolean isLowerThan(final Long long1, final Long long2) {
		return long1 == null || long2 == null ? null : long1.compareTo(long2) < 0 ? true : false;
	}

	/**
	 * @param long1
	 *            Long
	 * @param long2
	 *            Long
	 * @return the sum of the two arguments, handling null (ex : 3 + null = 3)
	 */
	public static Long add(final Long long1, final Long long2) {
		return long1 == null ? long2 : long2 == null ? long1 : long1 + long2;
	}

	/**
	 * @param long1
	 *            Long
	 * @param long2
	 *            Long
	 * @param long3
	 *            Long
	 * @return the sum of the three arguments, handling null (ex : 3 + 2 + null
	 *         = 5)
	 */
	public static Long add(final Long long1, final Long long2, final Long long3) {
		return long3 == null ? add(long1, long2) : add(long1, long2) + long3;
	}

	/**
	 * @param long1
	 *            Long
	 * @param long2
	 *            Long
	 * @param long3
	 *            Long
	 * @param long4
	 *            Long
	 * @return the sum of the four arguments, handling null (ex : 3 + 2 + null =
	 *         5)
	 */
	public static Long add(final Long long1, final Long long2, final Long long3, final Long long4) {
		return long4 == null ? add(long1, long2, long3) : add(long1, long2, long3) + long4;
	}

	/**
	 * @param long1
	 *            Long
	 * @param long2
	 *            Long
	 * @param long3
	 *            Long
	 * @param long4
	 *            Long
	 * @param long5
	 *            Long
	 * @return the sum of the five arguments, handling null (ex : 3 + 2 + null =
	 *         5)
	 */
	public static Long add(final Long long1, final Long long2, final Long long3, final Long long4, final Long long5) {
		return long5 == null ? add(long1, long2, long3, long4) : add(long1, long2, long3, long4) + long5;
	}

	/**
	 * @param long1
	 *            Long
	 * @param long2
	 *            Long
	 * @return the difference between long1 and long2. Null in case of null
	 *         argument(s)
	 */
	public static Long substract(final Long long1, final Long long2) {
		return long1 == null || long2 == null ? null : long1 - long2;
	}

	/**
	 * @param long1
	 *            Long
	 * @param long2
	 *            Long
	 * @return the product between long1 and long2. Null in case of null
	 *         argument
	 */
	public static Long multiply(final Long long1, final Long long2) {
		return long1 == null || long2 == null ? null : long1 * long2;
	}

	/**
	 * @param long1
	 *            Long
	 * @param long2
	 *            Long
	 * @return the division between long1 and long2. Null in case of null
	 *         argument
	 */
	public static Long divide(final Long long1, final Long long2) {
		return long1 == null || long2 == null ? null : long1 / long2;
	}

	/**
	 * @param value
	 *            Long
	 * @return true if argument is null or argument == 0
	 */
	public static Boolean isNullOrZeroValue(final Long value) {
		return value == null || value == 0;
	}

}