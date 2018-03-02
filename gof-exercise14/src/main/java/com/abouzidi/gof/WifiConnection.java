package com.abouzidi.gof;

import java.util.logging.Logger;

public class WifiConnection extends Connection {

	private final Logger LOG = Logger.getLogger(WifiConnection.class.getName());

	@Override
	public void connect() {
		LOG.info("wifi connection");
	}

}
