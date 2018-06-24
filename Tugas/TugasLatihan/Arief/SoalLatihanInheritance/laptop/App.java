package laptop;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop lpt = new Laptop("Asus");
		Asus as = new Asus(lpt, "AMD Ultron", "X555IU", 15, 5.5, 20, 2000, 10000000);
		System.out.println(as.printLaptop());
		as.behave();

	}

}
