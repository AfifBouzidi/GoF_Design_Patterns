package com.abouzidi.gof;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GofTest {

	Modem modem;
	Mobile myMobile;

	@Before
	public void setUp() throws Exception {
		modem = new Modem();
		myMobile = new Mobile();
		modem.addObserver(myMobile);
	}

	@Test
	public void test() {
		String message = "Hello";
		modem.receiveDate(message);
		assertEquals(message, myMobile.getMessage());
	}

}
