/*
created by : malik chaudhary
time : 10-05-2018 6:40AM
soal : 

Sakti sedang mencari partner bisnis untuk usahanya. Ia mencari seseorang yang mampu bekerja dengan cepat dan berpenampilan rapi. 
Partnernya juga harus lebih dari 30 tahun atau memiliki pengalaman 3 tahun.
*bekerja cepat lebih dari 8.0 skala 10.0
*penampilan minimal 9.0 dari skala 10.0

*/
import java.util.Scanner;
public class AlifharBoolean1{
	public static void main(String[] args){
 		double bekerja, penampilan, minBekerja, minPenampilan;
 		int usia, pengalaman, minUsia, minPengalaman;
 		boolean hasil;

 		minUsia = 30;
 		minPenampilan = 9.0;
 		minBekerja = 8.0;
 		minPengalaman = 3;


 		Scanner sakti = new Scanner(System.in);

 		System.out.print("Seberapa cepat anda bekerja ? (skala 0.0 - 10.0) : ");
 		bekerja = sakti.nextDouble();

 		System.out.print("Seberapa menarik diri anda ? (skala 0.0 - 10.0) : ");
 		penampilan = sakti.nextDouble();

 		System.out.print("Berapa usia anda ? : ");
 		usia = sakti.nextInt();

 		System.out.print("Berapa lama pengalaman anda bekrja ? : ");
 		pengalaman = sakti.nextInt();

 		hasil = ( ( bekerja > minBekerja && penampilan >= minPenampilan ) && ( usia > minUsia || pengalaman >= minPengalaman )  );

 		System.out.print("Apakah anda diterima ? : "+hasil);




	}
}