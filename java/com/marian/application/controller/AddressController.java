package com.marian.application.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marian.application.model.AddressInfo;
import com.marian.application.service.AddressService;



@RestController
@CrossOrigin(origins="https:localhost:3000")
public class AddressController {
	@Autowired
	public AddressService addressservice;
	@GetMapping("/api/address")            //select query
	public List <AddressInfo> showAllAddress()
	{
		return addressservice.getAllAddresses();
	}
	@PostMapping("/api/address")     //insert query
	public AddressInfo addAddress(@RequestBody AddressInfo address) 
	{
		return addressservice.saveAddress(address);
	}

}
