package com.abouzidi.gof;

import static org.junit.Assert.*;

import org.junit.Test;

public class GofTest {

	@Test
	public void test() {
		PurchaseServiceFacade purchaseServiceFacade = new PurchaseServiceFacade();
		purchaseServiceFacade.purchase();
	}

}
