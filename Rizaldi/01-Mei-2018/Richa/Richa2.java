/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 20:40 AM     
     * Updated By : 
     * Updated At : 
*/

public class Richa2{
    public static void main( String[] args){        
        double sphereArea, totSprint, totSprintArea, minute, timeSpend;

        sphereArea=0.5;
        totSprint=5;
        minute=60;
        totSprintArea=sphereArea*totSprint;

        timeSpend=minute*totSprintArea/totSprint;


        System.out.printf("Seorang anak bernama Oni setiap pagi selalu berolahraga memutari sebuah lapangan dengan keliling 0,5 km.\n"+
        "Apabila dengan kecepatan lari 5 km/jam Oni mampu memutari lapangan sebanyak 5 kali,\n"+
        "berapa lamakah Oni lari setiap paginya?\n");
        System.out.printf("\n");

        System.out.printf("Lama waktu Oni lari setiap pagi adalah : %.0f Menit\n", timeSpend);

    }
}