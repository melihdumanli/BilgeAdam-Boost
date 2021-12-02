package com.bilgeadam.boost.java.course01.lesson13;

public class Password {
	private String password = "";

	public static void main(String[] args) {
		Password pwd = new Password();
		pwd.assign("", "GültenHaným");
		System.out.println("Parola: " + pwd.password);
	}

	public void assign(String oldPassword, String newPassword) {  // null deðil ama empty olabilir

		if (this.check(oldPassword) && newPassword != null) {
			password = newPassword;
//			encode();
			decodeEncode(true);
			System.out.println("Parola deðiþtirildi");
		} 
		else {
			System.out.println("Parola deðiþtirilemedi");
		}
	}

	private boolean check(String passwordToCheck) {
		if (!password.equals(""))
//			decode();
			decodeEncode(false);
		return this.password.equals(passwordToCheck);
	}
	
	private void decode() {
		char[] chars = password.toCharArray();
//		System.out.println(chars);
		for (int i = 0; i < chars.length; i++) {
			int c = chars[i];
			c = c -1;
			chars[i] = (char)c;
		}
		password = new String(chars);
//		System.out.println(chars);
	}

	private void encode () {
		char[] chars = password.toCharArray();
//		System.out.println(chars);
		for (int i = 0; i < chars.length; i++) {
			int c = chars[i];
			c = c + 1;
			chars[i] = (char)c;
		}
		password = new String(chars);
//		System.out.println(chars);
	}
	
	private void decodeEncode (boolean isEncoding) {
		char[] chars = password.toCharArray();
//		System.out.println(chars);
		for (int i = 0; i < chars.length; i++) {
			int c = chars[i];
			if (isEncoding)
				c = c + 1;
			else
				c = c - 1;
			chars[i] = (char)c;
		}
		password = new String(chars);
//		System.out.println(chars);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
