package Task2;

import java.util.Scanner;

public class soalrotasi {
    public static void main(String[] args) {
        int size;
        int rotation;
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        rotation = input.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < rotation; i++) {
            int last;
            last = arr[size - 1];
            for (int j = size - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
