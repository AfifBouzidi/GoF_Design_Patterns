package com.abouzidi.gof;

public class WindowsPhone extends Mobile {

	public WindowsPhone(Communication communication) {
		super(communication);
	}

	@Override
	public void communicate() {
		communication.communicate();
	}

}
