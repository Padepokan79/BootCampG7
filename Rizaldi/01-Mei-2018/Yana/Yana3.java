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
        System.out.println("waktu tempuh perjalan Arief dari kosan ke kantor 79 adalah  : "+totalTime+" detik");

    }
}