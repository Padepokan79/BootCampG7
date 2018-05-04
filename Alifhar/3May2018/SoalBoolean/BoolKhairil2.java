/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	14.11
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolKhairil2{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int roti, selai, kismis, mentega, total, hargaTotal, hargaRoti=15000, hargaSelai=8500, hargaKismis=7500, hargaMentega=3500;
		boolean boleh;

		System.out.print("\nTotal roti: ");
		roti=keyboard.nextInt();
		System.out.print("Total selai: ");
		selai=keyboard.nextInt();
		System.out.print("Total kismis: ");
		kismis=keyboard.nextInt();
		System.out.print("Total mentega: ");
		mentega=keyboard.nextInt();

		total=roti+selai+kismis+mentega;
		hargaTotal=roti*hargaRoti+selai*hargaSelai+kismis*hargaKismis+mentega*hargaMentega;
		
		boleh=( roti<=1 && mentega<=1 && hargaTotal<=100000 && total>=4 );
		System.out.println("Total Harga: "+hargaTotal);
		System.out.println("Total item: "+total);
		System.out.println("Belanja disetujui: "+boleh);
	}
}

//Benar