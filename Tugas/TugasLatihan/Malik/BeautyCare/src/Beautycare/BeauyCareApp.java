package Beautycare;

import java.util.Scanner;
import java.util.Date;

import Validasi.ValidasiAngka;
import Validasi.ValidasiHuruf;
import Validasi.ValidasiInput;
public class BeauyCareApp {

	private static Scanner scan;

	public static void main(String[] args) {
		// object scanner
		scan = new Scanner(System.in);
		Date date = new Date();
		
		// reference variable class main
		String name, gender, member, memberType = null, ageStr, sPriceStr, pPriceStr;
		boolean memberBool, cek = false;
		double servicePrice, productPrice;
		// output program
		System.out.println();
		System.out.println("========================");
		System.out.println("WELCOME TO CHANDR BEAUTY");
		System.out.println("========================");
		System.out.println();
		
		name = ValidasiInput.inputValidasiBeauty("Enter your name\t     : ", cek);
		
		do {
			System.out.print("Enter your gender    : ");
			gender = scan.nextLine();
			cek = ValidasiAngka.validasiGender(gender);
		}while(cek == true);
		do {
			System.out.print("Enter your age\t     : ");
			ageStr = scan.next();
			cek = ValidasiHuruf.validasiHuruf(ageStr);
		}while(cek == true);
		do {
			System.out.print("Are you member ? y/n : ");
			member = scan.next();
			cek = ValidasiAngka.validasiMember(member);
		}while(cek == true);
		if (member.equals("y")) {
			do {
				System.out.print("What's your member ? : ");
				memberType = scan.next();
				cek = ValidasiAngka.validasiMemberType(memberType);
			}while(cek == true);
			memberBool = true;
		}else {
			memberBool = false;
		}

		sPriceStr = ValidasiInput.inputValidasiBeautyHuruf("Enter price service  : Rp. ", cek);
		pPriceStr = ValidasiInput.inputValidasiBeautyHuruf("Enter price product  : Rp. ", cek);
		
		int age = Integer.parseInt(ageStr);
		Customer custom = new Customer(name,gender,age);
		Visit    visit	= new Visit(custom, date);
		
		System.out.println();
		System.out.println();
		System.out.println("=======================");
		System.out.println("     BEAUTY STRUCK");
		System.out.println("=======================");
		System.out.println();
		custom.setMember(memberBool);
		custom.setMemberType(memberType);
		servicePrice = Double.parseDouble(sPriceStr);
		productPrice = Double.parseDouble(pPriceStr);
		visit.setServiceExpense(servicePrice);
		visit.setProductExpense(productPrice);
		System.out.println(visit.toBeautyView());
		
	}

	
}
