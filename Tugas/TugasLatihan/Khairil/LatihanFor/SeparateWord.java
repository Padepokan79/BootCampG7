/*
	 Program     : Tugas For - Separate Word
     Creator     : Khairil
     Created At  : 16 Mei 2018 13:55 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class SeparateWord {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String wordType;
		int executeLag, printing, nol, satu; 

		System.out.print("Masukkan kata : ");
		wordType = keyboard.nextLine();
		System.out.println();

		nol = 0;
		satu = 1;
		executeLag = wordType.length();

		System.out.println("Result");
		for(printing = nol; printing <= executeLag - satu; printing++) {
			System.out.println(wordType.charAt(printing));
		}
	}
}