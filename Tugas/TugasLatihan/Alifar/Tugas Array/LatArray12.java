/*
	* Created by:	Alifhar Juliansyah
	* 				22-05-2018	08.59
	* Updated by:
	*
*/
import java.util.Scanner;

public class LatArray12{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr1={25, 14, 56, 15, 36, 56, 77, 18, 29, 49}, arr3={2, 39, 47, 14, 36, 56, 57, 49, 43, 79}, same=new int[arr1.length];
		int rest=0;
		boolean notyet=true;

		System.out.println("\nArr 1 ");
		for(int arr : arr1)
			System.out.print(arr+" ");

		System.out.println("\nArr 3 ");
		for(int arr : arr3)
			System.out.print(arr+" ");

		for (int index=0; index<arr1.length; index++)
			for(int index2=0; index2<arr3.length; index2++){
				notyet=true;
				if(arr1[index]==arr3[index2]){
					for(int index3=0; index3<rest; index3++)
						if(arr1[index]==same[index3])
							notyet=false;
					if(notyet){
						same[rest]=arr1[index];
						rest++;
					}
				}
			}

		System.out.println("\n\nYang sama: ");
		for(int index=0; index<rest; index++)
			System.out.print(same[index]+" ");
		System.out.println();
	}
}