package week8.day2;

public class LearnExceptionHandling {

	public static void main(String[] args) {
	
	try {
		int number=7;
		System.out.println(number/0);
		}
	catch(ArithmeticException exp) {
		System.out.println("The exception is: "+exp);
	}
	
	try {
		int[] num= new int[-3];
		System.out.println(num[3]);
	}
	
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("The exception is: "+e);
	}
	catch(Exception e) {
		System.out.println("The exception is: "+e);
	}
	
	                       
	System.out.println("Code completed");

	}

}
