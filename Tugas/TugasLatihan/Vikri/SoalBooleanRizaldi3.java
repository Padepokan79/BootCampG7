/*
    Created By Vikri
    13/05/2018
    20:09
*/

import java.util.Scanner;

public class SoalBooleanRizaldi3{
    public static void main( String[] args){
        String siangMalam;
        Double oksigen, udara, temp, umur;    
        boolean kriteria;

        Scanner string = new Scanner(System.in);
        
        System.out.print("Kadar oksigen %? ");
        oksigen=string.nextDouble();

        System.out.print("Udara berapa ton/kubik? ");
        udara=string.nextDouble();

        System.out.print("temperatur? ");
        temp=string.nextDouble();

        System.out.print("Umur Bumi satuan milyar? ");
        umur=string.nextDouble();

        System.out.print("Ada Siang dan Malam (ya/tidak)? ");
        siangMalam=string.next();
        
        kriteria=siangMalam.equals("ya")&&(oksigen >= 20 && oksigen <= 100)&&(udara >= 5000000)&&(temp>=32&&temp<=40)&&(umur>=45&&umur<=200);
        System.out.println("Bisa ditempati? "+kriteria);    

    }
}