/*
Created by	: Yana
Time		: 14 Mei 2018 10.02
*/

import java.util.Scanner;

public class Ex18Drills3{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		int	umurPria, umurWanita, selisihUmur1, selisihUmur2, ganteng, penghasilan;
		boolean syaratKakek, syaratIbu, syaratAyah, syaratNenek, syaratUmum;

		umurWanita	= 25;
		umurPria	= 23;
		ganteng		= 9;
		penghasilan	= 10000000;
		selisihUmur1= umurWanita - umurPria;
		selisihUmur2= umurPria - umurWanita;

		syaratKakek	= umurPria >= 30 && ganteng >= 0 && penghasilan >= 5000000;
		syaratIbu	= umurPria >= 17 && umurPria < 30 && ganteng >= 8 && penghasilan >= 5000000;
		syaratAyah	= ( (selisihUmur1 <= 5 && selisihUmur1 >= 0 )|| (selisihUmur2 <= 5 && selisihUmur2 >= 0)) && 
					  ( ganteng >= 8 || penghasilan >= 5000000 );
		syaratNenek	= umurPria > 25 && umurPria < 40 && ( ganteng >= 8 || penghasilan > 5000000 );
		syaratUmum	= (syaratIbu && syaratAyah) || (syaratIbu && syaratKakek) || (syaratIbu && syaratNenek) ||
					  (syaratAyah && syaratKakek) || (syaratAyah || syaratNenek) || (syaratKakek && syaratNenek);

		if ( syaratKakek ) {
			System.out.println("Kakek menyetujui kriteria Pria tersebut");
		}
		if ( syaratIbu ){			
			System.out.println("Ibu menyetujui kriteria Pria tersebut");	
		}
		if ( syaratAyah ) {			
			System.out.println("Ayah menyetujui kriteria Pria tersebut");				
		}
		if ( syaratNenek ) {
			System.out.println("Nenek menyetujui kriteria Pria tersebut");				
		}
		if ( syaratUmum ) {
			System.out.println("Keluarga akan menyetujui");	
		} 
		else{			
			System.out.println("Keluarga tidak akan menyetujui");	
		}
	}
}