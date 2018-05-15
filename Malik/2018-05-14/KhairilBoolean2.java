/*
created by : Malik chaudhary
time : 10-05-2018 9:20AM 
soal :

di bandara husein penumpang yang diperbolehkan masuk ke bisnis lounge adalah pemegang tiket pesawat kelas bisnis yang memiliki 
subkelas D atau F baik untuk laki-laki terbang 20x dan perempuan terbang 15x. (subkelas T dengan syarat laki/perempuan terbang 30x)


*/

import java.util.Scanner;
public class KhairilBoolean2{
	public static void main(String[] args){
		String tiket, subkelas, kelamin;
		int terbang, terbangCewe, terbangCowo, terbangSubt;
		boolean hasil, cewe, cowo, hasilCewe, hasilCowo, kelasD, kelasF, kelasT, pilihTiket;

		terbangCowo = 20;
		terbangCewe = 15; 
		terbangSubt = 30;

		Scanner pesawat = new Scanner(System.in);	

		System.out.print("Jenis kelamin (pria/wanita) : ");
 		kelamin = pesawat.next();

		System.out.print("Jenis tiket anda (bisnis/ekonomi): ");
 		tiket = pesawat.next(); 

		System.out.print("subkelas anda (A-Z): ");
 		subkelas = pesawat.next(); 

 		System.out.print("banyak terbang ? : ");
 		terbang = pesawat.nextInt();

 		cewe = kelamin.equals("wanita");
		cowo = kelamin.equals("pria");

		pilihTiket = tiket.equals("bisnis");

		kelasD = subkelas.equals("D");
		kelasF = subkelas.equals("F");
		kelasT = subkelas.equals("T");

 		hasilCewe = ( ( cewe ) && pilihTiket &&  ( kelasD || kelasF ) && terbang == terbangCewe || ( kelasT && terbang == terbangSubt ));
 		hasilCowo = ( ( cowo ) && pilihTiket &&  ( kelasD || kelasF ) && terbang == terbangCowo || ( kelasT && terbang == terbangSubt ));

 		hasil = ( hasilCowo || hasilCewe );

 		System.out.print("Apakah anda boleh masuk ? : "+hasil); 


	}
}