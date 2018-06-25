package Person;

public class Teachers extends Person{
	
	String prefix, subject;
	public Teachers(int umur, String nama, String nama2, String jenis, String hoby, String subject) {
		super(umur, nama, nama2, jenis, hoby);
		this.subject = subject;
	}
	String greeting() {
		if (super.genders.contentEquals("Perempuan")) {
			prefix = "Mrs. "; 
		}
		else {
			prefix = "Mr. ";
		}
		return "Greeting {Hallo My name is "+prefix+lastName+" and I teach "+subject+"}";
	}
}
