//Created by :Hendra Kurniawan
//Date : 23 Mei 2018 Time : 1:59 AM
//Modified :
import java.util.Scanner;

public class RichaIf2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double kRumah, kMobil,gaji=8500000,tabungan=0,sandangPangan;
		double hRumah = 125000000,hMobil = 45000000;


		System.out.print(" Kredit rumah per bulan (%) : ");
		kRumah = keyboard.nextDouble();
		System.out.print(" Kredit mobil per bulan (%) : ");
		kMobil = keyboard.nextDouble();

		if(kMobil<3 && kRumah <1)
		{
			sandangPangan = gaji*0.5;
			tabungan = (gaji - sandangPangan) -(kRumah/100*hRumah)-(kMobil/100*hMobil);
		}
		else if(kMobil<5 && kRumah <2)
		{
			sandangPangan = gaji*0.35;
			tabungan = gaji - sandangPangan -(kRumah/100*hRumah)-(kMobil/100*hMobil);
		}
		else if(kMobil < 7 && kRumah < 3)
		{
			sandangPangan = gaji*0.25;
			tabungan = gaji -sandangPangan-(kRumah/100*hRumah)-(kMobil/100*hMobil);
		}
		else
		{
			System.out.println("Maaf uang tidak cukup!");
		}
		System.out.println("Tabungan Rudi Tabuti per bulan : Rp." + tabungan);

	}
}