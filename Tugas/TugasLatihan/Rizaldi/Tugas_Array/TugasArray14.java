/*
 * File           : TugasArray14.java
 * Project Name   : Tugas_Array
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_Array
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 22nd May 2018 10:19:15 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 22nd May 2018 10:43:15 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TugasArray14{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();
        Boolean cek=false;

        int[] arr1= {25,14,56,15,36,56,77,18,29,49,90};
        int[] arr2 = new int[10];
        int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
        int[] arr4 = new int[10];      
        int[] arrTemp= new int[arr1.length];
        int min, max, ind, ind2, indAfter, countDuplicate, totalVal, zero, index1, index2, nummber1, nummber2;
        ind=0;
        ind2=0;
        zero=0;
        nummber1=0;
        nummber2=0;
        totalVal=0;

        System.out.println("============================================");
        System.out.println("Data array 1 adalah : ");
        for(int index:arr1){
            System.out.print(index+" ");
        }
        System.out.println("masukkan index ke 1 : ");
        index1=keyboard.nextInt();
        System.out.println("masukkan index ke 2 : ");
        index2=keyboard.nextInt();
        
        System.out.println(" ");
        System.out.println("Data penukaran adalah : ");

        nummber1=arr1[index1];
        nummber2=arr1[index2];
        for(ind=zero; ind<arr1.length; ind++){

        arr1[index1]=nummber2;
        arr1[index2]=nummber1;

        }
        for(int in:arr1){
            System.out.print(in+" ");
        }
    }
}