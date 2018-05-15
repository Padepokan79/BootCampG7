/*
	Created By Vikri
	15/05/2018
	10:22
*/
import java.util.Scanner;

public class SoalIfAndrian2{
	public static void main(String[] args) {
		double gaji ,gajiPokok, tunjangan, pajak, pajak2;
		int nik;
		String golongan, nama;
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Nama? ");
		nama=input.next();

		System.out.print("Masukan NIK? ");
		nik=input.nextInt();

		System.out.println("==================================");
		System.out.println(	"List Golongan: \n"+
							"1. Golongan 2A\n"+
							"2. Golongan 2B\n"+
							"3. Golongan 3A\n"+
							"4. Golongan 3B\n"+
							"5. Golongan 4A\n"+
							"6. Golongan 4B\n");
		System.out.print("Masukan Golongan? ");
		golongan=input.next();
		
		System.out.println("==================================");
		
		
		if (golongan.equals("2A")) {
			gajiPokok = 1000000;
			tunjangan = 100000;
			
			pajak = gajiPokok+tunjangan;
			pajak2 = 2.0/100*pajak;

			gaji = gajiPokok+tunjangan;
			gaji = gaji - pajak2;

			System.out.println("Gaji Pokok    : "+(int)gajiPokok);
			System.out.println("Tunjangan     : "+(int)tunjangan);
			System.out.println("Pajak         : "+(int)pajak2);
			System.out.println("Gaji Diterima : "+(int)gaji);
		} else if (golongan.equals("2B")) {
			gajiPokok = 1500000;
			tunjangan = 200000;
			
			pajak = gajiPokok+tunjangan;
			pajak2 = 2.0/100*pajak;

			gaji = gajiPokok+tunjangan;
			gaji = gaji - pajak2;

			System.out.println("Gaji Pokok    : "+(int)gajiPokok);
			System.out.println("Tunjangan     : "+(int)tunjangan);
			System.out.println("Pajak         : "+(int)pajak2);
			System.out.println("Gaji Diterima : "+(int)gaji);
		} else if (golongan.equals("3A")) {
			gajiPokok = 2000000;
			tunjangan = 300000;
			
			pajak = gajiPokok+tunjangan;
			pajak2 = 2.0/100*pajak;

			gaji = gajiPokok+tunjangan;
			gaji = gaji - pajak2;

			System.out.println("Gaji Pokok    : "+gajiPokok);
			System.out.println("Tunjangan     : "+tunjangan);
			System.out.println("Pajak         : "+pajak2);
			System.out.println("Gaji Diterima : "+gaji);
		} else if (golongan.equals("3B")) {
			gajiPokok = 2500000;
			tunjangan = 400000;
			
			pajak = gajiPokok+tunjangan;
			pajak2 = 2.0/100*pajak;

			gaji = gajiPokok+tunjangan;
			gaji = gaji - pajak2;

			System.out.println("Gaji Pokok    : "+gajiPokok);
			System.out.println("Tunjangan     : "+tunjangan);
			System.out.println("Pajak         : "+pajak2);
			System.out.println("Gaji Diterima : "+gaji);
		} else if (golongan.equals("4A")) {
			gajiPokok = 3000000;
			tunjangan = 500000;
			
			pajak = gajiPokok+tunjangan;
			pajak2 = 2.0/100*pajak;

			gaji = gajiPokok+tunjangan;
			gaji = gaji - pajak2;

			System.out.println("Gaji Pokok    : "+(int)gajiPokok);
			System.out.println("Tunjangan     : "+(int)tunjangan);
			System.out.println("Pajak         : "+(int)pajak2);
			System.out.println("Gaji Diterima : "+(int)gaji);
		} else if (golongan.equals("4B")) {
			gajiPokok = 3500000;
			tunjangan = 600000;
			
			pajak = gajiPokok+tunjangan;
			pajak2 = 2.0/100*pajak;

			gaji = gajiPokok+tunjangan;
			gaji = gaji - pajak2;

			System.out.println("Gaji Pokok    : "+(int)gajiPokok);
			System.out.println("Tunjangan     : "+(int)tunjangan);
			System.out.println("Pajak         : "+(int)pajak2);
			System.out.println("Gaji Diterima : "+(int)gaji);
		} else {
			System.out.println("Golongan Tidak Diketahui");
		}
	}
}