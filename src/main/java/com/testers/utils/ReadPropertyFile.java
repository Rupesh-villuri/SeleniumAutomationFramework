package com.testers.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Properties;

public class ReadPropertyFile {

	private ReadPropertyFile(){

	}
	private static Properties prop = new Properties();
	private static final Map <String,String> CONFIGMAP = new HashMap<String, String>();

	static {
		
		String configFilePath =System.getProperty("user.dir")+"/src/test/resources/config/config.properties";
		FileInputStream configFile;
		try {
			configFile = new FileInputStream(configFilePath);
			prop.load(configFile);
						
			for (Entry<Object, Object> entry :prop.entrySet()) {
				CONFIGMAP.put( String.valueOf(entry.getKey()), String.valueOf(entry.getValue()) );
			}
			
		// prop.entrySet().forEach(entry -> CONFIGMAP.put( String.valueOf(entry.getKey()), String.valueOf(entry.getValue()) ));
		// can write as above also , but java 8 needed 
		// Lambda expressions are allowed only at source level 1.8 or above	
			
		}catch (FileNotFoundException e) { 	e.printStackTrace();
		}catch (IOException e) { e.printStackTrace();
		}catch (Exception e) { e.printStackTrace();
		}
	}
	
	public static String get(String key) {
		
		if( Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key)) ) {
			try {
				throw new Exception ("Property Name  "+ key +" is not found .please check config.properties file");
			}
			catch (Exception e) { e.printStackTrace();	
			}
		}
		return CONFIGMAP.get(key);	
	}
}
