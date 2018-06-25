/*
    Created By Vikri
    13/05/2018
    20:09
*/

import java.util.Scanner;

public class SoalBooleanRizaldi2{
    public static void main( String[] args){
        String makan, minum, berak;    
        boolean tidur;

        Scanner string = new Scanner(System.in);
        
        System.out.print("kucing saskehh makan apa? ");
        makan=string.next();

        System.out.print("kucing saskehh minum air apa? ");
        minum=string.next();

        System.out.print("saskehh berak di? ");
        berak=string.next();
        
        tidur=(makan.equals("rumput")||makan.equals("dedak"))&&minum.equals("hujan")&&berak.equals("pasir");

        System.out.println("kucing saskehh bisa tidur? "+tidur);    

    }
}