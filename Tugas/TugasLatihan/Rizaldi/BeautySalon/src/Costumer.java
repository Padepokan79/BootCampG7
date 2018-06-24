
public class Costumer extends Person{
	private String memberType;
	private Boolean isMember;
	
	public Costumer() {
		
	}
	public Costumer(String nama, String gender, int usia, String memberType, Boolean isMember) {
		super(nama, gender, usia);
		this.memberType = memberType;
		this.isMember = isMember;
	}

	// getter
	public  String getName() {
		return nama;
	}
	public String getGender() {
		return gender;
	}
	public String getMemberType() {
		return memberType;
	}
	public int getage() {
		return usia;
	}
	public Boolean getIsMember() {
		return isMember;
	}
	// setter
	void setName(String nama) {
		this.nama = nama;
	}
	void setGender(String gender) {
		this.gender = gender;
	}
	void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	void setAge(int usia) {
		this.usia = usia;
	}
	void setIsMember(Boolean isMember) {
		this.isMember = isMember;
	}
	
	public String toString() {
		return "\nNama\t\t\t: "+getName()+"\ngender\t\t\t: "+gender+"\nusia\t\t\t: "+usia+
				"\napakah anda member\t: "+getIsMember()+"\ntipe member\t\t: "+getMemberType();
	}

	
}
