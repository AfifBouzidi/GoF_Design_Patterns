package com.abouzidi.gof;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Test;

public class GofTest {

	@Test
	public void test() {
		Mobile mobileOne = MobileFactory.getInstance().createMobile(MobileType.SAMSUNG);
		Mobile mobileTwo = MobileFactory.getInstance().createMobile(MobileType.IPHONE);
		Mobile mobileThree = MobileFactory.getInstance().createMobile(MobileType.WINDOWSPHONE);
		assertThat(mobileOne, instanceOf(SamSung.class));
		assertThat(mobileTwo, instanceOf(IPhone.class));
		assertThat(mobileThree, instanceOf(WindowsPhone.class));
	}

}
