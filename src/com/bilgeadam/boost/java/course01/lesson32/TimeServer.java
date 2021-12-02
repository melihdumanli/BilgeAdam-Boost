package com.bilgeadam.boost.java.course01.lesson32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.err.println("Usage: <portNumber>");
			System.exit(-1);
		}
		
		int port = 0;
		try {
			port = Integer.parseInt(args[0]);
		}
		catch (Exception ex) {
			System.err.println("Usage: <portNumber> must be a number");
			System.exit(-2);
		}
	
		try (ServerSocket server = new ServerSocket(port)) {
			System.out.println("Timeserver sizi <<" + port + ">> numaralý porttan dinliyor");
			
			while (true) {
				Socket socket = server.accept();
				System.out.println("Connection established");
				
				
				
				InputStream input = socket.getInputStream();
				InputStreamReader reader = new InputStreamReader(input);
				BufferedReader br = new BufferedReader(reader);

				OutputStream output = socket.getOutputStream();
				PrintWriter writer = new PrintWriter(output);
				
				String readLine = br.readLine();
				System.out.println(readLine);
				writer.println(LocalDateTime.now() + " --> " + readLine);
				br.close();
			}
		}
		catch (IOException ex) {
			System.err.println(ex.getMessage());
			System.exit(-3);
		}
	}

}
