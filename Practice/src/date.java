import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class date {
    public static void main(String[] args) throws IOException, ParseException {
        // final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        // final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // final String firstInput = reader.readLine();
        // final String secondInput = reader.readLine();
        // final LocalDate firstDate = LocalDate.parse(firstInput, formatter);
        // final LocalDate secondDate = LocalDate.parse(secondInput, formatter);
        // final long days = ChronoUnit.DAYS.between(firstDate, secondDate);
        // System.out.println(firstDate);
        // System.out.println(secondDate);





        // System.out.println("Days between: " + days);


        Scanner input = new Scanner(System.in);
        String tanggal1 = input.nextLine();
        String tanggal2 = input.nextLine();

        // SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy")

        LocalDate date1 = LocalDate.parse(tanggal1, DateTimeFormatter.ISO_DATE);
        LocalDate date2 = LocalDate.parse(tanggal2, DateTimeFormatter.ISO_DATE);

        long selisih = ChronoUnit.DAYS.between(date1,date2);
        System.out.println(selisih);


    }
}
