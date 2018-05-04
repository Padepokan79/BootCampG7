/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	11.16
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolAlifhar2{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int tahun, beda=30;
		Double kecepatan, jarak=20.0, menit=30.0, jam, kecepatanLama;
		String warna;
		boolean boleh;

		System.out.print("\nWarna mobil: ");
		warna=keyboard.next();
		System.out.print("Kecepatan mobil: ");
		kecepatan=keyboard.nextDouble();
		System.out.print("tahun keluar: ");
		tahun=keyboard.nextInt();

		jam=menit/60;
		kecepatanLama=jarak/jam;

		boleh=(warna.equals("biru") && kecepatan>(kecepatanLama+beda) && (tahun==2016 || tahun==2017));
		System.out.println("Mobilnya akan dibeli: "+boleh);
	}
}