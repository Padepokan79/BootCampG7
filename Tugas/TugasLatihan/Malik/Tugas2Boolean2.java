/*
Created by : Malik Chaudhary
time : 09-05-2018 11:43AM
soal :
    Hari Jumat, Melodies Memori

	-Cewek atau Cowok yang berusia lebih dari 40 tahun.
	-Selain Itu tidak boleh masuk

*/
import java.util.Scanner;
public class Tugas2Boolean2{
	public static void main(String[] args){
		Scanner cewo = new Scanner(System.in);
		int age;
		boolean hasil, cewe, cowo;
		String kelamin;

		System.out.print("jenis Kelamin anda ? (perempuan / laki-laki)");
		kelamin = cewo.nextLine();

		cewe = kelamin.equals("perempuan");
		cowo = kelamin.equals("laki-laki");

		System.out.print("Usia anda : " );
		age = cewo.nextInt();

		hasil = ( (cewe || cowo ) && age > 40 );
		System.out.print("apakah boleh masuk ? "+ hasil);
	}
}