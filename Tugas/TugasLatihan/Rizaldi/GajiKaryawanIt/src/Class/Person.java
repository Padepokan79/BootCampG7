package Class;

public abstract class Person {
	private String nama;
	
	
	public Person() {
		
	}
	public Person(String nama) {
		this.nama = nama;
	}
	
	// setter getter
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public abstract String toString();
}
