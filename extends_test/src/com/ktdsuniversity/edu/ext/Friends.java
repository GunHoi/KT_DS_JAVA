package com.ktdsuniversity.edu.ext;

public class Friends extends Address {
	private String birthDay;

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String getAddress() {
		return super.getAddress()+"의 주소";
	}

	@Override
	public String getName() {
		return super.getName()+"의 이름";
	}

	@Override
	public String getPhoneNumber() {
		return super.getPhoneNumber()+"의 번호";
	}
}
