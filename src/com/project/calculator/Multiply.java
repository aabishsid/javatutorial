package com.project.calculator;

public class Multiply implements Operate {
	
	@Override
	public Double getResult(Double...numbers) {
		Double result = 1.0;
		
		for (Double num : numbers) {
			result *= num;
		}
		
		return result;
	}

	@Override
	public Double getResult(Double res, Double num) {
		// TODO Auto-generated method stub
		return null;
	}
	
			
}
	


