package com.abouzidi.gof;

import java.util.logging.Logger;

public class WifiHandler extends Handler {
	
	private final Logger LOG = Logger.getLogger(WifiHandler.class.getName());

	private Connection connection;

	public WifiHandler(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void sendMessage(String message) {
		if (connection != null) {
			LOG.info("send message by wifi");
			connection.sendMessage(message);
		} else if(nextHandler!=null) {
			LOG.info("[wifi] forward to the next handler");
			nextHandler.sendMessage(message);
		}
	}

}
