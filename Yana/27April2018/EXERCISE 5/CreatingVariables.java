public class CreatingVariables{
	public static void main(String[] args){
		int x, y, age, postCode, a, b, temp;
		double second, e, checking, gpa;
		String firstName, lastName, title, city, university;

		x = 10;
		y = 400;
		age = 39;

		second = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
 
		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr";

		city = "New York";
		postCode = 4456;
		university = "Harvard University";
		gpa = 3.8;

		a = 20;
		b = 50;

		temp = a;
		a = b;
		b = temp;		

		System.out.println("The variable x contains " +x);
		System.out.println("The value " +y+ " is stored in the variable y.");
		System.out.println("The experiment took " +second+ " second");
		System.out.println("A favourite irritational # is Euler's number: " +e);
		System.out.println("Hopefully you have more than $" +checking+ "!");
		System.out.println("My name's "+title+ " " +firstName + lastName);
		System.out.println("I live in " +city+ " " +postCode);
		System.out.println("I study in " +university);
		System.out.println("My GPA is " +gpa);
		System.out.println();
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}
}