package latihan;

public class TestMotor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motor m1 = new Motor();
		Motor m2 = new Motor("Yamaha", "Mio" , "Matic", "Biru", 110, 13000000);
		Motor m3 = new Motor();
		
		m1.merk = "Honda";
		m1.tipe = "Matic";
		m1.nama = "Vario";
		m1.warna = "Hitam";
		m1.kapasitas = 125;
		m1.harga = 15000000;

		m3.tambahData("Honda", "Blade", "Gigi", "Merah", 110, 13000000);
		
		m1.tampil();
		m2.tampil();
		m3.tampil();
	
	}

}
