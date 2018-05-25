/*
 * File           : GanjilKelipatanTugasWhile.java
 * Project Name   : Tugas-While
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas-While
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Thursday, 17th May 2018 1:07:07 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Thursday, 17th May 2018 1:07:37 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */





import java.util.Scanner;

public class GanjilKelipatanTugasWhile{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        
        int index, ganjil, mod;

        System.out.println("angka kelipatan 4 dan angka ganjil : ");            
        
        index=1;
        while(index<=100){
            ganjil=index%2; 
            mod=index%4;
                       
            if(ganjil!=0||mod==0){
                System.out.print(" " +index);                            
            }
            index=index+1;
        }


        // for(n=1; n<=1000; n+=1){ // 1 ~ 100
            
        //     ganjil=n%2; 
        //     mod=n%4;
                       
        //     if(ganjil!=0||mod==0){
        //         System.out.print(" " +n);                            
        //     }
        // }        
    }
}