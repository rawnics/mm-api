package com.awn.common.process.utils;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.BigDecimalConverter;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.SqlTimestampConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ObjectUtils
 * 
 */
public final class ObjectUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(ObjectUtils.class);

	/**
	 * private constructor
	 */
	private ObjectUtils() {
	}

	/**
	 * @param obj
	 *            Object
	 * @return true if object is null. Otherwise false.
	 */
	public static Boolean isNull(final Object obj) {
		return obj == null;
	}

	/**
	 * @param obj1
	 *            Object
	 * @param obj2
	 *            Object
	 * @return true if obj1 is the same as obj2. Otherwise false.
	 */
	public static Boolean areEqual(final Object obj1, final Object obj2) {
		return obj1.equals(obj2);
	}

	/**
	 * @param obj
	 *            Object
	 * @return a string representation of the object.
	 */
	public static String toString(final Object obj) {
		return obj.toString();
	}

	/**
	 * Copy property values from the origin bean to the destination bean for all
	 * cases where the property names are the same.
	 * 
	 * @param dest
	 *            Object
	 * @param orig
	 *            Object
	 */
	public static void copyProperties(final Object dest, final Object orig) {
		try {
			ConvertUtils.register(new SqlTimestampConverter(null), Timestamp.class);
			ConvertUtils.register(new BigDecimalConverter(null), BigDecimal.class);
			ConvertUtils.register(new DateConverter(null), Date.class);
			BeanUtils.copyProperties(dest, orig);
		} catch (Exception e) {
			LOGGER.error("An error occured while executing method: copyProperties ", e);
		}
	}

	/**
	 * Return the object of a given type from a set of Object.
	 * 
	 * @param resultset
	 *            Object
	 * @param type
	 *            String
	 * @return the object of the given type.
	 */
	public static Object getObjectByType(final Object[] resultset, final String type) {

		String typeObj;
		Boolean simpleRefType;

		Object result = null;

		if (resultset != null) {
			for (int i = 0; i < resultset.length; i++) {
				if (resultset[i] != null) {
					typeObj = resultset[i].getClass().getName();
					simpleRefType = StringUtils.indexOf(type, '.') < 0;
					if (simpleRefType) {
						typeObj = StringUtils.substring(typeObj, StringUtils.lastIndexOf(typeObj, '.') + 1,
								typeObj.length());
					}
					if (type.equals(typeObj)) {
						result = resultset[i];
						break;
					}
				}
			}
		}
		return result;

	}

}
