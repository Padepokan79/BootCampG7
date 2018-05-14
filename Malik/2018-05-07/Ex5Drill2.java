/*
Title : Creat Another Variable in one variable
Name  : Malik Chaudhary
Time  : 07 Mei 2018 11:33AM
*/

public class Ex5Drill2{
	public static void main(String[] args){
		int x,y,age, qty;
		double seconds, e, checking, weight;
		String firstName, lastName, title, animalName, animalType, word;

		x 	= 10;
		y 	= 400;
		age = 39;
		qty = 3;

		seconds  = 4.71;
		e 		 = 2.71828182845904523536;
		checking = 1.89;
		weight   = 2.82;

		firstName = "Graham";
		lastName  = "Mitchel";
		title     = "Mr.";

		animalName = "Hamster";
		animalType = "Winter";

		word = "I have "+ animalName + " with skin color " + animalType + " and his weight " +weight;

		

		System.out.println("The Variable x Contains "+ x);
		System.out.println("The value "+ y + " is stored in the variable y.");
		System.out.println("The experiment took "+ seconds + " seconds.");
		System.out.println("A favorite irrational # is Euler's number: "+ e);
		System.out.println("Hopefully you have more than $"+ checking + "!");
		System.out.println("My name's "+ title + " " + firstName + lastName);


		System.out.println(word);
	}
}