
public class Costumer extends Person{
	
	private String memberType=" ", name;
	private boolean member= false;
	
	public Costumer() {
		
	}
	public Costumer(String name) {
		this.name = name;
	}
	@Override
	public void setPerson(char gender, int age) {
		this.gender = gender;
		this.age = age;
		
	}
	public String getName() {
		return name;
	}
	public boolean isMember() {
		return member;
	}
	public void setMember(boolean member) {
		this.member = member;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public String toString() {
		return "Nama : "+getName()+
				"\n------------------";
	}
}
