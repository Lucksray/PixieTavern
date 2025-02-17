package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

/**
 * Takes in item details from CRUD functionality
 * 
 * @author leonc
 */
public class ItemController implements CrudController<Item> {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private ItemDAO itemDAO;
	private Utils utils;
	
	public ItemController(ItemDAO itemDAO, Utils utils) {
		super();
		this.itemDAO = itemDAO;
		this.utils = utils;
	}
	
	/**
	 * Reads all items to the logger
	 */
	@Override
	public List<Item> readAll(){
		List<Item> items = itemDAO.readAll();
		for (Item item : items) {
			LOGGER.info(item);
		}
		return items;
	}
	
	public Long read(String itemName) {
		Long id = itemDAO.read(itemName);
		return id;
	}
	
	/**
	 * Creates a item by taking in user input
	 */
	@Override
	public Item create() {
		LOGGER.info("Please enter the name of the product");
		String name = utils.getString();
		LOGGER.info("Please enter the price");
		float price = utils.getFloat();
		Item item = itemDAO.create(new Item(name, price));
		LOGGER.info("Item added");
		return item;
	}
	
	/**
	 * Updates an existing items by taking in user input
	 */
	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter the name");
		String name = utils.getString();
		LOGGER.info("Please enter the price");
		float price = utils.getFloat();
		Item item = itemDAO.update(new Item(id, name, price));
		LOGGER.info("Item updated");
		return item;
	}
	
	
	/**
	 * Deletes an existing customer by the id of the item
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the item you would like to delete");
		Long id = utils.getLong();
		return itemDAO.delete(id);
	}

}
