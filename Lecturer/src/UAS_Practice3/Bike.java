package UAS_Practice3;

public class Bike extends Vehicle{
	int wheels;
	int pedals;
	public Bike(double speed, String color, int wheels, int pedals) {
		super(speed, color);
		this.wheels = wheels;
		this.pedals = pedals;
	}
	public String toString()
	{
		return super.toString() + this.pedals + this.wheels;
	}
	
}
