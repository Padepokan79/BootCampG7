/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 14:13 AM
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class KhairilBoolean2{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
        
        Double bread, jam, raisin, butter, qtyBread, qtyButter, qtyJam, qtyRaisin, costBread, costButter, costJam, costRaisin, totalCost, minQty, maxCost, totalQty, maxQtyBread, maxQtyButter;        
        boolean shoping, condition1, condition2;

        System.out.println("Berapa jumlah roti yang anda beli : ");        
        qtyBread=keyboard.nextDouble();
        System.out.println("Berapa jumlah selai yang anda beli : ");        
        qtyJam=keyboard.nextDouble();
        System.out.println("Berapa jumlah kismis yang anda beli : ");        
        qtyRaisin=keyboard.nextDouble();
        System.out.println("Berapa jumlah mentega yang anda beli : ");        
        qtyButter=keyboard.nextDouble();
        
        bread=15000.0;
        jam=8500.0;
        raisin=7500.0;
        butter=3500.0;
        minQty=4.0;
        maxCost=100000.0;
        maxQtyBread=1.0;
        maxQtyButter=1.0;

        totalQty=qtyBread+qtyButter+qtyJam+qtyRaisin;

        costBread=bread*qtyBread;
        costButter=butter*qtyButter;
        costJam=jam*qtyJam;
        costRaisin=raisin*qtyRaisin;
        totalCost=costBread+costButter+costJam+costRaisin;
        
        condition1=((totalQty>=minQty)&&(totalCost<=maxCost));
        condition2=(qtyBread<=maxQtyBread&&qtyButter<=maxQtyButter);
        shoping=(condition1&&condition2);
        
        System.out.println("    ");        
        System.out.println("kriteria memnuhi untuk belanja ? "+shoping);
        System.out.printf("dengan total belanjaan seharga : Rp %.2f\n",totalCost);
        System.out.printf("dengan total item sebanyak : %.0f\n",totalQty);
        
                

    }
}