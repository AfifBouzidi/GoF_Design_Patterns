package com.abouzidi.gof;

public class MobileFactory4g implements MobileFactory {

	public IPhone createIPhone() {
		return new IPhone4g();
	}

	public SamSung createSamSung() {
		return new SamSung4g();
	}

}
