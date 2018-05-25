/*
	Created By Vikri
	21/05/2018
	14:45
*/
public class LatihanArray1{
	public static void main(String[] args) {
		int[] angka= {1, 4, 2, 5, 7};
		int number[] = new int[angka.length];

		for (int i = 0; i < angka.length; i++) {
			number[i] = angka[i];
			System.out.print(number[i]+" ");
		}
	}
}