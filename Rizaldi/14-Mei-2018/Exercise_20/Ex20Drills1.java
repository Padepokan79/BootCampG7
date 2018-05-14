/*
 * File           : Ex20Drills1.java
 * Project Name   : Exercise_20
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\14-Mei-2018\Exercise_20
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 14th May 2018 11:25:18 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 14th May 2018 11:25:22 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import static java.lang.System.*;
import java.util.Scanner;

public class Ex20Drills1{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);

        int math;

        out.println("Welcome to the UT Austin College Admissions Interface!");
        out.print("Please enter your SAT math score (200-800) : ");
        math = keyboard.nextInt();

        out.print("Admittance status : ");

        if(math>=790)
            out.print("CERTAIN");        
        if(math>=710)
            out.print("SAFE");        
        if(math>=500)
            out.print("PROBABLE");        
        if(math>=500)
            out.print("UNCERTAIN");        
        if(math>=390)
            out.print("UNLIKELY");        
        else
            out.print("DENIED");
            out.println();        

        // > perbedaan antara IF dan Else IF menurut saya seperti rangkaian listrik paralel dan seri
        // IF untuk paralel, sedangkan Else IF untuk seri,
        // > hasilnya bila else nya dibuka maka kondisi mana saja yang masuk akan dieksekusi,
        // > beda halnya jika menggunakan Else If, statement akan dieksekusi bila kondisi sebelumnya tidak terpenuhi
        // dan kondisi setelahnya tidak akan di proses.
    }
}