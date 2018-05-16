/*
 * File           : OddNumber.java
 * Project Name   : Tugas_Random
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_Random
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 1:49:15 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 1:49:16 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class OddNumber{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        
        int number, mod;
        
        
        for(number=2; number<=10; number++){ // 1 ~ 100
            mod=number%2;
            if(mod!=0){
                System.out.print(number+" ");                            
            }
        }        
    }
}