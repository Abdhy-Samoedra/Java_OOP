package Food_Court;

public abstract class Menu {
	 private String name;
	 private String id;
	 public Menu(String name) {
		this.name = name;
		this.id = generateId();
	}
	
	public abstract String generateId();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}public String getId() {
		return id;
	}
	 
	 
}
