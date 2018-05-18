/*
	* Created by:	Alifhar Juliansyah
	* 				17-05-2018	12.57
	* Updated by:
	*
*/
import java.util.Scanner;

public class TugasWhile2{
	public static void main(String[] args) {
		int kue=200, waktu=15, jam=8, menit=30, total;

		total=jam*60+menit;
		while(total>=0){
			kue-=3;
			total-=waktu;
		}

		System.out.print("Kue yang tersisa adalah "+kue);
	}
}