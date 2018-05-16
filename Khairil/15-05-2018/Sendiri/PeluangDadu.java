/*
	 Program     : Soal 1 - Peluang Dadu
     Creator     : Khairil
     Created At  : 14 Mei 2018 18:55 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class PeluangDadu {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int jumlahAngkaDadu, angka1, angka2, angka3, angka4, angka5, angka6;

		angka1 = 1;
		angka2 = 2;
		angka3 = 3;
		angka4 = 4;
		angka5 = 5;
		angka6 = 6;

		System.out.print("=============================");
		System.out.print("Peluang Dadu");
		System.out.println();
		System.out.print( "Masukkan Jumlah Nilai  : (max 18)  " );
		jumlahAngkaDadu = keyboard.nextInt();
		System.out.println(" Peluang Kombinasi Angka Dadu Yaitu :");		
		if(jumlahAngkaDadu == angka3) {
			System.out.println(angka1 + " / " + angka1 + " / " + angka1);
		}
		else if(jumlahAngkaDadu == angka4) {
			System.out.println(angka1 + " / " + angka1 + " / " + angka2);
			System.out.println(angka1 + " / " + angka2 + " / " + angka1);
			System.out.println(angka2 + " / " + angka1 + " / " + angka1);
		}
		else if(jumlahAngkaDadu == angka5) {
			System.out.println(angka1 + " / " + angka1 + " / " + angka3);
			System.out.println(angka1 + " / " + angka3 + " / " + angka1);
			System.out.println(angka3 + " / " + angka1 + " / " + angka1);
			System.out.println(angka1 + " / " + angka2 + " / " + angka2);
			System.out.println(angka2 + " / " + angka1 + " / " + angka2);
			System.out.println(angka2 + " / " + angka2 + " / " + angka1);
		}
		else if(jumlahAngkaDadu == angka6) {
			System.out.println(angka1 + " / " + angka1 + " / " + angka4);
			System.out.println(angka1 + " / " + angka4 + " / " + angka1);
			System.out.println(angka4 + " / " + angka1 + " / " + angka1);
			System.out.println(angka1 + " / " + angka2 + " / " + angka3);			
			System.out.println(angka1 + " / " + angka3 + " / " + angka2);
			System.out.println(angka2 + " / " + angka1 + " / " + angka3);
			System.out.println(angka2 + " / " + angka3 + " / " + angka1);
			System.out.println(angka3 + " / " + angka1 + " / " + angka2);
			System.out.println(angka3 + " / " + angka2 + " / " + angka1);
			System.out.println(angka2 + " / " + angka2 + " / " + angka2);			
		}
		else if(jumlahAngkaDadu == angka6+angka1) {
			System.out.println(angka1 + " / " + angka1 + " / " + angka5);
			System.out.println(angka1 + " / " + angka5 + " / " + angka1);
			System.out.println(angka5 + " / " + angka1 + " / " + angka1);
			System.out.println(angka1 + " / " + angka2 + " / " + angka4);			
			System.out.println(angka1 + " / " + angka4 + " / " + angka2);
			System.out.println(angka2 + " / " + angka4 + " / " + angka1);
			System.out.println(angka4 + " / " + angka1 + " / " + angka2);
			System.out.println(angka4 + " / " + angka2 + " / " + angka1);
			System.out.println(angka1 + " / " + angka3 + " / " + angka3);
			System.out.println(angka3 + " / " + angka1 + " / " + angka3);
			System.out.println(angka3 + " / " + angka3 + " / " + angka1);			
		}
		else if(jumlahAngkaDadu == angka6+angka2) {
			System.out.println(angka1 + " / " + angka1 + " / " + angka6);
			System.out.println(angka1 + " / " + angka6 + " / " + angka1);
			System.out.println(angka6 + " / " + angka1 + " / " + angka1);
			System.out.println(angka1 + " / " + angka2 + " / " + angka5);			
			System.out.println(angka1 + " / " + angka5 + " / " + angka2);
			System.out.println(angka2 + " / " + angka1 + " / " + angka5);
			System.out.println(angka2 + " / " + angka5 + " / " + angka1);
			System.out.println(angka5 + " / " + angka1 + " / " + angka2);
			System.out.println(angka5 + " / " + angka2 + " / " + angka1);
			System.out.println(angka1 + " / " + angka3 + " / " + angka4);
			System.out.println(angka1 + " / " + angka4 + " / " + angka3);			
			System.out.println(angka3 + " / " + angka1 + " / " + angka4);
			System.out.println(angka3 + " / " + angka4 + " / " + angka1);			
			System.out.println(angka4 + " / " + angka1 + " / " + angka3);
			System.out.println(angka4 + " / " + angka3 + " / " + angka1);			
		}
		else if(jumlahAngkaDadu == angka6+angka3) {
			System.out.println(angka1 + " / " + angka2 + " / " + angka6);
			System.out.println(angka1 + " / " + angka6 + " / " + angka2);
			System.out.println(angka2 + " / " + angka1 + " / " + angka6);
			System.out.println(angka2 + " / " + angka6 + " / " + angka1);
			System.out.println(angka6 + " / " + angka1 + " / " + angka2);
			System.out.println(angka6 + " / " + angka2 + " / " + angka1);
			System.out.println(angka1 + " / " + angka3 + " / " + angka5);
			System.out.println(angka1 + " / " + angka5 + " / " + angka3);
			System.out.println(angka3 + " / " + angka1 + " / " + angka5);
			System.out.println(angka3 + " / " + angka5 + " / " + angka1);
			System.out.println(angka5 + " / " + angka1 + " / " + angka3);
			System.out.println(angka5 + " / " + angka3 + " / " + angka1);
			System.out.println(angka1 + " / " + angka4 + " / " + angka4);
			System.out.println(angka4 + " / " + angka1 + " / " + angka4);
			System.out.println(angka4 + " / " + angka4 + " / " + angka1);
			System.out.println(angka3 + " / " + angka3 + " / " + angka3);
		}
		else if(jumlahAngkaDadu == angka6+angka4) {
			System.out.println(angka1 + " / " + angka3 + " / " + angka6);
			System.out.println(angka1 + " / " + angka6 + " / " + angka3);
			System.out.println(angka3 + " / " + angka1 + " / " + angka6);
			System.out.println(angka3 + " / " + angka6 + " / " + angka1);
			System.out.println(angka6 + " / " + angka1 + " / " + angka3);
			System.out.println(angka6 + " / " + angka3 + " / " + angka1);
			System.out.println(angka1 + " / " + angka4 + " / " + angka5);
			System.out.println(angka1 + " / " + angka5 + " / " + angka4);
			System.out.println(angka4 + " / " + angka1 + " / " + angka5);
			System.out.println(angka4 + " / " + angka5 + " / " + angka1);
			System.out.println(angka5 + " / " + angka1 + " / " + angka4);
			System.out.println(angka5 + " / " + angka4 + " / " + angka1);
			System.out.println(angka2 + " / " + angka3 + " / " + angka5);
			System.out.println(angka2 + " / " + angka5 + " / " + angka3);
			System.out.println(angka3 + " / " + angka2 + " / " + angka5);
			System.out.println(angka3 + " / " + angka5 + " / " + angka2);
			System.out.println(angka5 + " / " + angka2 + " / " + angka3);
			System.out.println(angka5 + " / " + angka3 + " / " + angka2);
		}
		else if(jumlahAngkaDadu == angka6 + angka5) {
			System.out.println(angka1 + " / " + angka4 + " / " + angka6);
			System.out.println(angka1 + " / " + angka6 + " / " + angka4);
			System.out.println(angka4 + " / " + angka1 + " / " + angka6);
			System.out.println(angka4 + " / " + angka6 + " / " + angka1);
			System.out.println(angka6 + " / " + angka1 + " / " + angka4);
			System.out.println(angka6 + " / " + angka4 + " / " + angka1);
			System.out.println(angka1 + " / " + angka5 + " / " + angka5);
			System.out.println(angka5 + " / " + angka1 + " / " + angka5);
			System.out.println(angka5 + " / " + angka5 + " / " + angka1);
			System.out.println(angka2 + " / " + angka4 + " / " + angka5);
			System.out.println(angka2 + " / " + angka5 + " / " + angka4);
			System.out.println(angka4 + " / " + angka2 + " / " + angka5);
			System.out.println(angka4 + " / " + angka5 + " / " + angka2);
			System.out.println(angka5 + " / " + angka2 + " / " + angka4);
			System.out.println(angka5 + " / " + angka4 + " / " + angka2);
			System.out.println(angka3 + " / " + angka4 + " / " + angka4);
			System.out.println(angka4 + " / " + angka3 + " / " + angka4);
			System.out.println(angka4 + " / " + angka4 + " / " + angka3);
			System.out.println(angka2 + " / " + angka6 + " / " + angka3);
			System.out.println(angka2 + " / " + angka3 + " / " + angka6);
			System.out.println(angka3 + " / " + angka2 + " / " + angka6);
			System.out.println(angka3 + " / " + angka6 + " / " + angka2);
			System.out.println(angka6 + " / " + angka2 + " / " + angka3);
			System.out.println(angka6 + " / " + angka3 + " / " + angka2);			
		}
		else if(jumlahAngkaDadu == angka6 + angka6 ) {
			System.out.println(angka1 + " / " + angka5 + " / " + angka6);
			System.out.println(angka1 + " / " + angka6 + " / " + angka5);
			System.out.println(angka5 + " / " + angka1 + " / " + angka6);
			System.out.println(angka5 + " / " + angka6 + " / " + angka1);
			System.out.println(angka6 + " / " + angka1 + " / " + angka5);
			System.out.println(angka6 + " / " + angka5 + " / " + angka1);
			System.out.println(angka2 + " / " + angka5 + " / " + angka5);
			System.out.println(angka5 + " / " + angka2 + " / " + angka5);
			System.out.println(angka5 + " / " + angka5 + " / " + angka2);
			System.out.println(angka4 + " / " + angka4 + " / " + angka4);
			System.out.println(angka3 + " / " + angka6 + " / " + angka3);
			System.out.println(angka6 + " / " + angka3 + " / " + angka3);
			System.out.println(angka3 + " / " + angka3 + " / " + angka6);
			System.out.println(angka2 + " / " + angka4 + " / " + angka6);
			System.out.println(angka2 + " / " + angka6 + " / " + angka4);
			System.out.println(angka4 + " / " + angka2 + " / " + angka6);
			System.out.println(angka4 + " / " + angka6 + " / " + angka2);
			System.out.println(angka6 + " / " + angka2 + " / " + angka4);
			System.out.println(angka6 + " / " + angka4 + " / " + angka2);
			System.out.println(angka3 + " / " + angka4 + " / " + angka5);
			System.out.println(angka3 + " / " + angka5 + " / " + angka4);
			System.out.println(angka4 + " / " + angka3 + " / " + angka5);
			System.out.println(angka4 + " / " + angka5 + " / " + angka3);
			System.out.println(angka5 + " / " + angka3 + " / " + angka4);
			System.out.println(angka5 + " / " + angka4 + " / " + angka3);			
		}
		else if(jumlahAngkaDadu == angka4+angka4+angka5 ) {
			System.out.println(angka1 + " / " + angka6 + " / " + angka6);
			System.out.println(angka6 + " / " + angka1 + " / " + angka6);
			System.out.println(angka6 + " / " + angka6 + " / " + angka1);
			System.out.println(angka2 + " / " + angka5 + " / " + angka6);
			System.out.println(angka2 + " / " + angka6 + " / " + angka5);
			System.out.println(angka5 + " / " + angka2 + " / " + angka6);
			System.out.println(angka5 + " / " + angka6 + " / " + angka2);
			System.out.println(angka6 + " / " + angka2 + " / " + angka5);
			System.out.println(angka6 + " / " + angka5 + " / " + angka2);
			System.out.println(angka3 + " / " + angka4 + " / " + angka6);
			System.out.println(angka3 + " / " + angka6 + " / " + angka4);
			System.out.println(angka4 + " / " + angka3 + " / " + angka6);
			System.out.println(angka4 + " / " + angka6 + " / " + angka3);
			System.out.println(angka6 + " / " + angka3 + " / " + angka4);
			System.out.println(angka6 + " / " + angka4 + " / " + angka3);			
		}
		else if(jumlahAngkaDadu == angka4+angka5+angka5) {
			System.out.println(angka2 + " / " + angka6 + " / " + angka6);
			System.out.println(angka6 + " / " + angka2 + " / " + angka6);
			System.out.println(angka6 + " / " + angka6 + " / " + angka2);
			System.out.println(angka3 + " / " + angka5 + " / " + angka6);
			System.out.println(angka3 + " / " + angka6 + " / " + angka5);
			System.out.println(angka5 + " / " + angka3 + " / " + angka6);
			System.out.println(angka5 + " / " + angka6 + " / " + angka3);
			System.out.println(angka6 + " / " + angka3 + " / " + angka5);
			System.out.println(angka6 + " / " + angka5 + " / " + angka3);
			System.out.println(angka4 + " / " + angka4 + " / " + angka6);
			System.out.println(angka4 + " / " + angka6 + " / " + angka4);
			System.out.println(angka6 + " / " + angka4 + " / " + angka4);			
		}
		else if(jumlahAngkaDadu == angka5+angka5+angka5) {
			System.out.println(angka6 + " / " + angka6 + " / " + angka3);
			System.out.println(angka6 + " / " + angka3 + " / " + angka6);
			System.out.println(angka3 + " / " + angka6 + " / " + angka6);
			System.out.println(angka6 + " / " + angka5 + " / " + angka4);
			System.out.println(angka6 + " / " + angka4 + " / " + angka5);
			System.out.println(angka5 + " / " + angka6 + " / " + angka4);
			System.out.println(angka5 + " / " + angka4 + " / " + angka6);
			System.out.println(angka4 + " / " + angka5 + " / " + angka6);
			System.out.println(angka4 + " / " + angka6 + " / " + angka5);
			System.out.println(angka5 + " / " + angka5 + " / " + angka5);			
		}		
		else if(jumlahAngkaDadu == angka6+angka5+angka5) {
			System.out.println(angka5 + " / " + angka5 + " / " + angka6);
			System.out.println(angka5 + " / " + angka6 + " / " + angka5);
			System.out.println(angka6 + " / " + angka5 + " / " + angka5);
			System.out.println(angka4 + " / " + angka6 + " / " + angka6);
			System.out.println(angka6 + " / " + angka4 + " / " + angka6);
			System.out.println(angka6 + " / " + angka6 + " / " + angka4);
		}
		else if(jumlahAngkaDadu == angka6+angka6+angka5) {
			System.out.println(angka6 + " / " + angka6 + " / " + angka5);
			System.out.println(angka6 + " / " + angka5 + " / " + angka6);
			System.out.println(angka5 + " / " + angka6 + " / " + angka6);			
		}
		else if(jumlahAngkaDadu == angka6+angka6+angka6) {
			System.out.println(angka6 + " / " + angka6 + " / " + angka6);			
		}			
		else {
			System.out.println("Inputan tidak boleh kurang dari 3 atau lebih dari 18");				
		}
	}
}