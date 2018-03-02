package com.abouzidi.gof;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GofTest {

	MementoTaker mementoTaker;
	Mobile myMobile;

	@Before
	public void setUp() throws Exception {

		mementoTaker = new MementoTaker();
		myMobile = new Mobile();

	}

	@Test
	public void test() {
		myMobile.setCurrentApplication("Gmail");
		myMobile.setCurrentApplication("skype");
		mementoTaker.addMobileMemento(myMobile.save());
		myMobile.setCurrentApplication("game");
		myMobile.restore(mementoTaker.getMemento(0));
		assertEquals("state from mementoTaker", "skype", myMobile.getCurrentApplication());
	}

}
