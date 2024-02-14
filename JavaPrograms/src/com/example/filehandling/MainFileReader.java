package com.example.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class MainFileReader {

	public static void main(String[] args) {
		
		// reading a file through FileReader
		// character stream
		try(FileReader f = new FileReader("file.txt")) {
			int letters = f.read();
			while(f.ready()) {
				System.out.println((char)letters);
				letters = f.read();
			}
			f.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
