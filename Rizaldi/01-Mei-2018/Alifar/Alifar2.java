/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 19:10 AM     
     * Updated By : 
     * Updated At : 
*/

public class Alifar2{
    public static void main( String[] args){        
        
        double housePrice, stHouse, ndHouse, totalMoney, stHouseSold, ndHouseSold;

        housePrice=60000000.0;
        stHouse=housePrice*30.0/100.0;
        ndHouse=housePrice*15.0/100.0;
        
        stHouseSold=housePrice+stHouse;
        ndHouseSold=housePrice-ndHouse;

        totalMoney=stHouseSold+ndHouseSold;


        System.out.printf("Pak Ryu ingin menjual dua buah rumah yang harga beli nya sebesar 60 juta rupiah.\n"+
        "Rumah pertama berhasil dijualnya dengan untung sebesar 30 persen.\n"+
        "Namun rumah keduanya harus terpaksa dijual dengan harga 15 persen lebih murah dari harga belinya.\n"+
        "Berapa total uang yang didapatkan oleh Pak Ryu?\n");
        System.out.printf("\n");

        System.out.printf("total uang yang didapatkan oleh Pak Ryu adalah : Rp %.0f\n", totalMoney);

    }
}