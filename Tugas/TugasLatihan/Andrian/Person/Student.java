package bootcamp;

public class Student extends Person {
	
	//concturcor
		public Student (String namaDepan, String namaBelakang, String jenisKelamin, String hobi, int umur) {
			super (namaDepan, namaBelakang, jenisKelamin, hobi, umur, hobi);
		}
		//object
		String toStringBio() {
			return super.toStringBio() ;
		}
		
		String toStringGreeting() {
			return "Yo! i'm " + firstName + ".";
		}
		
}
