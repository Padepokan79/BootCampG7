/*
 * File           : Ex20Drills3.java
 * Project Name   : Exercise_20
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\14-Mei-2018\Exercise_20
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 14th May 2018 11:42:58 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 14th May 2018 11:43:36 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import static java.lang.System.*;
import java.util.Scanner;

public class Ex20Drills3{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);

        int math;

        out.println("Welcome to the UT Austin College Admissions Interface!");
        out.print("Please enter your SAT math score (200-800) : ");
        math = keyboard.nextInt();

        out.print("Admittance status : ");

        if ( math >= 790 ) {
            out.print( "CERTAIN " );
        }
        else {
            if ( math >= 390 ) {
                out.print( "UNLIKELY " );
            }
        else {
            if ( math >= 710 ) {
                out.print( "SAFE " );
            }
            else {
                if ( math >= 580 ) {
                    out.print( "PROBABLE " );
                }
                else {
                    if ( math >= 500 ) {
                        out.print( "UNCERTAIN " );
                    }                    
                        else { // below 390
                            out.print( "DENIED " );
                            }
                        }
                    }
                }
            }
        out.println();
    }
}

// hasilnya tetep seperti drills 2.