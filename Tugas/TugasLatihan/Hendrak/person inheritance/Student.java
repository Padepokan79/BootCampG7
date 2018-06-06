//Created by : Hendra Kurniawan
//Date : 5 Juni 2018 Time : 2:32 PM
//Modified :
package latihan;

public class Student extends Person{

	public Student()
	{
		
	}
	
	public Student(String firstName, String lastName, String gender, String interest,int age)
	{
		super(firstName, lastName, gender,interest,age);
	}
	
	public String greeting() {
		return "Yo, Im " + firstName ;
	}
}
