package Interface_practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rabbit rabbit = new Rabbit();
		Hawk hawk = new  Hawk();
		Fish smallFish = new Fish();
		Fish largeFish = new Fish();
		smallFish.flee();
		smallFish.hunt();
		hawk.hunt();
		rabbit.flee();
	}

}
