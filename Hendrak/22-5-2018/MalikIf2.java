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
		System.out.print(" ketikan nama bulan (januari - desember :" );
		namaBulan = keyboard.next();
		if(namaBulan.equals("januari"))
		{
			System.out.println("Jumlah hari   : " + jumHari1 + "hari");
			System.out.println("Jumlah minggu : " + jumHari1/7 + "minggu" +jumHari1%7 +" hari");
		}



	}
}