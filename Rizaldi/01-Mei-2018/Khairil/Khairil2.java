/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 21:20 AM     
     * Updated By : 
     * Updated At : 
*/

public class Khairil2{
    public static void main( String[] args){        
        
        double phi1, phi2, r1, r2, s1, s2;

        phi1=22.0/7.0;        
        r1=14.0;
        r2=40.0;

        s1=phi1*(r1*r1);
        // radius ke dua
        phi1=3.14;
        s2=phi1*(r2*r2);

        System.out.printf("Seorang guru sedang mengajarkan kepada muridnya untuk menghitung luas lingkaran.\n"+
        "Setiap masing-masing lingkaran memiliki perhitungan yang berbeda.\n"+
        "apabila jari-jari memiliki ukuran kelipatan 7 maka pergunakan konstanta phi = 22/7,\n"+
        "dan apabila bukan kelipatan 7 maka pergunakan konstanta phi = 3,14.\n");
        System.out.printf("\n");
        
        System.out.printf("keliling lingkaran untuk r = 14 adalah : %.0f  meter\n", s1);
        System.out.printf("keliling lingkaran untuk r = 40 adalah : %.0f  meter", s2);
        

    }
}