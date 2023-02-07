package Session7;

public class Main {
    public static void main(String[] args) {

    }
}

/*  class vs abstract class vs interface class
    1 abstract class
        - suatu class yang memiliiki method yang belum didefinisikan
        - hanya bisa di extend 1 kali ( turunannya hanya boleh 1 parent )



    2 interface class
        - semua methodnya abstract
        - semua variael nya constant
        - boleh di IMPLEMENT lebih dari satu kali
 */
interface IInterface {
    int constanta1 = 1; // ini constant

    void method1(); // ini sudah abstract
}

//implementasi interfacenya

class Coba implements IInterface {  // ini bisa lebih dari 1 implement interfacenya dengan setiap penambahan dibatasi  ,

    @Override
    public void method1() {

    }
}

//kapan pakai abstract dan interface
/*
ketika abstract class yang diturunkan
- method/behavior nya
- atribut

ketika interface
- interface tidak punya atribut
- dipakai ketika, misal terdapat mobil dan kuda kan keduanya sama sama bergerak kita tidak bisa meng extend dari sebuah kelas, maka kita buat class baru bernama
  bergerak laalu akan di IMPLEMENT ke kuda dan mobil
- yang diturunkan behaviornya , bukan atribut
- interface bisa dipakai jika yang diturun kan tidak punya atribut, melainkan hanya behaviornya
- pokoknya interface menurunkan method / behavior yang tidak punya atribut
 */