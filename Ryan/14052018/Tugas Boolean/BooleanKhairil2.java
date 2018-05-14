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

public class BooleanKhairil2{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		
		String kelamin, kelas, bagian;
		int terbang;
		boolean accept;

		System.out.print("Type Kelas (bisnis/ekonomi/eksekutif) : ");
		kelas = keyboard.next();

		System.out.print("Baian (A-Z) : ");
		subkelas = keyboard.next();

		System.out.print("Jenis kelamin (L/P): ");
		kelamin = keyboard.next();

		System.out.print("Total penerbangan: ");
		terbang = keyboard.nextInt();
				
		accept = ( kelas.equals("bisnis") && (bagian.equals("D") || subkelas.equals("F") || (subkelas.equals("T") && terbang >= 30)) && 
				 ((kelamin.equals("L") && terbang >= 20) || (kelamin.equals("P") && terbang >= 15)) );
		System.out.println("Penerbangan di : "+boleh);
	}
}
