/*
created by : Malik chaudhary
time : 10-05-2018 9:00AM 
soal :

Toko Elekronik
Toko buka di hari senin s/d kamis, dan sabtu.
Selain itu toko tutup.

*/
import java.util.Scanner;
public class AriefBoolean2{
	public static void main(String[] args){
		String hari, senin, selasa, rabu, kamis, sabtu;
		boolean hasil;

		Scanner toko = new Scanner(System.in);


		System.out.print("masukan hari : ");
 		hari = toko.next();

 		senin = "senin";
 		selasa = "selasa";
 		rabu = "rabu";
 		kamis = "kamis";
 		sabtu = "sabtu";

 		hasil = ( hari.equals(senin) || hari.equals(selasa) || hari.equals(rabu) || hari.equals(kamis) || hari.equals(sabtu) );

 		System.out.print("Apakah toko buka ? : "+hasil); 
	}
}
