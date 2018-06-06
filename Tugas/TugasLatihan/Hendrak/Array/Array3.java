//Created by : Hendra Kurniawan
//Date : 26 Mei 2018 Time : 8:46 PM
//Modified :
import java.util.Scanner;

public class Array3{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int pilihBilangan,ketemu=0;

		System.out.print("Array 1 : ");
		for(int i = 0; i <arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		System.out.print("Masukan Bilangan : ");
		pilihBilangan = keyboard.nextInt();

		for(int i = 0 ; i < arr1.length;i++){
			if(pilihBilangan == arr1[i]){
				System.out.println("Bilangan "+ pilihBilangan + " ada di Index " +i);
			}
			else{
				ketemu=1;
			}
			
		}
		if(ketemu==0){
			System.out.println("Bilangan Tidak Ada!!");
		}

	}
}