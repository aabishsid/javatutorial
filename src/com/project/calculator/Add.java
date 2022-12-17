package com.project.calculator;

public class Add implements Operate {
      @Override
      public Double getResult(Double...numbers) {
      Double sum = 0.0;
      
      for (Double num : numbers) {
    	  sum += num;
      }
      
      return sum;
     }

	@Override
	public Double getResult(Double res, Double num) {
		// TODO Auto-generated method stub
		return null;
	}
}