package com.abouzidi.gof;

public class IPhone extends Mobile {

	public IPhone(Communication communication) {
		super(communication);
	}

	@Override
	public void communicate() {
		communication.communicate();
	}

}
