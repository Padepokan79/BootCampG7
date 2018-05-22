/*
	* Created by:	Alifhar Juliansyah
	* 				21-05-2018	15.25
	* Updated by:
	*
*/
import java.util.Scanner;

public class LatArray3{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr1={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int guess;
		boolean check=false;

		System.out.print("Masukkan angka: ");
		guess=scan.nextInt();

		for(int num : arr1)
			if(num==guess){
				System.out.println(guess+" was found");
				check=true;
			}
		
		if(check==false)
			System.out.println(guess+" was not found");
	}
}
//rata-rata
//apakah ada suatu bilangan
//suatu bilangan ada di posisi/index ke berapa
//terima nilai dan ubah nilai u/ suatu posisi pada arr1