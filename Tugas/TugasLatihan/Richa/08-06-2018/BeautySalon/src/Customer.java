/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 09.05 AM
Updated by			:
Updated Date/hour	:
*/

public class Customer extends Person {
	
	private String namaCustomer, memberType;
    private boolean member;
    

    public Customer () {
    }
    
    public Customer (String namaCustomer) {
    	this.namaCustomer = namaCustomer;
    }
    
    String getName () {
    	return namaCustomer;
    }
    
    boolean isMember () {
    	return member;
    }
    void setMember (boolean member) {
    	this.member = member;
    }

	String getMemberType() {
		return memberType;
	}

	void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
    public String toString() {
    	return "Nama customer: " + nama + " usia: " + usia + " gender: " + gender + " member type: " + memberType;
    }
	
	
}
