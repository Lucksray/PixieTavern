package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.dao.LoginDAO;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Login;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order>{
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private OrderDAO orderDAO;
	private Utils utils;
	private ItemDAO itemDAO = new ItemDAO();
	private ItemController itemController = new ItemController(itemDAO, utils);
	private LoginDAO loginDAO = new LoginDAO();
	
	
	public OrderController(OrderDAO orderDao, Utils utils) {
		super();
		this.orderDAO = orderDao;
		this.utils = utils;
	}

	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}
	
	@Override
	public Order create() {
		LOGGER.info("Please sign in");
		LOGGER.info("Username");
		String username = utils.getString();
		LOGGER.info("Password");
		String password = utils.getString();
		Login log = loginDAO.read(username,password);
		
		itemController.readAll();
		
		LOGGER.info("What item would you like to order? (Name please)");
		String itemName = utils.getString();
		LOGGER.info("How many would you like?");
		int amount = utils.getInt();
		Long itemId = itemController.read(itemName);		
		Order order = orderDAO.create(new Order(log.getCusId(),itemId,amount));
		LOGGER.info("Order sent");
		return order;		                                                   
	}
	
	@Override
	public Order update() {
		LOGGER.info("Please enter the ID of the order you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter the name of the item you would like to replace");
		String itemName = utils.getString();
		LOGGER.info("Please enter the amount you would like to buy");
		int amount = utils.getInt();
		
		Long itemId = itemController.read(itemName);
		Long cusId = orderDAO.readCusId(id);
		Order order = orderDAO.update(new Order(cusId,itemId,amount));
		return order;
	}
	
	@Override
	public int delete() {
		LOGGER.info("Please sign in");
		LOGGER.info("Username");
		String username = utils.getString();
		LOGGER.info("Password");
		String password = utils.getString();
		Login log = loginDAO.read(username,password);
		if ( log != null) {
			LOGGER.info("Please enter the id of the order you want to delete");
			Long id = utils.getLong();
			return orderDAO.delete(id);
		} else {
			LOGGER.info("Could not delete Order");
			return 0;
		}
		
		
	}

}
