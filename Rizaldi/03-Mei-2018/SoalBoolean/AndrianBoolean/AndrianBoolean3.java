/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 20:20
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class AndrianBoolean3{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
                
        String renovated;
        int floorQty, carQty, poolQty, floraQty, minFloor, minCar, minPool, minFlora, minFloraCondition2;
        Double houseWide, minHouseWide, minHouseWideCondition3;
        boolean acceptedHouse, renovatedY, condition1, condition2, condition3;

        System.out.println("sebutkan luas rumah yang diinginkan (hektare) : ");        
        houseWide=keyboard.nextDouble();                                        
        // System.out.println("apakah rumahnya bisa direnovasi (Y/T) : ");        
        // renovated=keyboard.next();                 
        System.out.println("berapa lantai yang ingin anda buat : ");        
        floorQty=keyboard.nextInt();                 
        System.out.println("berapa mobil yang ingin anda tampung di garasi : ");        
        carQty=keyboard.nextInt();                 
        System.out.println("berapa kolam renang yang ingin anda bangun : ");        
        poolQty=keyboard.nextInt();                 
        System.out.println("berapa jenis flora subtropis yang ingin anda tampung : ");        
        floraQty=keyboard.nextInt();                 
        
        minHouseWide=0.3;
        minHouseWideCondition3=0.7;
        minFloor=3;
        minCar=3;
        minPool=2;
        minFlora=5;
        minFloraCondition2=8;

        renovatedY=renovated.equals("Y");
        
        condition1=(houseWide>minHouseWide&&floorQty>minFloor&&carQty>minCar&&poolQty>=minPool&&floraQty>=minFlora);
        condition2=(houseWide>minHouseWide&&floorQty>minFloor&&carQty>minCar&&poolQty<minPool&&floraQty>=minFloraCondition2);
        condition3=(houseWide>minHouseWideCondition3&&floorQty<minFloor&&carQty>minCar&&poolQty>=minPool&&floraQty>=minFlora);

        acceptedHouse=(condition1||condition2||condition3);

        System.out.println("    ");                
        System.out.println("Spesifikasi rumah cocok seperti yang diinginkan = "+acceptedHouse);           
    }
}