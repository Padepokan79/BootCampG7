import java.util.*;

public class Account {
	String name;
	int idNumber;
	double saldo;
	
	public Account(String name, int idNumber) {
		this.name = name;
		this.idNumber = idNumber;
	}
	
	void dataNasabah() {
		System.out.println("nama anda	: "+name);
		System.out.println("id anda		: "+idNumber);
		System.out.println("saldo anda	: "+saldo);
	}
}
