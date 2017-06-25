package com.awn.common.process.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 */
public final class StringUtils {

	// Logger declaration.
	private static final Logger LOGGER = LoggerFactory.getLogger(StringUtils.class);

	/**
	 * STANDARD_DATE_FORMAT
	 */
	public static final String STANDARD_DATE_FORMAT = "dd/MM/yyyy";

	/**
	 * NO_SEPARATOR_SHORT_DATE_FORMAT
	 */
	public static final String NO_SEPARATOR_SHORT_DATE_FORMAT = "ddMMyy";

	/**
	 * LIBELLE_DATE_FORMAT
	 */
	public static final String LIBELLE_DATE_FORMAT = "dd MMMMMMMMM yyyy";

	/**
	 * UNDERSCORE_DATE_FORMAT
	 */
	public static final String UNDERSCORE_DATE_FORMAT = "dd_MM_yyyy";

	/**
	 * TIRET_DATE_FORMAT
	 */
	public static final String TIRET_DATE_FORMAT = "dd-MM-yyyy";

	/**
	 * STANDARD_HOUR_DATE_FORMAT
	 */
	public static final String STANDARD_HOUR_DATE_FORMAT = "dd/MM/yyyy HH:mm";

	/**
	 * STANDARD_HOUR_DATE_FORMAT_LETTRE
	 */
	public static final String STANDARD_HOUR_DATE_FORMAT_LETTRE = "dd/MM/yyyy HH'h'mm";

	/**
	 * STANDARD_HOUR_DATE_FORMAT_FILE
	 */
	public static final String STANDARD_HOUR_DATE_FORMAT_FILE = "dd_MM_yyyy_HH'h'mm'm'ss";

	/**
	 * DATE_PATERN
	 */
	private static final String DATE_PATERN = "[0-9]{6}|[0-9]{8}|[0-9]{2}/[0-9]{2}/[0-9]{2}|[0-9]{2}/[0-9]{2}/[0-9]{4}";

	/**
	 * PATTERN_EMAIL
	 */
	private static final Pattern PATTERN_EMAIL = Pattern.compile("^.+@.+\\\\..+$");

	/**
	 * private constructor
	 */
	private StringUtils() {
	}

	/**
	 * @param str1
	 *            String
	 * @param str2
	 *            String
	 * @return the String that is a concatenation of str1 and str2, handling
	 *         null parameters ("abc"+null="abc").
	 */
	public static String concat(final String str1, final String str2) {
		String str1p = str1 != null ? str1 : "";
		String str2p = str2 != null ? str2 : "";
		return str1p + str2p;
	}

	/**
	 * @param mail
	 *            String
	 * @return true if string matches format XX@XX.XX
	 */
	public static Boolean isValidEmailAddress(final String mail) {
		final Matcher matcher = PATTERN_EMAIL.matcher(mail);
		return matcher.find();
	}

	/**
	 * @param sDate
	 *            String
	 * @return true if string matches "ddMMyy", "dd/MM/yyyy", "ddMMyyyy" or
	 *         "dd/MM/yy" and is a valid date (ex : 31/02/2012 forbidden)
	 */
	public static Boolean isDate(final String sDate) {

		Boolean isValidDate = sDate.matches(DATE_PATERN); // Support "ddMMyy",
															// "dd/MM/yyyy",
															// "ddMMyyyy" ou
															// "dd/MM/yy"
		Boolean result = isValidDate;
		if (isValidDate) {
			try {
				final SimpleDateFormat sdformat = new SimpleDateFormat(STANDARD_DATE_FORMAT, Locale.getDefault());
				sdformat.setLenient(false); // Forbid 31/02/2012
				final java.util.Date convertedDate = sdformat.parse(sDate);
				final String resultDate = sdformat.format(convertedDate);

				if (!sDate.equals(resultDate)) {
					result = Boolean.FALSE;
				}
			} catch (ParseException e) {
				LOGGER.debug("StringUtils::isDate", e);
				result = Boolean.FALSE;
			}
		}

		return result;
	}

	/**
	 * @param chaine
	 *            String
	 * @return true if string matches a double value
	 */
	public static Boolean isDouble(final String chaine) {
		Double parsed = null;
		try {
			parsed = Double.parseDouble(chaine);
		} catch (NumberFormatException e) {
			LOGGER.debug("StringUtils::isDouble", e);
		}
		return parsed != null;
	}

	/**
	 * @param chaine
	 *            String
	 * @return true if string matches an integer value
	 */
	public static Boolean isInteger(final String chaine) {
		Integer parsed = null;
		try {
			parsed = Integer.parseInt(chaine);
		} catch (NumberFormatException e) {
			LOGGER.debug("StringUtils::isInteger", e);
		}
		return parsed != null;
	}

	/*
	 * 
	 * Wrappers for java.lang.String methods 
	 * 
	 */

	/**
	 * @param str
	 *            String
	 * @param position
	 *            Integer
	 * @return the character at the specified index of this string. The first
	 *         character is at index 0
	 */
	public static Character charAt(final String str, final Integer position) {
		return str.charAt(position);
	}

	/**
	 * Compares two strings lexicographically
	 * 
	 * @param str1
	 *            String
	 * @param str2
	 *            String
	 * @return the value 0 if the argument str2 is equal to str1; a value less
	 *         than 0 if str1 is lexicographically less than str2; and a value
	 *         greater than 0 if str1 is lexicographically greater than str2
	 */
	public static Integer compareTo(final String str1, final String str2) {
		return str1.compareTo(str2);
	}

	/**
	 * Compares two strings lexicographically, ignoring case differences
	 * 
	 * @param str1
	 *            String
	 * @param str2
	 *            String
	 * @return the value 0 if the argument str2 is equal to str1; a value less
	 *         than 0 if str1 is lexicographically less than str2; and a value
	 *         greater than 0 if str1 is lexicographically greater than str2
	 */
	public static Integer compareToIgnoreCase(final String str1, final String str2) {
		return str1.compareToIgnoreCase(str2);
	}

	/**
	 * Encodes this String into a sequence of bytes using the named charset,
	 * storing the result into a new byte array.
	 * 
	 * @param str
	 *            String
	 * @return the resultant byte array
	 */
	public static byte[] getBytes(final String str) {
		return str.getBytes();
	}

	/**
	 * @param str
	 *            String
	 * @return the length of this string
	 */
	public static Integer length(final String str) {
		return str.length();
	}

	/**
	 * @param str
	 *            String
	 * @param regexp
	 *            String
	 * @return true if str matches regexp. Otherwise false.
	 */
	public static Boolean matches(final String str, final String regexp) {
		return str.matches(regexp);
	}

	/**
	 * @param str
	 *            String
	 * @param oldChar
	 *            char
	 * @param newChar
	 *            char
	 * @return a string derived from this string by replacing every occurrence
	 *         of oldChar with newChar
	 */
	public static String replace(final String str, final char oldChar, final char newChar) {
		return str.replace(oldChar, newChar);
	}

	/**
	 * @param str
	 *            String
	 * @param regex
	 *            String
	 * @param replacement
	 *            String
	 * @return a string derived from this string by replacing every occurrence
	 *         of regexp with replacement parameter
	 */
	public static String replaceAll(final String str, final String regex, final String replacement) {
		return str.replaceAll(regex, replacement);
	}

	/**
	 * @param str
	 *            String
	 * @param regex
	 *            String
	 * @param replacement
	 *            String
	 * @return a string derived from this string by replacing the first
	 *         occurrence of regexp with replacement parameter
	 */
	public static String replaceFirst(final String str, final String regex, final String replacement) {
		return str.replaceFirst(regex, replacement);
	}

	/**
	 * @param str
	 *            String
	 * @param regex
	 *            String
	 * @return the array of strings computed by splitting this string around
	 *         matches of the given regular expression
	 */
	public static String[] split(final String str, final String regex) {
		return str.split(regex);
	}

	/**
	 * @param str
	 *            String
	 * @return a newly allocated character array whose length is the length of
	 *         this string and whose contents are initialized to contain the
	 *         character sequence represented by this string
	 */
	public static char[] toCharArray(final String str) {
		return str.toCharArray();
	}

	/**
	 * @param input
	 *            Integer
	 * @param size
	 *            Integer
	 * @return if size is not nul a new String left padded with zeros until the
	 *         size of the crafted String is e, if size is null the toString
	 *         value
	 */
	public static String convertIntegerToString(final Integer input, final Integer size) {
		String inputAsString;

		if (input != null && size != null) {
			inputAsString = org.apache.commons.lang.StringUtils.leftPad(input.toString(), size, '0');
		} else if (input != null) {
			inputAsString = input.toString();
		} else {
			inputAsString = "";
		}

		return inputAsString;
	}

	/**
	 * 
	 * @param input
	 *            Integer
	 * @return the toString value of the Integer parameter if not null, ""
	 *         otherwise.
	 */
	public static String convertIntegerToString(final Integer input) {
		String inputAsString;

		if (input != null) {
			inputAsString = input.toString();
		} else {
			inputAsString = "";
		}

		return inputAsString;
	}

	/*
	 * 
	 * Wrappers for org.apache.commons.lang.StringUtils
	 * 
	 */

	/**
	 * @param str
	 *            String
	 * @return true if the String is empty or null
	 */
	public static Boolean isEmpty(final String str) {
		return org.apache.commons.lang.StringUtils.isEmpty(str);
	}

	/**
	 * @param str
	 *            String
	 * @return true if the String is not empty and not null
	 */
	public static Boolean isNotEmpty(final String str) {
		return org.apache.commons.lang.StringUtils.isNotEmpty(str);
	}

	/**
	 * @param str
	 *            String
	 * @return true if the String is null, empty or whitespace
	 */
	public static Boolean isBlank(final String str) {
		return org.apache.commons.lang.StringUtils.isBlank(str);
	}

	/**
	 * @param str
	 *            String
	 * @return true if the String is not null, not empty and not whitespace
	 */
	public static Boolean isNotBlank(final String str) {
		return org.apache.commons.lang.StringUtils.isNotBlank(str);
	}

	/**
	 * @param str
	 *            String
	 * @return the trimmed string, null if null String input
	 */
	public static String trim(final String str) {
		return org.apache.commons.lang.StringUtils.trim(str);
	}

	/**
	 * @param str
	 *            String
	 * @return the stripped String, null if null String input
	 */
	public static String strip(final String str) {
		return org.apache.commons.lang.StringUtils.strip(str);
	}

	/**
	 * @param str1
	 *            String
	 * @param str2
	 *            String
	 * @return true if the Strings are equal, case sensitive, or both null
	 */
	public static Boolean areEqual(final String str1, final String str2) {
		return org.apache.commons.lang.StringUtils.equals(str1, str2);
	}

	/**
	 * @param str1
	 *            String
	 * @param str2
	 *            String
	 * @return true if the Strings are equal, case insensitive, or both null
	 */
	public static Boolean equalsIgnoreCase(final String str1, final String str2) {
		return org.apache.commons.lang.StringUtils.equalsIgnoreCase(str1, str2);
	}

	/**
	 * @param str
	 *            String
	 * @param searchChar
	 *            char
	 * @return the first index of the search character, -1 if no match or null
	 *         string input
	 */
	public static Integer indexOf(final String str, final char searchChar) {
		return org.apache.commons.lang.StringUtils.indexOf(str, searchChar);
	}

	/**
	 * @param str
	 *            String
	 * @param searchChar
	 *            char
	 * @return the last index of the search character, -1 if no match or null
	 *         string input
	 */
	public static Integer lastIndexOf(final String str, final char searchChar) {
		return org.apache.commons.lang.StringUtils.lastIndexOf(str, searchChar);
	}

	/**
	 * @param str
	 *            String
	 * @param searchChar
	 *            char
	 * @return true if the String contains the search character, false if not or
	 *         null string input
	 */
	public static Boolean contains(final String str, final char searchChar) {
		return org.apache.commons.lang.StringUtils.contains(str, searchChar);
	}

	/**
	 * @param str
	 *            String
	 * @param searchStr
	 *            String
	 * @return true if the String contains the search String, false if not or
	 *         null string input
	 */
	public static Boolean contains(final String str, final String searchStr) {
		return org.apache.commons.lang.StringUtils.contains(str, searchStr);
	}

	/**
	 * @param str
	 *            String
	 * @param start
	 *            String
	 * @return substring from start position, null if null String input
	 */
	public static String substring(final String str, final Integer start) {
		return org.apache.commons.lang.StringUtils.substring(str, start);
	}

	/**
	 * @param str
	 *            String
	 * @param start
	 *            Integer
	 * @param end
	 *            Integer
	 * @return substring from start position to end position, null if null
	 *         String input
	 */
	public static String substring(final String str, final Integer start, final Integer end) {
		return org.apache.commons.lang.StringUtils.substring(str, start, end);
	}

	/**
	 * @param text
	 *            String
	 * @param searchString
	 *            String
	 * @param replacement
	 *            String
	 * @return the text with any replacements processed, null if null String
	 *         input
	 */
	public static String replace(final String text, final String searchString, final String replacement) {
		return org.apache.commons.lang.StringUtils.replace(text, searchString, replacement);
	}

	/**
	 * @param str
	 *            String
	 * @return String without newline, null if null String input
	 */
	public static String chomp(final String str) {
		return org.apache.commons.lang.StringUtils.chomp(str);
	}

	/**
	 * @param str
	 *            String
	 * @return String without last character, null if null String input
	 */
	public static String chop(final String str) {
		return org.apache.commons.lang.StringUtils.chop(str);
	}

	/**
	 * @param str
	 *            String
	 * @param repeat
	 *            integer
	 * @return a new String consisting of the original String repeated n times,
	 *         null if null String input
	 */
	public static String repeat(final String str, final Integer repeat) {
		return org.apache.commons.lang.StringUtils.repeat(str, repeat);
	}

	/**
	 * @param str
	 *            String
	 * @return the upper cased String, null if null String input
	 */
	public static String upperCase(final String str) {
		return org.apache.commons.lang.StringUtils.upperCase(str);
	}

	/**
	 * @param str
	 *            String
	 * @return the lower cased String, null if null String input
	 */
	public static String lowerCase(final String str) {
		return org.apache.commons.lang.StringUtils.lowerCase(str);
	}

	/**
	 * @param str
	 *            String
	 * @return true if the String contains only unicode letters
	 */
	public static Boolean isAlpha(final String str) {
		return org.apache.commons.lang.StringUtils.isAlpha(str);
	}

	/**
	 * @param str
	 *            String
	 * @return true if only contains letters, and is non-null
	 */
	public static Boolean isAlphaSpace(final String str) {
		return org.apache.commons.lang.StringUtils.isAlphaSpace(str);
	}

	/**
	 * @param str
	 *            String
	 * @return true if only contains letters or digits, and is non-null
	 */
	public static Boolean isAlphanumeric(final String str) {
		return org.apache.commons.lang.StringUtils.isAlphanumeric(str);
	}

	/**
	 * @param str
	 *            String
	 * @return true if only contains letters, digits or space, and is non-null
	 */
	public static Boolean isAlphanumericSpace(final String str) {
		return org.apache.commons.lang.StringUtils.isAlphanumericSpace(str);
	}

	/**
	 * @param str
	 *            String
	 * @return true if only contains digits, and is non-null
	 */
	public static Boolean isNumeric(final String str) {
		return org.apache.commons.lang.StringUtils.isNumeric(str);
	}

	/**
	 * @param str
	 *            String
	 * @return true if only contains digits or space, and is non-null
	 */
	public static Boolean isNumericSpace(final String str) {
		return org.apache.commons.lang.StringUtils.isNumericSpace(str);
	}

	/**
	 * @param str
	 *            String
	 * @return true if only contains whitespace, and is non-null
	 */
	public static Boolean isWhitespace(final String str) {
		return org.apache.commons.lang.StringUtils.isWhitespace(str);
	}

	/**
	 * @param str
	 *            String
	 * @return the reversed String, null if null String input
	 */
	public static String reverse(final String str) {
		return org.apache.commons.lang.StringUtils.reverse(str);
	}

	/**
	 * @param str
	 *            the String to remove characters from, may be null
	 * @param stripChars
	 *            the characters to remove, null treated as whitespace
	 * @return the stripped String, <code>null</code> if null String input
	 */
	public static String stripEnd(String str, String stripChars) {
		return org.apache.commons.lang.StringUtils.stripEnd(str, stripChars);
	}

	/**
	 * method format.
	 *
	 * Returns a formatted string using the specified format string, and
	 * arguments.
	 * 
	 * @param format
	 *            format string
	 * @param argument
	 *            Argument referenced by the format specifiers in the format
	 *            string.
	 * @return A formatted string
	 */
	public static String format(String format, Object argument) {
		return String.format(Locale.getDefault(), format, argument);
	}

	/**
	 * Gets the substring before the first occurrence of a separator. The
	 * separator is not returned.
	 * 
	 * @param str
	 *            the String to get a substring from, may be null
	 * @param separator
	 *            the String to search for, may be null
	 * @return the substring before the first occurrence of the separator, null
	 *         if null String input
	 */
	public static String substringBefore(String str, String separator) {
		return org.apache.commons.lang.StringUtils.substringBefore(str, separator);
	}

	/**
	 * Gets the substring after the first occurrence of a separator. The
	 * separator is not returned.
	 * 
	 * @param str
	 *            the String to get a substring from, may be null
	 * @param separator
	 *            the String to search for, may be null
	 * @return the substring after the first occurrence of the separator, null
	 *         if null String input
	 */
	public static String substringAfter(String str, String separator) {
		return org.apache.commons.lang.StringUtils.substringBefore(str, separator);
	}

}