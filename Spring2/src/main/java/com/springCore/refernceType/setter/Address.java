package com.springCore.refernceType.setter;

public class Address {

	String town;
	String city;
	String state;
	
	
	public String getTown() {
		return town;
	}


	public void setTown(String town) {
		this.town = town;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Address(String town, String city, String state) {
		super();
		this.town = town;
		this.city = city;
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [town=" + town + ", city=" + city + ", state=" + state + "]";
	}


	public Address() {
	}

}
