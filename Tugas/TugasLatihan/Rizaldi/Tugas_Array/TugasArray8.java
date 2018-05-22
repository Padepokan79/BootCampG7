/*
 * File           : TugasArray8.java
 * Project Name   : Tugas-Array
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas-Array
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 21st May 2018 10:09:39 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 21st May 2018 10:09:46 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class TugasArray8{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();
        Boolean cek=false;

        int[] arr1={25,14,56,15,36,56,77,18,29,49};
        int[] arr2 = new int[10];
        int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
        int[] arr4 = new int[10];      
        int[] arrTemp= new int[arr1.length+1];
        int newVal, indexAdd;

        System.out.println("============================================");
        System.out.println("Data array awal memiliki index berjumlah "+arr1.length);
        for(int index:arr1){
            System.out.print(index+" ");
        }

        arr2=arr1;

        System.out.println(" ");
        System.out.println("============================================");
        System.out.println("Data array baru memiliki index berjumlah "+arr2.length);
        for(int index:arr2){
            System.out.print(index+" ");
        }
        
    }
}