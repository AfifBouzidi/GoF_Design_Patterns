package com.abouzidi.gof;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Test;

public class GofTest {

	@Test
	public void test() {
		Mobile mobile1 = MobileFactory.getInstance().createMobile(MobileType.SAMSUNG);
		Mobile mobile2 = MobileFactory.getInstance().createMobile(MobileType.IPHONE);
		Mobile mobile3 = MobileFactory.getInstance().createMobile(MobileType.WINDOWSPHONE);
		assertThat(mobile1, instanceOf(SamSung.class));
		assertThat(mobile2, instanceOf(IPhone.class));
		assertThat(mobile3, instanceOf(WindowsPhone.class));
	}

}
