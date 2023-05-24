package Food_Court.AppMenu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Food_Court.Resto.Drink;
import Food_Court.Resto.Food;

public class MainMenu {
	Scanner scan = new Scanner(System.in);

	public void showMenu(ArrayList<Food> foodList, ArrayList<Drink> drinkList)
	{
		int input = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Food court");
			System.out.println("1. add Menu");
			System.out.println("2. View Menu");
			System.out.println("3. Remove Menu");
			System.out.println("4. Edit Menu");
			System.out.println("5. Exit");
			System.out.print(">> ");
			input = scan.nextInt();
			scan.nextLine();
			
			switch (input) {
			case 1:
				addMenu(foodList,drinkList);
				break;
			case 2:
				viewMenu(foodList,drinkList);
				break;
			case 3:
				removeMenu(foodList,drinkList);
				break;
			case 4:
				editMenu(foodList,drinkList);
				break;
			
			}
		} while (input != 5);
	}
	public void addFood(ArrayList<Food> foodList, ArrayList<Drink> drinkList)
	{
		String name;
		String type;
		System.out.print("name :");
		name = scan.nextLine();
		System.out.print("type :");
		type = scan.nextLine();
		Food food = new Food(name, type);
		foodList.add(food);
	}
	public void addMenu(ArrayList<Food> foodList, ArrayList<Drink> drinkList)
	{
		String menu;
		do {
			System.out.print("What menu (Food | Drink): ");
			menu = scan.nextLine();
		} while (!menu.equals("Food") &&  !menu.equals("Drink"));
		if (menu.equals("Food")) {
			addFood(foodList, drinkList);
		}else if (menu.equals("Drink")) {
			addDrink(foodList,drinkList);
		}
	}
	private void addDrink(ArrayList<Food> foodList, ArrayList<Drink> drinkList) {
		String name;
		String flavor;
		System.out.print("name :");
		name = scan.nextLine();
		System.out.print("flavor :");
		flavor = scan.nextLine();
		Drink drink = new Drink(name,flavor);
		drinkList.add(drink);
	}
	public void viewMenu(ArrayList<Food> foodList, ArrayList<Drink> drinkList)
	{
		int input = 0;
		System.out.println("1. show Food");
		System.out.println("2. show drink");
		System.out.print(">> ");
		input = scan.nextInt();
		scan.nextLine();
		switch (input) {
		case 1: 
			for (int i = 0; i < foodList.size(); i++) {
				System.out.println("id : " + foodList.get(i).getId());
				System.out.println("name : " + foodList.get(i).getName());
				System.out.println("type : " +foodList.get(i).getType());
			}
			break;
		case 2:
			for (int i = 0; i < drinkList.size(); i++) {
				System.out.println("id : " + drinkList.get(i).getId());
				System.out.println("name : " + drinkList.get(i).getName());
				System.out.println("type : " +drinkList.get(i).getFlavor());
			}
			break;
		}
	}
	public void removeMenu(ArrayList<Food> foodList, ArrayList<Drink> drinkList)
	{
		int input = 0;
		String delete;
		int cek = 0;
		System.out.println("1. delete Food");
		System.out.println("2. delete drink");
		System.out.print(">> ");
		input = scan.nextInt();
		scan.nextLine();
		switch (input) {
		case 1: 
			for (int i = 0; i < foodList.size(); i++) {
				System.out.println("id : " + foodList.get(i).getId());
				System.out.println("name : " + foodList.get(i).getName());
				System.out.println("type : " +foodList.get(i).getType());
			}
			System.out.print("input food to delete");
			delete = scan.nextLine();
			for (int i = 0; i < foodList.size(); i++) {
				if (delete.equals(foodList.get(i).getName())) {
					foodList.remove(i);
					cek = 1;
				}
			}
			if (cek != 1) {
				System.out.println("food not found");
			}
			cek =0;
			break;
		case 2:
			for (int i = 0; i < drinkList.size(); i++) {
				System.out.println("id : " + drinkList.get(i).getId());
				System.out.println("name : " + drinkList.get(i).getName());
				System.out.println("type : " +drinkList.get(i).getFlavor());
			}
			System.out.print("input drink to delete");
			delete = scan.nextLine();
			for (int i = 0; i < drinkList.size(); i++) {
				if (delete.equals(drinkList.get(i).getName())) {
					drinkList.remove(i);
					cek = 1;
				}
			}
			if (cek != 1) {
				System.out.println("drink not found");
			}
			cek =0;
			break;
		}
	}
	public void editMenu(ArrayList<Food> foodList, ArrayList<Drink> drinkList)
	{
		int input = 0;
		String update;
		String newName;
		int cek = 0;
		System.out.println("1. update Food");
		System.out.println("2. update drink");
		System.out.print(">> ");
		input = scan.nextInt();
		scan.nextLine();
		switch (input) {
		case 1: 
			for (int i = 0; i < foodList.size(); i++) {
				System.out.println("id : " + foodList.get(i).getId());
				System.out.println("name : " + foodList.get(i).getName());
				System.out.println("type : " +foodList.get(i).getType());
			}
			System.out.print("input food to update");
			update = scan.nextLine();
			for (int i = 0; i < foodList.size(); i++) {
				if (update.equals(foodList.get(i).getName())) {
					System.out.print("input new name");
					newName = scan.nextLine();
					foodList.get(i).setName(newName);
					cek = 1;
				}
			}
			if (cek != 1) {
				System.out.println("food not found");
			}
			cek =0;
			break;
		case 2:
			for (int i = 0; i < drinkList.size(); i++) {
				System.out.println("id : " + drinkList.get(i).getId());
				System.out.println("name : " + drinkList.get(i).getName());
				System.out.println("type : " +drinkList.get(i).getFlavor());
			}
			System.out.print("input drink to update");
			update = scan.nextLine();
			for (int i = 0; i < drinkList.size(); i++) {
				if (update.equals(drinkList.get(i).getName())) {
					System.out.print("input new name");
					newName = scan.nextLine();
					drinkList.get(i).setName(newName);
					cek = 1;
				}
			}
			if (cek != 1) {
				System.out.println("food not found");
			}
			cek =0;
			break;
		}
	}
}
