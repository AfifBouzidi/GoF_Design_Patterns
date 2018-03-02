package com.abouzidi.gof;

import org.junit.Before;
import org.junit.Test;

public class GofTest {

	private Connection connectionOne;
	private Connection connectionTwo;
	private Connection connectionThree;
	private CompositeConnection compositeConnection;

	@Before
	public void setUp() throws Exception {
		connectionOne = new BluetoothConnection();
		connectionTwo = new WifiConnection();
		connectionThree = new UsbConnection();
		compositeConnection = new CompositeConnection();
		compositeConnection.addConnection(connectionOne);
		compositeConnection.addConnection(connectionTwo);
		compositeConnection.addConnection(connectionThree);
	}

	@Test
	public void test() {
		compositeConnection.connect();
	}

}
