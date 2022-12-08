package test.package1;

import java.util.ArrayList;
import java.util.List;

public class StreamsReduce {

	public static void main(String[] args) {
	 
		List<Integer> numbersList = new ArrayList<>();
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		numbersList.add(40);
		
		int sum = numbersList.stream().reduce(0,(ans,i) -> ans+i);
		
		System.out.println("sum of all elements in the numberlist: " + sum);
		

	}

}
