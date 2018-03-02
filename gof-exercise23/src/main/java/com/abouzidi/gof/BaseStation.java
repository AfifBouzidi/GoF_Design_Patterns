package com.abouzidi.gof;

import java.util.ArrayList;
import java.util.List;

public class BaseStation implements Mediator {

	private List<Mobile> mobiles = new ArrayList<>();

	@Override
	public void registerMobile(Mobile mobile) {
		mobiles.add(mobile);
	}

	@Override
	public void diffuseMessage(Mobile mobile, String message) {
		for (Mobile dist : mobiles) {
			if (!dist.equals(mobile)) {
				dist.receiveMessage(message);
			}
		}
	}

}
