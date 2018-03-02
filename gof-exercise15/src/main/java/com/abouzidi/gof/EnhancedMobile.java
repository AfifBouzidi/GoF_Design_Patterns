package com.abouzidi.gof;

import java.util.logging.Logger;

public class EnhancedMobile extends MobileDecorator {

	private final Logger LOG = Logger.getLogger(EnhancedMobile.class.getName());

	public EnhancedMobile(Mobile mobile) {
		super(mobile);
	}

	@Override
	public void voiceCall() {
		enhanceVoiceQuality();
		super.voiceCall();
	}

	private void enhanceVoiceQuality() {
		LOG.info("Enhance voice quality");
	}

}
