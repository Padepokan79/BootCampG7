/*
 * File           : Inclusive.java
 * Project Name   : Tugas_For
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_For
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 2:01:24 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 2:01:27 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class Inclusive{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        
        int n, number1, number2;
        System.out.println("Enter Start : ");                            
        number1=keyboard.nextInt();
        System.out.println("Enter End : ");                            
        number2=keyboard.nextInt();


        for(n=number1; n<=number2; n++){ // 1 ~ 100
            
            System.out.print(n+" ");                            
            
        }        
    }
}