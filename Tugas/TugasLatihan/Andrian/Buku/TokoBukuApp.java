package Buku;

import java.util.Scanner;

public class TokoBukuApp {

	private static Scanner key;

	public static void main(String[] args) {
		key = new Scanner(System.in);
		String nama;
		Author pengarang1 = new Author("Lucy", "illy@gmail.com", 'f');
		System.out.println(pengarang1.toString());
		
		System.out.println("Masukan email yang diinginkan : ");
		nama = key.next();
		
		pengarang1.setEmail(nama);
		System.out.println(pengarang1);
		
		
		
		Buku book1 = new Buku("Secret", pengarang1, 123.0);
		System.out.println(book1.triString());
		

		Buku book2 = new Buku("Secret", pengarang1, 123.0,2);
		System.out.println(book2.toString());
	}

}
