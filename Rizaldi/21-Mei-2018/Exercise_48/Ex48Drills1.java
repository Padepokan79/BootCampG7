/*
 * File           : Ex48Drills1.java
 * Project Name   : Exercise_48
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\21-Mei-2018\Exercise_48
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 21st May 2018 1:21:54 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 21st May 2018 1:22:51 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class Ex48Drills1{
    public static void main(String[] args){        
        String[] g7={"Alifhar","Andiran","Arief","Khairil","Richa","Vikri","Hendra","Yana","Chaudry","Malik","Rizaldi","Ryan"};
        String[] planets={"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};        
        
        for(String planet:planets){
            System.out.println(planet+"\t"+planet.toUpperCase());
        }
            System.out.println("================================");

        for(int g=0; g<g7.length; g++){
            System.out.println(g7[g]+"\t"+g7[g].toUpperCase());
        }
            System.out.println("================================");
    }
}