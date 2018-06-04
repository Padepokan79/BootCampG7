/*
	* Created by:	Alifhar Juliansyah
	* 				22-05-2018	08.28
	* Updated by:
	*
*/
import java.util.Scanner;

public class LatArray11{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr1={25, 14, 56, 15, 36, 56, 77, 18, 29, 49}, same=new int[arr1.length/2];
		int rest=0;
		boolean notyet=true;

		System.out.println("\nArr 1 ");
		for(int arr : arr1)
			System.out.print(arr+" ");

		for (int index=0; index<arr1.length-1; index++)
			for(int index2=index+1; index2<arr1.length; index2++){
				notyet=true;
				if(arr1[index]==arr1[index2]){
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