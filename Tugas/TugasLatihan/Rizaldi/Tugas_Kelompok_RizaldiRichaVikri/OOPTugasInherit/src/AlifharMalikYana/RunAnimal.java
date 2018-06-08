package AlifharMalikYana;
import java.util.*;
public class RunAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal A1 = new Animal("Paus Biru");
		System.out.print("Nama hewan\t\t: "+A1.getName()+"\nbergerak dengan cara\t: ");
		A1.gerak();
		
		
		Carnivore C1 = new Carnivore("Srigala", "Merangkul");
		System.out.print("\n\nNama hewan\t\t: "+C1.getName()+"\ncara Memangsa\t\t: "+C1.getCaraMemangsa()+"\nbergerak dengan cara\t: ");
		C1.gerak();
		System.out.print("dan makan dengan cara\t: ");
		C1.makan();
	}

}
