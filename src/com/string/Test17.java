package com.string;

public class Test17 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer(1000);
		System.out.println(sb1.capacity());

	}

}
