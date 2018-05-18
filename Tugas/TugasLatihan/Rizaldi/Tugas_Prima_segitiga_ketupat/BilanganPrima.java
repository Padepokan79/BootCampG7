/*
 * File           : BilanganPrima.java
 * Project Name   : Tugas_Prima_segitiga_ketupat
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_Prima_segitiga_ketupat
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Thursday, 17th May 2018 12:30:37 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Thursday, 17th May 2018 12:30:49 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class BilanganPrima{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        int number, index, n, temp,a;    
        temp=0;
        Boolean isPrime;

        a=5;
        a=10;
                
        System.out.println("Masukkan batas bilangan : ");
        number=keyboard.nextInt();

        for (index=2; index<=number; index++) {
            isPrime=true;

            for (n=2; n<index; n++) {
                if(index%n==0){
                    isPrime=false;                                
                }
            }

            if(isPrime==true){
            System.out.print(index+", ");
            }
        }

    }
}

