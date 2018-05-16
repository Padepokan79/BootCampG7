/*
created by : Malik Chaudhary
time : 15-05-2018 9:22AM
Soal :

Buatlah program untuk mencari angka terdepan dan angka paling belakang dalam sebuah bilangan. Lalu tentukan nilai dari angka tersebut didalam bilangan. 
*Bilangan harus bernilai antara 1 sampai 9999.
*Jika bilangan hanya bernilai satuan, maka angka terdepan dan paling belakang akan bernilai sama
=============================================
Masukkan bilangan: 1996
=============================================
angka terdepan: 1 dengan nilai ribuan
angka paling belakang: 6 dengan nilai satuan
=============================================

*/
import java.util.Scanner;
public class AlifharIf2{
	public static void main(String[] args){
		Scanner angka = new Scanner(System.in);
		int bil, puluhan, ratusan, ribuan, ratusribu;

		System.out.println("==========================");

		System.out.print("Masukan bilangan : ");
		bil = angka.nextInt();

		System.out.println("==========================");

		puluhan = bil%10;
		ratusan = (bil%100)%10;
		ribuan = ((bil%1000)%100)%10;

		if ( !( bil < 9999 && bil > 0 ) ) {
			if ( bil < 10 ) {
			System.out.println(" angka terdepan : "+bil+" anilai satuan ");
			}else if ( bil < 100 ) {
				bil = bil/10;
				System.out.println("angka terdepan : "+bil+" nilai puluhan");
				System.out.println(" angka paling belakang : "+puluhan+" nilai satuan ");
			}else if ( bil < 1000 ) {
				bil = bil/100;
				System.out.println(" angka terdepan : "+bil+" nilai ratusan ");
				System.out.println(" angka paling belakang : "+ratusan+" nilai satuan ");
			}else if ( bil < 10000) {
				bil = bil/1000;
				System.out.println(" angka terdepan : "+bil+" nilai ratusan ");
				System.out.println(" angka paling belakang : "+ribuan+" nilai satuan ");
			}
		}else{
			System.out.print("Angkamu melebihi/kurang dari batas");
		}
		
		
	}
}