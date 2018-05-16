/*
	DATE CREATED 	: 16 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Malik03{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		int skalaJujur, nol, angka9, angka2, angka15, angka5, angka35, skalaBohong, skalaSombong, skalaAngkuh, inputJujur, inputBohong, inputSombong, inputAngkuh;
		skalaJujur 	= 8;
		skalaBohong = 5;
		skalaSombong= 6;
		skalaAngkuh = 7;
		angka35 	= 35;
		angka15 	= 15;
		angka5 		= 5;
		angka9 		= 9;
		angka2 		= 2;
		nol 		= 0;

		System.out.println("=========================================");
		System.out.println("           DETECTED UR ATTITUDE          ");
		System.out.println("=========================================");
		System.out.print("Skala jujur anda     : ");
		inputJujur 	= key.nextInt();

		System.out.print("Skala bohong anda    : ");
		inputBohong = key.nextInt();

		System.out.print("Skala sombong anda   : ");
		inputSombong = key.nextInt();

		System.out.print("Skala angkuh anda    : ");
		inputAngkuh	= key.nextInt();
		System.out.println("-----------------------------------------");
		
		if ( (inputJujur+inputBohong+inputSombong+inputAngkuh) > angka35 ) {
			System.out.println("SELAMAT! anda sangat baik!");
		}
		else if ( (inputJujur+inputBohong+inputSombong+inputAngkuh) < angka15 ) {
			if ( (inputJujur+inputBohong+inputSombong+inputAngkuh) < angka5 ) {
				System.out.println("SELAMAT! anda kurang baik!");
			}else{
				System.out.println("SELAMAT! anda buruk!");
			}
		}
		else if (inputJujur >= skalaJujur && inputBohong < skalaBohong && inputSombong <= skalaSombong && inputAngkuh < skalaAngkuh) {
			System.out.println("SELAMAT! anda baik!");
		}
		else if (inputJujur >= angka9 && inputSombong >= angka2 && (inputBohong >= nol && inputAngkuh >= nol)) {
			System.out.println("SELEMAT! anda baik");
		}else{
			System.out.println("Tidak ada keterangan");
		}

	}
}