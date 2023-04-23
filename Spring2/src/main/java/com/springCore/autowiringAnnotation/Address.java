package com.springCore.autowiringAnnotation;

public class Address {
	String city;
	int code;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", code=" + code + "]";
	}
	
	
	
}
