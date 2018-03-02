package com.abouzidi.gof;

import org.junit.Test;

public class GofTest {

	@Test
	public void test() {
		Handler handler = new WifiHandler(null);
		handler.setNextHandler(new UsbHandler(new Connection())).setNextHandler(new Network3GHandler(null));
		handler.sendMessage("Hello msg");
	}

}
