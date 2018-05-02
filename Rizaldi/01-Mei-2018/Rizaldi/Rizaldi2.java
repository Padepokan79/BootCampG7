/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 21:50 AM     
     * Updated By : 
     * Updated At : 
*/

public class Rizaldi2{
    public static void main( String[] args){        
        
        double dailyMoney, guitarPrice, days80Money, labWork, lastMoney, moneyRemnant, daysRemnant;

        dailyMoney=2000.0;
        guitarPrice=245000.0;
        labWork=100000.0;
        days80Money=dailyMoney*80.0;

        lastMoney=days80Money-labWork;
        moneyRemnant=guitarPrice-lastMoney;

        daysRemnant=moneyRemnant/dailyMoney;

        System.out.printf("adi menabung perhari sebesar 2000 rupiah. dia hendak membeli gitar seharga 245.000 rupiah\n"+
        "dari hasil tabungan nya itu. disaat hari ke 80 adi memakai uang tabungannya sebanyak 100.000 rupiah untuk mengikuti praktikum.\n"+
        "berapa hari lagi agar adi bisa membeli gitar dari hasil tabungan dan sisa uang nya tersebut ?\n");
        System.out.printf("\n");

        System.out.println("jumlah hari agar bisa membeli gitar adalah  : "+daysRemnant+" hari");
        
        

    }
}