package Food_Court.Resto;

import Food_Court.Menu;

public class Drink extends Menu{
	private String flavor;
	public Drink(String name ,String flavor) {
		super(name);
		this.flavor = flavor;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	@Override
	public String generateId() {
		String id;
		int count = 1;
		id = "DRINK" + ((long)(Math.random()*(999L-100L+1)));
		return id;
	}
	
}
