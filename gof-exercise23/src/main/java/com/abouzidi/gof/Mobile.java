package com.abouzidi.gof;

import java.util.logging.Logger;

public class Mobile {

	private final Logger LOG = Logger.getLogger(Mobile.class.getName());

	private Mediator mediator;
	private String mobileNumber;

	public Mobile(Mediator mediator, String mobileNumber) {
		this.mediator = mediator;
		this.mobileNumber = mobileNumber;
	}

	public void sendMessage(String message) {
		mediator.diffuseMessage(this, message);
	}

	public void receiveMessage(String message) {
		LOG.info("[" + mobileNumber + "] message received: " + message);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		return true;
	}

}
