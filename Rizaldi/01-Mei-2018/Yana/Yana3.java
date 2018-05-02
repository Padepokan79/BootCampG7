/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 13:57 AM     
     * Updated By : 
     * Updated At : 
*/

public class Yana3{
    public static void main( String[] args){        
        
        float state, intersect1, intersect2, cv79, totdistance, consDistance;
        state=0;
        consDistance=100;
        intersect1=state+300;
        intersect2=intersect1+200;
        cv79=intersect2+250;

        totdistance=cv79;

        float walk, motor, walkTime, motorTime, leftDistance, totalTime;
        walk=120;
        motor=60;
        leftDistance=cv79-intersect2;

        walkTime=intersect2/consDistance*walk;
        motorTime=leftDistance/consDistance*motor;

        totalTime=walkTime+motorTime;

        System.out.printf("Perjalanan dari kosan Arief ke kantor 79 melewati 2 persimpangan, dari kosan ke\n"+
        "persimpangan ke-1 berjarak 300 meter, dari persimpangan ke-1 ke persimpangan\n"+
        "ke-2 berjarak 200 meter, dari persimpangan ke-2 ke kantor 79 berjarak 250\n"+
        "meter. Setiap 100 meter dapat ditempuh selama 120 detik dengan jalan kaki dan\n"+
        "60 detik menggunakan motor. Jika Arief pergi dari kosan ke persimpangan ke-2 dengan\n"+
        "berjalan kaki, kemudian dari persimpangan ke-2 ke kantor 79 menggunakan motor,\n"+
        "berapa waktu tempuh perjalan Arief dari kosan ke kantor 79?\n");
        System.out.printf("\n");

        System.out.println("waktu tempuh perjalan Arief dari kosan ke kantor 79 adalah  : "+totalTime+" detik");

    }
}