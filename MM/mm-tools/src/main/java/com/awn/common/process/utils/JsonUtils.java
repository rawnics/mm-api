package com.awn.common.process.utils;

import java.io.File;
import java.util.Date;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.module.SimpleModule;

public final class JsonUtils {

	private static ObjectMapper mapper = new ObjectMapper();

	public static ObjectMapper objectMapper() {

		ObjectMapper objectMapper = new ObjectMapper();

		SimpleModule simpleModule = new SimpleModule();
		simpleModule.addDeserializer(Date.class, new CustomDateDeserializer());
		objectMapper.registerModule(simpleModule);

		return objectMapper;
	}

	public static <T> T readJsonObject(String file, Class<T> type) {
		mapper = objectMapper();
		T returned = null;
		try {
			returned = mapper.readValue(new File(file), type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returned;
	}

	public static void writeJsonObject(String file, Object object) {
		mapper = objectMapper();
		ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
		try {
			writer.writeValue(new File(file), object);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
