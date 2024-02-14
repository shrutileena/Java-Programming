package com.example.filehandling;

import java.io.File;
import java.io.FileWriter;

public class NewFile {

	public static void main(String[] args) {
		try {
			File fo = new File("new.txt"); // creates instance of file, not the actual file
			System.out.println(fo);
			
			fo.createNewFile();
			
			// writing in file
			FileWriter fw = new FileWriter("new.txt");
			fw.write("hello");
			
			fw.close();
			
			// delete file
			if(fo.delete()) {
				System.out.println(fo.getName());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
