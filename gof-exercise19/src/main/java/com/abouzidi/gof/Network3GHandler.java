package com.abouzidi.gof;

import java.util.logging.Logger;

public class Network3GHandler extends Handler {

	private final Logger LOG = Logger.getLogger(Network3GHandler.class.getName());
	
	private Connection connection;

	public Network3GHandler(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void sendMessage(String message) {
		if (connection != null) {
			LOG.info("send message by 3G");
			connection.sendMessage(message);
		} else if(nextHandler!=null) {
			LOG.info("[3G] forward to the next handler");
			nextHandler.sendMessage(message);
		}
	}

}
