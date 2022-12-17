package com.methodoverridng;

public class Bicycle {

	protected int gear;
	protected int speed;
	
	public Bicycle(int startSpeed, int startGear) {
		gear = startGear;
		speed = startSpeed;
	}


   public void setGear(int newValue) {
	   gear = newValue;
   }
   
   public void aplyBrake(int decrement) {
	   speed-= decrement;
   }
   
   public void speedUp(int increment) {
	   speed += increment;
   }
}