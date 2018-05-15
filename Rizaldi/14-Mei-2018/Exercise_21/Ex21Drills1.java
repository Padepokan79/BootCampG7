/*
 * File           : Ex21Drills1.java
 * Project Name   : Exercise_21
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\14-Mei-2018\Exercise_21
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 14th May 2018 11:56:29 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 14th May 2018 11:56:32 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class Ex21Drills1{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        String title;

        System.out.print("First name :");
        String first=keyboard.next();
        System.out.print("Last name :");
        String last=keyboard.next();
        System.out.print("Gender (M/F) :");
        String gender=keyboard.next();
        System.out.print("Age :");
        int age=keyboard.nextInt();

        if(age<20){
            title=first;
        }
        else{
            if(gender.equals("F")){
                System.out.print("Are you maried, "+first+" ? (Y/N) : ");
                String maried=keyboard.next();
                if(married.equals("Y")){
                    title="Mrs.";
                }
                if(married.equals("N")){
                    title="Ms";
                }          
            }  
        }        
        System.out.println( "\n" + title + " " + last );            
    }
}
// error karena title akan selalu berisi nilai, dan compiler tidak bisa memastikan dalam if bercabang
// statement mana yang di pilih. sedangkan sekali kita rubah ke if biasa,
// tidak ada cara lain bagi kita untuk mengetik sesuatu agar bisa masuk ke kondisi, tanpa memberi kan 
// variable title sebuah nilai.