/*
 * File           : TugasArray9.java
 * Project Name   : Tugas_Array
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_Array
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 22nd May 2018 5:06:51 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 22nd May 2018 5:06:55 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TugasArray9{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();
        Boolean cek=false;

        int[] arr1={25,14,56,15,36,56,77,18,29,49};
        int[] arr2 = new int[10];
        int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
        int[] arr4 = new int[10];      
        int[] arrTemp= new int[arr1.length+1];
        int min, max, index1;

        System.out.println("============================================");
        System.out.println("Data array adalah : ");
        for(int index:arr1){
            System.out.print(index+" ");
        }

        Arrays.sort(arr1);
        System.out.println(" ");
        System.out.println("nilai terkecil adalah : "+arr1[0]);
        
        //======================================
        // System.out.println(" ");
        // min=Arrays.stream(arr1).min().getAsInt();
        // max=Arrays.stream(arr1).max().getAsInt();
        
        // System.out.println("Data array terkecil : "+min);
        // System.out.println("Data array terbesar : "+max);
        
    }
}