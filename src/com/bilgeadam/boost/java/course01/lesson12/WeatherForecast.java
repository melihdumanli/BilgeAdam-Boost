package com.bilgeadam.boost.java.course01.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WeatherForecast {

	public static void main(String[] args) {
		String apikey 		= "71d5ab9b7b5d6ea9f49a52048370c406";
		String location 	= "Istanbul,Turkey";
		String urlString 	= "http://api.openweathermap.org/data/2.5/onecall?lat=41.0351&lon=28.9833&exclude=minutely,hourly,alerts" + location + "&appid=" + apikey + "&units=metric&lang=tr";
//		String urlString 	= "http://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + apikey + "&units=metric&lang=tr";
		
		
		StringBuilder result = new StringBuilder();
		URL url;
		try {
			url = new URL(urlString);
			URLConnection conn = url.openConnection();
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
	}
}