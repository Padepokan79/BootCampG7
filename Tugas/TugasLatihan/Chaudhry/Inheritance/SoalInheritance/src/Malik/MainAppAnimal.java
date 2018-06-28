package Malik;

public class MainAppAnimal {

	public static void main(String[] args) {
		Animal anim = new Animal("Mamalia", "Berjalan");
		Herbivora her = new Herbivora("Mamalia", "Berjalan", "Kucing", "Memangsa");
		Carnivora car = new Carnivora("Mamalia", "Berjalan", "Anjing", "Memangsa");
		
		System.out.println(her.toString());
		her.cara();
		System.out.println("");
		System.out.println(car.toString());
		car.cara();
	}

}
