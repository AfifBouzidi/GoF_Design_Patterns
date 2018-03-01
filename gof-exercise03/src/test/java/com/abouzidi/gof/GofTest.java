package com.abouzidi.gof;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GofTest {

	MobileFactory mobileFactory3g;
	MobileFactory mobileFactory4g;

	@Before
	public void setUp() throws Exception {
		mobileFactory3g = new MobileFactory3g();
		mobileFactory4g = new MobileFactory4g();
	}

	@Test
	public void test() {
		IPhone iphoneOne = mobileFactory3g.createIPhone();
		IPhone iphoneTwo = mobileFactory4g.createIPhone();
		SamSung samSungOne = mobileFactory3g.createSamSung();
		SamSung samSungTwo = mobileFactory4g.createSamSung();
		assertThat(iphoneOne, instanceOf(IPhone3g.class));
		assertThat(iphoneTwo, instanceOf(IPhone4g.class));
		assertThat(samSungOne, instanceOf(SamSung3g.class));
		assertThat(samSungTwo, instanceOf(SamSung4g.class));
	}

}
