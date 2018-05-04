/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	13.26
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolAndrian2{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int usia;
		long penghasilan;
		double tinggi;
		String kelamin, ktp;
		boolean boleh;

		System.out.print("\nJenis kelamin anda (cewe/cowo)? ");
		kelamin=keyboard.next();
		System.out.print("Usia anda saat ini? ");
		usia=keyboard.nextInt();
		System.out.print("Apakah anda punya KTP (ya/tidak)? ");
		ktp=keyboard.next();
		System.out.print("Berapa penghasilan anda? ");
		penghasilan=keyboard.nextLong();
		System.out.print("Berapa tinggi badan anda? ");
		tinggi=keyboard.nextInt();

		boleh=( usia>=25 && ktp.equals("ya") && penghasilan>3000000 && ( (kelamin.equals("cewe") && tinggi>153) || (kelamin.equals("cowo") && tinggi>60) ) );
		System.out.println("Anda dibolehkan masuk: "+boleh);
	}
}