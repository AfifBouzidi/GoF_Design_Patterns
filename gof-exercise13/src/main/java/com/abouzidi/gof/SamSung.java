package com.abouzidi.gof;

public class SamSung  extends Mobile{

	public SamSung(Communication communication) {
		super(communication);
	}

	@Override
	public void communicate() {
		communication.communicate();
	}

}
