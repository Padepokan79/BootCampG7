//Created by :Hendra Kurniawan
//Date : 23 Mei 2018 Time : 1:32 AM
//Modified : 
import java.util.Scanner;

public class ChaudryIf3{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int jarak;

		System.out.println("===============================");
		System.out.println("Perjalanan Menuju Tempat Kerja");
		System.out.println("===============================");
		System.out.print("Masukan jarak rumah dengan perusahaan :");
		jarak = keyboard.nextInt();

		System.out.println("Perjalanan yang tersedia untuk anda :");
	
		if(jarak > 10)
		{
			System.out.println("-jalan kaki");
		}
		if(jarak > 35)
		{
			System.out.println("-naik sepeda");
		}
		if(jarak > 72)
		{
			System.out.println("-naik motor");
		}
		if(jarak > 100)
		{
			System.out.println("-naik mobil");
		}
		if(jarak > 150)
		{
			System.out.println("-naik Helicopter");
		}
	}
}