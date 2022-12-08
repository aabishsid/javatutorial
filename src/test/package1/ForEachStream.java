package test.package1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachStream {

	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<>();
		languages.add("scala");
		languages.add("java");
		languages.add("python");
		languages.add("basic");
		
//		List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
//		System.out.println("Languages sorted alphabetically: " + sortedList);

		
		System.out.println("printing all elements one by one:");
		languages.stream().forEach(y -> System.out.println("element is: " + y));
	}

} 
