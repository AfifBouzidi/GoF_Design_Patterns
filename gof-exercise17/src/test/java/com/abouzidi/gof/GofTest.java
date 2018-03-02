package com.abouzidi.gof;

import org.junit.Before;
import org.junit.Test;

public class GofTest {

	FlyweightPool flyweightPool;

	@Before
	public void setUp() throws Exception {
		flyweightPool = new FlyweightPool();
	}

	@Test
	public void test() {
		FlyweightMobile flyweightMobileOne = flyweightPool.getFlyweightMobile(MobileType.SAMSUNG);
		FlyweightMobile flyweightMobileTwo = flyweightPool.getFlyweightMobile(MobileType.SAMSUNG);
		flyweightMobileOne.communicateOverNetwork("3G");
		flyweightMobileTwo.communicateOverNetwork("4G");
	}

}
