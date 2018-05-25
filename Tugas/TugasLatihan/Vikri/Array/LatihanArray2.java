/*
	Created By Vikri
	21/05/2018
	15:15
*/
public class LatihanArray2{
	public static void main(String[] args) {
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int total = 0;
		for (int i = 0; i < arr1.length; i++) {
			int num = arr1[i];
			total += num;
		}
		System.out.println("Jumlah: "+total);
		System.out.println("Jumlah Rata-Rata: "+(total/arr1.length));
	}
}