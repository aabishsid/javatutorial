package com.string;

import java.util.*;

public class Test13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your City Name:");
		String name=sc.nextLine().toLowerCase().trim();
		if (name.equals("hyderabad"))
		{
			System.out.println("Hello Hyderabadi, Aadaab...");
		}
		else if(name.equals("chennai"))
		{
			System.out.println("Hello Madrasi, Vanakkam...");
		}
		else if (name.equals("bangalore"))
		{
			System.out.println("Hello Kannadiga, Namaskara");
		}
		else
		{
			System.out.println("Please enter valid city name");
		}
		
		
		

}
}