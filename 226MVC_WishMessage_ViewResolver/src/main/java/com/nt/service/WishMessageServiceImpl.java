package com.nt.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class WishMessageServiceImpl implements WishMessageService {

	
	@Override
	public String getMessage() {
		
		 // Create a collection of all available countries
        List countries = new ArrayList();

        // Map ISO countries to custom country object
        String[] countryCodes = Locale.getISOCountries();
        for (String countryCode : countryCodes){

            Locale locale = new Locale("", countryCode);
            String name = locale.getDisplayCountry();

    //        System.out.println(name);
            countries.add(name);
        }
        Collections.sort(countries);
      
        String ret="";
        for(Object k: countries)
		{
        	ret+=k+"     ";
			System.out.println(countries);
		}
        return ret;
        /*
		var hour=0;
		// get system  date and time
		var calendar=Calendar.getInstance();
		// get current hour of the day
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		// generate wish message
		if(hour<12){
			return "Good Morning";
		}
		else if(hour<16)
			return "Good AfterNoon";
		else if(hour<20)
			return "Good evng";
		else
			return "Good night";
		*/
	}

}
