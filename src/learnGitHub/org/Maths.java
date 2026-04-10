package learnGitHub.org;

public class Maths {
	
	
	
	///This project is created by Kutraleeswaran
	//1. addition
	//2. sub
	//3. multi
	//4. division
	
	public void addition() {	//addition completed
		
		int a = 10;
		int b = 22;
		int c = a + b;
			System.out.println("The 'c' value is  : " + c) ;
	}
	public void sub() {			//substraction completed
		
		int a = 22;
		int b = 10;
		int c = a - b;
			System.out.println("The 'c' value is  : " + c) ;
	}
	
	public static void main(String[] args) {	//This is main method
		
		Maths obj = new Maths();
		
		obj.addition();
		obj.sub();
		
		
	}
	

}
