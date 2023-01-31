package Session6;

import java.util.ArrayList;

public abstract class Perwira {
    private int poin;
    //    private char kolom;
    //    private int baris;
    protected Sel posisi;
    private WarnaEnum warna;  // tidak perlu di protected karena tidak akan di set dikelads turunannya ,di turunkan hanya butuh get doang, maka bikin getter nya dulu

    public WarnaEnum getWarna() {
        return warna;
    }

    protected Perwira(Sel sel, WarnaEnum warna) {
        this.posisi = sel;
        this.warna = warna;
    }

    protected Perwira(char kolom, int baris, WarnaEnum warna) {
        poin = 1;
        //      this.kolom = kolom;
        //      this.baris = baris;
        this.posisi = new Sel(kolom, baris);
        this.warna = warna;
    }

//    protected ArrayList<Sel> kemungkinanJalan() {
//        return new ArrayList<>();
//    }
    public abstract ArrayList<Sel> kemungkinanJalan();
}

