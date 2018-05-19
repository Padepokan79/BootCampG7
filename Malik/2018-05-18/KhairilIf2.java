/*
Created By	: Malik Chaudhary
Time 		: 16-05-2018 9:23PM

Soal :
Inputan merupakan jumlah angka dadu dari 3 dadu. Tampilkan kombinasi angka dadu setiap masing-masing yang berbeda 
angka dan berbeda urutan.

Inputan  : 4

Peluang angka dadu ==============
Angka dadu yang mungkin terjadi :
1 / 1 / 2
1 / 2 / 1
2 / 1 / 1

------------------------------------------------------------------------------------------------------------------

*/
import java.util.Scanner;
public class KhairilIf2{
	public static void main(String[] args){
		Scanner dadu = new Scanner(System.in);

		int angka;

		System.out.print("Inputan : ");
		angka = dadu.nextInt();

		if ( angka < 3 ) {
			System.out.print("Tidak ada kemungkinan");
		}else if ( angka == 3 ) {
			System.out.println("1 / 1 / 1");
		}else if ( angka == 4 ) {
			System.out.println("1 / 1 / 2");
			System.out.println("1 / 2 / 1");
			System.out.println("2 / 1 / 1");
		}else if ( angka == 5 ) {
			System.out.println("1 / 1 / 3");
			System.out.println("1 / 3 / 1");
			System.out.println("3 / 1 / 1");
			System.out.println("2 / 2 / 1");
			System.out.println("2 / 1 / 2");
			System.out.println("1 / 2 / 2");
		}else if ( angka == 6 ) {
			System.out.println("1 / 1 / 4");
			System.out.println("1 / 4 / 1");
			System.out.println("4 / 1 / 1");
			System.out.println("1 / 2 / 3");
			System.out.println("2 / 3 / 1");
			System.out.println("3 / 2 / 1");
			System.out.println("2 / 2 / 2");
		}else if ( angka == 7 ) {
			System.out.println("1 / 1 / 5");
			System.out.println("1 / 5 / 1");
			System.out.println("5 / 1 / 1");
			System.out.println("1 / 2 / 4");
			System.out.println("2 / 4 / 1");
			System.out.println("4 / 2 / 1");
			System.out.println("1 / 4 / 2");
			System.out.println("2 / 1 / 4");
			System.out.println("1 / 3 / 3");
			System.out.println("3 / 3 / 1");
			System.out.println("3 / 1 / 3");
		}else if ( angka == 8 ) {
			System.out.println("1 / 1 / 6");
			System.out.println("1 / 6 / 1");
			System.out.println("6 / 1 / 1");
			System.out.println("1 / 2 / 5");
			System.out.println("2 / 5 / 1");
			System.out.println("5 / 2 / 1");
			System.out.println("1 / 5 / 2");
			System.out.println("2 / 1 / 5");
			System.out.println("5 / 1 / 2");
			System.out.println("1 / 3 / 4");
			System.out.println("1 / 4 / 3");
			System.out.println("4 / 3 / 1");
			System.out.println("3 / 4 / 1");
			System.out.println("3 / 1 / 4");
			System.out.println("4 / 3 / 1");
		}else if ( angka == 9 ) {
			System.out.println("1 / 2 / 6");
			System.out.println("1 / 6 / 2");
			System.out.println("6 / 1 / 2");
			System.out.println("6 / 2 / 1");
			System.out.println("2 / 1 / 6");
			System.out.println("2 / 6 / 1");
			System.out.println("1 / 3 / 5");
			System.out.println("1 / 5 / 3");
			System.out.println("5 / 3 / 1");
			System.out.println("5 / 1 / 3");
			System.out.println("3 / 3 / 3");
			System.out.println("1 / 4 / 4");
			System.out.println("4 / 1 / 4");
			System.out.println("4 / 4 / 1");
			System.out.println("4 / 3 / 1");
		}else if ( angka == 10 ) {
			System.out.println("1 / 3 / 6");
			System.out.println("1 / 6 / 3");
			System.out.println("6 / 1 / 3");
			System.out.println("6 / 3 / 1");
			System.out.println("3 / 1 / 6");
			System.out.println("3 / 6 / 1");
			System.out.println("1 / 4 / 5");
			System.out.println("1 / 5 / 4");
			System.out.println("5 / 4 / 1");
			System.out.println("5 / 1 / 4");
			System.out.println("4 / 1 / 5");
			System.out.println("4 / 5 / 1");
			System.out.println("2 / 4 / 4");
			System.out.println("4 / 2 / 4");
			System.out.println("4 / 4 / 2");
			System.out.println("4 / 3 / 3");
			System.out.println("3 / 3 / 3");
			System.out.println("3 / 4 / 3");
			System.out.println("5 / 2 / 3");
			System.out.println("5 / 3 / 2");
			System.out.println("3 / 5 / 2");
			System.out.println("3 / 2 / 5");
			System.out.println("2 / 3 / 5");
			System.out.println("2 / 5 / 3");
		}else if ( angka == 11 ) {
			System.out.println("1 / 4 / 6");
			System.out.println("1 / 6 / 4");
			System.out.println("6 / 1 / 4");
			System.out.println("6 / 4 / 1");
			System.out.println("4 / 1 / 6");
			System.out.println("4 / 6 / 1");
			System.out.println("1 / 5 / 5");
			System.out.println("5 / 5 / 1");
			System.out.println("5 / 1 / 5");
			System.out.println("4 / 6 / 1");
			System.out.println("4 / 1 / 6");
			System.out.println("1 / 6 / 4");
			System.out.println("6 / 1 / 4");
			System.out.println("3 / 3 / 5");
			System.out.println("3 / 5 / 3");
			System.out.println("5 / 3 / 3");
			System.out.println("2 / 3 / 6");
			System.out.println("2 / 6 / 3");
			System.out.println("6 / 3 / 2");
			System.out.println("6 / 2 / 3");
			System.out.println("3 / 2 / 6");
			System.out.println("3 / 6 / 2");
		}else if ( angka == 12 ) {
			System.out.println("1 / 5 / 6");
			System.out.println("1 / 6 / 5");
			System.out.println("6 / 1 / 5");
			System.out.println("6 / 5 / 1");
			System.out.println("5 / 1 / 6");
			System.out.println("5 / 6 / 1");
			System.out.println("2 / 5 / 5");
			System.out.println("5 / 5 / 2");
			System.out.println("5 / 2 / 5");
			System.out.println("4 / 4 / 4");
			System.out.println("4 / 6 / 2");
			System.out.println("4 / 2 / 6");
			System.out.println("2 / 6 / 4");
			System.out.println("6 / 2 / 4");
			System.out.println("4 / 3 / 5");
			System.out.println("3 / 5 / 4");
			System.out.println("5 / 4 / 3");
			System.out.println("4 / 5 / 3");
			System.out.println("5 / 3 / 4");
			System.out.println("3 / 3 / 6");
			System.out.println("3 / 6 / 3");
			System.out.println("6 / 3 / 3");
		}else if ( angka == 13 ) {
			System.out.println("1 / 6 / 6");
			System.out.println("6 / 6 / 1");
			System.out.println("6 / 1 / 6");
			System.out.println("6 / 5 / 2");
			System.out.println("5 / 2 / 6");
			System.out.println("5 / 6 / 2");
			System.out.println("6 / 2 / 5");
			System.out.println("2 / 6 / 5");
			System.out.println("2 / 5 / 6");
			System.out.println("6 / 4 / 3");
			System.out.println("4 / 3 / 6");
			System.out.println("3 / 6 / 4");
			System.out.println("3 / 4 / 6");
			System.out.println("4 / 6 / 3");
			System.out.println("6 / 3 / 4");
		}else if ( angka == 14 ) {
			System.out.println("2 / 6 / 6");
			System.out.println("6 / 6 / 2");
			System.out.println("6 / 2 / 6");
			System.out.println("6 / 5 / 3");
			System.out.println("5 / 3 / 6");
			System.out.println("5 / 6 / 3");
			System.out.println("6 / 3 / 5");
			System.out.println("3 / 6 / 5");
			System.out.println("3 / 5 / 6");
			System.out.println("6 / 4 / 4");
			System.out.println("4 / 4 / 6");
			System.out.println("4 / 6 / 4");
		}else if ( angka == 15 ) {
			System.out.println("3 / 6 / 6");
			System.out.println("6 / 6 / 3");
			System.out.println("6 / 3 / 6");
			System.out.println("6 / 5 / 4");
			System.out.println("5 / 4 / 6");
			System.out.println("5 / 6 / 4");
			System.out.println("6 / 4 / 5");
			System.out.println("4 / 6 / 5");
			System.out.println("4 / 5 / 6");
			System.out.println("5 / 5 / 5");
		}else if ( angka == 16 ) {
			System.out.println("4 / 6 / 6");
			System.out.println("6 / 6 / 4");
			System.out.println("6 / 4 / 6");
			System.out.println("6 / 5 / 5");
			System.out.println("5 / 5 / 6");
			System.out.println("5 / 6 / 5");
		}else if ( angka == 17 ) {
			System.out.println("5 / 6 / 6");
			System.out.println("6 / 6 / 5");
			System.out.println("6 / 5 / 6");
		}else if ( angka == 17 ) {
			System.out.println("6 / 6 / 6");
		}
	}
}