/*
 * File           : ChaudarySoalIf1.java
 * Project Name   : Chaudary
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\17-Mei-2018\Soal-If\Chaudary
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 10:42:43 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 10:43:43 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */



import java.util.Scanner;

public class ChaudarySoalIf1{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String name, class="0" ;
		int salaryA, salaryB, salaryC, salaryD, primeSalary=0, bonus=0, empSalary=0, yearIn, workTime;


		System.out.println("\n========================================");
		System.out.println("LAPORAN PENGGAJIAN KARYAWAN BULANAN");
		System.out.println("========================================");
		System.out.print("\nNama\t\t: ");
		name = key.next();
		System.out.print("Tahun Masuk\t: ");
		salaryA = 1500000;
		salaryB = 1700000;
		salaryC = 2500000;
		salaryD = 5000000;
		yearIn = key.nextInt();
		workTime = 2018 - yearIn;
		System.out.println("Masa Kerja\t: "+workTime+" tahun");

		if (workTime <= 1) {
			class = "A";
			primeSalary = salaryA;
			bonus = 0;
			empSalary = primeSalary+bonus;
		}
		else if (workTime < 5) {
			class = "B";
			primeSalary = salaryB;
			bonus = 0;
			empSalary = primeSalary+bonus;
		}
		else if (workTime <= 7) {
			class = "C";
			primeSalary = salaryC;
			bonus = (workTime-4)*500000;
			empSalary = primeSalary+bonus;
		}
		else if (workTime > 7) {
			class = "D";
			primeSalary = salaryD;
			bonus = (workTime-4)*500000;
			empSalary = primeSalary+bonus;
		}

		System.out.println("Golongan\t: "+class);
		System.out.println("Gaji Pokok\t: Rp."+primeSalary);
		System.out.println("Bonus\t\t: Rp."+bonus);
		System.out.println("Gaji Karyawan\t: Rp."+empSalary);
		System.out.println("========================================");
	}
}