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

public class BoolenaArief1{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		
		int tanggal, platNo;
		boolean accept;

		System.out.print("Tanggal hari ini (Hanya tanggal) : ");
		tanggal = keyboard.nextInt();

		System.out.print("Angka Terakhir Plat No : ");
		platNo = keyboard.nextInt();
	
		accept = ( tanggal%2 == plat%2 );
		System.out.println("Izin masuk : "+boleh);
	}
}