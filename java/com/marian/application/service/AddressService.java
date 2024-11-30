package com.marian.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marian.application.model.AddressInfo;
import com.marian.application.repository.AddressInterface;



@Service
public class AddressService
{
	@Autowired
	public AddressInterface addressrepo;  //creating an object for EmployeeInterface
		public List<AddressInfo> getAllAddresses()   //datatype is EmployeeInfo(className)
		{
			return addressrepo.findAll();
		}
	public AddressInfo saveAddress( AddressInfo address)
	{
		
		return addressrepo.save(address);
	}
}
