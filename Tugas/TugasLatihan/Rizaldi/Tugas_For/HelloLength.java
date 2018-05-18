/*
 * File           : HelloLength.java
 * Project Name   : Tugas_For
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_For
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 2:07:50 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 2:07:51 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class HelloLength{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);

        String word;
        int n, count;
        
        
        System.out.println("Enter a word : ");                            
        word=keyboard.next();        
        System.out.println("==========================");                            

        count=word.length();
        

        for(n=1; n<=count; n++){ // 1 ~ 100
            
            System.out.println(word);
            
        }        
    }
}