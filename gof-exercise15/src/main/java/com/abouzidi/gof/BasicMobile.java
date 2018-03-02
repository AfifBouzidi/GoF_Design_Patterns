package com.abouzidi.gof;

import java.util.logging.Logger;

public class BasicMobile  extends Mobile{
	
	private final Logger LOG = Logger.getLogger(BasicMobile.class.getName());

	@Override
	public void voiceCall() {
		LOG.info("voice call");
	}

}
