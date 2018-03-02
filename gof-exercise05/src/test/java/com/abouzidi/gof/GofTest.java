package com.abouzidi.gof;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class GofTest {

	@Test
	public void test() {

		Mobile mobileOne = new SamSung();
		Mobile mobileTwo = new IPhone();
		Mobile mobileThree = new WindowsPhone();
		assertEquals(mobileOne, mobileOne.clone());
		assertEquals(mobileTwo, mobileTwo.clone());
		assertEquals(mobileThree, mobileThree.clone());

		assertFalse(mobileOne == mobileOne.clone());
		assertFalse(mobileTwo == mobileTwo.clone());
		assertFalse(mobileThree == mobileThree.clone());
	}

}
