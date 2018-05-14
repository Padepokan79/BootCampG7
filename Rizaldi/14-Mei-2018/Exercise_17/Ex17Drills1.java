/*
 * File           : Ex17Drills1.java
 * Project Name   : Exercise_17
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\14-Mei-2018\Exercise_17
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 14th May 2018 9:13:23 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 14th May 2018 9:14:03 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */





import java.util.Scanner;

public class Ex17Drills1{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);

        int age = 22;
        boolean onGuestList = false;
        double allure = 7.5;
        String gender = "F";

        if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
        System.out.println("You are allowed to enter the club.");
        }
        System.out.println("C-C-C-COMBO BREAKER");
        else {
        System.out.println("You are not allowed to enter the club.");
        // no it doesnt even compiled.
        // else itu harus ada if dulu di atasnya.
        // kalau if doang bisa
        // kalu else doang harus ada if
        }
    }
}