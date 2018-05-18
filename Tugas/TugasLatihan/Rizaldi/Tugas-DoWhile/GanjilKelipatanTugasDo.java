/*
 * File           : GanjilKelipatanTugasDo.java
 * Project Name   : Tugas-DoWhile
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas-DoWhile
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Friday, 18th May 2018 12:56:02 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Friday, 18th May 2018 12:56:39 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class GanjilKelipatanTugasDo{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        
        int n, ganjil, mod;

        System.out.println("angka kelipatan 4 dan angka ganjil : ");            
        
        n=1;
        do{
            ganjil=n%2; 
            mod=n%4;
                       
            if(ganjil!=0||mod==0){
                System.out.print(" " +n);                            
            }
            n=n+1;
        }while(n<=1000);


        // for(n=1; n<=1000; n+=1){ // 1 ~ 100
            
        //     ganjil=n%2; 
        //     mod=n%4;
                       
        //     if(ganjil!=0||mod==0){
        //         System.out.print(" " +n);                            
        //     }
        // }        
    }
}