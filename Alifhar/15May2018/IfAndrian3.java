/*
	* Created by:	Alifhar Juliansyah
	* 				15-05-2018	08.52
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfAndrian3{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String predikat, nama, keterangan="Tidak Lulus";
		double nilai, uts, uas, tugas, total;

		System.out.println("=============================");
		System.out.print("Nama     : ");
		nama=scan.nextLine();
		System.out.print("UTS      : ");
		uts=scan.nextInt();
		System.out.print("UAS      : ");
		uas=scan.nextInt();
		System.out.print("Tugas    : ");
		tugas=scan.nextInt();
		System.out.println("=============================");
		
		total=uts*0.3+uas*0.3+tugas*0.4;
		if(total>0 && total<20)
			predikat="E";
		else if(total>=20 && total<40)
			predikat="D";
		else if(total>=40 && total<60)
			predikat="C";
		else if(total>=60 && total<80){
			predikat="B";
			keterangan="Lulus";

		}
		else if(total>=80 && total<=100){
			predikat="A";
			keterangan="Lulus";
		}
		else
			predikat="error";

		System.out.println("Selamat \""+nama+"\", predikat yang anda dapatkan "+predikat+" dan anda dinyatakan "+keterangan);
	}
}