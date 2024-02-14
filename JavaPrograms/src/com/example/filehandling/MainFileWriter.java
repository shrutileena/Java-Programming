package com.example.filehandling;

import java.io.FileWriter;

public class MainFileWriter {

	public static void main(String[] args) {
		// true is to tell that we want to append and not over write
		try(FileWriter f = new FileWriter("note.txt", true)) {
//			f.write("hello world");
			f.write("this should be appended");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
