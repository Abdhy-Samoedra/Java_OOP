package Abstract_practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vehiccle vehicle = new Vehiccle();
		Car car = new Car("avanza",30);
		
		System.out.println(car.getName());
		car.setName("terios");
		Car car2 = new Car(car);
		System.out.println(car.getName());
		System.out.println(car2.getName());
		car.go(); 
	}

}
