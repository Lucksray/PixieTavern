package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.dao.LoginDAO;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Login;
import com.qa.ims.utils.Utils;

public class LoginPortal implements CrudController<Login> {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private LoginDAO loginDAO;
	private Utils utils;
	private Login userLogin;
	
	private CustomerDAO customerDAO = new CustomerDAO();
	
	public LoginPortal(LoginDAO loginDAO, Utils utils) {
		super();
		this.loginDAO = loginDAO;
		this.utils = utils;
	}

	@Override
	public List<Login> readAll() {
		List<Login> logins = loginDAO.readAll();
		for (Login login : logins) {
			LOGGER.info(login);
		}
		return logins;
	}

	@Override
	public Login create() {
		LOGGER.info("Please enter username");
		String username = utils.getString();
		LOGGER.info("Please enter password");
		String password = utils.getString();
		LOGGER.info("Please enter first name");
		String firstName = utils.getString();
		LOGGER.info("Please enter surname");
		String surname = utils.getString();
		Customer customer = customerDAO.create(new Customer(firstName, surname));
		Long cusId = customer.getId();
		Login login = loginDAO.create(new Login(username, password, cusId));
		LOGGER.info("Login created and paired");
		return login;		                                                   
	}

	@Override
	public Login update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Login login(){
		LOGGER.info("Please enter your username");
		String username = utils.getString();
		LOGGER.info("Please enter your password");
		String password = utils.getString();
		userLogin = loginDAO.read(username, password);
		return userLogin;
	}
}
