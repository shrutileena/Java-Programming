package com.example.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class MainBufferedWriter {

	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))) {
			bw.write("Hare Krishna");
			bw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
