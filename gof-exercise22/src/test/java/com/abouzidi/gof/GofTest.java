package com.abouzidi.gof;

import java.util.logging.Logger;

import org.junit.Test;

public class GofTest {

	private final Logger LOG = Logger.getLogger(GofTest.class.getName());

	@Test
	public void test() {
		Mobile mobile = new Mobile();
		for (Iterator<String> it = mobile.createIterator(); it.hasNext();) {
			LOG.info(it.next());
		}
	}

}
