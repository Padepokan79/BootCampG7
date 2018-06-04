/*
 * File           : TugasArray15.java
 * Project Name   : Tugas_Array
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_Array
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 22nd May 2018 10:43:09 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 22nd May 2018 10:43:29 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TugasArray15{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();
        Boolean cek=false;

        int[] arr1= {25,14,56,15,36,56,77,18,29,49,90};
        int[] arr2 = new int[10];
        int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
        int[] arr4 = new int[10];      
        int[] arrTemp= new int[arr1.length];
        
        int tempVar=0;

        
        System.out.println("Data array 1 adalah : ");
        for(int index:arr1){
            System.out.print(index+" ");
        }
        
        System.out.println(" ");
        System.out.println("============================================");
        System.out.println(" ");
        System.out.println("Data array hasil sorting dari terkecil : ");
        
        for (int ind = 0; ind < arr1.length; ind++){
            for(int ind2=ind+1; ind2 < arr1.length; ind2++){
                if(arr1[ind] > arr1[ind2]){
                        tempVar = arr1 [ind2];
                        arr1 [ind2]= arr1 [ind];
                        arr1 [ind] = tempVar;
                }
            }
            // ind=arr1.length; // SEGEL BAHAYA
        }
        for (int ind = 0; ind < arr1.length; ind++){
            System.out.print(arr1[ind]+" ");
        }

        System.out.println(" ");
        System.out.println("============================================");
        System.out.println(" ");
        System.out.println("Data array hasil sorting dari terbesar : ");
        
        for (int ind = 0; ind < arr1.length; ind++){
            for(int ind2=ind+1; ind2 < arr1.length; ind2++){
                if(arr1[ind] < arr1[ind2]){
                        tempVar = arr1 [ind2];
                        arr1 [ind2]= arr1 [ind];
                        arr1 [ind] = tempVar;
                }
            }
            // ind=arr1.length; // SEGEL BAHAYA
        }
        for (int ind = 0; ind < arr1.length; ind++){
            System.out.print(arr1[ind]+" ");
        }

    }
}