/*
	 Program     : Boolean Arief 1 / Jalan Tol
     Creator     : Khairil
     Created At  : 3 Mei 2018 14:25 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanArief1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int inputPlatNo, platNo, masuk, tidak, inputTgl, tgl, bilNol, bilSatu, bilDua, tglMax;
		boolean masukTol;

		System.out.print( "Input plat nomor  :  " );
		inputPlatNo = keyboard.nextInt();

		System.out.print( "Input tanggal  :  " );
		inputTgl = keyboard.nextInt();

		bilNol = 0;
		bilSatu = 1;
		bilDua = 2;
		tglMax = 31;

		masukTol = ( (inputPlatNo % bilDua == bilNol && inputTgl % bilDua == bilNol ) || (inputPlatNo % bilDua == bilSatu && inputTgl % bilDua == bilSatu ) && inputTgl <= tglMax );
		System.out.println( "Boleh masuk tol  : " + masukTol );		
	}
}