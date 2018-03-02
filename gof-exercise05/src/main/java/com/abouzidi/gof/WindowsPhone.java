package com.abouzidi.gof;

public class WindowsPhone extends Mobile {

	private MobileType mobileType;

	public WindowsPhone() {
		this.mobileType = MobileType.WINDOWSPHONE;
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
		WindowsPhone other = (WindowsPhone) obj;
		if (mobileType != other.mobileType)
			return false;
		return true;
	}
}
