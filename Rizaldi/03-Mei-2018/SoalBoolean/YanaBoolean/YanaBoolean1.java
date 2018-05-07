/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 13:19 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class YanaBoolean1{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
        
        String gender, degree, skill1, skill2, skill3, exp;    
        int age, ageLimit;
        boolean male, s1, s2, s3, java, angJS, pHp, expY, accepted;
        
        System.out.println("masukkan jenis kelamin (laki-laki/perempuan) : ");
        gender=keyboard.next();

        System.out.println("berapa usia anda : ");
        age=keyboard.nextInt();

        System.out.println("apa jenjang pendidikan terakhir anda : ");
        degree=keyboard.next();

        System.out.println("apa anda bisa Java ? (Y/T) : ");
        skill1=keyboard.next();
        System.out.println("apa anda bisa Angular ? (Y/T) : ");
        skill2=keyboard.next();
        System.out.println("apa anda bisa PHP ? (Y/T) : ");
        skill3=keyboard.next();

        System.out.println("apa anda pernah punya pengalaman (Y/T) : ");
        exp=keyboard.next();
                        
        ageLimit=23;

        s1=degree.equals("S1");
        s2=degree.equals("S2");
        s3=degree.equals("S3");

        male=gender.equals("laki-laki");                

        java=skill1.equals("Y");
        angJS=skill2.equals("Y");
        pHp=skill3.equals("Y");

        expY=exp.equals("Y");

        // jobY=(male&&age>=ageLimit&&java(angular||php)&&expY);
        accepted=(male&&(age>=ageLimit)&&(s1||s2||s3)&&(java&&(angJS||pHp)));

        System.out.println("diterima kerja ? : "+accepted);

    }
}