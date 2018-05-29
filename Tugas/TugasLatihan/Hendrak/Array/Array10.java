//Created by : Hendra Kurniawan
//Date : 27 Mei 2018 Time : 9:04 AM
//Modified :
import java.util.Scanner;

public class Array10{
	public static void main(String[] args) {
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		Scanner keyboard = new Scanner(System.in);
		int angka, ketemu=0;

		System.out.print("Array 1 : ");
		for(int i = 0; i <arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}

		System.out.print("\nMasukan Angka :");
		angka = keyboard.nextInt();

		for(int i = 0; i < arr1.length; i++){
			if(angka == arr1[i]){
				ketemu +=1;
				if(ketemu >= 2){
					System.out.println("Nilai yang memiliki duplikat :");
					System.out.println("Data ke "+ (i+1) + " dengan nilai " + arr1[i]);
				}
				else if(ketemu==1){
					System.out.println("Bilangan Tidak memiliki duplikat!");
				}

			}
		}
		if(ketemu==0){
			System.out.println("Bilangan tidak ditemukan di array.");
		} 
		
	}
}