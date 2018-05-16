/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	10.35
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfVikri2{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String nama, spp;
		double mtk, agama, pemb, utang;

		System.out.print("Nama              : ");
		nama=scan.next();
		System.out.print("Nilai MTK         : ");
		mtk=scan.nextInt();
		System.out.print("Nilai Agama       : ");
		agama=scan.nextInt();
		System.out.print("SPP lunas (y/n)   : ");
		spp=scan.next();
		System.out.print("Utang pembangunan : ");
		utang=scan.nextInt();
		System.out.println();

		if(!nama.equals("andi") && mtk>=72 && agama>=75)
			System.out.println("Anda naik kelas");
		else if(spp.equals("y") && utang==0)
			System.out.println("Anda naik kelas");
		else
			System.out.println("Anda tidak naik kelas");
	}
}