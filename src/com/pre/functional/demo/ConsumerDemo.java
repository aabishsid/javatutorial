package com.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	
//	@Override
//	public void accept(Integer t) {
//		System.out.println("Printing : " +t);
//	}

	public static void main(String[] args) {
	Consumer<Integer> consumer=	(t) -> System.out.println("Printing : " +t);
	
		consumer.accept(10);

		
//  	List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		
//		list1.stream().forEach(consumer);
		}
}
