/*
	DATA CREATED 	: 13 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Chaudhry03{
	public static void main(String[] args){
		
		String gejala, lelah, ruam;
		int demam;
		double beratAwal, proses, beratAKhir, kurang; 
		boolean hasil;
		Scanner key = new Scanner(System.in);

		System.out.print("Apa anda memiliki gejala seperti diare kronis? (ya/tidak) ");
		gejala 	= key.next();

		System.out.print("Berapa berat badan anda sekarang? ");
		beratAwal 	= key.nextDouble();

		System.out.print("Berapa lama anda demam? (dalam hari) ");
		demam 	= key.nextInt();

		System.out.print("Apakah anda mudah lelah? (ya/tidak) ");
		lelah 	= key.next();

		System.out.print("Apakah anda mempunyai ruam di kulit? (ya/tidak) ");
		ruam 	= key.next();



		kurang 	= 10.0/100;
		proses 	= beratAwal*kurang;
		beratAKhir 	= beratAwal - proses;

		hasil 	= ( gejala.equals("ya") && beratAKhir <= beratAwal && (demam >= 7 && demam <= 30) && lelah.equals("ya") && ruam.equals("ya") );

		System.out.println("Apa rumah yang bersangkutan sesuai? " + hasil);
		 
	}
}