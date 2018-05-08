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

public class AlifharBoolean3{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
                
        int correctAnsw, wrongAnsw, nullAnsw, cute, qtyQuest, passedVal, correctVal, wrongVal, nullVal, totalValue, minCute;
        String pencType, hair;
        Boolean descipline, passed, pen2B, srtHair;

        System.out.println("+---------------------------------------------------------------+");        
        System.out.println("Jawaban benar  : ");        
        correctAnsw=keyboard.nextInt();                                        
        System.out.println("Jawaban salah  : ");        
        wrongAnsw=keyboard.nextInt();                                        
        System.out.println("Jawaban kosong  : ");        
        nullAnsw=keyboard.nextInt();                                        
        System.out.println("Pensil yang digunakan  : (HB/2B/3B/4B/5B/6B)");        
        pencType=keyboard.next();                                        
        System.out.println("Skala Kerapian  : (0 sampai 10) ");        
        cute=keyboard.nextInt();                                        
        System.out.println("rambut   : (panjang/pendek) ");        
        hair=keyboard.next();                                        
        System.out.println("+---------------------------------------------------------------+");        

        qtyQuest=60;
        passedVal=130;
        correctVal=4;
        wrongVal=-1;
        nullVal=0;
        minCute=8;        

        pen2B=pencType.equals("2B");
        srtHair=hair.equals("pendek");

        totalValue=((correctAnsw*correctVal)+(wrongAnsw*wrongVal)+(nullAnsw*nullVal));
        descipline=(pen2B&&cute>=minCute||srtHair);
        passed=(totalValue>passedVal&&descipline);

        System.out.println("    ");                        
        System.out.println("Total nilai : "+totalValue);           
        System.out.println("kedisiplinan : "+descipline);           
        System.out.println("Anda lulus : "+passed);
        System.out.println("+---------------------------------------------------------------+");                   
    }
}