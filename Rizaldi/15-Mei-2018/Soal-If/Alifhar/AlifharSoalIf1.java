/*
 * File           : AlifharSoalIf1.java
 * Project Name   : Alifhar
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\15-Mei-2018\Soal-If\Alifhar
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 15th May 2018 3:09:54 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 15th May 2018 3:12:34 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class AlifharSoalIf1{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        
        Double number, oddNumber;        

        System.out.println("======================================================");
        System.out.println("Masukkan bilangan :           : ");
        number=keyboard.nextDouble();
        System.out.println("======================================================");

        oddNumber=number%2;    
        // positif negativ
        if(number>=0){
            System.out.println("Bilangan Bulat genap positif");                            
        }
        else if(number<0){
            System.out.println("Bilangan Bulat ganjil negatif");    
        }
        // genap ganjil
        if(oddNumber==0){
            System.out.println("Bilangan riil genap positif ");    
        }
        else if(oddNumber!=0){
            System.out.println("Bilangan riil ganjil positif ");
        }

        
        
    }
}