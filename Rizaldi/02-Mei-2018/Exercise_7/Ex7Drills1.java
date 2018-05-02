/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 02 May 2018 10:22 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex7Drills1{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What city is the capital of France?");
        keyboard.next();
        // ketika saya ketik "paris tahun 2019" muncul error = Exception in thread "main" java.util.InputMismatchException
        // ketika saya ketik "paris_tahun_2019" tidak muncul error
        // ketika saya ketik "234@$@!ASF><" tidak muncul error

        System.out.println("What is 6 multiplied by 7?");
        keyboard.nextInt();
        // ketika saya ketik "Rizaldi" muncul error = Exception in thread "main" java.util.InputMismatchException
        // ketika saya ketik "123 456 678 789 678" = pertanyaan langsung skip. karena value angka masuk ke pertanyaan selanjutnya

        System.out.println("Enter a number between 0.0 and 1.0.");
        keyboard.nextDouble();

        System.out.println("Is there anything you would like to say?");
        keyboard.next();
    }
}