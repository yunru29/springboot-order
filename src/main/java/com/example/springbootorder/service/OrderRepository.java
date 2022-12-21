package com.example.springbootorder.service;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;


@Repository //DAO
public class OrderRepository {
	
	@PersistenceContext
	private Session session;
	
	public Session getSession() {
		return session;
	}
	
	public boolean insert(Order order) {
		this.session.save(order);
		return true;
	}
	
	public List<Order> findAll() {
		return this.session.createQuery("FROM Order ORDER BY id").list();
	}
	
	public boolean update(Order order) {
		this.session.save(order);
		return true;
	}
	
}
