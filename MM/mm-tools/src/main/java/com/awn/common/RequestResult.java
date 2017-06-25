package com.awn.common;

/**
 * Generic Request result. It encapsulate the result with application messages.
 */
public class RequestResult<D> {

	private D data;
	private ApplicationMessages messages;

	/**
	 * Constructor
	 * 
	 * @param data
	 *            result data
	 * @param messages
	 *            application messages
	 */
	public RequestResult(D data, ApplicationMessages messages) {
		super();
		this.data = data;
		this.messages = messages;
	}

	/**
	 * Get service the result.
	 * 
	 * @return
	 */
	public D getData() {
		return data;
	}

	/**
	 * Set service the result.
	 * 
	 * @param data
	 */
	public void setData(D data) {
		this.data = data;
	}

	/**
	 * Get the application messages.
	 * 
	 * @return
	 */
	public ApplicationMessages getMessages() {
		return messages;
	}

	/**
	 * Set the application messages.
	 * 
	 * @param messages
	 */
	public void setMessages(ApplicationMessages messages) {
		this.messages = messages;
	}

}
