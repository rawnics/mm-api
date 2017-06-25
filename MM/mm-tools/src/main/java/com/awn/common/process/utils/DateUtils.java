package com.awn.common.process.utils;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DateUtils.
 * 
 */
public final class DateUtils {

	public static final Long MILLISECOND_PER_DAY = Long.valueOf(24 * 60 * 60 * 1000L);
	public static final Long MILLISECOND_PER_YEAR = Long.valueOf(MILLISECOND_PER_DAY * 365);

	public static final String SHORT_DATE_FORMAT = "ddMMyy";
	public static final String STANDARD_DATE_FORMAT = "dd/MM/yyyy";
	public static final String STANDARD_DATE_FORMAT_WITHOUT_SEP = "ddMMyyyy";
	public static final String SHORT_DATE_FORMAT_WITH_SEP = "dd/MM/yy";
	public static final String STANDARD_DATE_FORMAT_WITH_TIRET = "dd-MM-yyyy";

	// Logger declaration.
	private static final Logger LOGGER = LoggerFactory.getLogger(DateUtils.class);

	private static final Map<String, SimpleDateFormat> simpleDateFormats = new HashMap<>();

	/**
	 * private constructor
	 */
	private DateUtils() {
	}

	/**
	 * Build date method.
	 * 
	 * @param day
	 *            as Integer
	 * @param month
	 *            as Integer
	 * @param year
	 *            as Integer
	 * @return a date built on day, month and year. Be careful, month starts to
	 *         0.
	 */

	public static Date buildDate(final Integer day, final Integer month, final Integer year) {
		final Calendar gc = new GregorianCalendar(year, month, day);
		return gc.getTime();
	}

	/**
	 * Build date method.
	 * 
	 * @param day
	 *            as String
	 * @param month
	 *            as String
	 * @param year
	 *            as String
	 * @return a date built on day, month and year. Be careful, month starts to
	 *         0.
	 */
	public static Date buildDate(final String day, final String month, final String year) {
		return buildDate(Integer.valueOf(day), Integer.valueOf(month), Integer.valueOf(year));
	}

	/**
	 * Update year method.
	 * 
	 * @param date
	 *            Date
	 * @param year
	 *            integer
	 * @return a new date, with updated year value
	 */
	public static Date updateYear(final Date date, final Integer year) {

		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		calendar.set(GregorianCalendar.YEAR, year);

		return calendar.getTime();
	}

	/**
	 * Update year and month method.
	 * 
	 * @param date
	 *            Date
	 * @param year
	 *            Integer
	 * @param month
	 *            Integer
	 * @return a new date, with updated year and month values. Warning, month
	 *         starts to 0.
	 */
	public static Date updateYearAndMonth(final Date date, final Integer year, final Integer month) {

		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		calendar.set(GregorianCalendar.YEAR, year);
		calendar.set(GregorianCalendar.MONTH, month);

		return calendar.getTime();
	}

	/**
	 * Update year month and day method.
	 * 
	 * @param date
	 *            Date
	 * @param year
	 *            Integer
	 * @param month
	 *            Integer
	 * @param day
	 *            Integer
	 * @return a new date, with updated year, month and days values. Warning,
	 *         month starts to 0.
	 */
	public static Date updateYearMonthAndDay(final Date date, final Integer year, final Integer month,
			final Integer day) {

		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		calendar.set(GregorianCalendar.YEAR, year);
		calendar.set(GregorianCalendar.MONTH, month);
		calendar.set(GregorianCalendar.DAY_OF_MONTH, day);

		return calendar.getTime();
	}

	/**
	 * add a number of days to current date
	 * 
	 * @param days
	 *            Integer
	 * @return a new date, with updated days
	 */
	public static Date addDaysToCurrentDate(final Integer days) {

		final Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, days);

		return calendar.getTime();
	}

	/**
	 * add a number of months to current date
	 * 
	 * @param months
	 *            Integer
	 * @return a new date, with updated months
	 */
	public static Date addMonthsToCurrentDate(final Integer months) {

		final Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, months);

		return calendar.getTime();
	}

	/**
	 * add a number of years to current date
	 * 
	 * @param years
	 *            Integer
	 * @return a new date, with updated years
	 */
	public static Date addYearsToCurrentDate(final Integer years) {

		final Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, years);

		return calendar.getTime();
	}

	/**
	 * add a number of days to a given date
	 * 
	 * @param date
	 *            Date
	 * @param days
	 *            Integer
	 * @return a new date, with updated days
	 */
	public static Date addDaysToDate(final Date date, final Integer days) {

		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, days);

		return calendar.getTime();
	}

	/**
	 * add a number of months to a given date
	 * 
	 * @param date
	 *            Date
	 * @param months
	 *            Integer
	 * @return a new date, with updated months
	 */
	public static Date addMonthsToDate(final Date date, final Integer months) {

		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, months);

		return calendar.getTime();
	}

	/**
	 * add a number of years to a given date
	 * 
	 * @param date
	 *            Date
	 * @param years
	 *            Integer
	 * @return a new date, with updated years
	 */
	public static Date addYearsToDate(final Date date, final Integer years) {

		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, years);

		return calendar.getTime();
	}

	/* **** Comparaison methods for Date type. **** */

	/**
	 * Compare two dates
	 * 
	 * @param date1
	 *            Date
	 * @param date2
	 *            Date
	 * @return 1 if the first date is later than the second date -1 If the first
	 *         date is anterior to the second date, 0 if the two dates are
	 *         identical (to the day)
	 */
	public static Integer compareDates(final Date date1, final Date date2) {

		// Compare null dates
		Integer result = compareNullDates(date1, date2);

		if (result == null) {
			final Calendar calendar1 = Calendar.getInstance();
			calendar1.setTime(date1);

			final Calendar calendar2 = Calendar.getInstance();
			calendar2.setTime(date2);

			if (calendar1.get(Calendar.YEAR) < calendar2.get(Calendar.YEAR)) {
				result = -1;
			} else if (calendar1.get(Calendar.YEAR) > calendar2.get(Calendar.YEAR)) {
				result = 1;
			} else {
				result = compareDatesIgnoringYear(date1, date2);
			}
		}

		return result;
	}

	/**
	 * Compare two dates ignoring year
	 * 
	 * @param date1
	 *            Date
	 * @param date2
	 *            Date
	 * @return -1 If the first date is anterior to the second date, 0 if the two
	 *         dates are identical (to the day)
	 */
	public static Integer compareDatesIgnoringYear(final Date date1, final Date date2) {

		// Compare null dates
		Integer result = compareNullDates(date1, date2);

		if (result == null) {

			final Calendar calendar1 = Calendar.getInstance();
			calendar1.setTime(date1);

			final Calendar calendar2 = Calendar.getInstance();
			calendar2.setTime(date2);

			if (calendar1.get(Calendar.MONTH) < calendar2.get(Calendar.MONTH)) {
				result = -1;
			} else if (calendar1.get(Calendar.MONTH) > calendar2.get(Calendar.MONTH)) {
				result = 1;
			} else {
				// Compare days
				result = compareDays(calendar1, calendar2);
			}
		}
		return result;

	}

	/**
	 * Method compare days.
	 * 
	 * @param calendar1
	 *            Calendar
	 * @param calendar2
	 *            Calendar
	 * @return Integer
	 */
	private static Integer compareDays(final Calendar calendar1, final Calendar calendar2) {
		Integer result;
		if (calendar1.get(Calendar.DAY_OF_MONTH) < calendar2.get(Calendar.DAY_OF_MONTH)) {
			result = -1;
		} else if (calendar1.get(Calendar.DAY_OF_MONTH) > calendar2.get(Calendar.DAY_OF_MONTH)) {
			result = 1;
		} else {
			result = 0;
		}
		return result;
	}

	/**
	 * Method compare null dates
	 * 
	 * @param date1
	 *            Date
	 * @param date2
	 *            Date
	 * @return Integer
	 */
	private static Integer compareNullDates(final Date date1, final Date date2) {
		Integer result = null;
		if (date1 == null && date2 == null) {
			result = 0;
		} else if (date1 == null) {
			result = -1;
		} else if (date2 == null) {
			result = 1;
		}
		return result;
	}

	/**
	 * Is in interval method.
	 * 
	 * @param dateInf
	 *            Date
	 * @param dateSup
	 *            Date
	 * @param dateToTest
	 *            Date
	 * @return true if dateToTest is included between dateInf and dateSup
	 */
	public static Boolean isInInterval(final Date dateInf, final Date dateSup, final Date dateToTest) {

		Boolean result = Boolean.TRUE;

		// Inside interval : dateInf > dateSup
		if ((compareDates(dateInf, dateSup) == 1)
				&& (compareDates(dateToTest, dateInf) == 1 || compareDates(dateSup, dateToTest) == 1)) {
			result = Boolean.FALSE;
		}
		// Outside interval
		if (compareDates(dateInf, dateToTest) == 1 || compareDates(dateToTest, dateSup) == 1) {
			result = Boolean.FALSE;
		}

		return result;

	}

	/**
	 * Get difference in days method.
	 * 
	 * @param date1
	 *            Date
	 * @param date2
	 *            Date
	 * @return Rounded difference number of days between date2 and date1.
	 *         Positive if date2>date1, otherwise negative
	 */
	public static Integer getDifferenceInDays(final Date date1, final Date date2) {

		final Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(date1);

		final Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(date2);

		return (int) ((calendar2.getTimeInMillis() - calendar1.getTimeInMillis()) / MILLISECOND_PER_DAY);
	}

	/**
	 * Get difference in years method.
	 * 
	 * @param date1
	 *            Date
	 * @param date2
	 *            Date
	 * @return Rounded difference number of years between date2 and date1.
	 *         Positive if date2>date1, otherwise negative
	 */
	public static Integer getDifferenceInYears(final Date date1, final Date date2) {

		final Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(date1);

		final Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(date2);

		return (int) ((calendar2.getTimeInMillis() - calendar1.getTimeInMillis()) / MILLISECOND_PER_YEAR);

	}

	/**
	 * Get difference in working days method.
	 * 
	 * @param date1
	 *            Date
	 * @param date2
	 *            Date
	 * @return Rounded difference number of working days between date2 and
	 *         date1. Positive if date2>date1, otherwise negative
	 */
	public static Integer getDifferenceInWorkingDays(final Date date1, final Date date2) {

		final Integer numberOfDay = getDifferenceInDays(date1, date2);
		Integer delta = 0;

		final Calendar calendar = Calendar.getInstance();
		if (numberOfDay > 0) {
			calendar.setTime(date1);
		} else if (numberOfDay < 0) {
			calendar.setTime(date2);
		}

		if (numberOfDay != 0) {
			for (Integer i = 1; i <= Math.abs(numberOfDay); i++) {
				if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY
						&& calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
					delta++;
				}
				calendar.add(Calendar.DAY_OF_MONTH, 1);
			}
		}

		return Integer.signum(numberOfDay) * delta;

	}

	/**
	 * Get year methos.
	 * 
	 * @param date
	 *            Date
	 * @return Year of given date
	 */
	public static Integer getYear(final Date date) {
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}

	/**
	 * Get year as String method.
	 * 
	 * @param date
	 *            Date
	 * @return Year of given date as String
	 */
	public static String getYearAsString(final Date date) {
		return String.valueOf(getYear(date));
	}

	/**
	 * Get month method.
	 * 
	 * @param date
	 *            Date
	 * @return Month of given date
	 */
	public static Integer getMonth(final Date date) {
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) + 1;
	}

	/**
	 * Get month as String method.
	 * 
	 * @param date
	 *            Date
	 * @return Month of given date as String
	 */
	public static String getMonthAsString(final Date date) {
		final DecimalFormat nft = new java.text.DecimalFormat("#00.###");
		nft.setDecimalSeparatorAlwaysShown(false);
		return nft.format(getMonth(date));
	}

	/**
	 * Get day method.
	 * 
	 * @param date
	 *            Date
	 * @return Day of given date
	 */
	public static Integer getDay(final Date date) {
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * Get day as String method.
	 * 
	 * @param date
	 *            Date
	 * @return Day of given date as String
	 */
	public static String getDayAsString(final Date date) {
		return String.valueOf(getDay(date));
	}

	private static SimpleDateFormat getSimpleDateFormat(String pattern) {
		SimpleDateFormat format = simpleDateFormats.get(pattern);
		if (format == null) {
			format = new SimpleDateFormat(pattern, Locale.getDefault());
			simpleDateFormats.put(pattern, format);
		}
		return format;
	}

	/**
	 * Convert date to String method.
	 * 
	 * @param date
	 *            Date
	 * @param pattern
	 *            matching Date and Time Java patterns (ex :
	 *            "yyyy.MM.dd G 'at' HH:mm:ss z")
	 * @return String representation of given date, matching pattern
	 */
	public static String convertDateToString(final Date date, final String pattern) {
		String result = null;
		if (date != null && pattern != null) {
			final SimpleDateFormat format = getSimpleDateFormat(pattern);
			result = format.format(date);
		}
		return result;
	}

	/**
	 * Convert a String to its Date equivalent. Supports following formats :
	 * "ddMMyy", "dd/MM/yyyy", "ddMMyyyy", "dd/MM/yy" and "dd-MM-yyyy"
	 * 
	 * @param sDate
	 *            String
	 * @return Date converted from String
	 */
	public static Date convertStringToDate(final String sDate) {
		if (sDate == null) {
			return null;
		}
		try {
			return org.apache.commons.lang.time.DateUtils.parseDate(sDate,
					new String[] { SHORT_DATE_FORMAT, STANDARD_DATE_FORMAT, STANDARD_DATE_FORMAT_WITHOUT_SEP,
							SHORT_DATE_FORMAT_WITH_SEP, STANDARD_DATE_FORMAT_WITH_TIRET });
		} catch (ParseException e) {
			LOGGER.debug("DateUtils::convertStringToDate", e);
			return null;
		}
	}

	/**
	 * Convert a String to its Date equivalent using given format date
	 * 
	 * @param sDate
	 *            String
	 * @param format
	 *            String
	 * @return Date converted from String
	 */
	public static Date convertStringToDate(final String sDate, final String format) {
		java.util.Date resultDate = null;
		if (sDate != null && format != null) {
			resultDate = checkFormatDate(sDate, getSimpleDateFormat(format));
		}
		return resultDate;
	}

	/**
	 * Check format date method
	 * 
	 * @param sDate
	 *            String
	 * @param sdformat
	 *            SimpleDateFormat
	 * @return Date
	 */
	private static Date checkFormatDate(final String sDate, final SimpleDateFormat sdformat) {

		java.util.Date result = null;
		try {
			sdformat.setLenient(false); // Forbid 31/02/2012
			final java.util.Date dateConvertit = sdformat.parse(sDate);

			String resultDate = sdformat.format(dateConvertit);

			if (sDate.equals(resultDate)) {
				result = dateConvertit;
			}

			return result;
		} catch (ParseException e) {
			LOGGER.debug("DateUtils::checkFormatDate", e);
			return null;
		}
	}

}