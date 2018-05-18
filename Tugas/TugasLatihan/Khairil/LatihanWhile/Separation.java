/*
	 Program     : Tugas While - Separation
     Creator     : Khairil
     Created At  : 17 Mei 2018 13:12 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class Separation {
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
		printing = nol; 

		System.out.println("Result");
		while(printing <= executeLag - satu) {
			System.out.println(wordType.charAt(printing));
			printing = printing + 1;
		}
	}
}