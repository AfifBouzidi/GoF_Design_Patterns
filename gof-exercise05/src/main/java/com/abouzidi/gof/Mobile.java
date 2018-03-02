package com.abouzidi.gof;

public abstract class Mobile implements Cloneable{

	@Override
	public Object clone() {
	      Object clone = null;
	      
	      try {
	         clone = super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      return clone;
	   }

	
	
}
