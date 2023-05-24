package Food_Court.Resto;

import java.util.ArrayList;

import Food_Court.AppMenu.MainMenu;

public class Main {

	ArrayList<Food> foodList;
	ArrayList<Drink> drinkList;

	public static void main(String[] args) {
		new Main().start();
	}

	public Main() {
		foodList = new ArrayList<>();
		drinkList = new ArrayList<>();
	}
	public void start() {
		new MainMenu().showMenu(foodList,drinkList);
	}
	
	
}
