//Created by : Hendra Kurniawan
//Date : 6 Juni 2018 Time : 3:58 AM
//Modified :

import java.util.Scanner;

public class TesAuthorBuku {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		Author obj1 = new Author("hendra", "hakn@gmail.com", 'm');
		Buku obj2 = new Buku("Matematika", obj1, 50000);
		Buku obj3 = new Buku("Komik", obj1, 60000, 10);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		System.out.println();
					
		obj1.setEmail("hendraKurniawan@gmail.com");
		obj2.setPrice(75000);
		obj2.setQty(5);
		obj3.setPrice(80000);
		obj3.setQty(15);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
	}


}

