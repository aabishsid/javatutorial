package com.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.stream.api.example.DataBase;
import com.stream.api.example.Employee;

public class SortListDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		
		List<Employee> employees=DataBase.getEmployees();	
		
//		Collections.sort(employees, new Comparator<Employee>() {
//			
//			@Override
//			public int compare(Employee o1, Employee o2) {
///				return(int) (o1.getSalary() - o2.getSalary()); ///ascending
//			}
//		});
		
		
		
	//	(o1,  o2)-> (int) (o2.getSalary()-o1.getSalary())
		
		
		Collections.sort(employees,(o1,  o2)-> (int) (o1.getSalary()-o2.getSalary()));
		
	//		System.out.println(employees);
			
			
			employees.stream().sorted((o1,  o2)-> (int) (o1.getSalary()-o2.getSalary())).forEach(System.out::println);			
			
		
//   		Collections.sort(list);//ASENDING
//   	    Collections.reverse(list);
//   		System.out.println(list);	
//		
//     list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));//descending
//		}

	}


//class MyComparator implements Comparator<Employee>{
//		@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o2.getSalary()-o1.getSalary());//ascending	}
	
	}
}
	
	
	
	
