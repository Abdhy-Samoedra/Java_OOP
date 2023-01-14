import java.util.Scanner;

public class tempCodeRunnerFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String clock = input.nextLine();

        String sprt[] = clock.split(":");
        double hours = Double.parseDouble(sprt[0]);
        double minute = Double.parseDouble(sprt[1]);

        double degree1 = minute / 60 * 360;
        double degree2 = (hours / 12 * 360) + (minute / 60 * 360 / 12);

        System.out.println(degree1);
        System.out.println(degree2);

        double hasil = (360 - (degree2 - degree1));
        
        if (hasil > 360) {
            hasil = hasil - 360;
        } else if (Math.abs(hasil-360) < hasil) {
            hasil = hasil - 360;
        }
        System.out.println(Math.abs(hasil));

    }
}
