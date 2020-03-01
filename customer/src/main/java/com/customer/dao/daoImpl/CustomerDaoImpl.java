package com.customer.dao.daoImpl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.customer.dao.CustomerDao;
import com.customer.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Customer> getCustomer() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query query = currentSession.createQuery("from Customer c",Customer.class);
		return query.getResultList();
	}

}
