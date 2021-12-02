package com.bilgeadam.boost.java.course01.lesson32;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class TheClient {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("Usage: <ip-address> <portNumber>");
			System.exit(-1);
		}

		String hostName = args[0];

		int port = 0;
		try {
			port = Integer.parseInt(args[1]);
		}
		catch (Exception ex) {
			System.err.println("Usage: <ip-address> <portNumber>");
			System.exit(-2);
		}
		
		Socket socket = null;
		try {
			for (int i = 1; i<11; i++) {
				socket = new Socket(hostName, port);
				OutputStream output = socket.getOutputStream();
				PrintWriter writer = new PrintWriter(output);
				
				InputStream input = socket.getInputStream();
				InputStreamReader reader = new InputStreamReader(input);
				BufferedReader br = new BufferedReader(reader);
				
				writer.println("Saat kaç (" + i + ")?");
				System.out.println(br.readLine());
			}
		}
		catch (IOException ex) {
			System.err.println(ex.getMessage());
			System.exit(-3);
		}
		finally {
			if (socket != null) {
				try {
					socket.close();
				}
				catch (IOException ex) {
					ex.printStackTrace();
					System.exit(-4);
				}
			}
		}
	}

}
