/*
 * File           : RyanSoalIf2.java
 * Project Name   : Ryan
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\16-Mei-2018\Soal-If\Ryan
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 10:28:00 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 10:28:05 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class RyanSoalIf2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
        Double qtyPeople, room1, room2, price1, price2, priceRoom1, priceRoom2;
        

		System.out.println("=====================================");
		System.out.println("Masukan jumlah orang: ");
		qtyPeople = keyboard.nextDouble();
		
        room1=3.0;
        room2=2.0;
        price1=650000.0;
        price2=350000.0;
        // harga kosan 1
        priceRoom1=(qtyPeople/room1)*price1;
        priceRoom2=(qtyPeople/room2)*price2;

        System.out.println("harga kosan 1 : "+priceRoom1);
		System.out.println("harga kosan 2 : "+priceRoom2);
        System.out.println("=====================================");
		
        if(priceRoom1<priceRoom2){
            System.out.println("Disarankan untuk memilih rumah kosan 1 dengan harga : "+priceRoom1);    
        }
        else{
            System.out.println("Disarankan untuk memilih rumah kosan 2 dengan harga : "+priceRoom2);
        }
        
		


        
	}
}