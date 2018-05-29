//Created by : Hendra Kurniawan
//Date : 27 Mei 2018 Time : 3:32 PM
//Modified :
import java.util.Scanner;

public class Array14{
	public static void main(String[] args) {
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int temp,pilih;
		boolean urut=false;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Urut Array");
		System.out.println("1.Urut dari Besar ke Kecil");
		System.out.println("2.Urut dari Kecil ke Besar");
		System.out.print("pilih 1 atau 2 :");
		pilih = keyboard.nextInt();

		System.out.print("Array 1 : ");
		for(int i : arr1){
			System.out.print(" " + i);
		}

		if(pilih==1){
		while (!urut){
			urut = true;
			for(int i = 0; i < arr1.length - 1 ; i++){
				if(arr1[i] < arr1[i+1]){
					temp = arr1[i];
					arr1[i] = arr1[i + 1];
					arr1[i + 1] = temp;
					urut = false;
				}
			}
		}

		System.out.print("\nArray 1 Besar ke Kecil: ");
		for(int i : arr1){
			System.out.print(" " + i);
		}
		}
		else if(pilih==2){
		while (!urut){
			urut = true;
			for(int i = 0; i < arr1.length - 1 ; i++){
				if(arr1[i] > arr1[i+1]){
					temp = arr1[i];
					arr1[i] = arr1[i +1 ];
					arr1[i +1] =temp;
					urut = false;
				}
			}
		}

		System.out.print("\nArray 1 Kecil ke Besar: ");
		for(int i : arr1){
			System.out.print(" " + i);
		}
		}

	}
}