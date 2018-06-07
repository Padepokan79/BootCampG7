//Created by : Hendra Kurniawan
//Date : 26 Mei 2018 Time : 8:46 PM
//Modified :
import java.util.Scanner;

public class Array4{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int [] arr1 = {2, 14, 56, 15, 36, 46, 77, 18, 29, 49};
		int nilai, posisi;

		System.out.print("Array Awal     : ");
		for(int i=0; i <arr1.length;i++){
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		System.out.print("Masukan Nilai  : ");
		nilai = keyboard.nextInt();

		System.out.println();
		System.out.print("Masukan Posisi : ");
		posisi = keyboard.nextInt();

		arr1 [posisi-1] = nilai;

		System.out.println();
		System.out.print("Array Diubah   : ");
		for(int i=0; i <arr1.length;i++){
			System.out.print(arr1[i] + " ");
		}
	}
}