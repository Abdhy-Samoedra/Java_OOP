import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata = input.nextLine();

        // string reverse hanya terdapat pada string builder

        StringBuilder cek = new StringBuilder();

        cek.append(kata);
        cek.reverse();

        // karena string builder tidak bisa langsung dicompare denga string biasa maka dibuat to string dulu
        if (kata.equals(cek.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}