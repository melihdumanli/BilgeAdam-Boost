package com.bilgeadam.boost.java.course01.lesson33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

public class TranslationClient {

	public static void main(String[] args) {

		HashMap<String, String> texts = new HashMap<>();
		
		
		ResourceBundle rB = ResourceBundle.getBundle("com.bilgeadam.boost.java.course01.lesson33.TranslationTexts", new Locale("TR"));
		Enumeration<String> keys = rB.getKeys();
		
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			texts.put(rB.getString(key), key);
		}
		
		try (Socket socket = new Socket("localhost", 4711);) {

			OutputStream output = socket.getOutputStream();
			PrintWriter  writer = new PrintWriter(output, true);

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			keys = rB.getKeys();
			while (keys.hasMoreElements()) {
				String key = keys.nextElement();
				String text2Translate = rB.getString(key);
				writer.println(text2Translate);
				writer.println(texts.get(text2Translate));
				writer.println("EN");
				System.out.println(text2Translate + " --> " + br.readLine());
			}
		}
		catch (UnknownHostException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
