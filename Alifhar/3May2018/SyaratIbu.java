/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	09.19
	* Updated by:
	*
*/

import java.util.Scanner;

public class SyaratIbu{
	public static void main(String[] args){
		int umur, umurAnak=25;
		double ganteng, kaya;
		boolean boleh;

		Scanner keyboard=new Scanner(System.in);

		System.out.println("Saya sedang mencarikan pasangan untuk anak saya, "+umurAnak+" tahun");

		System.out.print("Berapa umur anda? ");
		umur=keyboard.nextInt();

		System.out.print("Seberapa ganteng anda, skala 0.0 sampai 10.0? ");
		ganteng=keyboard.nextDouble();

		System.out.print("Berapa penghasilan anda? ");
		kaya=keyboard.nextDouble();

		boleh=(umur>=17 && umur<30 && kaya>=5000000 && ganteng>=8);
		System.out.println("Dibolehkan menjadi pasangan anak saya : "+boleh);
	}
}