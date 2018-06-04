/*
 * File           : TugasArray3.java
 * Project Name   : Tugas-Array
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas-Array
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 21st May 2018 3:27:07 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 21st May 2018 3:27:31 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class TugasArray3{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();
        Boolean cek=false;

        int[] arr1={25,14,56,15,36,56,77,18,29,49};        
        int toFind, qtyIndex;

        System.out.println("============================================");
        System.out.print("Which Index to find ? ");
        toFind = keyboard.nextInt();
        

        qtyIndex=0;
        for ( int index : arr1 ) {

            if ( index == toFind ) {
                cek=true;    
                for(int ind=0; ind<arr1.length; ind++){
                    if(arr1[ind]==toFind){
                        qtyIndex+=ind;
                    }
                }
                System.out.println( index + " found !!! pada index "+qtyIndex);
            }
        }
            if(cek==false){
                    System.out.println(+toFind+" is Not found.");
            }

    }
}