/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 16 May 2018 08:30 
     * Updated By : 
     * Updated At : 
*/


import java.util.Scanner;

public class AriefSoalIf1{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);

        int ram, hdd, minWallet, maxWallet, minRam, minHdd;
        Double processor, price;
        String name;

        minWallet=7000000;
        maxWallet=10000000;
        minRam=8;
        minHdd=500;

        System.out.println("======================================================");
        System.out.print("Merek\t: ");
        name=keyboard.next();
        System.out.print("RAM\t: ");
        ram=keyboard.nextInt();
        System.out.print("HDD  (giga)\t: ");
        hdd=keyboard.nextInt();
        System.out.print("Processor\t: ");
        processor=keyboard.nextDouble();
        System.out.print("Harga\t: ");
        price=keyboard.nextDouble();
        System.out.println("======================================================");
        
        if(name.equals("SAMSUNG")){
            System.out.println("Status  :   Anda Fanboy");
        }
        if((price >= minWallet && price <= maxWallet) && (ram >= minRam) && (hdd >= minHdd) && (processor >= 2.8 && processor <= 3.5)){
            System.out.println("Status  :   Setuju untuk dibeli");
        }
        if(ram < minRam && hdd < minHdd){
            System.out.println("Status  :   Laptop Ngelag");
        }
        if(name.equals("SAMSUNG") && price > maxWallet){
            System.out.println("Status  :   Anda Sultan Fanboy");
        }
        
        


        
    }
}