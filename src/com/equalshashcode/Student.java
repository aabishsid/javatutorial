package com.equalshashcode;

class Student {
	
	private int rollNumber;
	private String name;
	private String  address;
	
	public Student(int rollNumber, String name, String address) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
    }
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddres(String addresss) {
		this.address = address;
	}

	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	public int getRollNumber() {
		return rollNumber;
	}
	
		public void setRollnumber(int rollnumber) {
		this.rollNumber = rollnumber;
	}
	
		@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;	
	
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		
		Student student = (Student) obj;
		
		return (student.rollNumber == this.rollNumber);
	}
}
