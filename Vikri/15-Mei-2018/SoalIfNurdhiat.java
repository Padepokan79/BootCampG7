/*
	Created By Vikri
	15/05/2018
	12:51
*/
import java.util.Scanner;
public class SoalIfNurdhiat{
	public static void main(String[] args) {
		int nilai, math, indo, ing;
		String nama;
		Scanner string = new Scanner(System.in);

		System.out.println("++++++++++++++++++++++++++");
		System.out.print("Nama: ");
		nama = string.next();

		System.out.print("Nilai Math: ");
		math = string.nextInt();

		System.out.print("Nilai Indonesia: ");
		indo = string.nextInt();

		System.out.print("Nilai Inggris: ");
		ing = string.nextInt();

		System.out.println("");
		nilai = ing+math+indo;
		nilai = nilai/3;

		System.out.println("Rata-rata Nilai: "+nilai);
		
		if (nilai==75) {
			System.out.println("Keterangan Nilai : Standart");
		} else if (nilai<85&&nilai>75) {
			System.out.println("Keterangan Nilai : Pas Standart");		
		} else if (nilai>=85&&nilai<=90) {
			System.out.println("Keterangan Nilai : Baik");
		} else if (nilai>90&&nilai<101) {
			System.out.println("Keterangan Nilai : Sangat Baik");
		} else {
			System.out.println("Nilai Kurang Mari remedial");
		}
		System.out.println("++++++++++++++++++++++++++");
	}
}