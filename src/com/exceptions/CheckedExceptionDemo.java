package com.exceptions;

import java.io.BufferedReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileReader file = newFileReader("C:\\test\\a.txt");
		BufferedReader fileInput = new BufferedReader(file);
		
		//Print first 3 lines of file "C:\test\a.txt"
		for(int counter = 0; counter < 3; counter++)
		System.out.println(fileInput.readLine());
		
		fileInput.close();
		//throw new MyException()
		
		// TODO Auto-generated method stub

	}

}
