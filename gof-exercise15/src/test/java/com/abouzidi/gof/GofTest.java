package com.abouzidi.gof;

import org.junit.Before;
import org.junit.Test;

public class GofTest {

	private Mobile basicMobile;
	private Mobile enhancedMobile;

	@Before
	public void setUp() throws Exception {
		basicMobile = new BasicMobile();
		enhancedMobile = new EnhancedMobile(basicMobile);
	}

	@Test
	public void test() {
		enhancedMobile.voiceCall();
	}

}
