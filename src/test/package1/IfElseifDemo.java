package test.package1;

public class IfElseifDemo {

	public static void main(String[] args) {
		
		int testcore = 45;
		char grade;
		
		if (testcore >= 90) {
			grade = 'A';
		} else if (testcore >= 80) {
			grade = 'B';
		} else if (testcore >= 70) {
			  grade = 'C';
		} else if (testcore >= 60)  {
			 grade = 'D';
		} else {
			  grade = 'F';
		}
		
		System.out.println ("Grade = " + grade);
	}		
		
		}
		