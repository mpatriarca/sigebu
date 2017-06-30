package ar.com.comunicar.common.utils.web;

import java.util.HashMap;
import java.util.Locale;

public class MultiLanguageToString {
	
	private static final String DEFAULT_LANGUAGE = "en";
	
	public static MultiLanguageToString getInstance() {
		return new MultiLanguageToString();
	}
	
	public String getValue(HashMap<String, String> multiLanguage, Locale locale) {
		 String result = multiLanguage.get(locale.getLanguage());
			
		 if (result == null) {
			result = multiLanguage.get(DEFAULT_LANGUAGE);
		 }
		return result;
	}
}