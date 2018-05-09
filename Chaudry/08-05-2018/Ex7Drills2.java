/*
	DATA CREATED 		: 08 MEI 2018
	AUTHOR 				: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Ex7Drills2{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "What city is the capital of France?" );
		keyboard.next();

		System.out.println( "What did you type?" );
		// pertanyaan kedua meledak ketika aku mengetikan [BLANK]
		keyboard.nextInt();

		System.out.println( "What did you type?" );
		/* 
			nilai yang gagal adalah penggunaan poin yang tidak tepat
			semisal penggunaan 0.1 dianggap salah, dan penggunaan 0,1 dianggap benar
		*/
		keyboard.nextDouble();

		System.out.println( "Is there anything else you would like to say?" );
		keyboard.next();
	}
}