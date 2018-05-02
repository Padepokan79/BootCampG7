/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 14:47 AM     
     * Updated By : 
     * Updated At : 
*/

public class Arief2{
    public static void main( String[] args){        
        
        int shop, daysAweek;
        float helmA, helmB, helmC;

        shop=5;
        daysAweek=7;

        helmA=250000;
        helmB=50000;
        helmC=650000;

        float totalSoldHelm;
        totalSoldHelm=helmA+helmB+helmC;
        totalSoldHelm=totalSoldHelm*shop;
        totalSoldHelm=totalSoldHelm*daysAweek;

        System.out.printf("Ucup memiliki 5 buah toko helm, dalam sehari setiap toko helmnya berhasil menjual sebanyak 3 buah helm dengan masing-masing harga helmnya,\n"+
        "Rp. 250.000 Helm A, Rp. 50.000 Helm B, Rp. 650.000 Helm C.\n"+
        "Berapa hasil penjualan Helm dalam 1 minggu?\n");
        System.out.printf("\n");

        System.out.printf("hasil penjualan Helm dalam 1 minggu adalah : Rp %.2f\n", totalSoldHelm);

    }
}