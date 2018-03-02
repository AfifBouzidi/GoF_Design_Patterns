package com.abouzidi.gof;

public interface Mediator {
	
	public void registerMobile(Mobile mobile);
	
	public void diffuseMessage(Mobile mobile,String message);
	
}
