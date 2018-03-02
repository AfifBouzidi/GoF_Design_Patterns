package com.abouzidi.gof;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;

public class Mobile implements Observer {
	private final Logger LOG = Logger.getLogger(Mobile.class.getName());

	private String message;

	@Override
	public void update(Observable modem, Object message) {
		this.message = (String) message;
		LOG.info("message received from modem: " + this.message);

	}

	public String getMessage() {
		return message;
	}
	
}
