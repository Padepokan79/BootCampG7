/*
	DATE CREATED : 17 MEI 2018
	AUTHOR       : NURDHIAT CHAUDHARY MALIK
*/
/*
	2. >> 
	Nilai angka 1-100. Setiap inputan memiliki keistimewaan. 
	Tampilkan fizz dari setiap urutan untuk nilai kelipatan 4. 
	Tampilkan bizz dari setiap urutan untuk nilai kelipatan 8.
	Tampilkan fizzbizz dari setiap urutan untuk nilai kelipatan 13.
	Apabila ada nilai yang memiliki kelipatan yang sama (misal : 4 dan 8) 
	prioritaskan untuk kelipatan yang lebih besar

	Inputan : 20

	Nilai yang akan muncul ==========
	1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ, 14, 15, BIZZ, 17, 18, 19, FIZZ
*/
import java.util.Scanner;
public class Khairil02{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		int inputAngka;	

		System.out.print("Inputan (1 - 20) : ");
		inputAngka = key.nextInt();

		System.out.println("Nilai yang akan muncul ==============");
		if (inputAngka == 1) {
			System.out.println("1");
		}
		else if (inputAngka == 2) {
			System.out.println("1, 2");
		}
		else if (inputAngka == 3) {
			System.out.println("1, 2, 3");
		}
		else if (inputAngka == 4) {
			System.out.println("1, 2, 3, FIZZ");
		}
		else if (inputAngka == 5) {
			System.out.println("1, 2, 3, FIZZ, 5");
		}
		else if (inputAngka == 6) {
			System.out.println("1, 2, 3, FIZZ, 5, 6");
		}
		else if (inputAngka == 7) {
			System.out.println("1, 2, 3, FIZZ, 5, 6, 7");
		}
		else if (inputAngka == 8) {
			System.out.println("1, 2, 3, FIZZ, 5, 6, 7, BIZZ");
		}
		else if (inputAngka == 9) {
			System.out.println("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9");
		}
		else if (inputAngka == 10) {
			System.out.println("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10");
		}
		else if (inputAngka == 11) {
			System.out.println("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11");
		}
		else if (inputAngka == 12) {
			System.out.println("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ");
		}
		else if (inputAngka == 13) {
			System.out.println("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ");
		}
		else if (inputAngka == 14) {
			System.out.println("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ, 14");
		}
		else if (inputAngka == 15) {
			System.out.println("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ, 14, 15");
		}
		else if (inputAngka == 16) {
			System.out.println("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ, 14, 15, BIZZ");
		}
		else if (inputAngka == 17) {
			System.out.println("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ, 14, 15, BIZZ, 17");
		}
		else if (inputAngka == 18) {
			System.out.println("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ, 14, 15, BIZZ, 17, 18");
		}
		else if (inputAngka == 19) {
			System.out.println("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ, 14, 15, BIZZ, 17, 18, 19");
		}
		else if (inputAngka == 20) {
			System.out.println("1, 2, 3, FIZZ, 5, 6, 7, BIZZ, 9, 10, 11, FIZZ, FIZZBIZZ, 14, 15, BIZZ, 17, 18, 19, FIZZ");
		}

	}
}