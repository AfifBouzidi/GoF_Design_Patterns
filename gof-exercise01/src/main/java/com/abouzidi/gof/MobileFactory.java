package com.abouzidi.gof;

public class MobileFactory {

	private static MobileFactory mobileFactory = new MobileFactory();

	private MobileFactory() {

	}

	public static MobileFactory getInstance() {
		return mobileFactory;
	}

	public Mobile createMobile(MobileType mobileType) {
		switch (mobileType) {
		case SAMSUNG:
			return new SamSung();
		case IPHONE:
			return new IPhone();
		case WINDOWSPHONE:
			return new WindowsPhone();
		default:
			throw new IllegalArgumentException("Moile Type not found");
		}
	}
}
