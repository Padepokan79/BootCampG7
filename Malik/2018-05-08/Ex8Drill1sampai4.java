/*
Nama : Malik Chaudahry
Time : 08-05-2018 2:21PM
title : make comment error 
*/
import java.util.Scanner;

public class Ex8Drill1sampai4{
	public static void main(String[] args){
		String name, hobby;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hello what is your name ?");
		name = keyboard.next(); // bisa di inputkan semua jenis tipe data

		System.out.println("Hi " + name + "! how old are you ?"); 
		age = keyboard.nextInt(); // hanya bisa meng inputkan angka bulat

		System.out.println("So you're "+ age +", eh ? That's not very old.");
		System.out.println("How much do you weight, " +name+" ?");
		weight = keyboard.nextDouble(); // hanya bisa meng inputkan angka desimal

		System.out.println(weight+" ! better keep that quite!!");
		System.out.println("Finally, what's your income, " + name + "?");
		income = keyboard.nextDouble(); // hanya bisa meng inputkan angka desimal

		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );

		/*
			1. program dengan inputan angka, dengan tipe data integer tidak bisa di input dengan tipe data double. mengapa ? karena integer 
			hanya menerima inputan angka antara 0-9 atau angka bulat tidak menerima angka yang berupa koma atau desimal

			2. program dengan inputan numerik atau angka baik angka bulat maupun desimal tidak bisa menerima inputan karakter atau string.
			mengapa ? karena numeric hanya berupa inputan angka.
			
		*/

		// soal no 4
		System.out.println(" can i know your hobby ?");
		hobby = keyboard.next();

		System.out.println("Wow it's good, i love "+hobby+ " too");


	}
}