package com.abouzidi.gof;

public abstract class Mobile {

	protected Communication communication;

	public Mobile(Communication communication) {
		this.communication = communication;
	}

	public abstract void communicate();

}
