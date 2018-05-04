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
        
        String gender, degree, skill, skill2, exp;    
        int age, ageLimit;
        boolean job, male, female, s1, s2, s3, java, angular, php, expY;
        
        System.out.println("masukkan jenis kelamin (laki-laki/perempuan) : ");
        gender=keyboard.next();

        System.out.println("berapa usia anda : ");
        age=keyboard.nextInt();

        System.out.println("apa jenjang pendidikan terakhir anda : ");
        degree=keyboard.next();

        System.out.println("apa skill yang anda miliki : ");
        skill=keyLine.nextLine();

        System.out.println("apa anda pernah punya pengalaman (ya/tidak) : ");
        exp=keyboard.next();
                        
        ageLimit=23;

        s1=degree.equals("S1");
        s2=degree.equals("S2");
        s3=degree.equals("S3");

        java=skill.equals("Java dan AngularJs");
        angular=skill.equals("AngularJs");
        php=skill.equals("Java dan PHP");

        male=gender.equals("laki-laki");        
        female=gender.equals("perempuan"); 

        expY=exp.equals("ya");

        job=(male&&age>=ageLimit&&(java||php)&&expY);

        System.out.println("diterima kerja ? : "+job);

    }
}