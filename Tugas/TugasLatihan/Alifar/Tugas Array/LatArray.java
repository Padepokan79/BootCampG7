/*
	* Created by:	Alifhar Juliansyah
	* 				21-05-2018	14.50
	* Updated by:
	*
*/
public class LatArray{
	public static void main(String[] args) {
		int[] angka={1, 4, 2, 5, 7, 10}, number= new int[angka.length];

		for(int index=0; index<angka.length; index++)
			number[index]=angka[index];

		for(int num : number)
			System.out.println(num);		
	}
}