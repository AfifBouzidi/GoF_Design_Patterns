package com.abouzidi.gof;

public class Mobile implements Aggregate<String> {

	private String[] mobileOptions = { "voice", "sms", "ussd", "internet", "email", "mp3", "calendar", "alarmClock",
			"wallet", "camera" };

	public Iterator<String> createIterator() {
		return new MobileOptionsIterator();
	}

	private class MobileOptionsIterator implements Iterator<String> {

		int index;

		public boolean hasNext() {
			return index >= mobileOptions.length ? false : true;
		}

		public String next() {
			return hasNext() ? mobileOptions[index++] : null;
		}

	}

}
