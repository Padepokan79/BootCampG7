/*
	DATE CREATED : 17 MEI 2018
	AUTHOR       : NURDHIAT CHAUDHARY MALIK
*/
/*
	Inputan merupakan jumlah angka dadu dari 3 dadu. Tampilkan kombinasi angka dadu setiap masing-masing yang berbeda angka dan berbeda urutan.

	Inputan  : 4

	Peluang angka dadu ==============
	Angka dadu yang mungkin terjadi :
	1 / 1 / 2
	1 / 2 / 1
	2 / 1 / 1
*/
import java.util.Scanner;
public class Khairil01{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		int inputAngka, angka1, angka2, angka3, angka4, angka5, angka6;
		angka6 = 6;
		angka5 = 5;
		angka4 = 4;
		angka3 = 3;
		angka2 = 2;
		angka1 = 1;

		System.out.print("Inputan : ");
		inputAngka = key.nextInt();

		System.out.println("Peluang angka dadu ==============");
		System.out.println("Angka dadu yang mungkin terjadi :");

		if (inputAngka == angka1 || inputAngka == angka2) {
			System.out.println("Tidak ada kemungkinan yang terjadi");
		}
		else if (inputAngka == angka3) {
			System.out.println("1 / 1 / 1");
		}
		else if (inputAngka == angka4) {
			System.out.println("1 / 1 / 2");
			System.out.println("1 / 2 / 1");
			System.out.println("2 / 1 / 1");
		}
		else if (inputAngka == angka5) {
			System.out.println("2 / 2 / 1");
			System.out.println("2 / 1 / 2");
			System.out.println("1 / 2 / 2");
			System.out.println("3 / 1 / 1");
			System.out.println("1 / 3 / 1");
			System.out.println("1 / 1 / 3");
		}
		else if (inputAngka == angka6) {
			System.out.println("2 / 2 / 2");
			System.out.println("1 / 1 / 4");
			System.out.println("1 / 4 / 1");
			System.out.println("4 / 1 / 1");
			System.out.println("3 / 2 / 1");
			System.out.println("3 / 1 / 2");
			System.out.println("1 / 3 / 2");
			System.out.println("1 / 2 / 3");
		}
		else if (inputAngka == (angka6+1)) {
			System.out.println("1 / 1 / 5");
			System.out.println("1 / 5 / 1");
			System.out.println("5 / 1 / 1");
			System.out.println("1 / 2 / 4");
			System.out.println("2 / 4 / 1");
			System.out.println("1 / 4 / 2");
			System.out.println("4 / 1 / 2");
			System.out.println("4 / 2 / 1");
			System.out.println("3 / 3 / 1");
			System.out.println("3 / 1 / 3");
			System.out.println("1 / 3 / 3");
		}
		else if (inputAngka == (angka6+2)) {
			System.out.println("1 / 1 / 6");
			System.out.println("1 / 6 / 1");
			System.out.println("6 / 1 / 1");
			System.out.println("1 / 2 / 5");
			System.out.println("1 / 5 / 2");
			System.out.println("5 / 1 / 2");
			System.out.println("5 / 2 / 1");
			System.out.println("2 / 1 / 5");

			System.out.println("1 / 3 / 4");
			System.out.println("1 / 4 / 3");
			System.out.println("4 / 3 / 1");
			System.out.println("4 / 1 / 3");
			System.out.println("3 / 4 / 1");
			System.out.println("3 / 1 / 4");
		}
		else if (inputAngka == (angka6+3)) {
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
			System.out.println("1 / 3 / 5");
			System.out.println("1 / 5 / 3");

			System.out.println("1 / 4 / 4");
			System.out.println("4 / 1 / 4");
			System.out.println("4 / 4 / 1");

		}
		else if (inputAngka == (angka6+4)) {
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
			System.out.println("3 / 3 / 4");
			System.out.println("3 / 4 / 3");

			System.out.println("5 / 2 / 3");
			System.out.println("5 / 3 / 2");
			System.out.println("3 / 5 / 2");
			System.out.println("3 / 2 / 5");
			System.out.println("2 / 3 / 5");
			System.out.println("2 / 5 / 3");
			
		}
		else if (inputAngka == (angka6+5)) {
			System.out.println("1 / 4 / 6");
			System.out.println("1 / 6 / 4");
			System.out.println("6 / 1 / 4");
			System.out.println("6 / 4 / 1");
			System.out.println("4 / 1 / 6");
			System.out.println("4 / 6 / 1");

			System.out.println("1 / 5 / 5");
			System.out.println("5 / 5 / 1");
			System.out.println("5 / 1 / 5");

			System.out.println("3 / 3 / 5");
			System.out.println("3 / 5 / 3");
			System.out.println("5 / 3 / 3");

			System.out.println("2 / 3 / 6");
			System.out.println("2 / 6 / 3");
			System.out.println("6 / 2 / 3");
			System.out.println("6 / 3 / 2");
			System.out.println("3 / 6 / 2");
			System.out.println("3 / 2 / 6");
			
		}
		else if (inputAngka == (angka6+6)) {
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

			System.out.println("2 / 4 / 6");
			System.out.println("2 / 6 / 4");
			System.out.println("6 / 2 / 4");
			System.out.println("6 / 4 / 2");
			System.out.println("4 / 6 / 2");
			System.out.println("4 / 2 / 6");

			System.out.println("4 / 3 / 5");
			System.out.println("4 / 5 / 3");
			System.out.println("5 / 3 / 4");
			System.out.println("5 / 4 / 3");

			System.out.println("3 / 3 / 6");
			System.out.println("3 / 6 / 3");
			System.out.println("6 / 3 / 3");
		}
		else if (inputAngka == (angka6+7)) {
			System.out.println("1 / 6 / 6");
			System.out.println("6 / 1 / 6");
			System.out.println("6 / 6 / 1");

			System.out.println("6 / 5 / 2");
			System.out.println("6 / 2 / 5");
			System.out.println("5 / 6 / 2");
			System.out.println("5 / 2 / 6");
			System.out.println("2 / 6 / 5");
			System.out.println("2 / 5 / 6");

			System.out.println("6 / 4 / 3");
			System.out.println("6 / 3 / 4");
			System.out.println("4 / 3 / 6");
			System.out.println("4 / 6 / 3");
			System.out.println("3 / 6 / 4");
			System.out.println("3 / 4 / 6");
		}
		else if (inputAngka == (angka6+8)) {
			System.out.println("2 / 6 / 6");
			System.out.println("6 / 2 / 6");
			System.out.println("6 / 6 / 2");

			System.out.println("6 / 5 / 3");
			System.out.println("6 / 3 / 5");
			System.out.println("5 / 6 / 3");
			System.out.println("5 / 3 / 6");
			System.out.println("3 / 6 / 5");
			System.out.println("3 / 5 / 6");

			System.out.println("6 / 4 / 4");
			System.out.println("4 / 6 / 4");
			System.out.println("4 / 4 / 6");

		}
		else if (inputAngka == (angka6+9)) {
			System.out.println("3 / 6 / 6");
			System.out.println("6 / 3 / 6");
			System.out.println("6 / 6 / 3");

			System.out.println("6 / 5 / 4");
			System.out.println("6 / 4 / 5");
			System.out.println("5 / 6 / 4");
			System.out.println("5 / 4 / 6");
			System.out.println("4 / 6 / 5");
			System.out.println("4 / 5 / 6");

			System.out.println("5 / 5 / 5");
		}
		else if (inputAngka == (angka6+10)) {
			System.out.println("4 / 6 / 6");
			System.out.println("6 / 4 / 6");
			System.out.println("6 / 6 / 4");

			System.out.println("6 / 5 / 5");
			System.out.println("5 / 6 / 5");
			System.out.println("5 / 5 / 6");

		}
		else if (inputAngka == (angka6+11)) {
			System.out.println("5 / 6 / 6");
			System.out.println("6 / 5 / 6");
			System.out.println("6 / 6 / 5");
		}
		else if (inputAngka == (angka6+12)) {
			System.out.println("6 / 6 / 6");
		}



	}
}