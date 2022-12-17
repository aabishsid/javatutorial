package com.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// public class SupplierDemo implements Supplier<String> {

//	@Override
//	public String get() {
//		return "Hii Java Techie" ;
//	}
  
//	public static void main(String[] args) {
//	Supplier<String> supplier= new SupplierDemo();
//	System.out.println(supplier.get());
//	}
//}

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		Supplier<String> supplier = ()->  "Hii java techie";
		
 	System.out.println(supplier.get());
		
		List<String> list1 = Arrays.asList("a","b");
		System.out.println(list1.stream().findAny().orElseGet(supplier));

	       
	}
	
	
}
