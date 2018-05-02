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
        
        Double moneyDiff, aniRatio, budiRatio, diffRatio, aniMoney, budiMoney, totMoney, a, b, total;

        // A = ani, B = Budi
        // A selisih B = 7500
        // 10% A + B = 80% A 
        // B = 70% A
        
        // A-70%A=7500
        // A*0.3=7500
        // A=7500/3
        // A = 2500

        //
        total = 42500.0;
        moneyDiff=7500.0;
        a = moneyDiff/0.3;
        b = total-a;

        // diffRatio=aniRatio-budiRatio;
        // aniMoney=aniRatio*moneyDiff/diffRatio;
        // budiMoney=budiRatio*moneyDiff/diffRatio;
        // totMoney=aniMoney+budiMoney;

        System.out.printf("Selisih uang Ani dan Budi adalah 7500.\n"+
        "Jika 10 persen uang Ani diberikan kepada Budi, maka uang Budi menjadi 80 persen uang Ani semula.\n"+
        "Berapa jumlah uang keduanya?\n");
        System.out.printf("\n");

        System.out.printf("Uang ani adalah              : %.0f Rupiah\n", a);
        System.out.printf("Uang budi adalah             : %.0f Rupiah\n", b);
        System.out.printf("Jumlah uang keduanya adalah  : %.0f Rupiah\n", total);

    }
}