package com.customer.dao.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.dao.CustomerDao;
import com.customer.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomer() {
		Query query = getCurrentSession().createQuery("from Customer c", Customer.class);
		return query.getResultList();
	}

	@Override
	public void addCustomer(Customer customer) throws Exception {
		try {
			getCurrentSession().save(customer);
		} catch (Exception e) {
			throw new Exception("unable to save the data:" + e);
		}
	}

	@Override
	public Customer getCustomer(int id) throws Exception {
		try {
			Query query = getCurrentSession().createQuery("from Customer c where c.id = :id");
			query.setParameter("id", id);
			return (Customer) query.getSingleResult();
		} catch (Exception e) {
			throw new Exception("unable to fetch data " + e);
		}
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void updateCustomer(Customer customer) throws Exception {
		try {
			getCurrentSession().update(customer);
		} catch (Exception e) {
			throw new Exception("unable to update data" + e);
		}
	}

	@Override
	public void deleteCustomer(Customer customer) throws Exception {
		try {
			getCurrentSession().delete(customer);
		} catch (Exception e) {
			throw new Exception("unable to delete record" + e);
		}
	}

}
