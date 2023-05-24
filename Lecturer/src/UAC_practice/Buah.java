package UAC_practice;

public class Buah {
	String nama;
	int harga;
	public Buah(String nama, int harga) {
		super();
		this.nama = nama;
		this.harga = harga;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	
}
