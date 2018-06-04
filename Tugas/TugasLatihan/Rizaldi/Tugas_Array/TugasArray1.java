/*
 * File           : TugasArray1.java
 * Project Name   : Tugas-Array
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas-Array
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 21st May 2018 2:59:25 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 21st May 2018 2:59:28 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class TugasArray1{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();

        int[] angka={1,4,2,5,7,10};
        int[] number= new int[angka.length];
        
            System.out.println("============================================");
        for(int index=0; index<angka.length; index++){
            number[index]=(int)(angka[index]);
            
            System.out.println(angka[i]);
        }
        for(int i:number){
            System.out.println(i);
        }
    }
}