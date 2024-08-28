package com.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Supplier;

@Repository
public class SupplierRepository {

	@Autowired
	SessionFactory factory;

	public String addManufacture(Supplier supplier) {
		try {
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();
			session.save(supplier);

			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Added";
	}

	public List<Supplier> getManufacture() {
		List<Supplier> list = null;

try {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(Supplier.class);
		criteria.add(Restrictions.and(Restrictions.eq("location", "thane"),
	    Restrictions.eq("nature_of_businesses", "small scale"),
	    Restrictions.eq("manufacturing_processes", "3D_printing")));
	    list = criteria.list();
		session.close();
		transaction.commit();
		
}catch(Exception e)
{
	e.printStackTrace();
}
		
		return list;
		
	}
}
