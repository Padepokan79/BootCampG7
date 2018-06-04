/*
	Created By Vikri
	21/05/2018
	4:11
*/
import java.util.Scanner;
import java.util.Random;
public class LatihanArray8{
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		for (int n=1; n < arr1.length; n++){
			if ( jumlah > arr1[n]) {
				jumlah = arr1[n]; 
				indeks = n;
			}
		}
		System.out.println("Nilai minimum nya adalah =" + jumlah + " indeks ke = " + indeks);
	}
}