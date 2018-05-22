/*
 * File           : TugasArray7.java
 * Project Name   : Tugas-Array
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas-Array
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 21st May 2018 9:42:21 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 21st May 2018 9:42:24 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class TugasArray7{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();
        Boolean cek=false;

        int[] arr1={25,14,56,15,36,56,77,18,29,49,90};
        int[] arr2 = new int[10];
        int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
        int[] arr4 = new int[10];      
        int[] arrTemp= new int[arr1.length+1];
        int newVal, indexAdd, ind, res;
        res=0;

        System.out.println("============================================");
        System.out.println("Data array awal memiliki index berjumlah "+arr1.length);        
        for(int index:arr1){
            System.out.print(index+" ");
        }
            System.out.println(" ");
        System.out.println("============================================");
        System.out.print("Masukkan nilai baru               : ");
        newVal = keyboard.nextInt();
        System.out.print("Masukkan index yang ingin diganti : ");
        indexAdd = keyboard.nextInt();
            
        for(ind=0; ind<arrTemp.length; ind++){
            if(ind==indexAdd){
                arrTemp[ind]=newVal;
            }
            else{
                arrTemp[ind]=arr1[res];
                res++;
            }

        }
        for(int ind1:arrTemp){
            System.out.print(ind1+" ");
        }
            System.out.println(" ");
            System.out.print("Jumlah length array : "+arrTemp.length);
        
        
    }
}