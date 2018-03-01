package com.abouzidi.gof;

public class MobileFactory3g implements MobileFactory {

	public IPhone createIPhone() {
		return new IPhone3g();
	}

	public SamSung createSamSung() {
		return new SamSung3g();
	}

}
