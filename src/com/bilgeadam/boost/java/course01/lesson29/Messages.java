package com.bilgeadam.boost.java.course01.lesson29;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages {
	private static final String BUNDLE_NAME = "com.bilgeadam.boost.java.course01.lesson29.messages"; //$NON-NLS-1$
	private Locale locale;
	private ResourceBundle messages;

	public Messages(String language, String country) {
		this.locale = new Locale(language, country);
		this.messages = ResourceBundle.getBundle(BUNDLE_NAME, locale);
	}

	public String getString(String key) {
		try {
			return messages.getString(key);
		}
		catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
