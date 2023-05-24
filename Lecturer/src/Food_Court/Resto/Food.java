package Food_Court.Resto;

import Food_Court.Menu;

public class Food extends Menu{
	private String type;
	int count = 1;
	public Food(String name, String type) {
		super(name);
		this.type = type;
	}
	@Override
	public String generateId() {
		String id;
		id = "FOOD" + ((long)(Math.random()*(999L-100L+1)));
		count++;
		return id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
