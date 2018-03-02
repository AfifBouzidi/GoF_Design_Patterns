package com.abouzidi.gof;

public class SamSung extends Mobile {

	private MobileType mobileType;

	public SamSung() {
		mobileType = MobileType.SAMSUNG;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mobileType == null) ? 0 : mobileType.hashCode());
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
		SamSung other = (SamSung) obj;
		if (mobileType != other.mobileType)
			return false;
		return true;
	}

}
