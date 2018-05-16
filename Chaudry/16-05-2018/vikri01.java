/*
	DATE CREATED 	: 16 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class vikri01{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		boolean bandingSatu, bandingDua;

		int inputIstri, inputAnak, satu, dua;
		String mobil;
		mobil = "mobil";
		satu  = 1;
		dua   = 2;

		System.out.print("Jumlah istri anda    : ");
		inputIstri = key.nextInt();

		System.out.print("Jumlah anak anda     : ");
		inputAnak = key.nextInt();

		bandingSatu = ( inputIstri == satu && inputAnak > dua );
		bandingDua  = ( inputIstri > dua && inputAnak == 1 );
		if (bandingSatu || bandingDua) {
			System.out.println("Selamat!! Nenek memberimu hadiah mobil");
		}else{
			System.out.println("Sayang sekali!! Nenek mu tidak memberi apa-apa");
		}
	}
}