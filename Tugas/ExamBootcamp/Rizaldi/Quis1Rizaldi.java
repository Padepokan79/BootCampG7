/*
 * File           : Quis1Rizaldi.java
 * Project Name   : htdocs
 * Project Path   : d:\xampp\htdocs
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 29th May 2018 8:24:53 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 29th May 2018 8:28:18 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */





import java.util.Random;
import java.util.Scanner;

public class Quis1Rizaldi{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        Scanner keyLine=new Scanner(System.in);

        int cekInput, intNumber, index, indPlusAfter, number1, number2, number3, maxVal, minVal;
        String number;

        cekInput=0;
        indPlusAfter=1;
        number1=0;
        number2=1;
        maxVal=100;
        minVal=5;
        do{
            System.out.println("Masukkan banyak angka  : ");
            number=keyboard.nextLine();

            if(number.matches("([0-9])+")){
                cekInput=1;
                System.out.println("Input harus angka");
                System.out.println("Batasan angka : "+number);
            }else{
                cekInput=0;
                System.out.println("Input Harus Angka");                
            }

            intNumber=Integer.parseInt(number);

            if(intNumber<minVal){
                cekInput=0;
                System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari 5.");                
                System.out.println("Silahkan input kembali.");                
            }else if(intNumber>maxVal){
                cekInput=0;
                System.out.println("Maaf, jumlah urutan angka tidak boleh lebih dari 100");                
                System.out.println("Silahkan input kembali.");                
            }else{
                cekInput=1;
            }
            

        }while(cekInput==0);
        
        System.out.print(+number2+" ");// tampilkan dahulu angka 1 karena tidak bisa di proses saat looping untuk mulai penambahan
        for(index=1; index<intNumber; index++){
            
            number3=number1+number2;
            
            System.out.print(number3+" ");
            number1=number2;
            number2=number3;
            
        }
            

    }
}
