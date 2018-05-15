/*
 * File           : YanaSoal2If.java
 * Project Name   : Yana
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\15-Mei-2018\Soal-If\Yana
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 15th May 2018 9:29:28 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 15th May 2018 9:31:31 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner

public class YanaSoal2If{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);                  

        
        String code, algorithmVal, dataBaseVal, networkVal, assemblyVal, dataStrucVal;
        Double ipk, semester, pass, accSemester, accIpk, accAlgo, accDB, accStruc;      

        System.out.println("======================================================");
        System.out.println("Jurusan : ");
        code=keyboard.next();

        if(code.equals("345")||code.equals("321")){                        
            

            System.out.println("semester                    : ");
            semester=keyboard.nextDouble();
            System.out.println("ipk                         : ");
            ipk=keyboard.nextDouble();
            System.out.println("Nilai prak. Algoritma       : ");
            algorithmVal=keyboard.next();
            System.out.println("Nilai prak. Basis Data      : ");
            dataBaseVal=keyboard.next();
            System.out.println("Nilai prak. Struktur Data   : ");
            dataStrucVal=keyboard.next();


            if((semester>=2&&semester<=5)&&(ipk>=3)&&algorithmVal.equals("A")&&(dataBaseVal.equals("A")||dataStrucVal.equals("A"))){
                System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Informatika atau sistem informasi.");
            }
            else{
                System.out.println("Anda TIDAK memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Informatika atau sistem informasi.");
            }

        }
        else if(code.equals("531")){
            System.out.println("semester                    : ");
            semester=keyboard.nextDouble();
            System.out.println("ipk                         : ");
            ipk=keyboard.nextDouble();
            System.out.println("Nilai prak. Jaringan        : ");
            networkVal=keyboard.next();
            System.out.println("Nilai prak. Rakitan         : ");
            assemblyVal=keyboard.next();            

            if((semester>=2&&semester<=5)&&(ipk>=3.25)&&(networkVal.equals("A"))&&(assemblyVal.equals("A")||assemblyVal.equals("B"))){
                System.out.println("Anda memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Komputer.");
            }
            else{
                System.out.println("Anda TIDAK memenuhi syarat untuk mendaftar beasiswa jurusan Teknik Komputer.");
            }
        }
        else{
            System.out.println("kode tidak ada  dalam daftar !!!");
        }
        
                

    }
}