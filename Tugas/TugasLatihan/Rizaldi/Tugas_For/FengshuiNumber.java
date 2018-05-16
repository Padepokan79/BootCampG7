/*
 * File           : FengshuiNumber.java
 * Project Name   : Tugas_For
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_For
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 3:19:12 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 3:19:30 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class FengshuiNumber{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);

        String phone, n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;
        int index, count;
        
        n0="khusus, special, langka,";
        n1="satu, satu-satunya, diri sendiri,";
        n2="mudah, gampang, tidak sulit";
        n3="menemukan, mendapatkan, hidup,";
        n4="mati, miskin, susah,";
        n5="Tidak akan, tidak pernah, tidak bisa";
        n6="Menuju, akan";
        n7="Tepat, hoki, atau bisa disebut juga ketuhanan";
        n8="Makmur";
        n9="Sukses";


        System.out.println("Masukkan No HP anda : ");                            
        phone=keyboard.next();        
        System.out.println("==========================");                            
        System.out.println("Hasilnya : ");                            

        count=phone.length();
        
        for(index=0; index<count; index++){
            
            System.out.println(phone.charAt(index)+" ");
            if(phone.charAt(index)=='0'){
                System.out.println(n0);
            }
            if(phone.charAt(index)=='1'){
                System.out.println(n1);
            }
            if(phone.charAt(index)=='2'){
                System.out.println(n2);
            }
            if(phone.charAt(index)=='3'){
                System.out.println(n3);
            }
            if(phone.charAt(index)=='4'){
                System.out.println(n4);
            }
            if(phone.charAt(index)=='5'){
                System.out.println(n5);
            }
            if(phone.charAt(index)=='6'){
                System.out.println(n6);
            }
            if(phone.charAt(index)=='7'){
                System.out.println(n7);
            }
            if(phone.charAt(index)=='8'){
                System.out.println(n8);
            }
            if(phone.charAt(index)=='9'){
                System.out.println(n9);
            }
            
        }        
    }
}