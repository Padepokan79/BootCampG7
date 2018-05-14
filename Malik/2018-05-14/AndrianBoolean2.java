/*
created by : malik chaudhary
time : 10-05-2018 7:34AM 
soal :

disebuah tempat bernama triangle diadakan penampilan dj ternama yang
dimana tidak semua kalangan bisa memasukinya, dan hal membatasinya
adalah, pria atau wanita dengan umur minimal 25 tahun, memiliki KTP, 
memiliki penghasilan lebih dari 3000000, dan mempunyai tinggi badan 
diatas 160 cm untuk pria dan untuk wanita 153 . diluar kriteria 
tersebut pengunjung tidak diperbolehkan	untuk masuk


*/
import java.util.Scanner;
public class AndrianBoolean2{
	public static void main(String[] args){
		int usia, minUsia, penghasilan, minPenghasilan, tinggi, tinggiPria, tinggiWanita;
		String ktp, kelamin;
		boolean hasilCewe, hasilCowo, hasil, ya, tidak, cewe, cowo;

		minUsia = 25;
		minPenghasilan = 3000000;

		tinggiWanita = 153;
		tinggiPria = 160;

		Scanner triangle = new Scanner(System.in);

		System.out.print("Jenis kelamin (pria/wanita): ");
 		kelamin = triangle.next();

 		System.out.print("usia anda : ");
 		usia = triangle.nextInt();

 		System.out.print("Apakah anda meiliki KTP ? (ya/tidak): ");
 		ktp = triangle.next();

 		System.out.print("Berapa penghasilan anda :Rp.  ");
 		penghasilan = triangle.nextInt();

 		System.out.print("Berapa tinggi anda : ");
 		tinggi = triangle.nextInt();

 		ya = ktp.equals("ya");
 		tidak = ktp.equals("tidak");

 		cewe = kelamin.equals("wanita");
		cowo = kelamin.equals("pria");

 		hasilCewe = ( cewe && ( usia >= minUsia && ya && penghasilan > minPenghasilan && tinggi > tinggiWanita ) );
 		hasilCowo = ( cowo && ( usia >= minUsia && ya && penghasilan > minPenghasilan && tinggi > tinggiPria ) );

 		hasil = (hasilCewe || hasilCowo);

 		System.out.print("Apakah anda boleh masuk ? : "+hasil);

	}
}