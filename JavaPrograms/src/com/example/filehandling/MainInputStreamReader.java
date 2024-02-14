package com.example.filehandling;

import java.io.IOException;
import java.io.InputStreamReader;

public class MainInputStreamReader {

	public static void main(String[] args) {
		// we are telling to InputStreamReader the input stream is System.in i.e default
		// keyboard
		
		// we are taking byte stream and putting it out in character stream
		try (InputStreamReader ins = new InputStreamReader(System.in)) {
			System.out.print("Enter some letters");
			int letters = ins.read();
			while(ins.ready()) {
				System.out.println((char) letters);
				letters = ins.read();
			}
			
			ins.close();
			System.out.println();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
