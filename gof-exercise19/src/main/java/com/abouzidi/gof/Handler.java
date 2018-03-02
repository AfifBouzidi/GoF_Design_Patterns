package com.abouzidi.gof;

public abstract class Handler {

	protected Handler nextHandler;

	public Handler setNextHandler(Handler handler) {
		this.nextHandler = handler;
		return nextHandler;
	}

	public abstract void sendMessage(String message);

}
