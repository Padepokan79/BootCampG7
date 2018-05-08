/*

Soal : 
andi mempunyai uang sebesar Rp. 250.000, ia membelanjakan uangnya untuk membeli
seekor kucing seharga Rp. 150.000, membeli makanan kucing Rp. 15000, kemudian kucing tersebut melahirkan
2 ekor anak kucing. andi menjual kedua anak kucing tsb masing" seharga Rp. 20.000. Berapakah uang Andi saat ini ?

Nama : Malik Chaudhary
Time : 07-05-2018 1:17PM

*/

public class Ex6Drill2{
	public static void main(String[] args){
		int uang, hargaKucing, hargaMakananKucing, jumlahAnakKucing, hargaAnakKucing;

		uang               = 250000;
		hargaKucing        = 150000;
		hargaMakananKucing = 15000;
		jumlahAnakKucing   = 2;
		hargaAnakKucing    = 20000;

		uang = (uang-hargaKucing-hargaMakananKucing)+(jumlahAnakKucing*hargaAnakKucing);
		System.out.println("Uang andi sekarang = "+uang);
	}
}