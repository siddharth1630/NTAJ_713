package com.nt.beans;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.TimeZone;

import lombok.Data;

@Data
public class PersonInfo {
	private long adharNo;
	private String name;
	private String[] addressess;
	private float salary;
	private File photoPath;
	private Currency currency;
	private Date dob;
	private Class javaClass;
	private Class[] javaClasses;
	private InputStream inputFile;
	private URL fbUrl;
	private Locale currentLocale;
	private TimeZone timezone;
	private Properties props;
}
