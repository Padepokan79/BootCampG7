//Created by vikri
//08/06/2018

package gajiIt;

abstract class Person {
	String nama;
	public Person(String nama) {
		this.nama = nama;
	}
	abstract String getName();
	public abstract String toString();
}
