/*
Created by : Malik Chaudhary
time : 09-05-2018 11:11AM
soal :
    
    Ibu, sedang mencarikan pasangan untuk anak perempuannya.
	Pasangannya harus berumur mulai dari 17 tahun dan dibawah 30 tahun,
	harus kaya dan ganteng


*/

import java.util.Scanner;
public class TugasBoolean2{
	public static void main(String[] args){
		Scanner ibu = new Scanner(System.in);

		int agePasanganAnak;
		double tampanPasanganAnak, penghasilanPasanganAnak;
		boolean hasilAnak;

		System.out.print("Usia anda : ");
		agePasanganAnak = ibu.nextInt();

		System.out.print("Seberapa tampan anda ? skala 0.0 - 10.0 ");
		tampanPasanganAnak = ibu.nextDouble();

		System.out.print("Penghasilan anda : ");
		penghasilanPasanganAnak = ibu.nextDouble();

		hasilAnak = ( (agePasanganAnak >= 17 && agePasanganAnak < 30) && tampanPasanganAnak >= 8.0 && penghasilanPasanganAnak >= 5000000 );
			
		System.out.print("Apakah ibu merestui ? : " + hasilAnak);	

	}
}