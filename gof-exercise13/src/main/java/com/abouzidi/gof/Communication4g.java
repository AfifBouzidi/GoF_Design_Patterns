package com.abouzidi.gof;

import java.util.logging.Logger;

public class Communication4g implements Communication{

	private final Logger LOG = Logger.getLogger(Communication4g.class.getName());

	public void communicate() {
		LOG.info("4G Communication");
	}
	
}
