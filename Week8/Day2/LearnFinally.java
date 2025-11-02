package week8.day2;

public class LearnFinally {

	public static void main(String[] args) {
		
		
		try {
			int number=7;
			System.out.println(number/0);
		}
		
		finally {
			System.out.println("Code completed and get status of execution");
		}

	}

}
