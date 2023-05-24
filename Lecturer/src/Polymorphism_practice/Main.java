package Polymorphism_practice;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Boat boat = new Boat();
		Bike bike = new Bike();
		
		Vehicle[] racers = {car,boat,bike};
		for (Vehicle x : racers) {
			x.go();
		}

	}

}
