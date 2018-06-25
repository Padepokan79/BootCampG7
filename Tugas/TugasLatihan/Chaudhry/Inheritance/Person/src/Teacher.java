
public class Teacher extends Person{
	String subject, prefix;
	
	public Teacher() {
		
	}
	public Teacher(String namaDepan, String namaBelakang, int age, String gender, String interest, String subjek) {
		super(namaDepan, namaBelakang, age, gender, interest);
		subject = subjek;
	}
	
	public String greeting() {
		if(gender.equals("Laki-Laki")) {
			prefix = "Mr.";
		
		}else if(gender.equals("Perempuan")){
			prefix = "Mrs.";
		}
		return "Hello namaku "+ prefix + lastName + " dan saya mengajar " + subject;
	}
	
}
