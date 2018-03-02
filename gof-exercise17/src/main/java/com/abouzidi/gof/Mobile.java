package com.abouzidi.gof;

import java.util.logging.Logger;

public class Mobile implements FlyweightMobile {

	private final Logger LOG = Logger.getLogger(Mobile.class.getName());

	private MobileType mobileType;

	public Mobile(MobileType mobileType) {
		this.mobileType = mobileType;
	}

	@Override
	public void communicateOverNetwork(String network) {
		LOG.info("communication over " + network);
	}

	@Override
	public String toString() {
		return "Mobile [mobileType=" + mobileType + "]";
	}

}
