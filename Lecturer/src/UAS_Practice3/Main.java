package UAS_Practice3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car(30,"blue",50);
		car.go();
		car.stop();
		Bike bike = new Bike(30,"red",5,8);
		bike.go();
		bike.stop();
		System.out.println(bike.pedals);
		System.out.println(car.wheels);
		System.out.println(car.toString());
		System.out.println(bike.toString());

	}

}
