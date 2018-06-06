//Created by : Hendra Kurniawan
//Date : 27 Mei 2018 Time : 3:03 PM
//Modified :
import java.util.Scanner;

public class Array13{
	public static void main(String[] args) {
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int posisi1, posisi2, temp;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("\nArray 1 : ");
		for(int i : arr1){
			System.out.print(" " + i);
		}

		System.out.print("\nMasukan posisi ke 1 yang akan ditukar : ");
		posisi1 = keyboard.nextInt();
		System.out.print("Masukan posisi ke 2 yang akan ditukar : ");
		posisi2 = keyboard.nextInt();

		temp = arr1[posisi1-1];
		arr1[posisi1-1] = arr1[posisi2-1];
		arr1[posisi2-1] = temp;
				
		System.out.print("\nArray 1 : ");
		for(int i=0 ; i < arr1.length; i++){
			System.out.print(" " + arr1[i]);
		}
	}
}