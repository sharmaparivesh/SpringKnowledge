package com.pack.autowiring;

public class Address {
	int flatNo;
	String AddressLine1;
	String city;
	
	Address(){}
	Address(int f,String Add,String city )
	{
		this.flatNo=f;
		this.AddressLine1=Add;
		this.city=city;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
