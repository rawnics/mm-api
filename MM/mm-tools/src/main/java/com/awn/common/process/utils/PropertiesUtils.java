package com.awn.common.process.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * PropertiesUtils
 */
public final class PropertiesUtils {

	// Prefix declaration.
	private static final String PREFIX = "/";

	// Logger declaration.
	private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesUtils.class);

	/**
	 * private constructor
	 */
	private PropertiesUtils() {
	}

	/**
	 * @param resourceName
	 *            resource name
	 * @return properties
	 */
	public static Map<Object, Object> extractProperties(final String resourceName) {
		final Properties properties = new Properties();
		InputStream propertiesInputStream = null;
		// Verify if the resource name starts with a "/", otherwise it might
		// result by an issue while loading the resource.
		// See the documentation of "PropertiesUtils.class.getResourceAsStream"
		String tmpResourceName = resourceName;
		if (!tmpResourceName.startsWith(PREFIX)) {
			tmpResourceName = PREFIX.concat(resourceName);
		}
		try {
			propertiesInputStream = PropertiesUtils.class.getResourceAsStream(tmpResourceName);
			if (propertiesInputStream != null) {
				properties.load(propertiesInputStream);
			} else {
				LOGGER.error(resourceName + " not found");
			}
		} catch (IOException e) {
			LOGGER.error("PropertiesUtils::extractProperties", e);
		} finally {
			if (propertiesInputStream != null) {
				try {
					propertiesInputStream.close();
				} catch (IOException e) {
					LOGGER.error("PropertiesUtils::extractProperties", e);
				}
				propertiesInputStream = null;
			}
		}
		return properties;
	}
}