/*
 * File           : OctopusLength.java
 * Project Name   : Tugas_For
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_For
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 2:19:39 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 2:19:40 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class OctopusLength{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);

        String word;
        int index, count;
        
        
        System.out.println("Masukkan kata : ");                            
        word=keyboard.nextLine();        
        System.out.println("==========================");                            
        System.out.println("Hasilnya : ");                            

        count=word.length();
        
        for(index=0; index<count; index++){ // 1 ~ 100
            
            System.out.println(word.charAt(index));
            
        }        
    }
}