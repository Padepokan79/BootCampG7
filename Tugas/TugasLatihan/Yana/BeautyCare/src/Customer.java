
public class Customer extends Person implements DiscountRate{
	private String name, memberType;
	private	boolean member=false;
	
	public Customer() {
	}
	
	public Customer(String name, String gender, int age) {
		this.name 	= name;
		this.gender	= gender;
		this.age	= age;
	}
	
	String getName() {
		return name;
	}
	
	boolean isMember() {
		return member;
	}
	
	void setMember(boolean member) {
		this.member = member;		
	}
	
	public String getMemberType() {
		if (member == true) {
			return memberType;
		}
		else {
			return "-";
		}
	}
	
	void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
	public double getServiceDiscountRate(String type) {
		double discount = 0;
		if (isMember() == true) {
			if (type.equals("Premium")) {
				return discount = serviceDiscountPremium;
			}
			else if (type.equals("Gold")) {
				return discount = serviceDiscountGold;
			}
			else if (type.equals("Silver")) {
				return discount = serviceDiscountSilver;
			}
			else {
				return discount = discount;
			}
		}
		else {
			return discount = discount;
		}
	}
	
	public double getProductDiscountRate(String type) {
		double discount = 0;
		if (isMember() == true) {
			if (type.equals("Premium")) {
				return discount = productDiscountPremium;
			}
			else if (type.equals("Gold")) {
				return discount = productDiscountGold;
			}
			else if (type.equals("Silver")) {
				return discount = productDiscountSilver;
			}
			else {
				return discount = discount;
			}
		}
		else {
			return discount = discount;
		}
	}
	
	public String toString() {
		return "Name : "+name+", Gender : "+gender+", Age : "+age+" Member Type : "+getMemberType();
	}
	
	public void showPerson() {
		String customer = toString();
	}
}
