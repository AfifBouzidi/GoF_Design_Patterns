package com.abouzidi.gof;

public class SamSungFactory implements MobileFactory {

	public Mobile createMobile() {
		return new SamSung();
	}

}
