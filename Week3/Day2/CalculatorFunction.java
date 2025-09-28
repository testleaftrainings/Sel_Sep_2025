package week3.day2;

public class CalculatorFunction {
	//add, sub, mul, div
	
	
	//Add number
	//add2Numbers  a+b
	//add3Numbers  a+b+c
	//add4Numbers  a+b+c+d
	//addnNumbers
	//addNumbers-Decimals
	
	
	public void addNumbers(int a,int b) {
		System.out.println(a+b);
    }
	
	public void addNumbers(int a,int b,int c) {
		System.out.println(a+b+c);

	}
	
	public void addNumbers(float a,float b) {
	System.out.println(a+b);

	}
	
	
	public static void main(String[] args) {
		CalculatorFunction calc=new CalculatorFunction();
		calc.addNumbers(1, 2,3);
		calc.addNumbers(1.5f, 2.5f);
	}
	
	
	
	
	

}
