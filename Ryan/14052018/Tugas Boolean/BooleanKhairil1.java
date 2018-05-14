/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At :    
     * Updated By : 
     * Updated At : 
*/


import java.util.Scanner;

public class BooleanKhairil1{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		int total, hargaTotal, roti, selai, kismis, mentega, 
			hargaRoti, hargaSelai, hargaKismis, hargaMentega;
		boolean accept;

		hargaRoti = 15000;
		hargaSelai = 8500;
		hargaKismis = 7500;
		hargaMentega = 3500;

		System.out.print("Total roti: ");
		roti = keyboard.nextInt();

		System.out.print("Total selai: ");
		selai=keyboard.nextInt();

		System.out.print("Total kismis: ");
		kismis = keyboard.nextInt();

		System.out.print("Total mentega: ");
		mentega = keyboard.nextInt();

		total = roti + selai + kismis + mentega;
		hargaTotal = (roti * hargaRoti) + (selai * hargaSelai) + (kismis * hargaKismis) + (mentega * hargaMentega);
		
		accept = ( roti <= 1 && mentega <= 1 && hargaTotal <= 100000 && total >= 4 );

		System.out.println("Total Harga : "+hargaTotal);
		System.out.println("Total item : "+total);
		System.out.println("Belanja  : "+boleh);
	}
}