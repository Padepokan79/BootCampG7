/*
Creted by	: Yana
Time		: 21 Mei 2018 14.47
*/

public class TugasArray1{
	public static void main(String[] args){

		int[] angka 	= {1, 4, 2, 5, 7, 10};
		int[] number 	= new int[angka.length];

		for (int index = 0; index < angka.length; index++) {
			number[index] = angka[index];
		}
		for (int num : number) {
			System.out.print(num+", ");
		}
	}
}