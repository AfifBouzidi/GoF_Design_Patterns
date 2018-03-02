package com.abouzidi.gof;

public class Mobile {

	private String currentApplication;

	public MobileMemento save() {
		return new MobileMemento(currentApplication);
	}

	public void restore(MobileMemento m) {
		currentApplication = m.getState();
	}

	public void setCurrentApplication(String currentApplication) {
		this.currentApplication = currentApplication;
	}

	public String getCurrentApplication() {
		return currentApplication;
	}
	
}
