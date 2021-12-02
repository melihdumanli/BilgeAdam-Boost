package com.bilgeadam.boost.java.course01.lesson29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Locale;

public class Texts {
	private Locale locale;
	private ArrayList<String> texts;
	private String rawFile;
	private String reportFile;
	
	public Texts(String language, String country, String rawFile, String reportFile) {
		this.locale = new Locale(language, country);
		this.rawFile = rawFile;
		this.reportFile = reportFile;
		this.texts = new ArrayList<>();
	}

	public void readRawStrings() {
		File file = new File(rawFile);

		try {
			FileReader fR = new FileReader(file);
			BufferedReader bR = new BufferedReader(fR);
			while (true) {
				String text = bR.readLine();
				if (text == null) {
					break;
				}
				this.texts.add(text);
			}
			bR.close();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public void showReadData() {
		for (String text : texts) {
			System.out.println(text);
		}
	}

	public String[] embedValues(LocalTime now, double degree, double dolarValue, double euroValue) {
		String[] embededTexts = new String[this.texts.size()];
		embededTexts[0] = this.texts.get(0);
		String dolar = this.texts.get(1);
		String euro = this.texts.get(2);
		
		embededTexts[0] = embededTexts[0].replace("$1$", "" + now.getHour());
		embededTexts[0] = embededTexts[0].replace("$2$", "" + degree);
		
		dolar = dolar.replace("$1$", "" + now.getHour());
		dolar = dolar.replace("$2$", "" + dolarValue);
		dolar = dolar.replace("$3$", "" + "TL");
		euro = euro.replace("$1$", "" + now.getHour());
		euro = euro.replace("$2$", "" + euroValue);
		euro = euro.replace("$3$", "" + "TL");
		embededTexts[1] = dolar;
		embededTexts[2] = euro;
		
		return embededTexts;
	}

	public void writeData(String[] newTexts) throws IOException {
		File file = new File(reportFile);
		FileWriter fW = new FileWriter(file);
		BufferedWriter bW = new BufferedWriter(fW);
		for (int i = 0; i < newTexts.length; i++) {
			bW.write(newTexts[i]);
			bW.newLine();
		}
		bW.close();
	}
}
