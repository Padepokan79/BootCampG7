//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 10:51 AM
//Modified by :
import java.util.Scanner;

public class IkanTravel{
	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);
		int penumpang,sisaPenumpang,jumlah60,jumlah45,jumlah32,jumlah18,jumlah12,jumlah6=0;
		double bis60,bis45,bis32,bis18,bis12,bis6,harga;
		String ketBis6;

		harga = 0;
		bis6=0;
		System.out.println("============================");
		System.out.println("Selamt datang di ikan Travel");
		System.out.println("============================");
		System.out.print("Masukan jumlah penumpang (max 120):");
		penumpang = keybord.nextInt();
		
		sisaPenumpang = penumpang;
		
		if(penumpang <= 6)
		{	
			System.out.println("Bis yang tersedia untuk anda :\n");
			System.out.println("Bis Dengan Kursi 6 Executive    Rp.2.000.000");
			System.out.println("\n*Rekomendasi Bis Untuk Anda: ");
			System.out.println("1 Bis Dengan 6 Kursi dengan Harga Rp.2.000.000 ");	
		}
		if(penumpang > 6 && penumpang <=11)
		{
			System.out.println("Bis yang tersedia untuk anda :\n");
			System.out.println("Bis Dengan Kursi 6 Executive    Rp.2.000.000");
			System.out.println("\n*Rekomendasi Bis Untuk Anda: ");
			System.out.println("2 Bis Dengan 6 Kursi dengan Harga Rp.4.000.000 ");	
			
		}
		if(penumpang >= 12 & penumpang <18)
		{	
			System.out.println("Bis yang tersedia untuk anda :\n");
			System.out.println("Bis Dengan 12 			Rp.1.300.000");
			System.out.println("Bis Dengan Kursi 6 Executive    Rp.2.000.000");
			System.out.println("\n*Rekomendasi Bis Untuk Anda: ");
			if(penumpang == 12)
				{
					System.out.println("1 Bis Dengan 12 Kursi Dengan Harga Rp.1.300.000 ");
				}
			if(penumpang > 12 && penumpang <18)
				{
					System.out.println("2 Bis Dengan 12 Kursi Dengan Harga Rp.2.600.000");
				}

		}
		if(penumpang >=18 && penumpang < 32)
		{
			System.out.println("Bis yang tersedia untuk anda :\n");
			System.out.println("Bis Dengan 18 			Rp.1.500.000");
			System.out.println("Bis Dengan 12 			Rp.1.300.000");
			System.out.println("Bis Dengan Kursi 6 Executive    Rp.2.000.000");
			System.out.println("\n*Rekomendasi Bis Untuk Anda: ");
			if(penumpang == 18)
			{
				System.out.println("1 Bis Dengan 18 Kursi Dengan Harga Rp.1.500.000");
			}
			if(penumpang > 18 && penumpang <= 24)
			{
				System.out.println("2 Bis Dengan 12 Kursi Dengan Harga Rp.2.600.000");	
			}
			if(penumpang > 25 && penumpang <=30)
			{
				System.out.println("1 Bis Dengan 18 Kursi dan 1 Bis Dengan 12 Kursi Dengan Harga Rp.2.800.000");
			}
			if(penumpang > 30 && penumpang <32)
			{
				System.out.println("2 Bis Dengan 18 Kursi Dengan Harga Rp.3.000.000");
			}
		}
		if(penumpang >=32 && penumpang < 45)
		{
			System.out.println("Bis yang tersedia untuk anda :\n");
			System.out.println("Bis Dengan 32 			Rp.1.800.000");
			System.out.println("Bis Dengan 18 			Rp.1.500.000");
			System.out.println("Bis Dengan 12 			Rp.1.300.000");
			System.out.println("Bis Dengan Kursi 6 Executive    Rp.2.000.000");
			System.out.println("\n*Rekomendasi Bis Untuk Anda: ");
			if(penumpang == 32)
			{
					System.out.println("1 Bis Dengan 32 Kursi Dengan Harga Rp.1.800.000");
			}
			if(penumpang > 32 && penumpang <= 36)
			{
					System.out.println("2 Bis Dengan 18 Kursi Dengan Harga Rp.3.000.000");
			
			}
			if(penumpang >36 && penumpang <=44)
			{
					System.out.println("1 Bis Dengan 32 Kursi dan 1 Bis Dengan 12 Kursi Dengan Harga Rp.3.100.000");
			}
		}
		if(penumpang >=45 && penumpang < 60)
		{
			System.out.println("Bis yang tersedia untuk anda :\n");
			System.out.println("Bis Dengan 45 			Rp.2.000.000");
			System.out.println("Bis Dengan 32 			Rp.1.800.000");
			System.out.println("Bis Dengan 18 			Rp.1.500.000");
			System.out.println("Bis Dengan 12 			Rp.1.300.000");
			System.out.println("Bis Dengan Kursi 6 Executive    Rp.2.000.000");
			System.out.println("\n*Rekomendasi Bis Untuk Anda: ");
			if(penumpang == 45)
			{
					System.out.println("1 Bis Dengan 45 Kursi Dengan Harga Rp.2.000.000");
			}
			if(penumpang > 45 && penumpang <= 57)
			{
					System.out.println("1 Bis Dengan 45 Kursi dan 1 Bis Dengan 12 Kursi Dengan Harga Rp.3.300.000");		
			}
			if(penumpang > 57 && penumpang <= 59)
			{
					System.out.println("2 Bis Dengan 32 Kursi Dengan Harga Rp.3.500.000");		
			}
		}
		if(penumpang >=60 && penumpang <=120)
		{
			System.out.println("Bis yang tersedia untuk anda :\n");
			System.out.println("Bis Dengan 60 			Rp.2.300.000");
			System.out.println("Bis Dengan 45 			Rp.2.000.000");
			System.out.println("Bis Dengan 32 			Rp.1.800.000");
			System.out.println("Bis Dengan 18 			Rp.1.500.000");
			System.out.println("Bis Dengan 12 			Rp.1.300.000");
			System.out.println("Bis Dengan Kursi 6 Executive    Rp.2.000.000");
			System.out.println("\n*Rekomendasi Bis Untuk Anda: ");
			if(penumpang == 60)
			{
					System.out.println("1 Bis Dengan 60 Kursi Dengan Harga Rp.2.300.000");
			}
			if(penumpang >60 && penumpang <=63 )
			{
					System.out.println("1 Bis Dengan 45 Kursi dan 1 Bis Dengan  18 Kursi Dengan Harga Rp.3.500.000 ");
			}
			if(penumpang >63 && penumpang <=72)
			{
					System.out.println("1 Bis Dengan 60 Kursi dan 1 Bis Dengan  12 Kursi Dengan Harga Rp.3.600.000 ");
			}
			if(penumpang >72 && penumpang <=78)
			{
					System.out.println("1 Bis Dengan 60 Kursi dan 1 Bis Dengan  18 Kursi Dengan Harga Rp.3.800.000 ");
			}
			if (penumpang > 78 && penumpang <= 90)
			{
					System.out.println("2 Bis Dengan 45 Kursi Dengan Harga Rp.4.000.000");
			}
			if(penumpang >90 && penumpang <=92)
			{
					System.out.println("1 Bis Dengan 60 Kursi dan 1 Bis Dengan  32 Kursi Dengan Harga Rp.4.100.000 ");
			}
			if(penumpang > 92 && penumpang <=105)
			{
					System.out.println("1 Bis Dengan 60 Kursi dan 1 Bis Dengan  45 Kursi Dengan Harga Rp.4.300.000 ");
			}
			if(penumpang >105 && penumpang <=120)
			{
 					System.out.println("2 Bis Dengan 60 Kursi Dengan Harga Rp.4.600.000 ");
			}
		}
	}
}//2 rekomendasi masih belum muncul