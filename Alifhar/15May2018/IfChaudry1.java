/*
	* Created by:	Alifhar Juliansyah
	* 				15-05-2018	10.52
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfChaudry1{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String nama, keterangan;
		double math, ind, ing, rata;

		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.print("Nama          : ");
		nama=scan.nextLine();
		System.out.print("Math          : ");
		math=scan.nextDouble();
		System.out.print("Indonesia     : ");
		ind=scan.nextDouble();
		System.out.print("Inggris       : ");
		ing=scan.nextDouble();

		rata=(math+ind+ing)/3;
		if(rata>=0 && rata<75)
			keterangan="Harus mengikuti remedial";
		else if(rata==75)
			keterangan="Boleh mengikuti remedial";
		else if(rata>75 && rata<85)
			keterangan="cukup";
		else if(rata>=85 && rata<=90)
			keterangan="baik";
		else if(rata>90 && rata<=100)
			keterangan="sangat baik";
		else
			keterangan="error";

		System.out.println("\nRata-rata nilai      : "+rata);
		System.out.println("Keterangan nilai     : "+keterangan);
		System.out.println("+++++++++++++++++++++++++++++++");
	}
}