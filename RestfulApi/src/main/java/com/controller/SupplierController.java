package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Supplier;
import com.service.SupplierService;

@RestController
public class SupplierController {

	@Autowired
	private SupplierService supplierservice;
	
	@PostMapping("/add-manufacture")
	public String addManufacture(@RequestBody Supplier supplier)
	{
		String msg=this.supplierservice.addManufacture(supplier);
		return "added";
		
	}
	
	
	@GetMapping("/get-manufacture")
	public List<Supplier> getManufacture()
	{
		return supplierservice.getManufacture();
		
		
	}
	
}
