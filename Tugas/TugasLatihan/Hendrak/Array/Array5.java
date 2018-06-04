//Created by : Hendra Kurniawan
//Date : 26 Mei 2018 Time : 8:46 PM
//Modified :
import java.util.Scanner;

public class Array5{
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int [] arr1 = {2, 14, 56, 15, 36, 46, 77, 18, 29, 49};	
	int posisi;

	System.out.print("Array Awal     : ");
	for(int i=0; i <arr1.length;i++){
		System.out.print(arr1[i] + " ");
	}

	System.out.print("\nMasukan posisi : ");
	posisi = keyboard.nextInt();
	for(int i=posisi-1; i < arr1.length-1;i++){
		arr1[i] = arr1[i+1];
	}

	System.out.print("Array Akhir    : ");
	for(int i=0; i <arr1.length-1;i++){
		System.out.print(arr1[i] + " ");
	}

	}
}