/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 15:03 AM
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class RichaBoolean2{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
        
        String name, crazy;
        int goodFriends, crimRecord, minQtyFriends, minQtyCrime;
        boolean nicePerson, yCrazy, nCrazy;

        minQtyFriends=13;
        minQtyCrime=7;

        System.out.println("Hai kamu ingin tahu kan bagaimana orang menilaimu?");
        System.out.println("Isi Penilaian di bawah ini ya :)");
        System.out.println("                                                                       ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                                                                       ");
        System.out.print("Nama : ");        
        name=keyboard.next();
        System.out.print("berapa teman baik yang kamu punya, "+name+" ? ");
        goodFriends=keyboard.nextInt();
        System.out.print("Apakah kamu pernah melakukan pelanggaran kriminal sebelumnya? kalo iya berapa kali ? ");
        crimRecord=keyboard.nextInt();
        System.out.print("Menurutmu kamu murah senyum atau tidak? (Ya/Tidak) ");
        crazy=keyboard.next();

        yCrazy=crazy.equals("Ya");
        nCrazy=crazy.equals("Tidak");

        nicePerson=(goodFriends>=minQtyFriends&&minQtyCrime<=crimRecord&&yCrazy);

        System.out.println("Baiklah,");
        System.out.println("Apakah "+name+" adalah orang yang baik? Ya "+nicePerson);
        System.out.print("Terimakasih! teruslah menjadi orang yang baik yaa");
                

    }
}