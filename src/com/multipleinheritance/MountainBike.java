package com.multipleinheritance;

class MountainBike extends TwoWheeler  implements Bicycle,Vehicle{
	
	private int seatHeight;
	private int gear;
	private int speed;
	
	public MountainBike(int startHeight,
	                    int startSpeed,
	                    int startGear) {
		seatHeight = startHeight;
		speed = startSpeed;
		gear = startGear;
	}
	
	
	@Override 
	public void applyBrake(int decrement ) {
		speed = speed-decrement;
	}
	
	
	@Override
	public void speedUp(int increment) {
	     speed = speed+increment;
	}
	public int getSeatHeight() {
		return seatHeight;
	}
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	public int getGear() {
		return gear;
		}
		
		public void setGear(int gear) {
			this.gear = gear;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public int getSpeed() {
			return speed;
		}


		@Override
		public void canDrive() {
			System.out.println("mountain bike can be driven");
			
		}


			
	}


