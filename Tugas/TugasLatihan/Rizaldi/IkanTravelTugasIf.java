/*
 * File           : IkanTravelTugasIf.java
 * Project Name   : Rizaldi
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 14th May 2018 8:25:17 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 14th May 2018 8:25:22 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class IkanTravel{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        int capacity, passQty, tmp, qtyNeeded, divMod, qty60, qty45, qty32, qty18, qty12, qty6, qty1, passMax;
        Double price60, price45, price32, price18, price12, price6, price;

        price60=2300000.0;
        price45=2000000.0;
        price32=1800000.0;
        price18=1500000.0;
        price12=1300000.0;
        price6=2000000.0;
        passMax=120;
        qty60=60;
        qty45=45;
        qty32=32;
        qty18=18;
        qty12=12;
        qty6=6;
        qty1=1;
        tmp=0;
                
        System.out.println("Masukkan jumlah penumpang : ");
        passQty=keyboard.nextInt();        
        System.out.println("");

        System.out.println("Bus yang tersedia untuk Anda :");
        System.out.println("");

        if(passQty<=passMax){
            if(passQty>=qty60){        
            System.out.println("Bis dengan Kursi 60 dengan harga : Rp "+price60);
            }
            if(passQty>=qty45){            
                System.out.println("Bis dengan Kursi 45 dengan harga :      Rp "+price45);
            }
            if(passQty>=qty32){            
                System.out.println("Bis dengan Kursi 32 dengan harga :      Rp "+price32);
            }
            if(passQty>=qty18){            
                System.out.println("Bis dengan Kursi 18 dengan harga :      Rp "+price18);
            }
            if(passQty>=qty12){            
                System.out.println("Bis dengan Kursi 12 dengan harga :      Rp "+price12);
            }
            if(passQty>=qty6 || passQty<=qty6){        
                System.out.println("Bis dengan Kursi 6 dengan harga  :      Rp "+price6);
            }

            System.out.println("\nRekomendasi pilihan Bis :");
            // start recomendation that capable with the input of qtyPass
            if(passQty>=qty1&&passQty<=qty6){
                price = price6;
				System.out.println("1 Bis dengan jumlah kursi " +qty6+ " dengan harga Rp " +price);
            }
            else if(passQty>qty6&&passQty<qty12){
                price = price6;
				System.out.println("2 Bis dengan jumlah kursi " +qty6+ " dengan harga Rp " +(price+price));
            }
            else if(passQty==qty12){
                price = price12;
				System.out.println("1 Bis dengan jumlah kursi " +qty12+ " dengan harga Rp " +(price));
            }
            else if(passQty>qty12&&passQty<qty18){
                price = price12;
				System.out.println("2 Bis dengan jumlah kursi " +qty12+ " dengan harga Rp " +(price+price));
            }
            else if(passQty==qty18){
                price = price18;
				System.out.println("1 Bis dengan jumlah kursi " +qty18+ " dengan harga Rp " +(price));
            }
            else if(passQty>qty18&&passQty<=(qty12+qty12)){
                price = price12;
				System.out.println("2 Bis dengan jumlah kursi " +qty12+ " dengan harga Rp " +(price+price));
            }
            else if(passQty>(qty12+qty12)&&passQty<=(qty12+qty18)){
                price = price12;
				System.out.println("1 Bis dengan jumlah kursi " +qty12+ " dan 1 bis dengan jumlah kursi "+qty18+" seharga Rp "+(price+price18));
            }
            else if(passQty<qty32){
                price = price18;
				System.out.println("2 Bis dengan jumlah kursi " +qty18+ " seharga "+(price+price));
            }
            else if(passQty==qty32){
                price = price32;
				System.out.println("1 Bis dengan jumlah kursi " +qty32+ " seharga "+price);
            }
            else if(passQty>qty32&&passQty<=(qty18+qty18)){
                price = price18;
				System.out.println("2 Bis dengan jumlah kursi " +qty18+ " seharga "+(price+price));
            }
            else if(passQty>(qty18+qty18)&&passQty<qty45){
                price = price32;
				System.out.println("1 Bis dengan jumlah kursi " +qty12+ "dan 1 bis dengan jumlah kursi "+qty32+" seharga Rp "+(price+price12));
            }
            else if(passQty==qty45){
                price = price45;
				System.out.println("1 Bis dengan jumlah kursi " +qty45+ " seharga "+price);
            }
            else if(passQty>qty45&&passQty<=(qty32+qty18)){
                price = price45;
				System.out.println("1 Bis dengan jumlah kursi " +qty18+ " dan 1 bis dengan jumlah kursi "+qty32+" seharga Rp "+(price18+price32));
				System.out.println(" atau ");
				System.out.println("1 Bis dengan jumlah kursi " +qty12+ " dan 1 bis dengan jumlah kursi "+qty45+" seharga Rp "+(price12+price45));
            }
            else if(passQty>(qty32+qty18)&&passQty<=(qty45+qty12)){
                price = price45;
				System.out.println("1 Bis dengan jumlah kursi " +qty12+ " dan 1 bis dengan jumlah kursi "+qty45+" seharga Rp "+(price12+price45));
            }
            else if(passQty>(qty45+qty12)&&passQty<qty60){
                price = price45;
				System.out.println("1 Bis dengan jumlah kursi " +qty18+ " dan 1 bis dengan jumlah kursi "+qty45+" seharga Rp "+(price18+price45));
            }
            else if(passQty==qty60){
                price = price60;
				System.out.println("1 Bis dengan jumlah kursi " +qty60+ " seharga "+price60);
            }
            else if(passQty>qty60&&passQty<=(qty45+qty18)){
                price = price45;
				System.out.println("1 Bis dengan jumlah kursi " +qty18+ " dan 1 bis dengan jumlah kursi "+qty45+" seharga Rp "+(price18+price45));
            }
            else if(passQty==(qty32+qty32)){
                price = price60;
				System.out.println("2 Bis dengan jumlah kursi " +qty32+ " seharga "+(price32+price32));
				System.out.println(" atau ");
				System.out.println("1 Bis dengan jumlah kursi " +qty12+ " dan 1 bis dengan jumlah kursi "+qty60+" seharga Rp "+(price12+price60));
            }
            else if(passQty>(qty32+qty32)&&passQty<=(qty12+qty60)){
                price = price60;
				System.out.println("1 Bis dengan jumlah kursi " +qty12+ " dan 1 bis dengan jumlah kursi "+qty60+" seharga Rp "+(price12+price60));
            }
            else if(passQty>(qty12+qty60)&&passQty<(qty60+qty18)){
                price = price60;
				System.out.println("1 Bis dengan jumlah kursi " +qty18+ " dan 1 bis dengan jumlah kursi "+qty60+" seharga Rp "+(price18+price60));
				System.out.println(" atau ");
				System.out.println("1 Bis dengan jumlah kursi " +qty32+ " dan 1 bis dengan jumlah kursi "+qty45+" seharga Rp "+(price45+price32));
            }
            else if(passQty==(qty60+qty18)){
                price = price60;
				System.out.println("1 Bis dengan jumlah kursi " +qty18+ " dan 1 bis dengan jumlah kursi "+qty60+" seharga Rp "+(price18+price60));
            }
            else if(passQty>(qty60+qty18)&&passQty<=(qty45+qty45)){
                price = price60;
				System.out.println("2 Bis dengan jumlah kursi " +qty45+ " seharga "+(price45+price45));
            }
            else if(passQty>(qty45+qty45)&&passQty<=(qty32+qty60)){
                price = price60;
				System.out.println("1 Bis dengan jumlah kursi " +qty32+ " dan 1 bis dengan jumlah kursi "+qty60+" seharga Rp "+(price32+price60));
            }
            else if(passQty>(qty60+qty32)&&passQty<=(qty60+qty45)){
                price = price60;
				System.out.println("1 Bis dengan jumlah kursi " +qty45+ " dan 1 bis dengan jumlah kursi "+qty60+" seharga Rp "+(price45+price60));
            }
            else if(passQty>(qty60+qty45)&&passQty<=(qty60+qty60)){
                price = price60;
				System.out.println("2 Bis dengan jumlah kursi " +qty60+ " seharga "+(price60+price60));
            }
        }
        else{
            System.out.println("Masukkan jumlah penumpang 1-120 orang");
        }
    }
}