/*
 * File           : TugasArray4.java
 * Project Name   : Tugas-Array
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas-Array
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 21st May 2018 3:40:28 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 21st May 2018 3:43:04 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class TugasArray4{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();
        Boolean cek=false;

        int[] arr1={25,14,56,15,36,56,77,18,29,49};        
        int toFind, qtyIndex;

        System.out.println("============================================");
        System.out.print("Masukkan angka yang ingin dicari : ");
        toFind = keyboard.nextInt();
        

        qtyIndex=0;
                  
        for(int ind=0; ind<arr1.length; ind++){
            if(arr1[ind]==toFind){
                qtyIndex+=ind;
            }
        }
        System.out.println("Ketemu !!! pada index "+qtyIndex);
    }
}