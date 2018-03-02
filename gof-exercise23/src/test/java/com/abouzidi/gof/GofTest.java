package com.abouzidi.gof;

import org.junit.Before;
import org.junit.Test;

public class GofTest {

	Mobile myMobile;
	Mediator mediator;

	@Before
	public void setUp() throws Exception {
		mediator = new BaseStation();
		myMobile = new Mobile(mediator, "111");
		mediator.registerMobile(new Mobile(mediator, "122"));
		mediator.registerMobile(new Mobile(mediator, "211"));
		mediator.registerMobile(new Mobile(mediator, "345"));
		mediator.registerMobile(new Mobile(mediator, "283"));

	}

	@Test
	public void test() {
		myMobile.sendMessage("Hello...");
	}

}
