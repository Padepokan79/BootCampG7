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

public class BooleanArief2{
	public static void main(String[] args){
		
		Scanner keyboard=new Scanner(System.in);
		
		String hari;
		boolean accept;

		System.out.println("Hari apa ini? (Tuliskan dalam huruf kecil, contoh: jumat) ");
		hari = keyboard.next();
		
		accept = ( !(hari.equals("jumat") || hari.equals("minggu")) );
		System.out.println("Apakah toko buka : " + buka);
	}
}