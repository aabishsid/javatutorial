package test.package1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> numbersList = new ArrayList<>();
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		numbersList.add(40);
		
//  	List<Integer> squaresList = new ArrayList<>();
//		for(Integer i: numbersList) {
//		squaresList.add(i*i);
//		}
	
//		List<Integer> squaresList = numbersList.stream().map(x -> x*x).collect(Collectors.toList());
// System.out.println("List of squared numbers: " + squaresList);

	
	
//	    Set<Integer> squareSet = new HashSet<>();
//    for(Integer i: numbersList) {
//	    	squareSet.add(i*i);
//    }
//	      Set<Integer> squareSet = numbersList.stream().map(x->x*x).collect(Collectors.toSet());
//	    System.out.println("Set of squared numbers: " + squareSet);
		
		List<String> languages = new ArrayList<>();
		languages.add("java");
		languages.add("python");
		languages.add("scala");
//
//         List<String> filterResult = new ArrayList<>();
//        for(String s: filterResult) {
//        	 if(s.startsWith("p")) {
//        		  filterResult.add(s);
//       		  
//        	 }
		List<String> filterResult = languages.stream().filter(s->s.startsWith("p")).collect(Collectors.toList());
        System.out.println("Languages starting with 'p': " + filterResult);
         }
	     
	     

	
	
	
	
	}
			

	



