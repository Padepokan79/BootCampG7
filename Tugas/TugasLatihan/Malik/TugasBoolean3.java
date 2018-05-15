/*
Created by : Malik Chaudhary
time : 09-05-2018 11:17AM
soal :
    
    Ayah, sedang mencarikan pasangan untuk anak perempuannya.
	Perbedaan umur pasangannya maksimal 5 tahun, 
	harus kaya atau ganteng.
*/
import java.util.Scanner;
public class TugasBoolean3{
	public static void main(String[] args){
		int agePasanganAyah, agaAnak, selisihAge;
		double tampanPasanganAyah, penghasilanPasanganAyah;
		boolean hasilAyah;

		Scanner ayah = new Scanner(System.in);

		System.out.print("Usia anak : ");
		agaAnak = ayah.nextInt();

		System.out.print("Usia pasangan : ");
		agePasanganAyah = ayah.nextInt();

		System.out.print("Seberapa tampan anda ? skala 0.0 - 10.0 ");
		tampanPasanganAyah = ayah.nextDouble();

		System.out.print("Penghasilan anda : ");
		penghasilanPasanganAyah = ayah.nextDouble();

		selisihAge = agePasanganAyah - agaAnak;

		hasilAyah = ( selisihAge == 5 || selisihAge == -5 && ( tampanPasanganAyah >= 8.0 || penghasilanPasanganAyah >= 5000000 ) );
		
		System.out.print("Apakah ayah merestui ? : " + hasilAyah);			



	}
}