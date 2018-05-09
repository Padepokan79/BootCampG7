/*
Created by : Malik Chaudhary
time : 09-05-2018 11:48AM
soal :
    Hari Selasa, Brondong Night 

	-Cewek Cakep usia 30 sampai 45 tahun
	-Cowok gk Ganteng usia 20 sampai 25 tahun


*/
import java.util.Scanner;
public class Tugas2Boolean4{
	public static void main(String[] args){
		Scanner cewo = new Scanner(System.in);
		int age, minAgeCowo, maxAgeCowo, minAgeCewe, maxAgeCewe;
		double penampilanCewo, penampilan;
		boolean hasilCewe, hasilCowo, hasilAkhir, cewe, cowo;
		String kelamin;

		minAgeCowo = 20;
		maxAgeCowo = 25;
		minAgeCewe = 30;
		maxAgeCewe = 45;
		penampilan = 8.0;

		System.out.printf("Jenis kelamin anda ? (perempuan / laki-laki ) ");
		kelamin = cewo.next();

		cewe = kelamin.equals("perempuan");
		cowo = kelamin.equals("laki-laki");

		System.out.print("Usia anda : " );
		age = cewo.nextInt();

		System.out.print("Seberapa menarik anda ? skala 0.0 - 10.0 " );
		penampilanCewo = cewo.nextDouble();

		hasilCewe = ( cewe && ( age >= minAgeCewe && age <= maxAgeCewe ) && penampilanCewo >= penampilan );
		hasilCowo = ( cowo && ( age >= minAgeCowo && age <= maxAgeCowo ) && penampilanCewo < penampilan );

		hasilAkhir = ( hasilCowo || hasilCewe );

		System.out.print("apakah boleh masuk ? "+ hasilAkhir);
	
	}
}