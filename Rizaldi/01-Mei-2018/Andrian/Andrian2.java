/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 08:44 AM     
     * Updated By : 
     * Updated At : 
*/

public class Andrian2{
    public static void main( String[] args){        
        int salesToday, salesYesterday, netto, inventory, totalNetto, totalSales, lastStock;

        netto=50;
        inventory=12;
        salesToday=175;
        salesYesterday=120;

        totalNetto=netto*inventory;
        totalSales=salesToday+salesYesterday;

        lastStock=totalNetto-totalSales;


        System.out.println("sisa beras di warung Bu Poniem sekarang adalah : "+lastStock+" Kg");

    }
}