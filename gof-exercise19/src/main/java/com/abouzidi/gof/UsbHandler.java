package com.abouzidi.gof;

import java.util.logging.Logger;

public class UsbHandler extends Handler {

	private final Logger LOG = Logger.getLogger(UsbHandler.class.getName());

	private Connection connection;

	public UsbHandler(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void sendMessage(String message) {
		if (connection != null) {
			LOG.info("send message by USB");
			connection.sendMessage(message);
		} else if (nextHandler != null) {
			LOG.info("[USB] forward to the next handler");
			nextHandler.sendMessage(message);
		}
	}
}
