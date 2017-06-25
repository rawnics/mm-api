
package com.awn.core.exception;

import java.io.Serializable;

/**
 * The ApplicationException class reflects a localized problem in the code
 * implementation of the application.
 */
public class ApplicationException extends RuntimeException implements Serializable {

	/**
	 * the serialVersionUID.
	 */
	private static final long serialVersionUID = 5181630160135349969L;

	/**
	 * Default constructor.
	 */
	public ApplicationException() {
		super();
	}

	/**
	 * Constructor of ApplicationException with the message.
	 * 
	 * @param message
	 *            the message
	 */
	public ApplicationException(String message) {
		super(message);
	}

	/**
	 * Constructor of ApplicationException with the message and the inner.
	 * 
	 * @param message
	 *            the message
	 * @param ex
	 *            the inner throwable
	 */
	public ApplicationException(String message, Throwable ex) {
		super(message, ex);
	}

	/**
	 * Constructor of ApplicationException with the inner.
	 * 
	 * ram ex the inner throwable
	 */
	public ApplicationException(Throwable ex) {
		super(ex);
	}

	/**
	 * Constructs an ApplicationException with a detail message. This
	 * constructor is here for compatibility with exception handlers.
	 * 
	 * @param declarative
	 *            unused
	 * @param message
	 *            the detail message
	 */
	public ApplicationException(boolean declarative, String message) {
		super(message);
	}

}
