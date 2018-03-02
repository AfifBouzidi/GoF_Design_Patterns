package com.abouzidi.gof;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GofTest {

	@Test
	public void test() {
		Mobile mobile = new Mobile.MobileBuilder("HD", "bulk sms", "#100").alarmClock("alarm").build();
		assertNotNull("Alarm clock", mobile.getAlarmClock());
	}

}
