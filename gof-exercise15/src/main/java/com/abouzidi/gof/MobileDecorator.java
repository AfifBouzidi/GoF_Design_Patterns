package com.abouzidi.gof;

public class MobileDecorator extends Mobile {

	private Mobile mobile;

	public MobileDecorator(Mobile mobile) {
		this.mobile = mobile;
	}

	@Override
	public void voiceCall() {
		this.mobile.voiceCall();
	}

}
