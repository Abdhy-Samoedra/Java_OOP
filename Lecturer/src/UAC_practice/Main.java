package UAC_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("saya");
		ArrayList<String> buah = new ArrayList<>();
		
		int input;
		String nama;
		Scanner scan = new Scanner(System.in);
		
		input = scan.nextInt();
		for (int i = 0; i < input; i++) {
			nama = scan.next();
			buah.add(nama);
		}
		for (int i = 0; i < buah.size(); i++) {
			System.out.println(buah.get(i));
		}
		 
		Buah buahku = new Buah(null,0);
		buahku.setHarga(2000000);
		buahku.setNama("jeruk");

		System.out.println(buahku.harga);
		System.out.println(buahku.nama);
	}

	}


