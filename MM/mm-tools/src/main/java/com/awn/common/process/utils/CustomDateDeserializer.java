
package com.awn.common.process.utils;

import java.io.IOException;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer;

public class CustomDateDeserializer extends DateDeserializer {

	private static final long serialVersionUID = -2275951539867772400L;

	@Override
	public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {

		if (jp.getCurrentTokenId() == JsonTokenId.ID_STRING) {
			try {
				return DateUtils.parseDate(jp.getText(),
						new String[] { "MM/dd/yyyy", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd'T'HH:mm:ss.SSSZ" });
			} catch (Exception e) {
				return super.deserialize(jp, ctxt);
			}
		} else {
			return super.deserialize(jp, ctxt);
		}
	}

}