/* 	Date 		: 2/5/2018    
	Time 		: 09:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class Ex8Drills1Sampai4 {
		public static void main( String[] args){
			String name, movie;
			int age;
			double weight, income;

			Scanner keyboard = new Scanner(System.in);
			
			System.out.print("Hello what is your name ?");
			name = keyboard.next();
			//error ketika measukan 2 kalimat "harga mati" karena kata kedua akan masuk pada pertanyaan selanjutnya yang dimana diharuskan memasukan angka
			//tidak terjadi error ketika memasukan niali double datau integer pada string

			System.out.print("Hi, " + name + "! How old are you ?");
			age = keyboard.nextInt();
			//error ketika memasuki kata Mawar
			//error ketika memasukan 41.2 karena yang dimasukan merupakan double dan integer tidak dapat menerimanya

			System.out.println("So you're " + age + "eh? That's not very old.");
			System.out.print("How much do you weigh, " + name + "? ");
			weight = keyboard.nextDouble();
			//tidak terjadi error ketika memasukan nilai integer pada double dikarenkan double mampu menerima rilai integer

			System.out.println( weight + "! Better keep that quiet!!");
			System.out.print("Finally, whar's your income, " + name + "? " );
			income = keyboard.nextDouble();

			System.out.print("Hopefully that is " + income + " per hour" );
			System.out.println(" and not per year!");
			System.out.print("Well, thanks for answering my rude question, ");
			System.out.println(name + ".");

			System.out.println("So, have you ever been go to cinema ? if you have to, where ?");
			movie = keyboard.next();
			System.out.println( movie + " ah really, i really ove that place, the screen is huge and the ar is so refreshing");
			System.out.println("Well, i think we should to cinema next time.");


		}
	}