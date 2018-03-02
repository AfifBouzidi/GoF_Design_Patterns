package com.abouzidi.gof;

import java.util.logging.Logger;

public class UsbConnection  extends Connection{

	private final Logger LOG = Logger.getLogger(UsbConnection.class.getName());

	@Override
	public void connect() {
		LOG.info("usb connection");
	}
}
