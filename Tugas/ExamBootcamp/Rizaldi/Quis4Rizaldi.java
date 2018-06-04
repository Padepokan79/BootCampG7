/*
 * File           : Quis4Rizaldi.java
 * Project Name   : htdocs
 * Project Path   : d:\xampp\htdocs
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 29th May 2018 9:54:15 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 29th May 2018 9:54:30 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class Quis4Rizaldi{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        Scanner keyLine=new Scanner(System.in);

        int[]   deretAngka={25,14,56,15,36,56,77,18,29,48};
        int[]   arrTemp=new int[deretAngka.length+1];
        int cekInput, intNumber, maxLine, minLine;
        String number;

        cekInput=0;
        intNumber=0;
        maxLine=10;
        minLine=1;

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
                System.out.println("Maaf, Pergeseran tidak boleh kurang dari 1");                
                System.out.println("Silahkan input kembali.");                
            }else if(intNumber>maxLine){
                cekInput=0;
                System.out.println("Maaf, Pergeseran tidak boleh lebih dari 10.");                
                System.out.println("Silahkan input kembali.");                
            }else{
                cekInput=1;
            }
            
        }while(cekInput==0);

                System.out.println("Nilai geser : "+intNumber);                

        for(int index=0; index<deretAngka.length; index++){

                System.out.print(deretAngka[index+intNumber]+" ");                

        }
    }
}