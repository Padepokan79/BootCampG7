/*
	DATE CREATED 	: 15 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Chaudhry01{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		int kkm, nilaiCukup, nilaiBaik2, nilaiSangat, nilaiMath, nilaiIndo, nilaiInggris, rata;
		String nama, keterangan;
		kkm = 75;
		nilaiCukup = 84;
		nilaiBaik2 = 90;
		nilaiSangat = 100;

		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.print("Nama\t\t: ");
		nama = key.next();

		System.out.print("Math\t\t: ");
		nilaiMath = key.nextInt();

		System.out.print("Indonesia\t: ");
		nilaiIndo = key.nextInt();

		System.out.print("Inggris\t\t: ");
		nilaiInggris = key.nextInt();
		System.out.println("");

		rata = (nilaiIndo + nilaiInggris + nilaiMath)/3;
		System.out.println("Rata\t\t: " +rata);

		if (rata == kkm) {
			System.out.println("Keterangan\t: Cukup");
			System.out.println("Ada baiknya Anda mengikuti Ujian Remedial untuk memperbaiki nilai :)");
		}
		else if (rata > kkm && rata <= nilaiCukup) {	
			System.out.println("Keterangan\t: Cukup");
		}
		else if(rata > nilaiCukup && rata <= nilaiBaik2){
			System.out.println("Keterangan\t: Baik");
		}
		else if (rata > 90) {
			System.out.println("Keterangan\t: Sangat Baik");
		}
		else{
			System.out.println("Keterangan\t: Kurang");
			System.out.println("Anda harus mengikuti Ujian Remedial");
		}


		System.out.println("+++++++++++++++++++++++++++++++++++++");

	}
}			