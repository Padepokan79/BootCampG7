/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	13.10
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolAndrian1{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		long hadiah;
		double penampilan;
		String kelamin, sekolah;
		boolean boleh;

		System.out.print("\nApakah anda teman sekolah Nesa (ya/tidak)? ");
		sekolah=keyboard.next();
		System.out.print("Jenis kelamin anda (cewe/cowo)? ");
		kelamin=keyboard.next();
		System.out.print("Harga hadiah yang anda bawa? ");
		hadiah=keyboard.nextLong();
		System.out.print("Penampilan anda (skala 0 sampai 10)? ");
		penampilan=keyboard.nextDouble();

		boleh=(sekolah.equals("ya") && (kelamin.equals("cewe") || kelamin.equals("cowo")) && ((hadiah>=5000000 && penampilan>=8.5) || (hadiah>20000000)) );
		System.out.println("Anda dibolehkan masuk: "+boleh);
	}
}