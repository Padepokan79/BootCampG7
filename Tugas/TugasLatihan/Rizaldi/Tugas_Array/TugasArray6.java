/*
 * File           : TugasArray6.java
 * Project Name   : Tugas-Array
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas-Array
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 21st May 2018 8:06:50 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 21st May 2018 8:06:54 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class TugasArray6{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();
        Boolean cek=false;
        

        int[] arr1={25,14,56,15,36,56,77,18,29,49};
        int[] arr2 = new int[10];
        int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
        int[] arr4 = new int[10];      
        int[] arrTemp= new int[arr1.length-1];
        int index, indexDel, res, indexAdd, ind;
        ind=0;
        res=0;
        

        System.out.println("============================================");
        System.out.println("Data array awal memiliki index berjumlah : "+arr1.length);        
        for(index=0; index<arr1.length; index++){
            System.out.print(arr1[index]+" ");
        }
            System.out.println(" ");

        System.out.println("============================================");
        System.out.print("Masukkan index yang ingin dihapus : ");
        indexAdd = keyboard.nextInt();

        for(ind=0; ind<arr1.length; ind++){
            if(ind!=indexAdd){
                arrTemp[res]=arr1[ind];
                res++;
            }

        }

        for(int ind2:arrTemp){
            System.out.print(ind2+" ");
        }

    }
}