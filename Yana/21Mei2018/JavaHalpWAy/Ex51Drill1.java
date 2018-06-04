/*
Creted by	: Yana
Time		: 21 Mei 2018 14.42
*/

public class Ex51Dill1{
	public static void main(String[] args){

		int[] arr = new int[1000];

		arr[0] =6;

		for(int i=0; i < arr.length; i++){
			arr[i] =1+(int) (Math.random()*100);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(arr[0]+","+arr[1]+", "+arr[2]);
	}
}