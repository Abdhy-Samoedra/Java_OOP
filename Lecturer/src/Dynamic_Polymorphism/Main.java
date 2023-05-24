package Dynamic_Polymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Animal animal;
		
		System.out.println("what animal do you want?");
		System.out.println("1=dog 2= cat");
		
		int choice = scan.nextInt();
		if(choice == 1)
		{
			animal = new Dog();
			animal.speak();
		}else if (choice == 2) {
			animal = new Cat();
			animal.speak();
		}else {
			animal = new Animal();
			System.out.println("choice invalid");
			animal.speak();
		}
	}

}
