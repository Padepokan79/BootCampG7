
public class Customer extends Person {
	private String nama, memberType;
	private boolean member = false;
	
	public Customer() {
		
	}
	public Customer(String nama, String jk, int umur) {
		this.nama 	= nama;
		jenisKelamin= jk;
		usia 		= umur;
	}
	public Customer(String nama, String jk, int umur, boolean member, String memberType) {
		this.nama 	= nama;
		jenisKelamin= jk;
		usia 		= umur;
		this.member = member;
		this.memberType = memberType;
	}
	
	String getNama() {
		return nama;
	}
	
	boolean isMember() {
		return member;
	}
	void setMember(boolean m) {
		member 	= m;
	}
	
	String getMemberType() {
		return memberType;
	}
	void setMemberType(String type) {
		memberType = type;
	}
	
	public void tampilData() {
		System.out.println("Nama          : "+nama);
		System.out.println("Jenis Kelamin : "+jenisKelamin);
		System.out.println("Usia          : "+usia);
		System.out.println("member        : "+member);
		System.out.println("Tipe member   : "+memberType);
	}
}
