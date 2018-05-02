/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 20:50 AM     
     * Updated By : 
     * Updated At : 
*/

public class Richa3{
    public static void main( String[] args){        
        // pusing soalnya :v :v :v
        Double moneyDiff, aniRatio, budiRatio, diffRatio, aniMoney, budiMoney, totMoney;

        moneyDiff=7500.0;
        aniRatio=90.0;
        budiRatio=80.0;

        diffRatio=aniRatio-budiRatio;
        aniMoney=aniRatio*moneyDiff/diffRatio;
        budiMoney=budiRatio*moneyDiff/diffRatio;
        totMoney=aniMoney+budiMoney;

        System.out.printf("Selisih uang Ani dan Budi adalah 7500.\n"+
        "Jika 10 persen uang Ani diberikan kepada Budi, maka uang Budi menjadi 80 persen uang Ani semula.\n"+
        "Berapa jumlah uang keduanya?\n");
        System.out.printf("\n");

        System.out.printf("Uang ani adalah              : %.0f Rupiah\n", aniMoney);
        System.out.printf("Uang budi adalah             : %.0f Rupiah\n", budiMoney);
        System.out.printf("Jumlah uang keduanya adalah  : %.0f Rupiah\n", totMoney);

    }
}