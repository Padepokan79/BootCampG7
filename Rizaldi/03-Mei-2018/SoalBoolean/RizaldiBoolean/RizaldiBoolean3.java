/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 11:59 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class RizaldiBoolean3{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
        
        String water, rotation;    
        Double oxygen, temperature, age, airTotal, oxygenContent, oxygenTolerant;
        boolean yesW, noW, yesR, noR, living;
        
        System.out.println("apakah planet ini ada air (yes/no): ");
        water=keyboard.next();

        System.out.println("berapa jumlah O2 planet ini : max 500");
        oxygen=keyboard.nextDouble();

        System.out.println("berapa temperatur planet ini : ");
        temperature=keyboard.nextDouble();

        System.out.println("apakah planet ini ada siang dan malam (yes/no) : ");
        rotation=keyboard.next();

        System.out.println("berapa usia planet ini : ");
        age=keyboard.nextDouble();

        airTotal=500.0;
        oxygenTolerant=20.0;
        oxygenContent=oxygen*20.0/100.0;

        yesW=water.equals("yes");
        noW=water.equals("no");
        yesR=rotation.equals("yes");
        noR=rotation.equals("no");        

        living=(yesW&&yesR&&oxygenContent==oxygenTolerant&&temperature>=32&&temperature<=40&&age>=45&&age<=200);

        System.out.println("Planet ini layak huni : "+living);

    }
}