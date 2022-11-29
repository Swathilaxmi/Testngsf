package com.training.Utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import static com.training.Utilities.Constants.USER_DIR;
import static com.training.Utilities.Constants.FILE_SEPARATOR;
import static com.training.Utilities.Constants.APPLICATION_PROPERTIES;

public class CommonUtilities {
public String getproperty(String Key) throws IOException {
	//file path
	//String spath="C:\\Users\\16692\\eclipse-workspace\\TestNGFramework\\Properties\\application.properties";
	String spath = USER_DIR+FILE_SEPARATOR+APPLICATION_PROPERTIES;
	
	//file input stream
	FileInputStream fileinput=new FileInputStream(spath);
	Properties prop=new Properties();
	prop.load(fileinput);
	String value=prop.getProperty(Key);
	return value;
	
}
}
