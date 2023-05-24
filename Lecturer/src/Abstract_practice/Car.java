package Abstract_practice;

public class Car extends Vehiccle{
	
	private String name;
	private int num;
	public Car(String name, int num) {
		this.name = name;
		this.num = num;
	}
	public Car(Car x) {
		this.copy(x);
	}
	



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getNum() {
		return num;
	}




	public void setNum(int num) {
		this.num = num;
	}
	
	void copy(Car x) {
		this.setName(x.getName());
		this.setNum(x.getNum());
	}




	@Override
	void go() {
		System.out.println("Driver riding a car");
	}

}
