import java.util.Scanner;

public class theBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int a, b;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == size - 1) {
                        System.out.print("*");
                    } else if (j == i || j == size - i - 1) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
