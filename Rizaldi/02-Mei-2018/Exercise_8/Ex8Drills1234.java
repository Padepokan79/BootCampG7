/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 02 May 2018 10:53 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex8Drills1234{
    public static void main( String[] args){
        String name, address;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello. What is  your name ? ");
        name = keyboard.next();
        // ketika saya ketikan "1231asfasfa rqw2312" muncul error karena kata kedua mengandung
        // data angka sedangkan variable name adalah sebuah string.

        System.out.print("Hi, "+name+"! How old are you?");
        age = keyboard.nextInt();
        // ketika saya ketikan "sebelas" muncul error karena data yang saya masukkan bertipe string
        // sedangkan variable age dan keyboard scanner nya bertipe Int.

        

        System.out.println( "So you're " + age + ", eh? That's not very old." );
        System.out.print("How much do you weight, "+name+" ? ");
        weight = keyboard.nextDouble();
        // ketika saya masukkan data integer ke variable weight tidak terjadi error dan variable bisa dipakai
        // karena integer bisa masuk ke tipe data double namun sebaliknya.
        // ketika saya ketikan "sebelas koma lima" muncul error karena data yang saya masukkan bertipe string
        // sedangkan variable weight dan keyboard scanner nya bertipe Double.

        System.out.println(weight+" ! Better keep that quiet !!");
        System.out.print("Finally, what's your income, "+name+" ? ");
        income = keyboard.nextDouble();
        // ketika saya ketikan "sebelas juta" muncul error karena data yang saya masukkan bertipe string
        // sedangkan variable income dan keyboard scanner nya bertipe Double.        
        
        
        
        

        System.out.print("Hopefully that is "+income+" per hour ");
        System.out.println(" and not per year! ");
        System.out.print("Well, thanks for answering my rude questions, ");
        System.out.println(name+" . where do you live ?");
        address = keyboard.next();

    }
}