/*
	 Program     : Boolean Rizaldi 2 / Kucing Sasuke
     Creator     : Khairil
     Created At  : 3 Mei 2018 15:00 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanRizaldi2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputMakan, makanRumput, makanDedak, inputMinum, inputBerak, y; 
		boolean bisaTidur;

		System.out.print( "Makan Rumput atau Dedak ?  " );
		inputMakan = keyboard.next();
		System.out.print( "Minum ga (Pilih Y atau T) ?  " );
		inputMinum = keyboard.next();
		System.out.print( "Berak di pasir (Pilih Y atau T) ?  " );
		inputBerak = keyboard.next();

		makanRumput = "Rumput";
		makanDedak  = "Dedak";
		y = "Y";

		bisaTidur = ( (inputMakan.equals(makanRumput) || inputMakan.equals(makanDedak) ) && inputMinum.equals(y) && inputBerak.equals(y)  );

		System.out.println( "Bisa Tidur ?  : " + bisaTidur );		
	}
}