/*
	DATA CREATED 	: 12 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Khairil02{
	public static void main(String[] args){
		
		String gender, kelas, subClass;
		int terbang;
		boolean hasil;
		Scanner key = new Scanner(System.in);

		System.out.print("Apa jenis kelamin anda? ");
		gender 	= key.next();

		System.out.print("kelas yang anda pilih? (bisnis/ekonomi/eksekutif) ");
		kelas 	= key.next();

		System.out.print("Apa subClass anda? ");
		subClass 	= key.next();

		System.out.print("Berapa kali anda melakukan penerbangan? ");
		terbang 	= key.nextInt();


		hasil 	= ( kelas.equals("bisnis") && ( (subClass.equals("d") || subClass.equals("f")) && ((gender.equals("pria") && terbang == 20) || (gender.equals("wanita") && terbang == 15)) ) || ((subClass.equals("t")) && ((gender.equals("pria") && terbang == 30) || (gender.equals("wanita") && terbang == 30)) ));

		System.out.print("Apakah anda lolos seleksi? " + hasil);
		 
	}
}