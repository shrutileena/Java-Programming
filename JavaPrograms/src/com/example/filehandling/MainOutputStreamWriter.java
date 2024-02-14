package com.example.filehandling;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainOutputStreamWriter {

	public static void main(String[] args) {
		try(OutputStreamWriter o = new OutputStreamWriter(System.out)) {
			o.write("shruti");
			o.write('\n');
			o.write('A');
			o.write(10);
			o.write('\n');
			char[] arr = "hello world".toCharArray();
			o.write(arr);
			o.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
