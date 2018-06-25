package Salon;

public class Costumer extends AbstracPerson {
	private String nama, memberType;
	private boolean member = false;
	
	public Costumer(String nama, String jenisKelamin, int umur) {
		this.jenisKelamin = jenisKelamin;
		this.umur = umur;
		name = nama;	
	}

	String getName() {
		return name;
	}
	
	String getMemberType() {
		return memberType;
	}
	
	void setMemberType( String memberType ) {
		this.memberType = memberType;
	}

	void setMember (boolean member ) {
		this.member = member;
	}
	
	boolean isMember() {
		return member;
	}
	
	boolean cekMember() {
		String cek ="";
		if (member==true) {
			System.out.println("Member");
		}
		else {
			System.out.println("Non-member");
		}
		return member;
	}
	
	public void printAbstract() {
		System.out.println("Name : "+name);
		System.out.println("Jenis kelamin : "+jenisKelamin);
		System.out.println("Umur : "+umur);
	}
	
	public String toString () {
		return "===========================================\nCustomer name \t\t\t: "+name+"\nAre you member \t\t\t: "+member+"\nType of member \t\t\t: "+memberType;
	}

	
}
