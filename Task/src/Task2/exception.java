package Task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class exception {
    // FileNotFoundException
    // public static void main(String[] args) {
    // try {
    // File file = new File("D://saya.txt");

    // FileReader fl = new FileReader(file);
    // } catch (Exception e) {
    // System.out.println("file tidak ada");
    // }
    // }

    // Arithmatic exception
    // public static void main(String[] args) {
    // try {
    // int x = 30;
    // int y = 0;

    // int result = x/y;

    // System.out.println("Result :"+result);
    // } catch (ArithmeticException e) {
    // System.out.println("tidak bisa membagi dengan 0");
    // }
    // }

    // Nullpointer exception
    // public static void main(String[] args) {
    // try {
    // String a = null;
    // System.out.println(a.charAt(0));
    // } catch (NullPointerException e) {
    // System.out.println("Nullpointer exception");
    // }
    // }

    // StringIndexOutOfBoundsException
    // public static void main(String[] args) {
    // try {
    // String a = "samoedra";
    // System.out.println(a.charAt(10));
    // } catch (StringIndexOutOfBoundsException e) {
    // System.out.println("StringIndexOutOfBoundsException");
    // }
    // }

    // ArrayIndexOutOfBounds Exception
    // public static void main(String[] args) {
    // try {
    // int a[] = new int[8];
    // a[11] = 20;
    // } catch (ArrayIndexOutOfBoundsException e) {
    // System.out.println("ArrayIndexOutOfBoundsException");
    // }
    // }

    // NumberFormatException
    // public static void main(String[] args) {
    // try {
    // int angka = Integer.parseInt("samoedra");
    // System.out.println(angka);
    // } catch (Exception e) {
    // System.out.println("number format exception");
    // }
    // }

    // IllegalArgumentException
    // public static void print(int num) {
    // if (num >= 33) {
    // System.out.println("berhasil");
    // } else {

    // throw new IllegalArgumentException("tidak berhasil");
    // }

    // }
    // public static void main(String[] args) {
    // exception.print(11);
    // }

    // ClassNotFoundException
    // public static void main(String[] args) {
    // try {
    // Class.forName("PPTI16");
    // } catch (Exception e) {
    // System.out.println(e);
    // System.out.println("clas not found");
    // }
    // }

    // IOException
    // public static void main(String[] args) {
    //     try {
    //         File file = new File("file.txt");
    //         FileInputStream fileInputStream = new FileInputStream(file);
    //         // do something with the file
    //     } catch (IOException e) {
    //         System.out.println("IOException occured");
    //         e.printStackTrace();
    //     }
    // }

    // NoSuchElementException
    public static void main(String[] args) {
        Set exampleleSet = new HashSet();
 
        Hashtable exampleTable = new Hashtable();
 
        exampleleSet.iterator().next();
          //accessing Set
       
        exampleTable.elements().nextElement();
    }
}
