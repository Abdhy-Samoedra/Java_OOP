package Session6;

import java.util.ArrayList;

public class Pion extends Perwira {
    public Pion(char kolom, int baris, WarnaEnum warna) {
        super(kolom, baris, warna);
    }


    @Override
    public ArrayList<Sel> kemungkinanJalan() {
//        return super.kemungkinanJalan(); // memakai super kemungkinan jalan jika behaviornya sama dengan parentnya
        ArrayList<Sel> jalans = new ArrayList<>();

        if (getWarna() == WarnaEnum.Putih) {
            jalans.add(new Sel(posisi.kolom, posisi.baris + 1));
        } else {
            jalans.add(new Sel(posisi.kolom, posisi.baris - 1));
        }

        return jalans;
    }
}
