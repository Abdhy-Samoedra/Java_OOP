package Generics_practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {1,2,3,4,5};
		String[] stringArray = {"w","y","y"};
		Double[] doubleArray = {1.0,2.88,3.66,4.6,5.9};
		Character[] charArrayy = {'u','q','1'};
		display(intArray);
		display(stringArray);
		System.out.println(getData(stringArray));
		System.out.println(getData(intArray));
		
	}
	public static <T> void display(T[] array)
	{
		for(T t : array) {
			System.out.println(t);
		}
	}
	public static <G> G getData (G[] array)
	{
		return array[0];
		
	}

}
