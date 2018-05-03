/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	13.52
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolArief1{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int tanggal, plat;
		boolean boleh;

		System.out.print("\nSebutkan tanggal hari ini: ");
		tanggal=keyboard.nextInt();
		System.out.print("Sebutkan angka terakhir plat anda: ");
		plat=keyboard.nextInt();
	
		boleh=( tanggal%2 == plat%2 );
		System.out.println("Anda boleh masuk: "+boleh);
	}
}