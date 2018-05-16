/*
created by : Malik Chaudhary
time : 15-05-2018 8:33AM
Soal :
Buatlah program untuk mencari jenis sebuah bilangan
Jenis bilangan
Positif, negatif --> riil
		 --> bulat --> genap
			   --> ganjil
=====================================
Masukkan bilangan: 39
=====================================
Bilangan tersebut adalah
Bilangan bulat ganjil positif
=====================================
contoh lain: -32.3 --> bilangan riil negatif
	     12.00 --> bilangan bulat genap positif



*/
import java.util.Scanner;
public class AlifharIf1{
	public static void main(String[] args){
		Scanner bilangan = new Scanner(System.in);

		double bilRil, angka;
		int bilBulat;

		System.out.println("=======================");
		System.out.print("Masukan bilangan :");
		angka = bilangan.nextDouble();

		System.out.println("=======================");
		System.out.println("Bilangan tersebut adalah");
		if ( ( angka % 2 ) == 0 ) {
			if ( angka > 0 ) {
				System.out.print("Bilangan bulat genap positif");
			}else{
				System.out.print("Bilangan bulat genap negatif");
			}
			
		}else if( ( ( angka % 2 ) < 0 ) ){
			if ( angka > 0 ) {
				System.out.print("Bilangan bulat ganjil positif");
			}else{
				System.out.print("Bilangan bulat ganjil negatif");
			}
		}
	}
}
