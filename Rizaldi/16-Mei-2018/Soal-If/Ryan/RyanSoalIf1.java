/*
 * File           : RyanSoalIf1.java
 * Project Name   : Ryan
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\16-Mei-2018\Soal-If\Ryan
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 9:16:01 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 9:17:22 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class RyanSoalIf1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
        double distance, disCons1, disCons2, disCons3, hour, speed1, speed2, speed3, gas1, gas2, gas3, costGas1, costGas2, costGas3, time1, time2, time3;

        hour=1;
        disCons1=30;        
        disCons2=35;        
        disCons3=45;        
        gas1=15;
        gas2=10;
        gas3=20;

		System.out.println("=====================================");
		System.out.println("Masukan jarak tempuh: ");
		distance = keyboard.nextDouble();
		// waktu tercepat
        speed1=disCons1/hour;
        speed2=disCons2/hour;
        speed3=disCons3/hour;
        
        time1=(distance/hour)/speed1;
        time2=(distance/hour)/speed2;
        time3=(distance/hour)/speed3;
        // bensin termurah

        costGas1=distance/gas1;
        costGas2=distance/gas2;
        costGas3=distance/gas3;

        System.out.println("Mobil 1 = waktu : "+time1+" jam, dan bensin : "+costGas1+" liter");
		System.out.println("Mobil 2 = waktu : "+time2+" jam, dan bensin : "+costGas2+" liter");
		System.out.println("Mobil 3 = waktu : "+time3+" jam, dan bensin : "+costGas3+" liter");


        if(((time1<time2)&&(time1<time3))&&((costGas1<costGas2)&&(costGas1<costGas3))){
            System.out.println("disaran kan pakai Mobil 1 : dengan waktu "+time1+" dan habis bensin "+costGas1+" liter"); 
        }
        else if(((time2<time1)&&(time2<time3))&&((costGas2<costGas1)&&(costGas2<costGas3))){
            System.out.println("disaran kan pakai Mobil 2 : dengan waktu "+time2+" dan habis bensin "+costGas2+" liter"); 
        }
        else if(((time3<time1)&&(time3<time2))&&((costGas3<costGas1)&&(costGas3<costGas2))){
            System.out.println("disaran kan pakai Mobil 3 : dengan waktu "+time3+" dan habis bensin "+costGas3+" liter"); 
        }		
	}
}