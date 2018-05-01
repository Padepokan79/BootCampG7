public class Alifhar1 {
	public static void main (String[] args) {
		double kecil, besar, waktuKecil, waktuBesar;

		kecil = 10; // liter per menit
		besar = 15; //liter per menit
		waktuBesar = 0.8; // menit
		waktuKecil = (waktuBesar * besar)/kecil; // liter

		System.out.println ("Sebuah kamar mandi memiliki 2 pipa yang berbeda ukuran.\nPipa kecil dapat mengalirkan air 10 liter/menit,\nsedangkan pipa besar 15 liter/menit.\nWaktu yang dibutuhkan untuk mengisi bak menggunakan pipa besar adalah 0,8 menit.\nBerapa menit yang dibutuhkan untuk mengisi bak menggunakan pipa kecil?");
		System.out.println ("Jadi, waktu yang dibutuhkan utnuk mengisi bak dengan pipa besar adalah " + waktuKecil + " menit");
	}
}