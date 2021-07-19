package com.example.demo.models;
public class CustomerResponseModel {
     @Override
	public String toString() {
		return "CustomerResponseModel [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + ", address="
				+ address + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private int id;
     private String name;
     private String phonenumber ;
     private String address;
}
