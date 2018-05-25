//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 9:35 PM
//Modified by :
import java.util.Scanner;

public class Vikriif1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int istri, anak;

		System.out.print("Masukan jumlah istri :");
		istri = keyboard.nextInt();
		System.out.print("Masukan jumlah anak :");
		anak = keyboard.nextInt();

		if((istri == 1 && anak > 2)||(istri >2&&anak ==1))
			{System.out.println("Nenek memberi mu mobil!!");}
		else{
			System.out.println("Gak ada hadiah!!");
		}

	}
}