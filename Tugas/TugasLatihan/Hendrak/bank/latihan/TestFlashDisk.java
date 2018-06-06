package latihan;

public class TestFlashDisk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	
	}

}
