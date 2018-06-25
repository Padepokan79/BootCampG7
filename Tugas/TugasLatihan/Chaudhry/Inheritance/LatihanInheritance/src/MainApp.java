
public class MainApp {

	public static void main(String[] args) {
		Author au 	= new Author("Nurdhiat", "chaudharynurdhiat@gmail.com", 'm');
		Book bo1 	= new Book("Pangeran Cahaya", au, 12000);
		Book bo2 	= new Book("Pangeran Gelap", au, 15000, 2);
		
		System.out.println("- AUTHOR ----------");
		System.out.println(au.toString());
		System.out.println("- BOOK 01 ---------");
		System.out.println(bo1.toString());
		System.out.println("- BOOK 02 ---------");
		System.out.println(bo2.toString());
		
		
		au.setEmail("nurdhiatmalik@gmail.com");
		bo1.setPrice(10000);
		bo2.setPrice(13000);
		bo2.setQty(10);
		System.out.println("");
		System.out.println("");
		
		
		
		System.out.println("- AUTHOR ----------");
		System.out.println(au.toString());

		System.out.println("- BOOK 01 ---------");
		System.out.println(bo1.toString());

		System.out.println("- BOOK 02 ---------");
		System.out.println(bo2.toString());
	}

}
