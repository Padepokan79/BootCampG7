/*
	 Program     : Soal 1 - Vikri
     Creator     : Khairil
     Created At  : 17 Mei 2018 19:00 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class VikriIfElse1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int inputIstri, inputAnak, syarat1, syarat2;

		syarat1 = 1;
		syarat2 = 2;

		System.out.print("Jumlah istri : ");
		inputIstri = keyboard.nextInt();
		System.out.println();
		System.out.print("Jumlah anak : ");
		inputAnak = keyboard.nextInt();
		System.out.println();

		if( (inputIstri == syarat1 && inputAnak > syarat2) || (inputIstri > syarat2 && inputAnak == syarat1) ) {
			System.out.println("Nenek memberikan hadiah Mobil");
		}
		else {
			System.out.println("Ogah ah!");	
		}
	}
}


//1. seorang nene akan memberikan hadiah mobil apabila cucunya yang laki-laki mempunyai istri 1 dan anak lebih dari 2, atau istri lebih dari 2 & anak 1