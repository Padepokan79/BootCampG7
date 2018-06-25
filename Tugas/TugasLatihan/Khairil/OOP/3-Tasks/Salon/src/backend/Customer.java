package backend;

public class Customer extends Person {
	private String memberType;
	private boolean member;

	public Customer() {
		
	}
	
	public Customer(String nama) {
		name = nama;
	}
	
	public Customer(String nama, boolean member) {
		name = nama;
		this.member = member;
	}
	
	public Customer(String nama, boolean member, String memberType) {
		name = nama;
		this.member = member;
		this.memberType = memberType;
	}
	
	public void setName(String nama) {
		name = nama;
	}	
	
	public String getName() {
		return name;
	}
	
	public void setMember(boolean member) {
		this.member = member;
	}
	
	public boolean getMember() {
		return member;
	}
	
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
	public String getMemberType() {
		return memberType;
	}
	
	public String isMember(boolean member) {
		String cek = "";
		if(member == true) {
			cek = "Member";
		}
		else {
			cek = "Non-Member";
		}
		return cek;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

//	public String toString() {
//		return "Nama : " + name + "\nStatus : " + isMember();
//	}
}