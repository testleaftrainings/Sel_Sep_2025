package week8.day2;

public class LearnThrow {

	public static void main(String[] args) {
		int age=-18;
		
		if(age>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible to vote");
		}
if(age<=0) {
	throw new ArithmeticException("The age is negative");
}
		
	}

}
