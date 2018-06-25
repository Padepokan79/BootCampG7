// Created by vikri 
// 13/05/2018
// 08:09
import java.util.Scanner;
public class SoalBooleanYana3{
	public static void main(String[] args) {
		boolean kriteria;
		double ipk;
		int semester, ratarata, algoritma, database, pemrograman; 
		String jKelamin, pendidikan, status, beasiswa;

		Scanner input = new Scanner(System.in);
		Scanner string = new Scanner(System.in);

		System.out.print("Jenis Kelamin : ");
		jKelamin = string.next();

		System.out.print("Semester : ");
		semester = input.nextInt();

		System.out.print("IPK : ");
		ipk = input.nextDouble();

		System.out.print("Jenis Beasiswa (PPA/PPB) : ");
		beasiswa = input.next();

		System.out.print("algoritma : ");
		algoritma = input.nextInt();

		System.out.print("database : ");
		database= string.nextInt();

		System.out.print("pemrograman : ");
		pemrograman = string.nextInt();

		System.out.print("Status mampu (ya/tidak) : ");
		status = input.next();

		ratarata = (database+pemrograman)/2;
		kriteria = jKelamin.equals("pria") || jKelamin.equals("wanita") && semester >= 3 && semester <= 5  && ratarata >= 8 && ratarata <= 10;
		kriteria = kriteria && (ipk >= 2.75 && ipk <=4.00 && status.equals("tidak") && beasiswa.equals("ppa")) || (ipk >= 3.00 && ipk <= 4 && beasiswa.equals("ppb"));
		
		System.out.println("\n--------------------------"+
						   "\nMasuk kriteria? " +kriteria+
						   "\n--------------------------");
	}
}
