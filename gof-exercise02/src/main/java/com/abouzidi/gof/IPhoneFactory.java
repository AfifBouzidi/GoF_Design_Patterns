package com.abouzidi.gof;

public class IPhoneFactory implements MobileFactory {

	public Mobile createMobile() {
		return new IPhone();
	}

}
