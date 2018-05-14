/*
	* Created by:	Alifhar Juliansyah
	* 				14-05-2018	09.32
	* Updated by:
	*
*/
import java.util.Scanner;

public class Ex18Drills2{
	public static void main(String[] args){
		int umur, umurAnak=25;
		double ganteng, kaya;
		boolean restuKakek, restuNenek, restuAyah, restuIbu;

		Scanner keyboard=new Scanner(System.in);

		System.out.println("Selamat Datang");

		System.out.print("Berapa umur anda? ");
		umur=keyboard.nextInt();

		System.out.print("Seberapa ganteng anda, skala 0.0 sampai 10.0? ");
		ganteng=keyboard.nextDouble();

		System.out.print("Berapa penghasilan anda? ");
		kaya=keyboard.nextDouble();
		System.out.println();

		restuKakek=(umur>=30 && kaya>=5000000);
		restuNenek=(umur>25 && umur<40 && ( kaya>5000000 || ganteng>=8 ));
		restuAyah=( (umur<=(umurAnak+5) && umur>=(umurAnak-5)) && (kaya>=5000000 || ganteng>=8));
		restuIbu=(umur>=17 && umur<30 && kaya>=5000000 && ganteng>=8);
		
		if(restuIbu)
			System.out.println("\nIbu,   menyetujui.");
		else
			System.out.println("Ibu,   tidak menyetujui.");
		if(restuAyah)
			System.out.println("Ayah,  menyetujui.");
		else
			System.out.println("Ayah,  tidak menyetujui.");
		if(restuNenek)
			System.out.println("Nenek, menyetujui.");
		else
			System.out.println("Nenek, tidak menyetujui.");
		if(restuKakek)
			System.out.println("Kakek, menyetujui.");
		else
			System.out.println("Kakek, tidak menyetujui.");
		if(!restuIbu && !restuAyah && !restuKakek && !restuNenek)
			System.out.println("\nTidak disetujui semua");
	}
}