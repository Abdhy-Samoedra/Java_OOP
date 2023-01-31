package Session6;

import java.util.ArrayList;

public class Benteng extends Perwira {

    protected Benteng(char kolom, int baris, WarnaEnum warna) {
        super(kolom, baris, warna);
    }

    @Override
    public ArrayList<Sel> kemungkinanJalan() {
        return null;
    }
}
