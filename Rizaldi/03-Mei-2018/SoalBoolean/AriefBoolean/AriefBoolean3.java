/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 15:58 AM
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class AriefBoolean3{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
                
        Double ram, hdd, processor, minRam, minHdd, minCPU, maxCPU;
        boolean specLaptop;

        System.out.println("berapa kapasitas ram laptop : ");        
        ram=keyboard.nextDouble();                
        System.out.println("berapa kapasitas HDD laptop : ");        
        hdd=keyboard.nextDouble();                
        System.out.println("berapa kecepatan processor laptop : ");        
        processor=keyboard.nextDouble();                

        minRam=8.0;
        minHdd=1.0;
        minCPU=3.0;
        maxCPU=4.5;

        specLaptop=(ram>=minRam&&hdd>=minHdd&&(processor>=minCPU&&processor<=maxCPU));
        
        System.out.println("    ");                
        System.out.println("Laptop tersebut masuk spesifikasi = "+specLaptop);   
    }
}