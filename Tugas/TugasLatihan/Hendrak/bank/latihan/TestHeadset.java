package latihan;

public class TestHeadset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Headset h1 = new Headset();
		Headset h2 = new Headset("merek2", "merah", 1.2, 0.3, 45000);
		Headset h3 = new Headset();
		
		h1.merk="merek1";
		h1.warna="hitam";
		h1.panjang=1;
		h1.besarColokan=0.5;
		h1.harga = 50000;
		
		
		h3.tambahData("merek3", "Biru", 1.1, 0.4, 60000);
		
		h1.tampil();
		h2.tampil();
		h3.tampil();
		
	}

}
