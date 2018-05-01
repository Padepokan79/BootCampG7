/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 15:06 AM     
     * Updated By : 
     * Updated At : 
*/

public class Alifar1{
    public static void main( String[] args){        
        
        Double sPipe, bPipe, minute, bPipeTime, sPipeTime, bakLiter;

        sPipe=10.0;
        bPipe=15.0;
        minute=1.0;
        bPipeTime=0.8*minute;
        bakLiter=bPipe*bPipeTime;

        sPipeTime=bPipeTime*bakLiter;
        sPipeTime=bakLiter/sPipeTime;






        System.out.printf("waktu yang dibutuhkan untuk mengisi bak menggunakan pipa kecil adalah : %.2f\n", sPipeTime);

    }
}