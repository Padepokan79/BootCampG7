/*
 * File           : TurtleWords.java
 * Project Name   : Tugas_For
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_For
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 2:32:01 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 2:32:03 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class TurtleWords{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);

        String word1, word2;
        int index, count1, count2, maxLength, totalLength;
        
        
        System.out.println("Masukkan kata : ");                            
        word1=keyboard.nextLine();        
        System.out.println("Masukkan kata : ");                            
        word2=keyboard.nextLine();        
        System.out.println("==========================");                            
        System.out.println("Hasilnya : ");                            
        

        maxLength=30;
        count1=word1.length();
        count2=word2.length();
        totalLength=maxLength-(count1+count2);

        System.out.print(word1);                            
        for(index=0; index<totalLength; index++){ // 1 ~ 100            
            System.out.print(".");            
        }        
        System.out.print(word2);                            
    }
}