package week3.day2;

public class LearnString {

	public static void main(String[] args) {

		// String Literal
		String name1 = "TestLeaf";

		String name3 = "TestLeaf";

		// String instantiation
		String name2 = new String("TestLeaf");

		String name4 = new String("TestLeaf"); 

		// .equals and == method

		// .equals 2 Strings-values
		System.out.println(name1.equals(name3));

		// == method - reference address of the Strings
		System.out.println(name1 == name3); // true
		System.out.println(name1 == name2); // false
		System.out.println(name2 == name4); // false

		System.out.println("-----------------------");

		//
		String batchName = "September";

		// Length of the String
		int lengthOfString = batchName.length();
		System.out.println("The length is: " + lengthOfString);

		// toUpperCase - convert the alphabets of String into uppercase
		// September - SEPTEMBER

		String upperCase = batchName.toUpperCase();
		System.out.println(upperCase);

		// toLowerCase - convert the alphabets of String into lowercase
		// September - september

		// .equal - compares the exact content bw Strings
		// contains - compare the partial Value

		boolean contains = batchName.contains("Sep");
		System.out.println(contains);

		// equalsIgnoresCase - compare the exact value of 2 Strings- it will ignore the
		// cases

		System.out.println(batchName.equalsIgnoreCase("septEmbeR"));

		System.out.println("-----------------------");

		String batch = "Sel Sep 2025";
		
		// {"S","l S","p 2025"}

		// array
		int arrayName[] = { 1, 2, 3 };
		String name[] = { "Vineeth", "Rajendran" };

		// split
		String split[] = batch.split("02");
		
		// {"Sel","Sep","2025"}
		
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]); //
		}

		// toCharArray - String into Character Array
		
		String nameOfBatch = "September";
		
		// {'S','e','p','t','e','m','b','e','r'}

		char[] charArray = nameOfBatch.toCharArray();
		System.out.println(charArray[5]);

		// charAt - Character at an index
		char charAt = nameOfBatch.charAt(8);
		System.out.println(charAt);

		//
		String rupee = "1000";
		int dollar1 = 20;
		int dollar2 = 30;
		System.out.println(rupee + dollar2);

		int parseInt = Integer.parseInt(rupee);
		System.out.println(dollar1 + parseInt);

	}

}
