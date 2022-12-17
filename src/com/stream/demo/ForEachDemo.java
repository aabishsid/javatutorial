package com.stream.demo;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.HashMap;

public class ForEachDemo {
	
//	filter ----> for conditional check

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Murrit");
		list.add("john");
	    list.add("piter");
	    list.add("marek");
		list.add("mac");
		
//		for (String s:list) {
//			System.out.println(s);
//		}
		
		for (String s:list) {
			if(s.startsWith("m"))
			System.out.println(s);
		}
		
		
//	    (t)->s.startsWith("m"))
		list.stream().filter(t-> t.startsWith("m")).forEach(t ->  System.out.println(t));
				
		
	//	 t -> {System.out.println(s);	
		list.stream().forEach(t ->  System.out.println(t));
	
		
		
		
	 Map<Integer, String> map= new HashMap<>();
	 
	 map.put(1, "a");
	 map.put(2, "b");
	 map.put(3, "c");
	 map.put(4, "d");
	
	 
//	map.forEach((key,value)->System.out.println(key+": "+value));
//	
	 map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj-> System.out.println(obj));
//	
	 
//	Consumer<String> consumer= (t)-> System.out.println(t);
//	consumer.accept("java techie");
//	
	 
//	Consumer<String> consumer= (t)-> System.out.println(t);  //internal structure of forEach method
//	for(String s1:list) {
//		consumer.accept(s);
	
	 
	

	
	
	}

	
}

