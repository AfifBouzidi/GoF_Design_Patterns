package com.abouzidi.gof;

public class Mobile {

	private String voice;
	private String sms;
	private String ussd;
	private String internet;
	private String email;
	private String mp3;
	private String calendar;
	private String alarmClock;
	private String wallet;
	private String camera;

	private Mobile(MobileBuilder mobileBuilder) {
		this.voice = mobileBuilder.voice;
		this.sms = mobileBuilder.sms;
		this.ussd = mobileBuilder.ussd;
		this.internet = mobileBuilder.internet;
		this.email = mobileBuilder.email;
		this.mp3 = mobileBuilder.mp3;
		this.calendar = mobileBuilder.calendar;
		this.alarmClock = mobileBuilder.alarmClock;
		this.wallet = mobileBuilder.wallet;
		this.camera = mobileBuilder.camera;
	}

	public static class MobileBuilder {
		private String voice;
		private String sms;
		private String ussd;
		private String internet;
		private String email;
		private String mp3;
		private String calendar;
		private String alarmClock;
		private String wallet;
		private String camera;

		public MobileBuilder(String voice, String sms, String ussd) {
			this.voice = voice;
			this.sms = sms;
			this.ussd = ussd;
		}

		public MobileBuilder internet(String internet) {
			this.internet = internet;
			return this;
		}

		public MobileBuilder email(String email) {
			this.email = email;
			return this;
		}

		public MobileBuilder mp3(String mp3) {
			this.mp3 = mp3;
			return this;
		}

		public MobileBuilder calendar(String calendar) {
			this.calendar = calendar;
			return this;
		}

		public MobileBuilder alarmClock(String alarmClock) {
			this.alarmClock = alarmClock;
			return this;
		}

		public MobileBuilder wallet(String wallet) {
			this.wallet = wallet;
			return this;
		}

		public MobileBuilder camera(String camera) {
			this.camera = camera;
			return this;
		}

		public Mobile build() {
			return new Mobile(this);
		}
	}

	public String getVoice() {
		return voice;
	}

	public String getSms() {
		return sms;
	}

	public String getUssd() {
		return ussd;
	}

	public String getInternet() {
		return internet;
	}

	public String getEmail() {
		return email;
	}

	public String getMp3() {
		return mp3;
	}

	public String getCalendar() {
		return calendar;
	}

	public String getAlarmClock() {
		return alarmClock;
	}

	public String getWallet() {
		return wallet;
	}

	public String getCamera() {
		return camera;
	}
}
