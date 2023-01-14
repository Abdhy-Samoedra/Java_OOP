package Session3;

import java.util.Vector;

public class arrayVector2 {
    public static void main(String[] args) {
        Vector<String> nama = new Vector<>();
        nama.add("Budi"); // untuk add data
        nama.add(0, "sari"); // karena dia di inisialisasi indexnya maka akan dia ditumpuk seperti push mid
                             // di LL
        nama.set(0, "rudi"); // mengganti value di dalam index yang ditunjuk

        System.out.println(nama.get(0));
        System.out.println(nama.get(1));
        System.out.println(nama.capacity());

        System.out.println(fibo(4));
    }

    // method
    static int fibo(int n) { // dikasih static agar bisa diakses kelas lain
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
