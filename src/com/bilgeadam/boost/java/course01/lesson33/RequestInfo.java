package com.bilgeadam.boost.java.course01.lesson33;

public class RequestInfo {
	String text2Translate;
	String translationKey;
	String language;

	public RequestInfo(String text2Translate, String translationKey, String language) {
		super();
		this.text2Translate = text2Translate;
		this.translationKey = translationKey;
		this.language       = language;
	}
}
