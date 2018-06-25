public class Tugas1{
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,};
		int arr2[] = {11,21,31,41,51,61,71,81,91};
		int arr3[] = {12,22,32,42,52,62,72,82,92};

		String arr4[] = {"a","v","a"};

		shiiitt(arr, 4);
	}
	public static void shiiitt(int[] s, int a){
		for (; a < s.length; a++) {
			System.out.print(s[a]+" ");
		}
	}
}