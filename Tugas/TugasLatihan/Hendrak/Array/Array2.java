//Created by : Hendra Kurniawan
//Date : 26 Mei 2018 Time : 8:46 PM
//Modified :
import java.util.Scanner;

public class Array2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int cariAngka;
		boolean ketemu=false;

		System.out.print("Masukan bilangan yang dicari : " );
		cariAngka = keyboard.nextInt();

		for(int i =0; i < arr1.length; i++){
			if(arr1[i]==cariAngka){
				ketemu = true;
			}
		}
		if(ketemu){
			System.out.println("Bilangan Ada di dalam Array 1");
		}
		else {
			System.out.println("Bilangan Tidak ada di dalam array 1");
		}


	}
}