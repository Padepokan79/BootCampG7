/*
	* Created by:	Alifhar Juliansyah
	* 				21-05-2018	15.29
	* Updated by:
	*
*/
import java.util.Scanner;

public class LatArray4{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr1={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int guess, index=-1;
		boolean check=false;

		System.out.print("Masukkan angka: ");
		guess=scan.nextInt();

		for(int i=0; i<arr1.length ; i++)
			if(arr1[i]==guess){
				index=i;
				i=arr1.length+1;
				check=true;
			}
		
		if(check==false)
			System.out.println(guess+" was not available");
		else
			System.out.println(guess+" was found at index "+index);
	}
}
//rata-rata
//apakah ada suatu bilangan
//suatu bilangan ada di posisi/index ke berapa
//terima nilai dan ubah nilai u/ suatu posisi pada arr1