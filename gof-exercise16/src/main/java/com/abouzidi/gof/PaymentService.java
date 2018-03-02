package com.abouzidi.gof;

import java.util.logging.Logger;

public class PaymentService {

	private final Logger LOG = Logger.getLogger(PaymentService.class.getName());

	public void makePayment() {
		LOG.info("make payment");
	}

}
