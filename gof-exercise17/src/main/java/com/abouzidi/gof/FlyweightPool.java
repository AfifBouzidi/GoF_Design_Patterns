package com.abouzidi.gof;

import java.util.EnumMap;
import java.util.Map;

public class FlyweightPool {

	private Map<MobileType, FlyweightMobile> mobiles = new EnumMap<>(MobileType.class);

	public FlyweightMobile getFlyweightMobile(MobileType mobileType) {
		FlyweightMobile mobile = mobiles.get(mobileType);
		if (mobile == null) {
			mobile = new Mobile(mobileType);
			mobiles.put(mobileType, mobile);
		}
		return mobile;
	}

}
