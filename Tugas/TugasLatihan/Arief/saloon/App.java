package saloon;

import java.util.*;

public class App {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name, gender, memberType, isMember;
		int age, totPrice, servPrice, prodPrice;
		boolean member = false;
		
	    input = new Scanner( System.in );
	    
	    System.out.print("Your name\t\t: ");
	    name = input.next();
	    
	    System.out.print("Your gender\t\t: ");
	    gender = input.next();
	    
	    System.out.print("Your age\t\t: ");
	    age = input.nextInt();
	    
	    System.out.print("Are you a Member ? Y/T\t: ");
	    isMember = input.next();
	    
		if (isMember.equals("Y")) {
			member = true;
			System.out.print("Member Type\t\t: ");
			memberType = input.next();
		} else {
			member = false;
			memberType = "Not a member";
		}
		
		System.out.print("Total Service Price\t: ");
		servPrice = input.nextInt();
		
		System.out.print("Total Product Price\t: ");
		prodPrice = input.nextInt();
		System.out.println();
		System.out.println("============================================");
				
		Customer cst = new Customer(name, gender, age);
		cst.setMember(member);
		cst.setMemberType(memberType);
		System.out.println(cst.AbstractPerson());
		Visit vst = new Visit(cst, servPrice, prodPrice);
		vst.total();
		vst.getServiceDiscountRate(cst.getMemberType());
		vst.getProductDiscountRate(cst.getMemberType());
		
		System.out.println(vst.AbstractPerson());
		System.out.println(vst.totExp());

	}
}
