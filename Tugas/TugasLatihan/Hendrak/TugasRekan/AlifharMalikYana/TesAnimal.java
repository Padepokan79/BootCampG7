package AlifharMalikYana;

public class TesAnimal {
	public static void main(String[] args) {
		Animal anim = new Animal("mamalia", "berjalan ");
		Carnivora c = new Carnivora("Harimau", anim, "cakar dan taring");
		Herbivora h = new Herbivora("Kerbau", anim, "gigi yang kuat");
		
		System.out.println(anim.toString());
		System.out.println(c.toString());
		c.memangsa();
		
		System.out.println();
		System.out.println(h.toString());
		h.makan();
		
		
	}
}
