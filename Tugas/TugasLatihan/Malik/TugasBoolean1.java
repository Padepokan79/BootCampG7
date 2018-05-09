/*
Created by : Malik Chaudhary
time : 09-05-2018 11:00AM
soal :
    
    Kakek, sedang mencarikan pasangan untuk cucu perempuannya.
	Pasangannya harus berumur minimal 30 tahun, ganteng atau tidak yang penting Kaya.



	Penampilan 8

*/
import java.util.Scanner;
public class TugasBoolean1{
	public static void main(String[] args){
		Scanner kake = new Scanner(System.in);

		int agePasanganCucu;
		double tampanPasanganCucu, penghasilanPasanganCucu;
		boolean hasilCucu;

		System.out.print("Usia anda : ");
		agePasanganCucu = kake.nextInt();

		System.out.print("Seberapa tampan anda ? skala 0.0 - 10.0 ");
		tampanPasanganCucu = kake.nextDouble();

		System.out.print("Penghasilan anda : Rp. ");
		penghasilanPasanganCucu = kake.nextDouble();

		hasilCucu = ( agePasanganCucu >= 30 && penghasilanPasanganCucu >= 5000000 && ( tampanPasanganCucu >= 8.0 || tampanPasanganCucu <= 8.0 ) );\

		System.out.print("Apakah kake merestui ? : " + hasilCucu);





	}
}