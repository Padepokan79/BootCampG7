package AlifharMalikYana;

public class ShowAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("Mamalia", "Berjalan");
		Carnivora carnivora = new Carnivora("Singan", "Menerkam", animal);
		
		System.out.println("\nANIMAL");
		System.out.println(animal.tampilAnimal());
		System.out.println("\nCARNIVORA");
		System.out.println(carnivora.tampilCarnovora());
		System.out.println("Cara memangsa : "+carnivora.memangsa());
//		System.out.println("Cara makan    : "+carnivora.makan());
	}

}
