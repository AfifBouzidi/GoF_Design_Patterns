package com.abouzidi.gof;

import java.util.logging.Logger;

public class Communication3g implements Communication {

	private final Logger LOG = Logger.getLogger(Communication3g.class.getName());

	public void communicate() {
		LOG.info("3G Communication");
	}

}
