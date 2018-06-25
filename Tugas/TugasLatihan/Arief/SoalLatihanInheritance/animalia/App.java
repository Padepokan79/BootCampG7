package animalia;

public class App {

	public static void main(String[] args) {
		 
		Animal nm = new Animal("Mamalia");
		Carnivora crn = new Carnivora(nm, "Harimau", "Belanja");
		
		System.out.println(crn.printAnimal());
		nm.gerak();
	}

}
