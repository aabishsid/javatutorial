package com.innerclasses;

public class OuterClass {
	
	class InnerClass{
		public void display() {
			System.out.println("This is a inner class method");
		}
		void outerClassMethod() {
			
			System.out.println("in the inner Class Method");
			
			class MethodLocalClass {
				void localInnerMethod () {
							System.out.println("in the method local class: Method");
			}
			}
	 		MethodLocalClass mlc = new MethodLocalClass();
			mlc.localInnerMethod();
								}
 				
				
			}
		
	

	public static void main(String[] args) {

		
	}



	public void outerClassMethod() {
		// TODO Auto-generated method stub
		
	}

}
