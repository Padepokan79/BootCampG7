package customer;

public class Customer extends Person{
	String memberType, memb;
	private static boolean member;
	
	public Customer(String name, String gender, int usia,boolean memberBukan, String memberType) {
		super(name, gender, usia);
		this.setMember(memberBukan);
		this.setMemberType(memberType);
	}
	
	String getName() {
		return name;
	}
	
	int getUsia() {
		return usia;
	}
	
	String getGender() {
		return gender;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setUsia(int usia) {
		this.usia = usia;
		
	}
	
	void setGender(String gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return 	"Nama: "+name+"\n"+
				"Apakah anda member: "+isMember()+"\n"+
				validMember(isMember());
	}
	String validMember(boolean cek) {
		setMember(cek);
		if(isMember() == false) {
			memb = "";
		} else {
			memb = "Member Apa: "+getMemberType()+"\n";
		}
		return memb;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public static boolean isMember() {
		return member;
	}

	public static void setMember(boolean member) {
		Customer.member = member;
	}
}
