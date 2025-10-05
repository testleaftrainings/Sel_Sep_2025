package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicates {

	public static void main(String[] args) {
		
		//Declare an Array
		//              0 1 2 3 4 5
		int[] numbers= {2,5,3,2,7,5};
		
		//Declare a Set
		Set<Integer> uniqueNumbers=new LinkedHashSet<Integer>();
		System.out.println("The set is: "+uniqueNumbers);
		//       0   1   2    3   4    5
		for (int i = 0; i < numbers.length; i++) {
			uniqueNumbers.add(numbers[i]);
			
			//uniqueNumbers.add(numbers[0]);  [2]
			//uniqueNumbers.add(numbers[1]);[2,5]
			//uniqueNumbers.add(numbers[2]);[2,5,3]
			//uniqueNumbers.add(numbers[3]);[2,5,3]
			//uniqueNumbers.add(numbers[4]);[2,5,3,7]
			//uniqueNumbers.add(numbers[5]);[2,5,3,7]
			
		}
		
		System.out.println("The set is: "+uniqueNumbers);
		
		
		
		
		
		
	}

}
