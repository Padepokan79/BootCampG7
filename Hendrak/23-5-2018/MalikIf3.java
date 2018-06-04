//Created by :Hendra Kurniawan
//Date : 22 Mei 2018 Time : 9:16 AM
//Modified : 
import java.util.Scanner;

public class MalikIf3{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double jujur, bohong, sombong, angkuh,skala;
		String ket="";


		System.out.println("==========================");
		System.out.println("DETECTED UR ATTITUDE ");
		System.out.println("==========================");
		System.out.print("Skala jujur anda    :");
		jujur = keyboard.nextDouble();
		System.out.print("Skala bohong anda   :");
		bohong = keyboard.nextDouble();
		System.out.print("Skala sombong anda  :");
		sombong = keyboard.nextDouble();
		System.out.print("Skala angkuh anda   :");
		angkuh = keyboard.nextDouble();

		skala = bohong + sombong +  angkuh; 
		
		if(jujur>=8&&jujur<=10 && bohong < 5 && bohong>=1 && sombong >=1 && sombong < 6 && angkuh >=1 && angkuh < 7)
		{
			ket = "Selamat anda baik";
		}
		if(jujur>9 && jujur <=10 && sombong < 2 && sombong >=1)
		{
			ket = "Selamat anda sangat baik";
		}
		if(jujur<5 && jujur >=1 && bohong > 5 && bohong <=10 && sombong >5 && sombong <=10)
		{
			ket = "Anda Kurang baik";
		}

		if(skala +jujur >35 )
		{
			ket = "Anda buruk"; 
		}
		
		if(skala + jujur < 14)
		{
			ket = "Selamat Anda sangat baik";
		}













		System.out.println("==========================");
		System.out.println(ket);

	}
}