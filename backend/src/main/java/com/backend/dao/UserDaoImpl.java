package com.backend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.backend.model.Users;

@Repository("userDaoImpl")
@Transactional
public class UserDaoImpl implements UsersDao {
	private static final Logger logger= LoggerFactory.getLogger(UserDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	public void registerUser(Users user) {
		logger.info("register user is implemented");
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
		System.out.println("user saved");
		logger.info(" user saved ");
		
	}

}
