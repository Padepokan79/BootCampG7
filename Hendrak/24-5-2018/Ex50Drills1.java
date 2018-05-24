//Created by :Hendra Kurniawan
//Date : 23 Mei 2018 Time : 2:39 PM
//Modified :
import java.util.Scanner;

public class Ex50Drills1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String [] heroes = { 
			"Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon",
			"Bellerophon", "Castor", "Chrysippus", "Deadalus", "Diomedes",
			"Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
			"Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus","GatotKaca",
			"Hanoman","Eunostus","Eunostus","Budi","Budi","Budi",
		};

		String guess="";
		boolean found;
		int ketemu=0;

		System.out.println("Pop Quiz!");
		System.out.print("Name any *mortal* hero from Greek mythology: ");
		guess = keyboard.next();

		found = false;
		for(String hero : heroes)
		{
			if(guess.equals(hero))
			{
				System.out.println("Thats one of them!");
				found = true;
			}
		}

		if(found == false)
		{
			System.out.println("No, " + guess + " wasn't a Greek mortal hero");
		}

		System.out.println("Ada heroes duplikat!");
		System.out.print("Name any *mortal* hero from Greek mythology: ");
		guess = keyboard.next();

		ketemu = 0;
		for(String hero : heroes)
		{
			if(guess.equals(hero))
			{
				ketemu += 1;

			}

		}

		if(ketemu >=2)
		{
			System.out.println("Ada Hero Kembar " + ketemu);
		}
	}
}