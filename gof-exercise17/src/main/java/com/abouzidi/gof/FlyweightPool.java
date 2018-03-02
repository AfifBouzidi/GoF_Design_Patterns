package com.abouzidi.gof;

import java.util.HashMap;
import java.util.Map;

public class FlyweightPool {

	private Map<MobileType, FlyweightMobile> mobiles = new HashMap<>();

	public FlyweightMobile getFlyweightMobile(MobileType mobileType) {
		FlyweightMobile mobile = mobiles.get(mobileType);
		if (mobile == null) {
			mobile = new Mobile(mobileType);
			mobiles.put(mobileType, mobile);
		}
		return mobile;
	}

}
