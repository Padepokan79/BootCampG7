package latihan;

public class Test3Objek {
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
		
		System.out.println();
		System.out.println();
		/////////////////////////////////////////////////////////////
		
		FlashDisk fd1 = new FlashDisk();
		FlashDisk fd2 = new FlashDisk("King stone", "Putih" , 3.2, 16, 130000);
		FlashDisk fd3 = new FlashDisk();
		
		fd1.merk = "Hp";
		fd1.kapasitas =16;
		fd1.tipe =3.0;
		fd1.warna ="Hitam";
		fd1.harga =100000;
		
		fd3.tambahData("V-Gen" , "Kuning" , 3.0, 8, 80000);
		
		fd1.tampil();
		fd2.tampil();
		fd3.tampil();
		
		System.out.println();
		System.out.println();
		//////////////////////////////////////////////////////////////////
		
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
