/*
created by : Malik Chaudhary
time : 15-05-2018 10:18AM
Soal :

	Anda diharuskan membuat apliaksi yang dapat membantu para karyawan BUMN 
	mengetahui berapa besar gaji yang mereka dapatkan, dimana dalam program
	tersebut memmperlihatkan gaji pokok, tunjangan keluarga, pajak, gaji 
	total. Gaji yang mereka dapatkan ditentukan dari seberapa tinggi
	jabatan mereka dimana :
	Golongan 2A	Gaji pokok = 1jt
			tunjangan = 100rb
	Golongan 2B	Gaji pokok = 1.5jt
			tunjangan = 200rb
	Golongan 3A	Gaji pokok = 2jt
			tunjangan = 300rb
	Golongan 3B	Gaji pokok = 2.5jt
			tunjangan = 400rb
	Golongan 4A	Gaji pokok = 3jt
			tunjangan = 500rb
	Golongan 4B	Gaji pokok = 3.5jt
			tunjangan = 600rb

	* pajak = 2% dari gajipokok dan tunjangan
	* total gaji = gajipokok dan tunjangan dikurangi pajak

output:
==============================================
Masukan nama	:
Masukan NIK	:
==============================================
List golongan :
1. Golongan 2A
2. golongan 2B
3. golongan 3A
4. golongan 3B
5. golongan 4A
6. golongan 4B
Masukan golongan anda :
==============================================
Gaji pokok		:
Tunjangan		:
Pajak			:
Gaji yang diterima	:


*/
import java.util.Scanner;
public class AndrianIf2{
	public static void main(String[] args){
		Scanner gaji = new Scanner(System.in);
		Scanner golongan = new Scanner(System.in);


		double gajiDuaA, gajiDuaB, gajiTigaA, gajiTigaB, gajiEmpatA, gajiEmpatB,tunjanganDuaA, tunjanganDuaB, tunjanganTigaA, tunjanganTigaB, tunjanganEmpatA, tunjanganEmpatB;

		gajiDuaA = 1000000; 
		tunjanganDuaA = 100000;

		gajiDuaB = 1500000;
		tunjanganDuaB = 200000;

		gajiTigaA = 2000000;
		tunjanganTigaA = 300000;

		gajiTigaB = 2500000;
		tunjanganTigaB = 400000;

		gajiEmpatA = 3000000;
		tunjanganEmpatA = 500000;

		gajiEmpatB = 3500000;
		tunjanganEmpatB = 600000;

		
		String nama, nik, list, golDuaA, golDuaB, golTigaA, golTigaB, golEmpatA, golEmpatB;

		golDuaA = "golongan 2A";
		golDuaB = "golongan 2B";
		golTigaA = "golongan 3A";
		golTigaB = "golongan 3B";
		golEmpatA = "golongan 4A";
		golEmpatB = "golongan 4B";


		System.out.println("================================");
		System.out.print("Masukan Nama\t: ");
		nama = gaji.next();
		System.out.print("Masukan NIK\t: ");
		nik = gaji.next();
		System.out.println("================================");
		System.out.println("List golongan : ");
		System.out.println("1. golongan 2A ");
		System.out.println("2. golongan 2B ");
		System.out.println("3. golongan 3A ");
		System.out.println("4. golongan 3B ");
		System.out.println("5. golongan 4A ");
		System.out.println("6. golongan 4B ");

		System.out.print("Masukan golongan anda : ");
		list = golongan.nextLine();
		System.out.println("=================================");

		/*
			
	* pajak = 2% dari gajipokok dan tunjangan
	* total gaji = gajipokok dan tunjangan dikurangi pajak
		*/
		if ( list.equals(golDuaA) ) {
			double pajak = 2.0/100*( gajiDuaA+tunjanganDuaA );
			double total = (gajiDuaA+tunjanganDuaA)-pajak;

			System.out.println("Gaji Pokok : "+gajiDuaA);
			System.out.println("Tunjangan : "+tunjanganDuaA);
			System.out.println("Pajak : "+pajak);
			System.out.println("Gaji yang diterima : "+total);
		}else if (list.equals(golDuaB)) {
			double pajak = 2.0/100*( gajiDuaB+tunjanganDuaB );
			double total = (gajiDuaB+tunjanganDuaB)-pajak;

			System.out.println("Gaji Pokok : "+gajiDuaB);
			System.out.println("Tunjangan : "+tunjanganDuaB);
			System.out.println("Pajak : "+pajak);
			System.out.println("Gaji yang diterima : "+total);
		}else if (list.equals(golTigaA)) {
			double pajak = 2.0/100*( gajiTigaA+tunjanganTigaA );
			double total = (gajiTigaA+tunjanganTigaA)-pajak;

			System.out.println("Gaji Pokok : "+gajiTigaA);
			System.out.println("Tunjangan : "+tunjanganTigaA);
			System.out.println("Pajak : "+pajak);
			System.out.println("Gaji yang diterima : "+total);
		}else if (list.equals(golTigaB)) {
			double pajak = 2.0/100*( gajiTigaB+tunjanganTigaB );
			double total = (gajiTigaB+tunjanganTigaB)-pajak;

			System.out.println("Gaji Pokok : "+gajiTigaB);
			System.out.println("Tunjangan : "+tunjanganTigaB);
			System.out.println("Pajak : "+pajak);
			System.out.println("Gaji yang diterima : "+total);
		}else if (list.equals(golEmpatA)) {
			double pajak = 2.0/100*( gajiEmpatA+tunjanganEmpatA );
			double total = (gajiEmpatA+tunjanganEmpatA)-pajak;

			System.out.println("Gaji Pokok : "+gajiEmpatA);
			System.out.println("Tunjangan : "+tunjanganEmpatA);
			System.out.println("Pajak : "+pajak);
			System.out.println("Gaji yang diterima : "+total);
		}else if (list.equals(golEmpatB)) {
			double pajak = 2.0/100*( gajiEmpatB+tunjanganEmpatB );
			double total = (gajiEmpatB+tunjanganEmpatB)-pajak;

			System.out.println("Gaji Pokok : "+gajiEmpatB);
			System.out.println("Tunjangan : "+tunjanganEmpatB);
			System.out.println("Pajak : "+pajak);
			System.out.println("Gaji yang diterima : "+total);
		}
	
	}
}