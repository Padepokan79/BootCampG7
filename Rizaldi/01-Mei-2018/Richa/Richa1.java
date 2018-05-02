/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 20:30 AM     
     * Updated By : 
     * Updated At : 
*/

public class Richa1{
    public static void main( String[] args){        
        double hour, toMinute, distance, late, speed, lateTime;

        hour=1.0;
        toMinute=hour*60;
        distance=30;
        late=toMinute-10;        

        lateTime=late/toMinute;

        speed=distance/lateTime;
        

        System.out.printf("Seseorang mengendarai mobil ke tempat kerjanya selama 1 jam dengan jarak 30 km.\n"+
        "Jika dia terlambat berangkat 10 menit, kecepatan yang harus digunakan agar sampai ke kantor adalah ?\n");
        System.out.printf("\n");

        System.out.printf("kecepatan yang harus digunakan agar sampai ke kantor adalah : %.0f KM\n", speed);

    }
}