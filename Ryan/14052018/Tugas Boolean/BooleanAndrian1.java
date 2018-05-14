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

public class BooleanAndrian1{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		
		String kelamin, sekolah;
		long hargaHadiah;
		double penampilan;
		boolean accept;

		System.out.print("Apakah anda teman sekolah Nesa (Y/T) : ");
		sekolah = keyboard.next();

		System.out.print("Jenis kelamin (L/P) : ");
		kelamin = keyboard.next();

		System.out.print("Harga hadiah yang dibawa : ");
		hadiah = keyboard.nextLong();

		System.out.print("Berapa penampilan anda (skala 0.0 sampai 10.0) : ");
		penampilan = keyboard.nextDouble();

		boleh = (sekolah.equals("Y") && (kelamin.equals("P") || kelamin.equals("L")) && ((hargaHadiah >= 5000000 && penampilan >= 8.5) || (hadiah > 20000000)));
		
		System.out.println("Anda dibolehkan masuk: "+boleh);
	}
}