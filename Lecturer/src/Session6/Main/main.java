package Session6.Main;

import Session6.Perwira;
import Session6.Pion;
import Session6.Sel;
import Session6.WarnaEnum;

import java.util.ArrayList;

public class main {

    /* polymorphism : mengarah kepada perbedaan behavior contohnya tiap bidak catur memiliki cara jalan/behavior yang berbeda */

    /*overloading : 
    - nama function harus sama 
    - jumlah parameternya berbeda
    - tipe data paramternya berbeda
    - biasanya berada di dalam 1 class
    */

    /*overriding : 
    - nama functionnya sama
    - berbeda class
    */

    /*
    abstract class : class yang memiliki absrtratc function
    abstract function : function yang belum di deskripsikan/didefine
    */

    /*
    interface :
    - semua functionnya adalah abstract
    - semua atributnya const
    */
    public static void main(String[] args) {
//        Perwira p = new Perwira('A',1, WarnaEnum.Putih); // error karena beda package
        Pion pion = new Pion('A', 2, WarnaEnum.Putih);

        ArrayList<Sel> jalan = pion.kemungkinanJalan();
        for (Sel sel : jalan) {
            System.out.println("" + sel.kolom + sel.baris);
        }
    }


}
