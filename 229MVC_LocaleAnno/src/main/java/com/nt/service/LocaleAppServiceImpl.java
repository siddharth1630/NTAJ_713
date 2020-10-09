package com.nt.service;

import java.util.Locale;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

@Service
public class LocaleAppServiceImpl implements LocaleAppService {

	@Override
	public TreeSet<String> getAllCountries() {
		Locale locales[]=null;
		TreeSet<String> countries=null;
		locales=Locale.getAvailableLocales();
		// get all countries list
		countries=new TreeSet<String>();
		for(Locale l:locales) {
			if(!l.getDisplayCountry().equals("")) {
				countries.add(l.getDisplayCountry());
			}
		}
		return countries;
	}

	@Override
	public TreeSet<String> getAllLanguage() {
		Locale locales[]=null;
		TreeSet<String> language=null;
		locales=Locale.getAvailableLocales();
		// get all countries list
		language=new TreeSet<String>();
		for(Locale l:locales) {
			if(!l.getDisplayLanguage().equals("")) {
				language.add(l.getDisplayLanguage());
			}
		}
		language.forEach(e->{
			System.out.println(e);
		});
		return language;
	}

}
