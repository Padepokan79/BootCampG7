/*
 * File           : TugasArray2.java
 * Project Name   : Tugas-Array
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas-Array
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 21st May 2018 3:15:40 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 21st May 2018 3:27:16 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class TugasArray2{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();

        int[] arr1={25,14,56,15,36,56,77,18,29,49};        
        int total,avg;

        System.out.println("============================================");
        total=0;
        avg=0;
        for(int index=0; index<arr1.length; index++){
            
            total+=arr1[index];
            avg=total/arr1.length;
            
        }
        System.out.println("jumlah dari arr1 adalah : "+total);
        System.out.println("rata-rata arr1 adalah   : "+avg);

    }
}