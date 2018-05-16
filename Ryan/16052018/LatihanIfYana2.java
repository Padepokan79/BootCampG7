/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 16 May 2018 10:43
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner

public class LatihanIfYana2{
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