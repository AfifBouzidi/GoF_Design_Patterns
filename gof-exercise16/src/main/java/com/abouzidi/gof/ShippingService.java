package com.abouzidi.gof;

import java.util.logging.Logger;

public class ShippingService {

	private final Logger LOG = Logger.getLogger(ShippingService.class.getName());

	public void shipMobile() {
		LOG.info("ship mobile");
	}
}
