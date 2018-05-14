/*
created by : Malik chaudhary
time : 10-05-2018 1:57PM 
soal :

agar bisa tidur kucing sasuke harus makan rumput atau dedak, minum air hujan dan berak di pasir.

*/

import java.util.Scanner;
public class RizaldiBoolean1{
	public static void main(String[] args){
		String makanan, minuman, berak;
		boolean hasil, namaMakanan1, namaMakanan2, namaMinuman, tempatBerak;

		Scanner kucing = new Scanner(System.in);

		System.out.print("apa yang dimakan kucing sasuke : ");
 		makanan = kucing.next();

 		System.out.print("apa yang diminum kucing sasuke : air ");
 		minuman = kucing.next();

 		System.out.print("Berak dimana kucing sasuke : di ");
 		berak = kucing.next();

 		namaMakanan1 = makanan.equals("rumput");
 		namaMakanan2 = makanan.equals("dedak");
 		namaMinuman = minuman.equals("hujan");
 		tempatBerak = berak.equals("pasir");

 		hasil = ( ( namaMakanan1 || namaMakanan2 ) && namaMinuman && tempatBerak );

 		System.out.print("Apakah sasuke bisa tidur ? : "+hasil); 
	}
}