/*
	* Created by:	Alifhar Juliansyah
	* 				15-05-2018	11.11
	* Updated by:
	*
*/

import java.util.Scanner;

public class IfChaudry3{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int jalan, sepeda, motor, mobil, helikopter, jarak;

		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("PERJALANANKU MENJUJU TEMPAT KERJA");
		System.out.println("++++++++++++++++++++++++++++++++++\n");
		System.out.print("Masukkan jarak rumah dengan perusahaan : ");
		jarak=scan.nextInt();

		if(jarak>=0)
			System.out.println("Jalan Kaki");
		if(jarak>=35)
			System.out.println("Naik Sepeda");
		if(jarak>=72)
			System.out.println("Naik Motor");
		if(jarak>=100)
			System.out.println("Naik Mobil");
		if(jarak>=150)
			System.out.println("Naik Helikopter");
	}
}