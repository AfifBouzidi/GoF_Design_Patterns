package com.abouzidi.gof;

public class WindowsPhoneFactory implements MobileFactory {

	public Mobile createMobile() {
		return new WindowsPhone();
	}

}
