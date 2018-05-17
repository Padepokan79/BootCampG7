/*
created by 	: Malik Chaudhary
time 		: 15-05-2018 2:37PM
update		: 15-05-2018 8:43PM

Soal :
siswa dinyatakan naik kelas jika tidak bernama andi dan nilai mtk tidak dibawah 72 dan nilai agama tidak dibawah 75, 
tapi bisa juga naik kelas jika spp nya lunas dan utang uang pembangunan tidak lebih dari 0

*/

import java.util.Scanner;
public class VikriIf2{
	public static void main(String[] args){
		Scanner siswa = new Scanner(System.in);
		String nama, spp;
		int nilaiMtk, nilaiAgama, minNilai, maxNilai;
		double hutang, nol;
		boolean lunas, proses;

		minNilai = 72;
		maxNilai = 75;
		nol 	 = 0;

		System.out.print("Masukan nama anda : ");
		nama = siswa.next();
		System.out.print("Nilai Matematika : ");
		nilaiMtk = siswa.nextInt();
		System.out.print("Nilai agama : ");
		nilaiAgama = siswa.nextInt();
		System.out.print("Sudah melunasi spp (sudah/belum) : ");
		spp = siswa.next();
		System.out.print("Hutang pmbangunan : Rp. ");
		hutang = siswa.nextDouble();

		lunas = spp.equals("sudah");
		proses = ( ( !( nama.equals("andi") && nilaiMtk >= minNilai && nilaiAgama >= maxNilai ) ) || ( lunas && hutang <= nol ) );
		if ( proses ) {
			System.out.print("Selamat anda naik kelas");
		}else{
			System.out.print("Maaf anda tidak naik kelas");
		}
	}
}