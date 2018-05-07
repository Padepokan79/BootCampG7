/*
	 Program     : Boolean Rizaldi 3 / Planet Baru
     Creator     : Khairil
     Created At  : 3 Mei 2018 15:20 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanRizaldi3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputAir, y, inputSiang, inputMalam;
		int inputUmur, umurMin, umurMax;
		double inputKadar, kadar, inputUdara, udara, inputSuhu, suhuMin, suhuMax; 
		boolean cariPlanet;

		System.out.print( "Ada air ?  " );
		inputAir = keyboard.next();
		System.out.print( "Kadar 02 ?  " );
		inputKadar = keyboard.nextDouble();
		System.out.print( "Total Udara ?  " );
		inputUdara = keyboard.nextDouble();
		System.out.print( "Suhu nya  ?  " );
		inputSuhu = keyboard.nextDouble();
		System.out.print( "Siang (Y/T)  ?  " );
		inputSiang = keyboard.next();				
		System.out.print( "Malam (Y/T)  ?  " );
		inputMalam = keyboard.next();						
		System.out.print( "Umur Planet ?  " );
		inputUmur = keyboard.nextInt();

		y = "Y";
		udara = 500000;
		kadar = 0.2 * 500000;
		suhuMin = 32.0;
		suhuMax = 40.0;
		umurMin = 45;
		umurMax = 200;

		cariPlanet = ( inputAir.equals(y) && inputKadar == kadar && inputUdara == udara && (inputSuhu >= suhuMin && inputSuhu <= suhuMax) && ( inputSiang.equals(y) || inputMalam.equals(y) ) && (inputUmur >= umurMin && inputUmur <= umurMax) );

		System.out.println( "Pewe Ga ?  : " + cariPlanet );		
	}
}