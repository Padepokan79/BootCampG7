/*
	* Created by:	Alifhar Juliansyah
	* 				17-05-2018	12.2
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfKhairil1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dadu, nilai1=1, nilai2=2, nilai3=3, nilai4=4, nilai5=5, nilai6=6;

		System.out.println("Peluang Dadu");
		System.out.println();
		System.out.print( "Masukkan Jumlah Nilai dari 3 Dadu " );
		dadu = scan.nextInt();

		System.out.println("Angka dadu yang mungkin terjadi:");		
		if (dadu == nilai3) {
			System.out.println(nilai1 + " / " + nilai1 + " / " + nilai1);
		} else if (dadu == nilai4) {
			System.out.println(nilai1 + " / " + nilai1 + " / " + nilai2);
			System.out.println(nilai1 + " / " + nilai2 + " / " + nilai1);
			System.out.println(nilai2 + " / " + nilai1 + " / " + nilai1);
		} else if (dadu == nilai5) {
			System.out.println(nilai1 + " / " + nilai1 + " / " + nilai3);
			System.out.println(nilai1 + " / " + nilai3 + " / " + nilai1);
			System.out.println(nilai3 + " / " + nilai1 + " / " + nilai1);
			System.out.println(nilai1 + " / " + nilai2 + " / " + nilai2);
			System.out.println(nilai2 + " / " + nilai1 + " / " + nilai2);
			System.out.println(nilai2 + " / " + nilai2 + " / " + nilai1);
		} else if (dadu == nilai6) {
			System.out.println(nilai1 + " / " + nilai1 + " / " + nilai4);
			System.out.println(nilai1 + " / " + nilai4 + " / " + nilai1);
			System.out.println(nilai4 + " / " + nilai1 + " / " + nilai1);
			System.out.println(nilai1 + " / " + nilai2 + " / " + nilai3);			
			System.out.println(nilai1 + " / " + nilai3 + " / " + nilai2);
			System.out.println(nilai2 + " / " + nilai1 + " / " + nilai3);
			System.out.println(nilai2 + " / " + nilai3 + " / " + nilai1);
			System.out.println(nilai3 + " / " + nilai1 + " / " + nilai2);
			System.out.println(nilai3 + " / " + nilai2 + " / " + nilai1);
			System.out.println(nilai2 + " / " + nilai2 + " / " + nilai2);			
		} else if (dadu == nilai6+nilai1) {
			System.out.println(nilai1 + " / " + nilai1 + " / " + nilai5);
			System.out.println(nilai1 + " / " + nilai5 + " / " + nilai1);
			System.out.println(nilai5 + " / " + nilai1 + " / " + nilai1);
			System.out.println(nilai1 + " / " + nilai2 + " / " + nilai4);			
			System.out.println(nilai1 + " / " + nilai4 + " / " + nilai2);
			System.out.println(nilai2 + " / " + nilai4 + " / " + nilai1);
			System.out.println(nilai4 + " / " + nilai1 + " / " + nilai2);
			System.out.println(nilai4 + " / " + nilai2 + " / " + nilai1);
			System.out.println(nilai1 + " / " + nilai3 + " / " + nilai3);
			System.out.println(nilai3 + " / " + nilai1 + " / " + nilai3);
			System.out.println(nilai3 + " / " + nilai3 + " / " + nilai1);			
		} else if (dadu == nilai6+nilai2) {
			System.out.println(nilai1 + " / " + nilai1 + " / " + nilai6);
			System.out.println(nilai1 + " / " + nilai6 + " / " + nilai1);
			System.out.println(nilai6 + " / " + nilai1 + " / " + nilai1);
			System.out.println(nilai1 + " / " + nilai2 + " / " + nilai5);			
			System.out.println(nilai1 + " / " + nilai5 + " / " + nilai2);
			System.out.println(nilai2 + " / " + nilai1 + " / " + nilai5);
			System.out.println(nilai2 + " / " + nilai5 + " / " + nilai1);
			System.out.println(nilai5 + " / " + nilai1 + " / " + nilai2);
			System.out.println(nilai5 + " / " + nilai2 + " / " + nilai1);
			System.out.println(nilai1 + " / " + nilai3 + " / " + nilai4);
			System.out.println(nilai1 + " / " + nilai4 + " / " + nilai3);			
			System.out.println(nilai3 + " / " + nilai1 + " / " + nilai4);
			System.out.println(nilai3 + " / " + nilai4 + " / " + nilai1);			
			System.out.println(nilai4 + " / " + nilai1 + " / " + nilai3);
			System.out.println(nilai4 + " / " + nilai3 + " / " + nilai1);			
		} else if (dadu == nilai6+nilai3) {
			System.out.println(nilai1 + " / " + nilai2 + " / " + nilai6);
			System.out.println(nilai1 + " / " + nilai6 + " / " + nilai2);
			System.out.println(nilai2 + " / " + nilai1 + " / " + nilai6);
			System.out.println(nilai2 + " / " + nilai6 + " / " + nilai1);
			System.out.println(nilai6 + " / " + nilai1 + " / " + nilai2);
			System.out.println(nilai6 + " / " + nilai2 + " / " + nilai1);
			System.out.println(nilai1 + " / " + nilai3 + " / " + nilai5);
			System.out.println(nilai1 + " / " + nilai5 + " / " + nilai3);
			System.out.println(nilai3 + " / " + nilai1 + " / " + nilai5);
			System.out.println(nilai3 + " / " + nilai5 + " / " + nilai1);
			System.out.println(nilai5 + " / " + nilai1 + " / " + nilai3);
			System.out.println(nilai5 + " / " + nilai3 + " / " + nilai1);
			System.out.println(nilai1 + " / " + nilai4 + " / " + nilai4);
			System.out.println(nilai4 + " / " + nilai1 + " / " + nilai4);
			System.out.println(nilai4 + " / " + nilai4 + " / " + nilai1);
			System.out.println(nilai3 + " / " + nilai3 + " / " + nilai3);
		} else if (dadu == nilai6+nilai4) {
			System.out.println(nilai1 + " / " + nilai3 + " / " + nilai6);
			System.out.println(nilai1 + " / " + nilai6 + " / " + nilai3);
			System.out.println(nilai3 + " / " + nilai1 + " / " + nilai6);
			System.out.println(nilai3 + " / " + nilai6 + " / " + nilai1);
			System.out.println(nilai6 + " / " + nilai1 + " / " + nilai3);
			System.out.println(nilai6 + " / " + nilai3 + " / " + nilai1);
			System.out.println(nilai1 + " / " + nilai4 + " / " + nilai5);
			System.out.println(nilai1 + " / " + nilai5 + " / " + nilai4);
			System.out.println(nilai4 + " / " + nilai1 + " / " + nilai5);
			System.out.println(nilai4 + " / " + nilai5 + " / " + nilai1);
			System.out.println(nilai5 + " / " + nilai1 + " / " + nilai4);
			System.out.println(nilai5 + " / " + nilai4 + " / " + nilai1);
			System.out.println(nilai2 + " / " + nilai3 + " / " + nilai5);
			System.out.println(nilai2 + " / " + nilai5 + " / " + nilai3);
			System.out.println(nilai3 + " / " + nilai2 + " / " + nilai5);
			System.out.println(nilai3 + " / " + nilai5 + " / " + nilai2);
			System.out.println(nilai5 + " / " + nilai2 + " / " + nilai3);
			System.out.println(nilai5 + " / " + nilai3 + " / " + nilai2);
		} else if (dadu == nilai6 + nilai5) {
			System.out.println(nilai1 + " / " + nilai4 + " / " + nilai6);
			System.out.println(nilai1 + " / " + nilai6 + " / " + nilai4);
			System.out.println(nilai4 + " / " + nilai1 + " / " + nilai6);
			System.out.println(nilai4 + " / " + nilai6 + " / " + nilai1);
			System.out.println(nilai6 + " / " + nilai1 + " / " + nilai4);
			System.out.println(nilai6 + " / " + nilai4 + " / " + nilai1);
			System.out.println(nilai1 + " / " + nilai5 + " / " + nilai5);
			System.out.println(nilai5 + " / " + nilai1 + " / " + nilai5);
			System.out.println(nilai5 + " / " + nilai5 + " / " + nilai1);
			System.out.println(nilai2 + " / " + nilai4 + " / " + nilai5);
			System.out.println(nilai2 + " / " + nilai5 + " / " + nilai4);
			System.out.println(nilai4 + " / " + nilai2 + " / " + nilai5);
			System.out.println(nilai4 + " / " + nilai5 + " / " + nilai2);
			System.out.println(nilai5 + " / " + nilai2 + " / " + nilai4);
			System.out.println(nilai5 + " / " + nilai4 + " / " + nilai2);
			System.out.println(nilai3 + " / " + nilai4 + " / " + nilai4);
			System.out.println(nilai4 + " / " + nilai3 + " / " + nilai4);
			System.out.println(nilai4 + " / " + nilai4 + " / " + nilai3);
			System.out.println(nilai2 + " / " + nilai6 + " / " + nilai3);
			System.out.println(nilai2 + " / " + nilai3 + " / " + nilai6);
			System.out.println(nilai3 + " / " + nilai2 + " / " + nilai6);
			System.out.println(nilai3 + " / " + nilai6 + " / " + nilai2);
			System.out.println(nilai6 + " / " + nilai2 + " / " + nilai3);
			System.out.println(nilai6 + " / " + nilai3 + " / " + nilai2);			
		} else if (dadu == nilai6 + nilai6 ) {
			System.out.println(nilai1 + " / " + nilai5 + " / " + nilai6);
			System.out.println(nilai1 + " / " + nilai6 + " / " + nilai5);
			System.out.println(nilai5 + " / " + nilai1 + " / " + nilai6);
			System.out.println(nilai5 + " / " + nilai6 + " / " + nilai1);
			System.out.println(nilai6 + " / " + nilai1 + " / " + nilai5);
			System.out.println(nilai6 + " / " + nilai5 + " / " + nilai1);
			System.out.println(nilai2 + " / " + nilai5 + " / " + nilai5);
			System.out.println(nilai5 + " / " + nilai2 + " / " + nilai5);
			System.out.println(nilai5 + " / " + nilai5 + " / " + nilai2);
			System.out.println(nilai4 + " / " + nilai4 + " / " + nilai4);
			System.out.println(nilai3 + " / " + nilai6 + " / " + nilai3);
			System.out.println(nilai6 + " / " + nilai3 + " / " + nilai3);
			System.out.println(nilai3 + " / " + nilai3 + " / " + nilai6);
			System.out.println(nilai2 + " / " + nilai4 + " / " + nilai6);
			System.out.println(nilai2 + " / " + nilai6 + " / " + nilai4);
			System.out.println(nilai4 + " / " + nilai2 + " / " + nilai6);
			System.out.println(nilai4 + " / " + nilai6 + " / " + nilai2);
			System.out.println(nilai6 + " / " + nilai2 + " / " + nilai4);
			System.out.println(nilai6 + " / " + nilai4 + " / " + nilai2);
			System.out.println(nilai3 + " / " + nilai4 + " / " + nilai5);
			System.out.println(nilai3 + " / " + nilai5 + " / " + nilai4);
			System.out.println(nilai4 + " / " + nilai3 + " / " + nilai5);
			System.out.println(nilai4 + " / " + nilai5 + " / " + nilai3);
			System.out.println(nilai5 + " / " + nilai3 + " / " + nilai4);
			System.out.println(nilai5 + " / " + nilai4 + " / " + nilai3);			
		} else if (dadu == nilai4+nilai4+nilai5 ) {
			System.out.println(nilai1 + " / " + nilai6 + " / " + nilai6);
			System.out.println(nilai6 + " / " + nilai1 + " / " + nilai6);
			System.out.println(nilai6 + " / " + nilai6 + " / " + nilai1);
			System.out.println(nilai2 + " / " + nilai5 + " / " + nilai6);
			System.out.println(nilai2 + " / " + nilai6 + " / " + nilai5);
			System.out.println(nilai5 + " / " + nilai2 + " / " + nilai6);
			System.out.println(nilai5 + " / " + nilai6 + " / " + nilai2);
			System.out.println(nilai6 + " / " + nilai2 + " / " + nilai5);
			System.out.println(nilai6 + " / " + nilai5 + " / " + nilai2);
			System.out.println(nilai3 + " / " + nilai4 + " / " + nilai6);
			System.out.println(nilai3 + " / " + nilai6 + " / " + nilai4);
			System.out.println(nilai4 + " / " + nilai3 + " / " + nilai6);
			System.out.println(nilai4 + " / " + nilai6 + " / " + nilai3);
			System.out.println(nilai6 + " / " + nilai3 + " / " + nilai4);
			System.out.println(nilai6 + " / " + nilai4 + " / " + nilai3);			
		} else if (dadu == nilai4+nilai5+nilai5) {
			System.out.println(nilai2 + " / " + nilai6 + " / " + nilai6);
			System.out.println(nilai6 + " / " + nilai2 + " / " + nilai6);
			System.out.println(nilai6 + " / " + nilai6 + " / " + nilai2);
			System.out.println(nilai3 + " / " + nilai5 + " / " + nilai6);
			System.out.println(nilai3 + " / " + nilai6 + " / " + nilai5);
			System.out.println(nilai5 + " / " + nilai3 + " / " + nilai6);
			System.out.println(nilai5 + " / " + nilai6 + " / " + nilai3);
			System.out.println(nilai6 + " / " + nilai3 + " / " + nilai5);
			System.out.println(nilai6 + " / " + nilai5 + " / " + nilai3);
			System.out.println(nilai4 + " / " + nilai4 + " / " + nilai6);
			System.out.println(nilai4 + " / " + nilai6 + " / " + nilai4);
			System.out.println(nilai6 + " / " + nilai4 + " / " + nilai4);			
		} else if (dadu == nilai5+nilai5+nilai5) {
			System.out.println(nilai6 + " / " + nilai6 + " / " + nilai3);
			System.out.println(nilai6 + " / " + nilai3 + " / " + nilai6);
			System.out.println(nilai3 + " / " + nilai6 + " / " + nilai6);
			System.out.println(nilai6 + " / " + nilai5 + " / " + nilai4);
			System.out.println(nilai6 + " / " + nilai4 + " / " + nilai5);
			System.out.println(nilai5 + " / " + nilai6 + " / " + nilai4);
			System.out.println(nilai5 + " / " + nilai4 + " / " + nilai6);
			System.out.println(nilai4 + " / " + nilai5 + " / " + nilai6);
			System.out.println(nilai4 + " / " + nilai6 + " / " + nilai5);
			System.out.println(nilai5 + " / " + nilai5 + " / " + nilai5);			
		} else if (dadu == nilai6+nilai5+nilai5) {
			System.out.println(nilai5 + " / " + nilai5 + " / " + nilai6);
			System.out.println(nilai5 + " / " + nilai6 + " / " + nilai5);
			System.out.println(nilai6 + " / " + nilai5 + " / " + nilai5);
			System.out.println(nilai4 + " / " + nilai6 + " / " + nilai6);
			System.out.println(nilai6 + " / " + nilai4 + " / " + nilai6);
			System.out.println(nilai6 + " / " + nilai6 + " / " + nilai4);
		} else if (dadu == nilai6+nilai6+nilai5) {
			System.out.println(nilai6 + " / " + nilai6 + " / " + nilai5);
			System.out.println(nilai6 + " / " + nilai5 + " / " + nilai6);
			System.out.println(nilai5 + " / " + nilai6 + " / " + nilai6);			
		} else if (dadu == nilai6+nilai6+nilai6) {
			System.out.println(nilai6 + " / " + nilai6 + " / " + nilai6);			
		} else if (dadu < nilai3) {
			System.out.println("Tidak ada, karena nilai kurang dari 3");
		} else {
			System.out.println("Tidak ada, karena nilai lebih dari 18");
		}
	}
}