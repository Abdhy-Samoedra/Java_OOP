import java.util.Scanner;

public class theRankOfGPA {

    static void bubleSort(double[] GPA) {
        for (int i = 0; i < GPA.length; i++) {
            for (int j = 0; j < GPA.length - 1; j++) {
                if (GPA[j] < GPA[j + 1]) {
                    double temp = GPA[j];
                    GPA[j] = GPA[j + 1];
                    GPA[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mhs = input.nextInt();

        double[] GPA = new double[mhs];

        for (int i = 0; i < mhs; i++) {
            GPA[i] = input.nextDouble();
        }
        bubleSort(GPA);

        int rank = 1;
        int count = 0;
        for (int i = 0; i < GPA.length; i++) {
            if (i == 0) {
                System.out.printf("%d %.2f\n", rank, GPA[i]);
            } else {
                if (GPA[i] == GPA[i - 1]) {
                    count++;
                    System.out.printf("%d %.2f\n", rank, GPA[i]);
                } else {
                    rank += count + 1;
                    count = 0;
                    System.out.printf("%d %.2f\n", rank, GPA[i]);
                }
            }
        }
    }
}
