/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	14.11
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolKhairil1{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		double nilai1, nilai2;
		String kelamin, domisili;
		boolean boleh;

		System.out.print("\nDomisili (masukkan dalam huruf kecil): ");
		domisili=keyboard.nextLine();
		System.out.print("Nilai Matematika Semester 1: ");
		nilai1=keyboard.nextDouble();
		System.out.print("Nilai Matematika Semester 2: ");
		nilai2=keyboard.nextDouble();
		
		boleh=( (domisili.equals("bandung") || domisili.equals("kota bandung")) && nilai1>=8 && nilai2>=8 );
		System.out.println("Dapat mengikuti seleksi olimpiade matematika: "+boleh);
	}
}