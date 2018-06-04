//Created by : Hendra Kurniawan
//Date : 28 Mei 2018 Time : 8:35 AM
//Modified :
import java.util.Scanner;

public class Array6{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int [] arr1 = new int[11];	
		
		arr1[0]= 25;
		arr1[1]= 14;
		arr1[2]= 56;
		arr1[3]= 15;
		arr1[4]= 36;
		arr1[5]= 56;
		arr1[6]= 77;
		arr1[7]= 18;
		arr1[8]= 29;
		arr1[9]= 49;
		int posisi,nilai;

		System.out.print("Array Awal     : ");
		for(int i=0; i <arr1.length-1;i++){
		System.out.print(arr1[i] + " ");
		}
		
		System.out.print("\nMasukan posisi yang akan disisipkan: ");
		posisi = keyboard.nextInt();
		
		System.out.println();
		System.out.print("Masukan Nilai  : ");
		nilai = keyboard.nextInt();


		for(int i=arr1.length-1; i > posisi;i--){
		arr1[i] = arr1[i-1];
		}

		arr1[posisi] = nilai;
		System.out.print("Array Akhir    : ");
		for(int i=0; i <arr1.length;i++){
		System.out.print(arr1[i] + " ");
	}

	}
}