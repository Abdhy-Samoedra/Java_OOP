package UAS_Practice3;

public class Vehicle {
	double speed;
	String color;
	
	public Vehicle(double speed, String color) {
		this.speed = speed;
		this.color = color;
	}
	void go()
	{
		System.out.println("This vehicle is go");
	}
	void stop()
	{
		System.out.println("This vehicle is stop");
	}
	public String toString()
	{
		return this.speed + "\n"+ this.color + "\n";
	}
}
