/*
 * File           : ClubReservation.java
 * Project Name   : Rizaldi
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 14th May 2018 1:06:39 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 14th May 2018 1:06:41 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class ClubReservation{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        String day, gender;
        Double cute, cuteMin;
        int age;

        cuteMin=8.0;

        System.out.print("Hari yang diingingkan : ");
        day=keyboard.next();
        System.out.print("Umur anda :");
        age=keyboard.nextInt();
        System.out.print("jenis kelamin (cewek/cowok) :");
        gender=keyboard.next();
        System.out.print("Penampilan rate dari 0.0 s.d 10.8 :");
        cute=keyboard.nextDouble();

        if(day.equals("jumat")&&(gender.equals("cewek")||gender.equals("cowok"))&&age>40){
            System.out.println("=========================================================");
            System.out.println("Reservasi Melodies Memori sukses !!!");
            System.out.println("=========================================================");
        }
        else if(day.equals("kamis")&&(gender.equals("cewek"))&&cute>=cuteMin&&(age>=21&&age<=30)){
            System.out.println("=========================================================");
            System.out.println("Reservasi Ladies Night sukses !!!");
            System.out.println("=========================================================");
        }
        else if(day.equals("sabtu")&&(gender.equals("cewek")||gender.equals("cowok"))&&(age>=21&&age<=30)&&cute>=cuteMin){
            System.out.println("=========================================================");
            System.out.println("Reservasi Jomblo Night sukses !!!");
            System.out.println("=========================================================");
        }
        else if(day.equals("selasa")&&(gender.equals("cewek")&&cute>=cuteMin&&(age>=30&&age<=45))||(gender.equals("cowok")&&cute<cuteMin&&(age>=20&&age<=25))){
            System.out.println("=========================================================");
            System.out.println("Reservasi Brondong Night sukses !!!");
            System.out.println("=========================================================");
        }
        else if(day.equals("senin")||day.equals("rabu")||day.equals("minggu")){
            System.out.println("=========================================================");
            System.out.println("Reservasi anda untuk club umum sukses !!!");
            System.out.println("=========================================================");
        }
        else{
            System.out.println("=========================================================");
            System.out.println("Reservasi anda tidak memenuhi persyaratan apapun !!!");
            System.out.println("=========================================================");
        }
                
    }
}