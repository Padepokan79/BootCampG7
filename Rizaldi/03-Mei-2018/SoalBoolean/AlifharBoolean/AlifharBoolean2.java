/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 20:50
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class AlifharBoolean2{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
                
        String color;
        Double speed, currSpeedIn30Minute, currSpeedIn1Hour, expectSpeed;
        int year, minYear1, minYear2;
        Boolean newCar, blue;

        System.out.println("warna apakah mobil baru ini  : ");        
        color=keyboard.next();                                        
        System.out.println("berapa kecepatan mobil baru ini  : ");        
        speed=keyboard.nextDouble();                                        
        System.out.println("keluaran tahun berapa mobil baru ini  : ");        
        year=keyboard.nextInt();                                        
        
        blue=color.equals("biru");

        currSpeedIn30Minute=20.0;
        currSpeedIn1Hour=currSpeedIn30Minute*2.0;
        expectSpeed=currSpeedIn1Hour+30.0;
        minYear1=2016;
        minYear2=2017;

        newCar=(blue&&speed>=expectSpeed&&(year>=minYear1||year>=minYear2));

        System.out.println("    ");                
        System.out.println("mobil baru ini masuk kriteria = "+newCar);           
    }
}