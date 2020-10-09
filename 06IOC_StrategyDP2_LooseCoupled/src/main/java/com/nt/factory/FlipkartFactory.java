package com.nt.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	static {
		InputStream is=null;
		try {
			// locate properties using stream
			is=new FileInputStream("src/main/java/com/nt/commons/info.properties");
			// load properties
			props=new Properties();
			props.load(is);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}// static blocks
	
	
	public static Flipkart getInstance()throws Exception {
		Courier courier=null;
		Flipkart fpkt=null;
		// get dependend class and create class object
		courier =(Courier)Class.forName(props.getProperty("sdp.name")).newInstance();
		// create Target class object
		fpkt=new Flipkart();
		// assign dependent class object to target class object
		fpkt.setCourier(courier); 
		
		return fpkt;
	}
}
