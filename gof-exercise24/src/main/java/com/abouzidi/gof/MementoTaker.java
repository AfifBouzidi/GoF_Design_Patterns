package com.abouzidi.gof;

import java.util.ArrayList;
import java.util.List;

public class MementoTaker {

	private List<MobileMemento> memntos = new ArrayList<>();

	public void addMobileMemento(MobileMemento mobileMemento) {
		memntos.add(mobileMemento);
	}

	public MobileMemento getMemento(int index) {
		return memntos.get(index);
	}

}
