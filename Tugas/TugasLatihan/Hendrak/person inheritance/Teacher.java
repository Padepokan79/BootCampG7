//Created by : Hendra Kurniawan
//Date : 5 Juni 2018 Time : 2:32 PM
//Modified :
package latihan;

public class Teacher extends Person{
	String subject, prefix;
	
	public Teacher() {
		
	}
	
	public Teacher(String firstName, String lastName, String gender, String interest,int age, String subject) {
		super(firstName, lastName, gender, interest, age);
		this.subject = subject;
	}
	
	public String greeting() {
		if(gender.equals("Male")) {
			prefix = "Mr.";
		}
		else if(gender.equals("Female"))
		{
			prefix = "Mrs.";
		}
		
		return "Hello, my name is " + prefix + " " + lastName + " and i teach " + subject ;
	}
	
}
