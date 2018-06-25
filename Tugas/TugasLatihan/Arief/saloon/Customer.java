package saloon;

public class Customer extends Person {
	private String memberType;
	private boolean member=false;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String nm, String jk, int usia) {
		 name = nm;
		 gender = jk;
		 age = usia;
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
	
	String getMemberType() {
		return memberType;
	}
	
	void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
	String AbstractPerson() {
		return 	"Customer's name\t\t: " + name +
				"\nGender\t\t\t: " + gender +
				"\nAge\t\t\t: " + age + " years old" +
				"\n============================================";
	}

}
