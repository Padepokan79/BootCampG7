package teamChauOOP;

public class GadgetApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1=new Laptop("Intel Core i5", 3.4, 10, 7000000, 8, 1024);
		Asus a1=new Asus(l1, "L510", "Windows");
		
		System.out.println(l1.toString());
		System.out.println(a1.toString());
	}

}
