/*
	* Created by:	Alifhar Juliansyah
	* 				02-05-2018	10.45
	* Updated by:
	*
*/
import java.util.Scanner;

public class Ex8Drills{
	public static void main(String[] args){
		String name, origin;
		int age;
		double weight, income;

		Scanner keyboard=new Scanner(System.in);

		System.out.print("Hello. What is your name? ");
		name=keyboard.next();

		System.out.print("Hi, "+name+"! How old are you? ");
		age=keyboard.nextInt();
		// inputan berupa huruf dan simbol
		// inputan berupa bilangan desimal
		// inputan berupa angka yang terlalu besar atau terlalu kecil (input < -2,147,483,648 atau input > 2,147,483,647)

		System.out.println("So you're "+age+". eh? That's not very old.");
		System.out.print("Where are you from "+name+"? ");
		origin=keyboard.next();

		System.out.print("How much do you weight, "+name+"? ");
		weight=keyboard.nextDouble();
		// inputan berupa huruf dan simbol

		System.out.println(weight+"! Better keep that quiet!!");
		System.out.print("Finally, what's your income, "+name+"? ");
		income=keyboard.nextDouble();
		// inputan berupa huruf dan simbol

		System.out.print("Hopefully that is "+income+" per hour");
		System.out.println(" and not per year!");
		System.out.print("Well, thanks for answering my rude questions, ");
		System.out.println(name+".");


		/*
		1.	Program tetap bisa berjalan apabila memasukkan nilai integer ke scanner yang menerima double
			hal ini karena nilai integer merupakan nilai yang juga dimiliki oleh tipe data double
			contohnya nilai integer 1 sama dengan nilai double 1.0
		2.	Program tetap berjalan apabila memasukkan angka ke scanner yang menerima string
			Hal ini karena angka (bilangan) termasuk kedalam karakter
			namun berbeda dengan int dan double, angka (bilangan) di String tidak memiliki nilai sehingga tidak bisa di operasikan oleh operasi matematika
		*/
	}
}