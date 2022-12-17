package com.stream.api.example;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
	
	public static  List<Employee> evaluateTaxUsers(String input){
		
		if(input.equalsIgnoreCase("tax")) {
			DataBase.getEmployees().stream().count();
			System.out.println("line 12<="+ DataBase.getEmployees().stream().count());
		return DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 500000)
				.collect(Collectors.toList());
	}else {
		return DataBase.getEmployees().stream().filter(emp -> emp.getSalary() < 500000)
				.collect(Collectors.toList());
	}
	}
	
		public static void main(String[] args) {
		System.out.println(evaluateTaxUsers("tax"));
	//	System.out.println(evaluateTaxUsers("non tax"));
	}

}
