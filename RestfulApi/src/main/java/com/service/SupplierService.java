package com.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Supplier;
import com.repository.SupplierRepository;

@Service
public class SupplierService {

@Autowired
 SupplierRepository supplierrepository;
	
	public  String addManufacture(Supplier supplier)
	{
		String msg=supplierrepository.addManufacture(supplier);
		return "added";
	}

	
	public List<Supplier> getManufacture()
	{
		List<Supplier>l=supplierrepository.getManufacture();
		return l;
	}
	
}
