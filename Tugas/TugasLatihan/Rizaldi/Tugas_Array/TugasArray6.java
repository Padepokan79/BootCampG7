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
        int ind, count=0;

        int[] arr1={25,14,56,15,36,56,77,18,29,49};
        int[] arr2 = new int[10];
        int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
        int[] arr4 = new int[10];      
        int[] arrTemp= new int[arr1.length-1];
        int index, indexDel, res;
        res=0;

        System.out.println("============================================");
        System.out.println("Data array awal memiliki index berjumlah : "+arr1.length);        
        for(index=0; index<arr1.length; index++){
            System.out.print(arr1[index]+" ");
        }
            System.out.println(" ");

        System.out.println("============================================");
        System.out.print("Masukkan index yang ingin dihapus : ");
        indexDel = keyboard.nextInt();

        for(ind=0; ind<arrTemp.length; ind++){
            if(ind==indexDel){
                arrTemp[ind]=arr1[ind];
                res++;
            }
            for(int a=0; a<indexDel; a++){
                arrTemp[a]=arr1[a];
            }
            for(int b=res; b<arrTemp.length; b++){
                arrTemp[res]=arr1[res];
            }
            
        }
        for(int ind2:arrTemp){
            System.out.print(ind2+" ");
        }

           //==================================== 
        // // arr1[indexDel]=(int)(0);
        // for(ind=0; ind<arr1.length; ind++){
        //     if(ind==indexDel){
        //         for(int ind2=ind; ind2<(arr1.length-1); ind2++){
        //             arr1[ind2]=arr1[ind2+1];
        //         }
        //         count++;
        //         break;
        //     }            
        // }
        // // for(int i:arr1){
            
        // //     System.out.println(i);
        // // }
        // if(count==0){
        //     System.out.println("Index tidak ada !!!");
        // }
        // else{
        //     System.out.println("Yeaaaay index terhapus !!!");
        //     System.out.println("Data Array baru adalah : ");
        //     for(ind=0; ind<arr1.length-1; ind++){
        //         System.out.print(arr1[ind]+" ");

        //     }
            
        // }
        
    }
}