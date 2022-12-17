package com.string;

public class MaskTest {

	public static String mask(String creditCard)
	{
		String x="XXXX-XXXX-XXXX-";
		return x+creditCard.substring(15,19);
		
	}
	public static void main(String[] args)
	{
		System.out.println("1234-5678-9101-5979");
	
	}

}
