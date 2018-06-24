package iFace;

abstract class Person {
	String nama;
	public Person(String nama) {
		this.nama = nama;
	}
	abstract String getName();
	public abstract String toString();
}
