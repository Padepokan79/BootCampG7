/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 21:40 AM     
     * Updated By : 
     * Updated At : 
*/

public class Rizaldi1{
    public static void main( String[] args){        
        Double qtyBread, qtyWater, hungry, thirsty, eat, drink;

        qtyBread=20.0;
        qtyWater=20.0;
        hungry=15.0;
        thirsty=15.0/2.0;

        eat=qtyBread-hungry;
        drink=qtyWater-thirsty;

        System.out.printf("Adi membeli 20 bungkus roti dan 20 botol air mineral,\n"+
        "jika lapar adi memakan 1 bungkus roti dan 1/2 botol air mineral.\n"+
        "berapa sisa roti dan air mineral jika adi merasa lapar 15 kali. ?\n");
        System.out.printf("\n");
        
        System.out.printf("Sisa roti adalah         : %.0f buah\n",eat);
        System.out.printf("Sisa air Mineral adalah  : %.1f botol\n",drink);
        
        

    }
}