package UAS_Practice3;

public class Car extends Vehicle{
	int wheels;

	public Car(double speed, String color, int wheels) {
		super(speed, color);
		this.wheels = wheels;
	}
	public String toString()
	{
		return super.toString() + this.wheels;
	}

}
