//Created by :Hendra Kurniawan
//Date : 22 Mei 2018 Time : 9:56 AM
//Modified : 
import java.util.Scanner;

public class MalikIf2{
	public static void main(String[] args) {
		String namaBulan;
		int jumHari1=31,jumHari2=30;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("======================");
		System.out.println(" Super Month");
		System.out.println("======================");
		System.out.print(" ketikan nama bulan (januari - desember ): " );
		namaBulan = keyboard.next();
		if(namaBulan.equals("januari")||namaBulan.equals("maret")||namaBulan.equals("mei")||namaBulan.equals("juli")||namaBulan.equals("september")||namaBulan.equals("november"))
		{
			System.out.println("Jumlah hari   : " + jumHari1 + " hari");
			System.out.println("Jumlah minggu : " + jumHari1/7 + " minggu " +jumHari1%7 +" hari");
		}
		else if(namaBulan.equals("februari")||namaBulan.equals("april")||namaBulan.equals("juni")||namaBulan.equals("agustus")||namaBulan.equals("oktober")||namaBulan.equals("desember"))
		{	
			if(namaBulan.equals("februari"))
			{
			System.out.println("Jumlah hari   : " + (jumHari2 -2) + " hari");
			System.out.println("Jumlah minggu : " + (jumHari2 - 2)/7 + " minggu " +(jumHari2-2)%7 +" hari");
				
			}
			else
			{
			System.out.println("Jumlah hari   : " + jumHari2 + " hari");
			System.out.println("Jumlah minggu : " + jumHari2/7 + " minggu " +jumHari2%7 +" hari");
			}
		}


	}
}