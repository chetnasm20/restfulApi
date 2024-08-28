package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int supplier_id;
	private String company_name;
	
	private String website;
	private String location;
	private String nature_of_businesses;
	private String manufacturing_processes;
	

	
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getNature_of_businesses() {
		return nature_of_businesses;
	}
	public void setNature_of_businesses(String nature_of_businesses) {
		this.nature_of_businesses = nature_of_businesses;
	}
	public String getManufacturing_processes() {
		return manufacturing_processes;
	}
	public void setManufacturing_processes(String manufacturing_processes) {
		this.manufacturing_processes = manufacturing_processes;
	}
	@Override
	public String toString() {
		return "Supplier [supplier_id=" + supplier_id + ", company_name=" + company_name + ", website=" + website
				+ ", location=" + location + ", nature_of_businesses=" + nature_of_businesses
				+ ", manufacturing_processes=" + manufacturing_processes + "]";
	}
	public Supplier(int supplier_id, String company_name, String website, String location, String nature_of_businesses,
			String manufacturing_processes) {
		super();
		this.supplier_id = supplier_id;
		this.company_name = company_name;
		this.website = website;
		this.location = location;
		this.nature_of_businesses = nature_of_businesses;
		this.manufacturing_processes = manufacturing_processes;
	}
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
