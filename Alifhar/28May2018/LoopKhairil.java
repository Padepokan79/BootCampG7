/*
	* Created by:	Alifhar Juliansyah
	* 				20-05-2018	22.59
	* Updated by:
	*
*/
import java.util.Scanner;
import java.util.Random;
public class LoopKhairil{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Random rand=new Random();
		String pilih;
		int soal, level, angka1, angka2, jawab, rest=1, benar=0, total=0;

		do{
			rest=1;
			do{
				System.out.print("Pilih level? ");
				level=scan.nextInt();
			}while(!(level>=1 && level<=6));

			do{
				System.out.print("Jumlah soal yang diinginkan? ");
				soal=scan.nextInt();
			}while(!(soal>=1 && soal<=100));
			total+=soal;

			for(int index=1; index<level; index++)
				rest*=10;

			for(int index=0; index<soal; index++){
				angka1=rand.nextInt(rest*9+1)+rest;
				angka2=rand.nextInt(rest*9+1)+rest;
				System.out.print(angka1+" + "+angka2+" = ");
				jawab=scan.nextInt();
				if(jawab==angka1+angka2){
					System.out.println("jawaban benar\n");
					benar++;
				}
				else
					System.out.println("jawaban salah\n");
			}
			System.out.print("Ingin mengulang? ");
			pilih=scan.next();
		}while(pilih.equals("ya"));

		System.out.println("==============================");
		System.out.println("Kamu benar "+benar+" soal dari "+total+" soal.");
		if(benar<0.25*total)
			System.out.println("Coba lagi ya");
		else if(benar>=0.25*total && benar<0.5*total)
			System.out.println("Oke lah masih mending");
		else if(benar>=0.5*total && benar<0.75*total)
			System.out.println("Sip lah masih di atas standar");
		else if(benar>=0.75*total && benar<total)
			System.out.println("Anda benar-benar matematikawan");
		else if(benar==total)
			System.out.println("PURRRRRFECT!!");
		System.out.println("==============================");
	}
}