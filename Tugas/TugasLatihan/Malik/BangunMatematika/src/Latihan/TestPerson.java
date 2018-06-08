package Latihan;

import java.util.Scanner;

import ControllerElektronik.Laptop;

public class TestPerson {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String nama;
			scan = new Scanner(System.in);
			
			System.out.print("Nama anda : ");
			nama = scan.next();
		
			Person p1 = new Person();
			Person p2 = new Person("Malik", "Chandr", "Male", "Musically", 20);
			Person p3 = new Person();
			
			p1.firstName = nama;
			p1.lastName = "Chaudhary";
			p1.age = 18;
			p1.gender = "Male";
			p1.interest = "Musik, Gaming";
			
			p3.inisialisasiPerson("Malik", "Chandr", "male", "Gaming", 20);
			
			System.out.println("People 1");
			p1.bidata();
			p1.greeting();

			System.out.println("People 2");
			p2.bidata();
			p2.greeting();
			
			System.out.println("People 3");
			p3.bidata();
			p3.greeting();
			
			Laptop l = new Laptop("Macbook","Putih","Mac Os processor 2.3 Ghz", 8, 5);
			
			System.out.println();
			l.tampilLaptop();
			
	}

}
