/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 11:06 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class RizaldiBoolean1{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        
           
        double grade, point1, point2, point3, point4, point5, point6, point7, point8;
        boolean passed, lect1, lect2, lect3, lect4, lect5, lect6, lect7, lect8, obligateLect;
        
        System.out.println("Masukkan nilai dari skala 0.0 sd 10.0 !!!");
        System.out.println("Masukkan nilai mata kuliah A : ");
        point1=keyboard.nextDouble();

        System.out.println("Masukkan nilai mata kuliah B : ");
        point2=keyboard.nextDouble();

        System.out.println("Masukkan nilai mata kuliah C : ");
        point3=keyboard.nextDouble();

        System.out.println("Masukkan nilai mata kuliah D : ");
        point4=keyboard.nextDouble();

        System.out.println("Masukkan nilai mata kuliah E : ");
        point5=keyboard.nextDouble();

        System.out.println("Masukkan nilai mata kuliah F : ");
        point6=keyboard.nextDouble();

        System.out.println("Masukkan nilai mata kuliah G : ");
        point7=keyboard.nextDouble();

        System.out.println("Masukkan nilai mata kuliah H : ");
        point8=keyboard.nextDouble();

        grade=7;

        lect1=(point1>=grade);
        lect2=(point2>=grade);
        lect3=(point3>=grade);
        lect4=(point4>=grade);
        lect5=(point5>=grade);
        lect6=(point6>=grade);
        lect7=(point7>=grade);
        lect8=(point8>=grade);

        obligateLect=(point1>=grade&&point3>=grade&&point4>=grade&&point5>=grade);

        passed=(obligateLect&&(lect1||lect2||lect3||lect4||lect5||lect6||lect7||lect8));
    
        System.out.println("Orang tersebut boleh lulus : "+passed);

    }
}