/*
created by : malik chaudhary
time : 10-05-2018 7:14AM 
soal :

Akan diadakan rave party di rumah nesa, dan nesa ingin mengundang semua
temannya akan tetapi karena tempat yang terbatas nesa harus mensortir
itu semua yang dimana yang dapat memasuki pesta tersebut merupakan
teman sekolah nesa, pria / wanita tidak masalah, harus membawa hadiah
dengan minimum harga 5000000, pria diwajibkan tampan dan wanita sangat
diharuskan cantik dengan skala 8.5, cantik atau ganteng tidak masalah
jika orang tersebut membawa hadiah lebih dari 20000000. diluar hal itu 
dilarang masuk.

*/
import java.util.Scanner;
public class AndrianBoolean1{
	public static void main(String[] args){

		String teman, kelamin;
		double penampilanCowo, penampilanCewe, penampilan, minPenampilan;
		int minHadiah, maxHadiah, hadiahMin, hadiahMax;
		boolean hasil, cowo, cewe, ya, tidak;

		hadiahMin = 5000000;
		hadiahMax = 20000000;
		minPenampilan = 8.5;

		Scanner party = new Scanner(System.in);

		System.out.print("Apakah anda teman sekolah nesa ? (ya/bukan): ");
 		teman = party.next();

 		System.out.print("Jenis kelamin (pria/wanita) : ");
 		kelamin = party.next();

 		System.out.print("Berapa harga hadiah anda ? : Rp.  ");
 		minHadiah = party.nextInt();

 		System.out.print("Seberapa menarik diri anda ? (skala 0.0-10.0) : ");
 		penampilan = party.nextDouble();

 		ya = teman.equals("ya");
 		tidak = teman.equals("tidak");


 		hasil = ( ya && ( minHadiah >= hadiahMin && penampilan >= minPenampilan ) || ( ( penampilan >= minPenampilan || penampilan <= minPenampilan ) && minHadiah > hadiahMax ) );

 		System.out.print("Apakah anda boleh masuk ? : "+hasil);


	}
}