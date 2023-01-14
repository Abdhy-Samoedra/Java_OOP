package Session3;

import java.util.ArrayList;
import java.util.Collections;

public class arrayVector {
    public static void main(String[] args) {
        // membuat array
        int arr[] = new int[100];
        arr[0] = 1;

        // membuat array 2 dimensi
        int arr2[][] = new int[10][10];
        arr2[9][7] = 9;

        // membuar arraylist
        ArrayList<Integer> nilai = new ArrayList<>();

        // push data / insert data ke arraylist

        // nilai.add((int)(Math.random()*1000)); // kayak di link list yang push/insert

        // nilai.set(1, 5); // untuk menembak jika mau langsung memasukkan nilai di
        // index 1

        for (int i = 0; i < 10; i++) {
            nilai.add((int) (Math.random() * 1000));
        }
        
        //berbagai cara untuk sorting
        nilai.sort((a, b) -> a.compareTo(b)); //untuk sorting juga kecil ke besar
        // nilai.sort((a, b) -> a > b ? 1 : a < b ? -1 : 0); //untuk sorting juga- kecil ke besar
        // nilai.sort((a, b) -> a > b ? -1 : a < b ? 1 : 0); //untuk sorting juga besar ke kecil
        // Collections.sort(nilai); // colllection.sort untuk sorting ascending(kecil ke besar)

        for (int i = 0; i < 10; i++) {
            System.out.println(nilai.get(i));
        }

        // pop / delete data dari arraylist
        nilai.remove(0); // untuk menghapus data di index 0
        nilai.remove(nilai.size() - 1); // untuk menghapus data di index terakhir

        System.out.println("Setelah dihapus");

        for (int i = 0; i < nilai.size(); i++) {
            System.out.println(nilai.get(i));
        }
        System.out.println("size : " + nilai.size());
        System.out.println(nilai.get(0));

        
        // nilai.clear(); // untuk menghapus semua data
        // System.out.println("size : " + nilai.size());

        System.out.println(nilai.contains(6)); // untuk mencari data di arraylist
    }

}
