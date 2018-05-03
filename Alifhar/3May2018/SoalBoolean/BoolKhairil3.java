/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	14.29
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolKhairil3{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int terbang;
		String kelamin, kelas, subkelas;
		boolean boleh;

		System.out.print("\nKelas pesawat (bisnis/ekonomi/eksekutif): ");
		kelas=keyboard.next();
		System.out.print("Sub Kelas pesawat (A-Z): ");
		subkelas=keyboard.next();
		System.out.print("Jenis kelamin anda (pria/wanita): ");
		kelamin=keyboard.next();
		System.out.print("Total penerbangan: ");
		terbang=keyboard.nextInt();
				
		boleh=( kelas.equals("bisnis") && (subkelas.equals("D") || subkelas.equals("F") || (subkelas.equals("T") && terbang>=30)) && 
			((kelamin.equals("pria") && terbang>=20) || (kelamin.equals("wanita") && terbang>=15)) );
		System.out.println("Belanja disetujui: "+boleh);
	}
}