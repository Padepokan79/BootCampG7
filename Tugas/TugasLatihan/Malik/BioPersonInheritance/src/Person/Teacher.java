package Person;

public class Teacher extends Person{
	String subjek, prefix="Mr.";
	Teacher(String firstName, String lastName, int age, String gender, String interest, String subjek){
		super(firstName, lastName, age, gender, interest);
		this.subjek = subjek;
	}
	
	String toGreet() {
		if (gender.equals("male")) {
			prefix = "Mr.";
		}else {
			prefix = "Mrs.";
		}
		return "Hello My name is "+prefix+" "+lastName+" and i teach "+subjek;
	}
}
