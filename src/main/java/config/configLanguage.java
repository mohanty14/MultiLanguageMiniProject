package config;

import java.io.FileInputStream;
import java.util.Properties;

public class configLanguage {

	private Properties prop;
	private FileInputStream ip;

	public Properties readProperty() {
	
		String lang=System.getProperty("lang");
		System.out.println("reading lang is " + lang);
		prop = new Properties();
		try {
			switch (lang.toLowerCase()) {
			case "english":
				ip = new FileInputStream("./src/main/resources/english.properties");
				break;
			case "french":
				ip = new FileInputStream("C:\\Users\\91878\\eclipse-workspace\\newWorkspace\\multLanguage\\src\\main\\resources\\french.properties");
				break;
			case "russain":
				ip = new FileInputStream("./src/main/resources/russian.properties");
				break;
			default:
				System.out.println("no lang found");
				break;
			}
			prop.load(ip);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		return prop;
	}
}
