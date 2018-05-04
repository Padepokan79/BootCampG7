/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	15.24
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolRizaldi2{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		String makan, minum, berak;
		boolean tidur;

		System.out.println("\nTulis seluruh jawaban dalam huruf kecil");
		System.out.print("Makanan kucing sasuke hari ini: ");
		makan=keyboard.nextLine();
		System.out.print("Minuman kucing sasuke hari ini: ");
		minum=keyboard.nextLine();
		System.out.print("Kucing sasuke hari ini berak di: ");
		berak=keyboard.nextLine();

		tidur=( (makan.equals("rumput") || makan.equals("dedak")) && minum.equals("air hujan") && berak.equals("pasir") );
		
		System.out.println("Kucing sasuke bisa tidur: "+tidur);
	}
}