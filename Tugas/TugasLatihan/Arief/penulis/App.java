package penulis;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author aut = new Author("Ucup", "ucumail@gmail.pret", 'M');
		System.out.println(aut.printString());
		
		Book bok = new Book("Melesat Dalam Kubur", aut, 50000, 1);
		System.out.println(bok.printString());

	}

}
