package com.marian.application.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AddressInfo 
{
	private String userName;
	private String address;
	
	private String phoneNumber;
	private String email;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //autoincrement method
	private int id;
	public AddressInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddressInfo(String userName, String address, String phoneNumber, String email, int id) {
		super();
		this.userName = userName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.id = id;
	}
	@Override
	public String toString() {
		return "AddressInfo [userName=" + userName + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", id=" + id + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
