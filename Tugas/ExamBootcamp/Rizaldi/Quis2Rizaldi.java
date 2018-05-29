/*
 * File           : Quis2Rizaldi.java
 * Project Name   : xampp
 * Project Path   : d:\xampp\htdocs\xampp
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 29th May 2018 9:37:49 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 29th May 2018 9:38:20 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class Quis2Rizaldi{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        Scanner keyLine=new Scanner(System.in);

        int index, index1, cekInput, intNumber, maxLine, minLine;
        String number;
        
        index=0;
        index1=0;
        cekInput=0;
        maxLine=20;
        minLine=2;

        do{
            System.out.println("Masukkan banyak angka  : ");
            number=keyboard.nextLine();

            if(number.matches("([0-9])+")){
                cekInput=1;
            }else{
                cekInput=0;                
                System.out.println("Maaf, input yang diterima hanya berupa angka.");                
                System.out.println("Silahkan input kembali.");                
            }

            intNumber=Integer.parseInt(number);

            if(intNumber<minLine){
                cekInput=0;
                System.out.println("Maaf, jumlah baris tidak boleh kurang dari 2");                
                System.out.println("Silahkan input kembali.");                
            }else if(intNumber>maxLine){
                cekInput=0;
                System.out.println("Maaf, jumlah baris tidak boleh lebih dari 20.");                
                System.out.println("Silahkan input kembali.");                
            }else{
                cekInput=1;
            }
            

        }while(cekInput==0);
        
        System.out.println("Batasan angka : "+intNumber);

        for(index=1; index<=intNumber; index++){
            for(index1=1; index1<=index; index1++){
                System.out.print(index1+" ");
            }
                System.out.println();
        }

    }
}