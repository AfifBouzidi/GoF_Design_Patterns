package com.abouzidi.gof;

public class IPhone extends Mobile{
	
	private MobileType mobileType;

	public IPhone() {
		this.mobileType = MobileType.IPHONE;
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
		IPhone other = (IPhone) obj;
		if (mobileType != other.mobileType)
			return false;
		return true;
	}
	

}
