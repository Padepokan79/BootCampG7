/*
Created By	: Malik Chaudhary
Time 		: 16-05-2018 9:19PM

Soal :
Nilai angka 1-100. Setiap inputan memiliki keistimewaan. 
Tampilkan fizz dari setiap urutan untuk nilai kelipatan 4. 
Tampilkan bizz dari setiap urutan untuk nilai kelipatan 8.
Tampilkan fizzbizz dari setiap urutan untuk nilai kelipatan 13.
Apabila ada nilai yang memiliki kelipatan yang sama (misal : 4 dan 8) 
prioritaskan untuk kelipatan yang lebih besar

Inputan : 20

Nilai yang akan muncul ==========
1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ, 14, 15, BIZZ, 17, 18, 19, FIZZ

------------------------------------------------------------------------------------------------------------------

*/
import java.util.Scanner;
public class KhairilIf1{
	public static void main(String[] args){
		Scanner nilai = new Scanner(System.in);

		int angka;

		System.out.print("Inputan (1-20): ");
		angka = nilai.nextInt();

		if ( angka == 1 ) {
			System.out.print("1");
		}
		 if ( angka == 2 ) {
			System.out.print("1, 2");
		}
		 if ( angka == 3 ) {
			System.out.print("1, 2, 3");
		}
		 if ( angka == 4 ) {
			System.out.print("1, 2, 3, FIZZ");
		}
		 if ( angka == 5 ) {
			System.out.print("1, 2, 3, FIZZ, 5");
		}
		 if ( angka == 6 ) {
			System.out.print("1, 2, 3, FIZZ, 5, 6");
		}
		 if ( angka == 7 ) {
			System.out.print("1, 2, 3, FIZZ, 5, 6, 7");
		}
		 if ( angka == 8 ) {
			System.out.print("1, 2, 3, FIZZ, 5, 6, 7, BIZZ ");
		}
		 if ( angka == 9 ) {
			System.out.print("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9 ");
		}
		 if ( angka == 10 ) {
			System.out.print("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10 ");
		}
		 if ( angka == 11 ) {
			System.out.print("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11 ");
		}
		 if ( angka == 12 ) {
			System.out.print("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ ");
		}
		 if ( angka == 13 ) {
			System.out.print("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ ");
		}
		 if ( angka == 14 ) {
			System.out.print("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ, 14 ");
		}
		 if ( angka == 15 ) {
			System.out.print("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ, 14, 15 ");
		}
		 if ( angka == 16 ) {
			System.out.print("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ, 14, 15, BIZZ");
		}
		 if ( angka == 17 ) {
			System.out.print("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ, 14, 15, BIZZ, 17");
		}
		 if ( angka == 18 ) {
			System.out.print("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ, 14, 15, BIZZ, 17, 18 ");
		}
		 if ( angka == 19 ) {
			System.out.print("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ, 14, 15, BIZZ, 17, 18, 19");
		}
		 if ( angka == 20 ) {
			System.out.print("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ, 14, 15, BIZZ, 17, 18, 19, FIZZ ");
		}
	}
}