package week3.day2;

public class Audi extends Car{
	
	public void higherEndBraking() {
		System.out.println("higherEndBraking");

	}

	public static void main(String[] args) {
		Audi audiOptions =new Audi();
		audiOptions.higherEndBraking();
		audiOptions.applyBrake();
		audiOptions.startVehicle();
	}
	
	
}
//  3             2             1
//Audi extends Car extends Vehicle