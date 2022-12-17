package com.methodoverridng;

public class MethodOverridingDemo {

	public static void main(String[] args) {
	
    	Bicycle bicycle = new Bicycle(10, 1);
    	System.out.println("Bicycle gear is: " + bicycle.gear);
    	System.out.println("Bicycle speed is: " + bicycle.speed);
		bicycle.aplyBrake(1);
		System.out.println("Bicycle speed after applying breaks is: " + bicycle.speed);
	
		
      Bicycle mountainBike = new MountainBike(50, 50, 3);
      System.out.println("MountainBike Gear is: " + mountainBike.gear);
      System.out.println("MountainBike speed is: " + mountainBike.speed);
      
     
      	mountainBike.aplyBrake(1);
      	System.out.println("MountainBike speed after applying break is: " + mountainBike.speed);

      	mountainBike.speedUp(10);
    	System.out.println("Bike speed after speeding up is: " + mountainBike.speed);

	}
	
	
	

	}
	
	

