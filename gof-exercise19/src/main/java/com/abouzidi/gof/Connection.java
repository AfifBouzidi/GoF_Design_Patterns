package com.abouzidi.gof;

import java.util.logging.Logger;

public class Connection {

	private final Logger LOG = Logger.getLogger(Connection.class.getName());

	public void sendMessage(String message) {
		LOG.info("send message: " + message);
	}

}
