/*
 * File           : Quis5Rizaldi.java
 * Project Name   : htdocs
 * Project Path   : d:\xampp\htdocs
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 29th May 2018 10:00:54 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 29th May 2018 10:01:09 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class Quis5Rizaldi{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        Scanner keyLine=new Scanner(System.in);

        int[]   deretAngka={2,39,47,14,36,56,57,49,43,79};
        int[]   arrTemp=new int[deretAngka.length+1];
        
        int cekInput, intNumberVal, intNumberPos, maxPosition, minPosition;
        String number, number1;

        cekInput=0;
        intNumberVal=0;
        intNumberPos=0;
        maxPosition=10;
        minPosition=1;

        do{
            System.out.println("Masukkan Yang mau disisipkan    : ");
            number=keyboard.nextLine();
            System.out.println("Sisipkan pada posisi ke         : ");
            number1=keyboard.nextLine();

            if(number.matches("([0-9])+")&&number1.matches("([0-9])+")){
                cekInput=1;
            }else{
                cekInput=0;                
                System.out.println("Maaf, input yang diterima hanya berupa angka.");                
                System.out.println("Silahkan input kembali.");                
            }

            intNumberVal=Integer.parseInt(number);
            intNumberPos=Integer.parseInt(number1);

            if(intNumberPos<minPosition){
                cekInput=0;
                System.out.println("Maaf, input posisi tidak boleh kurang dari 1");                
                System.out.println("Silahkan input kembali.");                
            }else if(intNumberPos>maxPosition){
                cekInput=0;
                System.out.println("Maaf, input posisi tidak boleh lebih dari 10.");                
                System.out.println("Silahkan input kembali.");                
            }else{
                cekInput=1;
            }
            
        }while(cekInput==0);
        System.out.println("Panjang array lama adalah : "+deretAngka.length);                
        System.out.println("Panjang array baru adalah : "+arrTemp.length);                
        System.out.println("Hasil penyisipan adalah   : \n");                
            
        // buat array baru dgn length sebanyak deretAngka+1
        // copy array 1 sebanyak length posisi pada arary baru
        // masukkan nilai yg di inginkan pada array posisi baru
        // tambahkan sisa array 1 pada array baru
        
        
        int indCopy2=0;

        for(int indCopy1=0; indCopy1<arrTemp.length; indCopy1++){// proses kopi deretAngka ke arrTemp
            
            if((indCopy1+1)==intNumberPos){
                arrTemp[indCopy1]=intNumberVal;
            }
            else{
                for(indCopy2=0; indCopy2<(intNumberPos-1); indCopy2++){// memasukkan nilai deret angka sampai ke posisi yg diinginkan
                    arrTemp[indCopy2]=deretAngka[indCopy2];
                }
                
                for(int indCopy3=intNumberPos; indCopy3<arrTemp.length; indCopy3++){// memasukkan nilai deret dari posisi yg diinginkan sampai akhir length array baru
                    arrTemp[indCopy3]=deretAngka[indCopy3-1];
                }
            }
        }
        for(int indexPrint: arrTemp){
            System.out.print(indexPrint+" ");                
        }
    }
}