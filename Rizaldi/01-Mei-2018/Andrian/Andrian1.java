/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 08:22 AM     
     * Updated By : 
     * Updated At : 
*/

public class Andrian1{
    public static void main( String[] args){        
        int pole, tono, ati, susi, jarak;

        pole=0;
        tono=20;
        ati=4;
        susi=8;        

        jarak=pole+tono;
        jarak=jarak-ati;
        jarak=jarak+susi;

        System.out.printf("Tono berada 20 meter disebelah kiri tiang bendera.\n"+
        "Ati berada 4 meter disebelah kanan tono,\n"+
        "sedangkan susi berada 8 meter disebelah kiri ati.\n"+
        "jika posisi tiang bendera dianggap posisi awal atau titik nol,\n"+
        "berapa meterkah susi dengan tiang bendera ?\n");
        System.out.printf("\n");

        System.out.println("jarak susi dengan tiang bendera adalah : "+jarak+" meter");

    }
}