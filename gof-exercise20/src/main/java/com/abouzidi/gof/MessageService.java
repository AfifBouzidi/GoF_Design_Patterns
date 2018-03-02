package com.abouzidi.gof;

import java.util.logging.Logger;

public class MessageService {

	private final Logger LOG = Logger.getLogger(MessageService.class.getName());

	public void sendMessage(String message) {
		LOG.info("send message: " + message);
	}

}
