/*
 * File           : TugasArray5,java
 * Project Name   : Tugas-Array
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas-Array
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 21st May 2018 3:49:39 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 21st May 2018 3:49:53 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class TugasArray5{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();
        Boolean cek=false;

        int[] arr1={25,14,56,15,36,56,77,18,29,49};
        int[] arr2 = new int[10];
        int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
        int[] arr4 = new int[10];      
        int newVal, indexChange;

        System.out.println("============================================");
        System.out.println("Data array awal :");
        for(int index:arr1){
            System.out.print(index+" ");
        }
            System.out.println(" ");
        System.out.println("============================================");
        System.out.print("Masukkan nilai pengganti          : ");
        newVal = keyboard.nextInt();
        System.out.print("Masukkan index yang ingin diganti : ");
        indexChange = keyboard.nextInt();
            
        arr1[indexChange]=(int)(newVal);
        for(int index:arr1){
            System.out.print(index+" ");
        }
        
    }
}