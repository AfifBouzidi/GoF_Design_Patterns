package com.abouzidi.gof;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GofTest {

	private MobileFactory mobileFactory;

	@Before
	public void setUp() throws Exception {
		mobileFactory = new SamSungFactory();
	}

	@Test
	public void test() {
		Mobile mobile = mobileFactory.createMobile();
		assertThat(mobile, instanceOf(SamSung.class));
	}

}
