package com.qa.ims.InitData;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataInit {
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	private String cus1Name;
	private String cus1Surname;
	private String cus2Name;
	private String cus2Surname;
	
	private void customerInit(String properties) {
		Properties cusProps = new Properties();
		try (InputStream fis = ClassLoader.getSystemResourceAsStream(properties)){
			cusProps.load(fis);
		}catch (Exception e) {
			LOGGER.error(e);
		}
		this.cus1Name = cusProps.getProperty("cus1Name", "");
		this.cus1Surname = cusProps.getProperty("cus1Surname", "");
		this.cus2Name = cusProps.getProperty("cus2Name", "");
		this.cus2Surname = cusProps.getProperty("cus2Surname", "");
		
	}
	
	public List<String> customerInit() {
		customerInit("customer.properties");
		List<String> init = new ArrayList<>();
		init.add(this.cus1Name);
		init.add(this.cus1Surname);
		init.add(this.cus2Name);
		init.add(this.cus2Surname);
		return init;
	}
}
