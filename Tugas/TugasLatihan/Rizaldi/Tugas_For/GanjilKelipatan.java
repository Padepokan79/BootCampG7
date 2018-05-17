/*
 * File           : GanjilKelipatan.java
 * Project Name   : Tugas_For
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_For
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 11:44:24 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 11:44:26 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class GanjilKelipatan{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        
        int n, ganjil, mod;

        System.out.println("angka kelipatan 4 dan angka ganjil : ");            
        

        for(n=1; n<=1000; n+=1){ // 1 ~ 100
            
            ganjil=n%2; 
            mod=n%4;
                       
            if(ganjil!=0||mod==0){
                System.out.print(" " +n);                            
            }
        }        
    }
}