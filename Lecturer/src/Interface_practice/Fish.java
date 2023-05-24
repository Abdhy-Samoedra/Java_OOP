package Interface_practice;

public class Fish implements Prey,Predator{

	@Override
	public void hunt() {
		System.out.println("ikan ini makan ikan yang lebih kecil");
		
	}

	@Override
	public void flee() {
		System.out.println("ikan ini dimakan ikan yang lebih besar");
		
	}

}
