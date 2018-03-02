package com.abouzidi.gof;

import org.junit.Test;

public class GofTest {

	@Test
	public void test() {
		Connection connection = new Mobile();
		connection.sendData(null);
	}

}
