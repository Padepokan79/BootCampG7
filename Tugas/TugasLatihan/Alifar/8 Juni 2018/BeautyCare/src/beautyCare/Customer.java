package beautyCare;

public class Customer extends Person implements DiscountRate {
	private boolean member=false;
	private String memberType="-";
	
	public Customer() {}
	public Customer(String name, String gender, int age) {
		super(name, gender, age);
	}

	boolean isMember() {
		return member;
	}
	
	void setMember(boolean member) {
		this.member=member;
	}
	
	String getMember() {
		return memberType;
	}
	
	void setMemberType(String type) {
		memberType=type;
	}
	
	public double getServiceDiscountRate(String type) {
		double discount=0;
		if(memberType.equals("Premium"))
			discount=serviceDiscountPremium;
		else if(memberType.equals("Gold"))
			discount=serviceDiscountGold;
		else if(memberType.equals("Silver"))
			discount=serviceDiscountSilver;
		return discount;
	}
	
	public double getProductDiscountRate(String type) {
		double discount=0;
		if(memberType.equals("Premium"))
			discount=productDiscountPremium;
		else if(memberType.equals("Gold"))
			discount=productDiscountGold;
		if(memberType.equals("Silver"))
			discount=productDiscountSilver;
		return discount;
	}

	public String toString() {
		return super.toString()+"\nCustomer [member = " + member + ", memberType = " + memberType + "]";
	}
	
	
}
