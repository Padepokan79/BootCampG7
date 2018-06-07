package TigaObjek;

public class Tampil {

	public static void main(String[] args) {
		
		Headset headset1 = new Headset();
		Headset headset2 = new Headset();
		Headset headset3 = new Headset(1.2, 35000, 3.5, "Putih", "Samsung");
		
		headset1.panjang = 2.3;
		headset1.harga = 75000;
		headset1.besarColokan = 2.5;
		headset1.warna = "Hitam";
		headset1.merk = "Xiaomi";
		headset1.tampil();
		//////////////////////
		headset2.Headset(2, 27000, 3.5, "Biru", "Sony");
		headset2.tampil();
		//////////////////////
		headset3.tampil();
		
		
		//********************************//
		
		Flashdisk fd1 = new Flashdisk();
		Flashdisk fd2 = new Flashdisk();
		Flashdisk fd3 = new Flashdisk(32, 75000, 3, "Toshiba", "Hitam");
		
		fd1.kapasitas = 16;
		fd1.harga = 55000;
		fd1.type = 2.5;
		fd1.merk = "Sandisk";
		fd1.warna = "Merah";
		fd1.tampil();
		////////////////////
		fd2.Flashdisk(8, 35000, 3, "Seagete", "Hijau");
		fd2.tampil();
		///////////////////
		fd3.tampil();
		
		//********************************//
		
		Motor motor1 = new Motor();
		Motor motor2 = new Motor();
		Motor motor3 = new Motor(250, 43000000, "Kawasaki", "KLX 250 BF", "Hijau", "Trail");
		
		motor1.cc = 125;
		motor1.harga = 10000000;
		motor1.merk = "Honda";
		motor1.nama = "Supra X 125";
		motor1.warna = "Merah";
		motor1.tipe = "Bebek";
		motor1.tampil();
		///////////////////
		motor2.Motor(165, 8000000, "Honda", "GL Pro", "Hitam", "Sport");
		motor2.tampil();
		//////////////////
		motor3.tampil();
	}

}
