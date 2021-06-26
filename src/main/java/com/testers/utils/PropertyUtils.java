package com.testers.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Properties;

import com.testers.constants.FrameworkConstants;
import com.testers.enums.ConfigProperties;

public class PropertyUtils {

	private PropertyUtils(){

	}
	private static Properties prop = new Properties();
	private static final Map <String,String> CONFIGMAP = new HashMap<String, String>();

	static {
		
		FileInputStream configFile;
		try {
			configFile = new FileInputStream(FrameworkConstants.getConfigFilePath());
			prop.load(configFile);
						
			for (Entry<Object, Object> entry :prop.entrySet()) {
				CONFIGMAP.put( String.valueOf(entry.getKey()), String.valueOf(entry.getValue()) );
			}					
		}catch (FileNotFoundException e) { 	e.printStackTrace();
		}catch (IOException e) { e.printStackTrace();
		}catch (Exception e) { e.printStackTrace();
		}
	}
	
	public static String get(ConfigProperties key) {
		
		if( Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase())) ) {
			try {
				throw new Exception ("Property Name  "+ key +" is not found .please check config.properties file");
			}
			catch (Exception e) { e.printStackTrace();	
			}
		}
		return CONFIGMAP.get(key.name().toLowerCase());	
	}
}
