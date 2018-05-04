/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 15:30 AM
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class RichaBoolean3{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
                
        int ageHusb, ageWife, dispute, husbSalary, ageRatio, idealRatio, maxDispute, minHusbSalary;
        boolean compatible;        

        System.out.println("Selamat datang, ketahuilah kecocokan kalian sebagai suami isteri!");        
        System.out.print("Umur suami  : ");        
        ageHusb=keyboard.nextInt();
        System.out.print("Umur isteri : ");        
        ageWife=keyboard.nextInt();
        System.out.print("Dalam sebulan berapa kali kalian bertengkar? : ");        
        dispute=keyboard.nextInt();
        System.out.print("Berapa gaji suami dalam sebulan? : ");        
        husbSalary=keyboard.nextInt();

        idealRatio=9;
        maxDispute=5;
        minHusbSalary=5000000;

        ageRatio=ageHusb-ageWife;

        
        compatible=(ageRatio<=idealRatio&&dispute<=maxDispute&&husbSalary>=minHusbSalary);

        System.out.println("    ");
        System.out.println("Ini hasilnya....");
        System.out.println("Apakah kalian cocok menjadi suami isteri? "+compatible);
        
                

    }
}