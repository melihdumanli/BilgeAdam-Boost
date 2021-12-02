package com.bilgeadam.boost.java.course01.lesson28;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataWriterExample {

	public static void main(String[] args) {
		double[] values = { 1.12, 23.45, 643.0, 9843.98 };
		int[] ints = { 1, 23, 643, 9843 };
		File     file   = new File("C:\\Users\\babur.somer\\values.ddd");
		try {
			FileOutputStream     fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream     dos = new DataOutputStream(bos);
			
			for (int i= 0; i < values.length; i++) {
				dos.writeDouble(values[i]);
				dos.writeInt(ints[i]);
			}
			dos.close();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
