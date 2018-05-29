public class Drills2 {
	public static void main(String[] args) {
		int a,b,ex;

		a = 20;
		b = 50;
		ex = 0;

		ex = a; //ex menjadi nilai a dan nilai a 0...
		a = b; //a menjadi nilai b dan nilai a 50...
		b = ex; //b menjadi nilai ex dan nilai b 20

		System.out.println("Nilai a = " + a);
		System.out.println("Nilai b = " + b);
	}
}