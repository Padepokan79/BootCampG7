/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 21:15 AM     
     * Updated By : 
     * Updated At : 
*/

public class Khairil1{
    public static void main( String[] args){        
        
        double distance, hour, minute, speedHour;

        distance=150.0;
        hour=1.0;
        minute=60*hour;
        speedHour=distance/hour;
        

        System.out.printf("Tuan Nishiyama ingin membuat aplikasi untuk mengukur kecepatan mobil.\n"+
        "Setiap kecepatan memiliki indikasi yang berbeda. Asumsi untuk satuan jarak adalah km,\n"+
        "kecepatan km/jam dan waktu jam, menit. inputan yang kosong hanya ada satu inputan baik itu jaraknya saja,\n"+
        "kecepatannya saja ataupun waktunya saja. Kecepatan maksimum yang bisa diinputkan adalah sebesar 200km/jam.\n");
        System.out.printf("\n");

        System.out.printf("input kecepatan adalah : %.0f Km/jam\n", speedHour);
        

    }
}