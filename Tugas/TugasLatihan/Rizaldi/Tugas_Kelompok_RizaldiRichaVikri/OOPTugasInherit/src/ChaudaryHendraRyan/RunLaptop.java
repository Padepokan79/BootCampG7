package ChaudaryHendraRyan;

import java.util.*;

public class RunLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String typing, gaming, cooling;
		Scanner kb = new Scanner(System.in);
		
		Laptop laptop1 = new Laptop("ROG", "Asus", "core i 9", 9000000, 12, 12, 13.7, 999.9);
		System.out.println(laptop1.toString());
		laptop1.toGame();
		laptop1.toType();
		
		
		Asus A1 = new Asus("Zenfone", "Asus", "core i 12", 12000000, 8, 150, 20.2, 12.4, "bisa ngetik", "bisa main game", "pendingin super");
		System.out.println(A1.toString());
	}

}
