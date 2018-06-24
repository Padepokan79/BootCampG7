package amy1;

class AnimalApp {

	public static void main(String[] args) {
		Animal animal = new Animal("Mamalia", "ngesot");
		System.out.println( animal.printAnimal() );

		Carnivora car = new Carnivora(animal, "Ular", "membelit ampe mati");
		System.out.println( car.printCarnivora() );
	}

}
