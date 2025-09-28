package week3.day2;

public class Car extends Vehicle {

	public void applyBrake() {
		System.out.println("applyBrake");

	}

	public static void main(String[] args) {
		Car carOptions = new Car();
		carOptions.applyBrake();
		carOptions.startVehicle();

	}

}
