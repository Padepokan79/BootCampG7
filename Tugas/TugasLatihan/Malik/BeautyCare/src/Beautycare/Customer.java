package Beautycare;

import Interface.DiscountRate;

public class Customer extends Person implements DiscountRate{
	// reference variable Customer
	private boolean member = false;
	private String memberType, name;
	private double discount = 0;
	
	Customer(){}
	// Constructor Customer
	Customer(String name, String gendere, int agee){
		this.name 	= name;
		gender 		= gendere;
		age 		= agee;
	}
	// Getter untuk name
	String getName() {
		return name;
	}
	// Getter member true/false
	boolean isMember() {
		return member;
	}
	// setter member
	void setMember(boolean member){
		this.member = member;
	}
	// getter member type
	String getMemberType() {
		return memberType;
	}
	// setter member type
	void setMemberType(String type) {
		if (member == true) {
			this.memberType = type;
		}else {
			this.memberType = "-";
		}
	}
	// toString Beauty
	public String toBeautyView() {
		return "Nama\t\t: "+name+"\nGender\t\t: "+gender+"\nAge\t\t: "+age+"\nMember\t\t: "+member+"\nMember Type\t: "+memberType;
	}
	// Interface method untuk service discount
	@Override
	public double getServiceDiscountRate(String type) {
		if (type.equals("Gold")) {
			return serviceDiscountGold;
		}else if (type.equals("Silver")) {
			return serviceDiscountSilver;
		}else if (type.equals("Premium")) {
			return serviceDiscountPremium;
		}else {
			return discount;
		}
		
	}
	// Interface method untuk product discount
	@Override
	public double getProductDiscountRate(String type) {
		if (type.equals("Gold")) {
			return productDiscountGold;
		}else if (type.equals("Silver")) {
			return productDiscountSilver;
		}else if (type.equals("Premium")) {
			return productDiscountPremium;
		}else {
			return discount;
		}
	}
}
