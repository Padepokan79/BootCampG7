/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	11.07
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolAlifhar1{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int umur, pengalaman;
		Double cepat, penampilan;
		boolean boleh;

		System.out.print("\nBerapa umur anda? ");
		umur=keyboard.nextInt();
		System.out.print("Berapa tahun pengalaman anda bekerja? ");
		pengalaman=keyboard.nextInt();
		System.out.print("Seberapa cepat anda bekerja (skala 0 sampai 10)? ");
		cepat=keyboard.nextDouble();
		System.out.print("Seberapa rapi anda (skala 0 sampai 10)? ");
		penampilan=keyboard.nextDouble();

		boleh=(cepat>8 && penampilan >=9 && (umur>30 || pengalaman>=3));
		System.out.println("Anda diterima: "+boleh);
	}
}