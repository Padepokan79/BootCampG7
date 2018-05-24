//Created by :Hendra Kurniawan
//Date : 23 Mei 2018 Time : 1:15 AM
//Modified : 
import java.util.Scanner;

public class ChaudryIf1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String nama,ket;
		double math, ind, ingg,rata2;

		System.out.println("+++++++++++++++++++++++");
		System.out.print("Nama  :");
		nama = keyboard.nextLine();
		System.out.print("Nilai math  (0-100):");
		math = keyboard.nextDouble();
		System.out.print("Nilai Indonesia  (0-100):");
		ind = keyboard.nextDouble();
		System.out.print("Nilai Inggris  (0-100):");
		ingg = keyboard.nextDouble();

		rata2 = (math+ingg+ind)/3;

		if(rata2 > 90 && rata2 <=100)
		{
			ket ="Sangat Baik";
		}
		if(rata2 > 84 && rata2 <= 90)
		{
			ket="Baik";
		}
		if (rata2 > 75 && math < 85) {
			ket="cukup";
		}
		if(rata2 == 75)
		{
			ket = "Nilai anda Standar, anda bisa mengikuti ujian remedial";
		}
		else
		{
			ket="Nilai anda kurang dan harus mengikuti ujian remedial";
		}


		System.out.println("Rata - rata nilai : "+ rata2);
		System.out.println("Keterangan nilai  : "+ ket);
	}
}