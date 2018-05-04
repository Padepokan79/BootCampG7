/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	13.57
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolArief2{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		String hari;
		boolean buka;

		System.out.println("\nHari apa ini? (Tuliskan dalam huruf kecil, contoh: jumat) ");
		hari=keyboard.next();
		
		buka=( !(hari.equals("jumat") || hari.equals("minggu")) );
		System.out.println("Toko buka: "+buka);
	}
}