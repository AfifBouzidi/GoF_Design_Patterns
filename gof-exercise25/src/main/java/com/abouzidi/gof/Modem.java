package com.abouzidi.gof;

import java.util.Observable;

public class Modem extends Observable {

	public void receiveDate(String message) {
		this.setChanged();
		this.notifyObservers(message);
	}
}
