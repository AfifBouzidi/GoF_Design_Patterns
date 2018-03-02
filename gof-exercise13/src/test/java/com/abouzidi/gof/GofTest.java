package com.abouzidi.gof;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GofTest {
	
	private Mobile mobileOne;
	private Mobile mobileTwo;
	private Communication com3g;
	private Communication com4g;

	@Before
	public void setUp() throws Exception {
		com3g=new Communication3g();
		com4g=new Communication4g();
		mobileOne=new SamSung(com3g);
		mobileTwo=new IPhone(com4g);
	}

	@Test
	public void test() {
		mobileOne.communicate();
		mobileTwo.communicate();
	}

}
