package com.example.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class MainBufferedReader {

	public static void main(String[] args) {

		// byte stream to char stream and then reading char stream
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("You typed : " + br.readLine());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// reading file using FileReader
		try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			while(br.ready()) {
				System.out.println(br.readLine()); 
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
