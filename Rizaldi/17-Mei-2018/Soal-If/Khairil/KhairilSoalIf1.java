/*
 * File           : KhairilSoalIf1.java
 * Project Name   : Khairil
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\17-Mei-2018\Soal-If\Khairil
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Thursday, 17th May 2018 12:11:04 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Thursday, 17th May 2018 12:11:30 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class KhairilSoalIf1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int diceQtyNumber, number1, number2, number3, number4, number5, number6;


		System.out.print("=============================================================");
		System.out.print("Peluang Dadu");
		System.out.println();
		System.out.print( "Masukkan Nilai  : (max 18)  " );
		diceQtyNumber = keyboard.nextInt();
		System.out.println(" Peluang Kombinasi Dadu Yaitu :");		

		number1=1;
		number2=2;
		number3=3;
		number4=4;
		number5=5;
		number6=6;

		if(diceQtyNumber==number3) {
			System.out.println(number1+" / "+number1+" / "+number1);
		}
		else if(diceQtyNumber==number4) {
			System.out.println(number1+" / "+number1+" / "+number2);
			System.out.println(number1+" / "+number2+" / "+number1);
			System.out.println(number2+" / "+number1+" / "+number1);
		}
		else if(diceQtyNumber==number5) {
			System.out.println(number1+" / "+number1+" / "+number3);
			System.out.println(number1+" / "+number3+" / "+number1);
			System.out.println(number3+" / "+number1+" / "+number1);
			System.out.println(number1+" / "+number2+" / "+number2);
			System.out.println(number2+" / "+number1+" / "+number2);
			System.out.println(number2+" / "+number2+" / "+number1);
		}
		else if(diceQtyNumber==number6) {
			System.out.println(number1+" / "+number1+" / "+number4);
			System.out.println(number1+" / "+number4+" / "+number1);
			System.out.println(number4+" / "+number1+" / "+number1);
			System.out.println(number1+" / "+number2+" / "+number3);			
			System.out.println(number1+" / "+number3+" / "+number2);
			System.out.println(number2+" / "+number1+" / "+number3);
			System.out.println(number2+" / "+number3+" / "+number1);
			System.out.println(number3+" / "+number1+" / "+number2);
			System.out.println(number3+" / "+number2+" / "+number1);
			System.out.println(number2+" / "+number2+" / "+number2);			
		}
		else if(diceQtyNumber==number6+number1) {
			System.out.println(number1+" / "+number1+" / "+number5);
			System.out.println(number1+" / "+number5+" / "+number1);
			System.out.println(number5+" / "+number1+" / "+number1);
			System.out.println(number1+" / "+number2+" / "+number4);			
			System.out.println(number1+" / "+number4+" / "+number2);
			System.out.println(number2+" / "+number4+" / "+number1);
			System.out.println(number4+" / "+number1+" / "+number2);
			System.out.println(number4+" / "+number2+" / "+number1);
			System.out.println(number1+" / "+number3+" / "+number3);
			System.out.println(number3+" / "+number1+" / "+number3);
			System.out.println(number3+" / "+number3+" / "+number1);			
		}
		else if(diceQtyNumber==number6+number2) {
			System.out.println(number1+" / "+number1+" / "+number6);
			System.out.println(number1+" / "+number6+" / "+number1);
			System.out.println(number6+" / "+number1+" / "+number1);
			System.out.println(number1+" / "+number2+" / "+number5);			
			System.out.println(number1+" / "+number5+" / "+number2);
			System.out.println(number2+" / "+number1+" / "+number5);
			System.out.println(number2+" / "+number5+" / "+number1);
			System.out.println(number5+" / "+number1+" / "+number2);
			System.out.println(number5+" / "+number2+" / "+number1);
			System.out.println(number1+" / "+number3+" / "+number4);
			System.out.println(number1+" / "+number4+" / "+number3);			
			System.out.println(number3+" / "+number1+" / "+number4);
			System.out.println(number3+" / "+number4+" / "+number1);			
			System.out.println(number4+" / "+number1+" / "+number3);
			System.out.println(number4+" / "+number3+" / "+number1);			
		}
		else if(diceQtyNumber==number6+number3) {
			System.out.println(number1+" / "+number2+" / "+number6);
			System.out.println(number1+" / "+number6+" / "+number2);
			System.out.println(number2+" / "+number1+" / "+number6);
			System.out.println(number2+" / "+number6+" / "+number1);
			System.out.println(number6+" / "+number1+" / "+number2);
			System.out.println(number6+" / "+number2+" / "+number1);
			System.out.println(number1+" / "+number3+" / "+number5);
			System.out.println(number1+" / "+number5+" / "+number3);
			System.out.println(number3+" / "+number1+" / "+number5);
			System.out.println(number3+" / "+number5+" / "+number1);
			System.out.println(number5+" / "+number1+" / "+number3);
			System.out.println(number5+" / "+number3+" / "+number1);
			System.out.println(number1+" / "+number4+" / "+number4);
			System.out.println(number4+" / "+number1+" / "+number4);
			System.out.println(number4+" / "+number4+" / "+number1);
			System.out.println(number3+" / "+number3+" / "+number3);
		}
		else if(diceQtyNumber==number6+number4) {
			System.out.println(number1+" / "+number3+" / "+number6);
			System.out.println(number1+" / "+number6+" / "+number3);
			System.out.println(number3+" / "+number1+" / "+number6);
			System.out.println(number3+" / "+number6+" / "+number1);
			System.out.println(number6+" / "+number1+" / "+number3);
			System.out.println(number6+" / "+number3+" / "+number1);
			System.out.println(number1+" / "+number4+" / "+number5);
			System.out.println(number1+" / "+number5+" / "+number4);
			System.out.println(number4+" / "+number1+" / "+number5);
			System.out.println(number4+" / "+number5+" / "+number1);
			System.out.println(number5+" / "+number1+" / "+number4);
			System.out.println(number5+" / "+number4+" / "+number1);
			System.out.println(number2+" / "+number3+" / "+number5);
			System.out.println(number2+" / "+number5+" / "+number3);
			System.out.println(number3+" / "+number2+" / "+number5);
			System.out.println(number3+" / "+number5+" / "+number2);
			System.out.println(number5+" / "+number2+" / "+number3);
			System.out.println(number5+" / "+number3+" / "+number2);
		}
		else if(diceQtyNumber==number6 + number5) {
			System.out.println(number1+" / "+number4+" / "+number6);
			System.out.println(number1+" / "+number6+" / "+number4);
			System.out.println(number4+" / "+number1+" / "+number6);
			System.out.println(number4+" / "+number6+" / "+number1);
			System.out.println(number6+" / "+number1+" / "+number4);
			System.out.println(number6+" / "+number4+" / "+number1);
			System.out.println(number1+" / "+number5+" / "+number5);
			System.out.println(number5+" / "+number1+" / "+number5);
			System.out.println(number5+" / "+number5+" / "+number1);
			System.out.println(number2+" / "+number4+" / "+number5);
			System.out.println(number2+" / "+number5+" / "+number4);
			System.out.println(number4+" / "+number2+" / "+number5);
			System.out.println(number4+" / "+number5+" / "+number2);
			System.out.println(number5+" / "+number2+" / "+number4);
			System.out.println(number5+" / "+number4+" / "+number2);
			System.out.println(number3+" / "+number4+" / "+number4);
			System.out.println(number4+" / "+number3+" / "+number4);
			System.out.println(number4+" / "+number4+" / "+number3);
			System.out.println(number2+" / "+number6+" / "+number3);
			System.out.println(number2+" / "+number3+" / "+number6);
			System.out.println(number3+" / "+number2+" / "+number6);
			System.out.println(number3+" / "+number6+" / "+number2);
			System.out.println(number6+" / "+number2+" / "+number3);
			System.out.println(number6+" / "+number3+" / "+number2);			
		}
		else if(diceQtyNumber==number6 + number6 ) {
			System.out.println(number1+" / "+number5+" / "+number6);
			System.out.println(number1+" / "+number6+" / "+number5);
			System.out.println(number5+" / "+number1+" / "+number6);
			System.out.println(number5+" / "+number6+" / "+number1);
			System.out.println(number6+" / "+number1+" / "+number5);
			System.out.println(number6+" / "+number5+" / "+number1);
			System.out.println(number2+" / "+number5+" / "+number5);
			System.out.println(number5+" / "+number2+" / "+number5);
			System.out.println(number5+" / "+number5+" / "+number2);
			System.out.println(number4+" / "+number4+" / "+number4);
			System.out.println(number3+" / "+number6+" / "+number3);
			System.out.println(number6+" / "+number3+" / "+number3);
			System.out.println(number3+" / "+number3+" / "+number6);
			System.out.println(number2+" / "+number4+" / "+number6);
			System.out.println(number2+" / "+number6+" / "+number4);
			System.out.println(number4+" / "+number2+" / "+number6);
			System.out.println(number4+" / "+number6+" / "+number2);
			System.out.println(number6+" / "+number2+" / "+number4);
			System.out.println(number6+" / "+number4+" / "+number2);
			System.out.println(number3+" / "+number4+" / "+number5);
			System.out.println(number3+" / "+number5+" / "+number4);
			System.out.println(number4+" / "+number3+" / "+number5);
			System.out.println(number4+" / "+number5+" / "+number3);
			System.out.println(number5+" / "+number3+" / "+number4);
			System.out.println(number5+" / "+number4+" / "+number3);			
		}
		else if(diceQtyNumber==number4+number4+number5 ) {
			System.out.println(number1+" / "+number6+" / "+number6);
			System.out.println(number6+" / "+number1+" / "+number6);
			System.out.println(number6+" / "+number6+" / "+number1);
			System.out.println(number2+" / "+number5+" / "+number6);
			System.out.println(number2+" / "+number6+" / "+number5);
			System.out.println(number5+" / "+number2+" / "+number6);
			System.out.println(number5+" / "+number6+" / "+number2);
			System.out.println(number6+" / "+number2+" / "+number5);
			System.out.println(number6+" / "+number5+" / "+number2);
			System.out.println(number3+" / "+number4+" / "+number6);
			System.out.println(number3+" / "+number6+" / "+number4);
			System.out.println(number4+" / "+number3+" / "+number6);
			System.out.println(number4+" / "+number6+" / "+number3);
			System.out.println(number6+" / "+number3+" / "+number4);
			System.out.println(number6+" / "+number4+" / "+number3);			
		}
		else if(diceQtyNumber==number4+number5+number5) {
			System.out.println(number2+" / "+number6+" / "+number6);
			System.out.println(number6+" / "+number2+" / "+number6);
			System.out.println(number6+" / "+number6+" / "+number2);
			System.out.println(number3+" / "+number5+" / "+number6);
			System.out.println(number3+" / "+number6+" / "+number5);
			System.out.println(number5+" / "+number3+" / "+number6);
			System.out.println(number5+" / "+number6+" / "+number3);
			System.out.println(number6+" / "+number3+" / "+number5);
			System.out.println(number6+" / "+number5+" / "+number3);
			System.out.println(number4+" / "+number4+" / "+number6);
			System.out.println(number4+" / "+number6+" / "+number4);
			System.out.println(number6+" / "+number4+" / "+number4);			
		}
		else if(diceQtyNumber==number5+number5+number5) {
			System.out.println(number6+" / "+number6+" / "+number3);
			System.out.println(number6+" / "+number3+" / "+number6);
			System.out.println(number3+" / "+number6+" / "+number6);
			System.out.println(number6+" / "+number5+" / "+number4);
			System.out.println(number6+" / "+number4+" / "+number5);
			System.out.println(number5+" / "+number6+" / "+number4);
			System.out.println(number5+" / "+number4+" / "+number6);
			System.out.println(number4+" / "+number5+" / "+number6);
			System.out.println(number4+" / "+number6+" / "+number5);
			System.out.println(number5+" / "+number5+" / "+number5);			
		}		
		else if(diceQtyNumber==number6+number5+number5) {
			System.out.println(number5+" / "+number5+" / "+number6);
			System.out.println(number5+" / "+number6+" / "+number5);
			System.out.println(number6+" / "+number5+" / "+number5);
			System.out.println(number4+" / "+number6+" / "+number6);
			System.out.println(number6+" / "+number4+" / "+number6);
			System.out.println(number6+" / "+number6+" / "+number4);
		}
		else if(diceQtyNumber==number6+number6+number5) {
			System.out.println(number6+" / "+number6+" / "+number5);
			System.out.println(number6+" / "+number5+" / "+number6);
			System.out.println(number5+" / "+number6+" / "+number6);			
		}
		else if(diceQtyNumber==number6+number6+number6) {
			System.out.println(number6+" / "+number6+" / "+number6);			
		}			
		else {
			System.out.println("Input = <3 dan >18");				
		}
	}
}