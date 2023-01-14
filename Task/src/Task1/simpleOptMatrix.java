import java.util.Scanner;

public class simpleOptMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int cases = input.nextInt();

        // int sum = 0;
        for (int i = 0; i < cases; i++) {
            int opt = input.nextInt();
            int rc = input.nextInt();
            int value = input.nextInt();

            if (opt == 0) {
                for (int j = 0; j < 5; j++) {
                    matrix[rc][j] += value;
                }

            } else if (opt == 1) {
                for (int j = 0; j < 5; j++) {
                    matrix[j][rc] += value;
                }

            }

        }
        int sum = 0;
        int min = matrix[0][0];
        int max = matrix[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sum += matrix[i][j];
                min = Math.min(min, matrix[i][j]);
                max = Math.max(max, matrix[i][j]);
            }
        }
        System.out.println(sum + " " + min + " " + max);
    }

}
