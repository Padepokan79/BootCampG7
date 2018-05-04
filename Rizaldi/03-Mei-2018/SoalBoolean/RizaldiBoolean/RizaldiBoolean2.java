/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 11:06 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class RizaldiBoolean2{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
        
        String eat, drink, pooPlace;    
        boolean sleep, grass, dedak, rain, sand;
        
        System.out.println("apa yang kucing sasuke makan : ");
        eat=keyboard.next();

        System.out.println("apa yang kucing sasuke minum : ");
        drink=keyLine.nextLine();

        System.out.println("Dimana kucing sasuke berak : ");
        pooPlace=keyboard.next();

        grass=eat.equals("rumput");
        dedak=eat.equals("dedak");
        rain=drink.equals("air hujan");
        sand=pooPlace.equals("pasir");        

        sleep=((grass||dedak)&&rain&&sand);

        System.out.println("kucing sasuke bisa tidur : "+sleep);

    }
}