package com.string;

public class Test16 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("abcdefghijklmnop");
		sb.append("q");
		System.out.println(sb.capacity());
		sb.append("abcdefghijklmnop");
		sb.append("q");
		sb.append("q");
		System.out.println(sb.capacity());
	}

}
