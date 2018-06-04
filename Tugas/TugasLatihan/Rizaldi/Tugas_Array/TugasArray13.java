/*
 * File           : TugasArray13.java
 * Project Name   : Tugas_Array
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_Array
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 22nd May 2018 10:00:33 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 22nd May 2018 10:00:35 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TugasArray13{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();
        Boolean cek=false;

        int[] arr1= {25,14,56,15,36,56,77,18,29,49};
        int[] arr2 = new int[10];
        int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
        int[] arr4 = new int[10];      
        int[] arrTemp= new int[arr1.length];
        int min, max, ind, ind2, indAfter, countDuplicate, totalVal, zero;
        ind=0;
        ind2=0;
        zero=0;
        
        totalVal=0;

        System.out.println("============================================");
        System.out.println("Data array 1 adalah : ");
        for(int index:arr1){
            System.out.print(index+" ");
        }
        System.out.println(" ");
        System.out.println("Data array 3 adalah : ");
        for(int index:arr3){
            System.out.print(index+" ");
        }
        
        
        System.out.println(" ");
        System.out.println("Data hasil penjumlahan arr1 dan arr3 : ");

        for(ind=zero; ind<arr1.length; ind++){
            for(ind2=zero; ind2<arr3.length; ind2++){
                totalVal=arr1[ind]+arr3[ind];
                arr4[ind]=totalVal;
            }
            // ind=arr1.length; // SEGEL BAHAYA JANGAN DIBUKA !!!
        }
        for(int in:arr4){
            System.out.print(in+" ");
        }
    }
}