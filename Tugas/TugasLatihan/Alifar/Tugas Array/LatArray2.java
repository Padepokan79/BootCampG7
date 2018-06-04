/*
	* Created by:	Alifhar Juliansyah
	* 				21-05-2018	15.11
	* Updated by:
	*
*/
public class LatArray2{
	public static void main(String[] args) {
		int[] arr1={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		double sum=0, average;

		for(int index=0; index<arr1.length; index++){
			sum+=arr1[index];
		}
		
		average=sum/arr1.length;
		System.out.println("Rata-ratanya adalah "+average);
	}
}
//rata-rata
//apakah ada suatu bilangan
//suatu bilangan ada di posisi/index ke berapa
//terima nilai dan ubah nilai u/ suatu posisi pada arr1