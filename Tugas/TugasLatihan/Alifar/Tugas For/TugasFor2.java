/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	11.45
	* Updated by:
	*
*/
import java.util.Scanner;

public class TugasFor2{
	public static void main(String[] args) {
		int kue=200, waktu=15, jam=8, menit=30, total;

		for(total=jam*60+menit; total>=0; total-=waktu)
			kue-=3;

		System.out.print("Kue yang tersisa adalah "+kue);
	}
}