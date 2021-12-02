package com.bilgeadam.boost.java.course01.lesson29;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;

public class CreateLanguageDependendTexts {

	public static void main(String[] args) {
		File configFile = new File("C:\\Users\\babur.somer\\git\\BA-Boost\\BilgeAdam-Boost\\BilgeAdam Boost\\src\\com\\bilgeadam\\boost\\java\\course01\\lesson29\\config\\configuration.config");
		Texts texts = null;
		try {
			FileReader fR = new FileReader(configFile);
			BufferedReader bR = new BufferedReader(fR);
			String language = bR.readLine();
			String country = bR.readLine();
			int vat = Integer.parseInt(bR.readLine());
			texts = new Texts(language, country, bR.readLine(), bR.readLine());
			bR.close();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		if (texts != null) {
			texts.readRawStrings();
			texts.showReadData();
			String[] newTexts = texts.embedValues(LocalTime.now(), 17.2, 9.18, 10.19);
			
			try {
				texts.writeData(newTexts);
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
