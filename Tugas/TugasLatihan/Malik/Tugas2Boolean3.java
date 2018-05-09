/*
Created by : Malik Chaudhary
time : 09-05-2018 11:45AM
soal :
    Hari Sabtu, Jomblo Night 

	-Cewek atau Cowok yang berusia 21 tahun sampai 30 tahun
	 Penampilan Menarik
	 Selain itu Tidak boleh masuk


*/
import java.util.Scanner;
public class Tugas2Boolean3{
	public static void main(String[] args){
		Scanner cewo = new Scanner(System.in);
		int age;
		double penampilan;
		boolean hasil, cewe, cowo;
		String kelamin;

		System.out.print("Jenis kelamin anda ? (perempuan / laki-laki)");
		kelamin = cewo.next();

		System.out.print("Usia anda : " );
		age = cewo.nextInt();

		System.out.print("Seberapa menarik anda ? skala 0.0 - 10.0 " );
		penampilan = cewo.nextDouble();

		cewe = kelamin.equals("perempuan");
		cowo = kelamin.equals("laki-laki");

		hasil = ( (cewe || cowo) && age >= 21 && age <= 30 && penampilan >= 8.0 );
		System.out.print("apakah boleh masuk ? "+ hasil);
	}
}