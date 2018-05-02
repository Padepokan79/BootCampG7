/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	10.05
	* Updated by:
	*
*/

public class Nurwan{
	public static void main(String[] args){
		double kesehatan, pokok, bonusbulan, lembur, pph;
		double bonus=500000, transport=750000;
		double umkB=3091345.56, umkJ=3648035;
		double total;

		double april;
		bonusbulan=0;
		pokok=umkB*120.0/100.0;
		kesehatan=2.0/100.0*pokok;
		bonusbulan=2*bonus;
		lembur=1.5*(1.0/173.0)*pokok*10;
		april=pokok+kesehatan+bonusbulan+lembur;
		pph=(5.0/100.0)*april;
		april=april-pph;
		System.out.println("Salary Bulan April");
		System.out.println("*******************************");
		System.out.println("Nama : Nurwan");
		System.out.println("Posisi : Programmer");
		System.out.println("*******************************");
		System.out.printf("Gaji Pokok 	: %.2f\n",pokok);
		System.out.printf("T.Kesehatan	: %.2f\n",kesehatan);
		System.out.printf("Bonus		: %.2f\n",bonusbulan);
		System.out.printf("Lembur		: %.2f\n",lembur);
		System.out.printf("\nPPH		: %.2f\n",pph);
		System.out.println("===============================");
		System.out.printf("Take Home Pay	: %.2f\n",april);
		System.out.println("===============================");

		double mei;
		bonusbulan=0;
		pokok=umkB*120.0/100.0;
		kesehatan=2.0/100.0*pokok;
		lembur=1.5*(1.0/173.0)*pokok*5;
		mei=pokok+kesehatan+lembur;
		pph=5.0/100.0*mei;
		mei=mei-pph;
		System.out.println("\nSalary Bulan Mei");
		System.out.println("*******************************");
		System.out.println("Nama : Nurwan");
		System.out.println("Posisi : Programmer");
		System.out.println("*******************************");
		System.out.printf("Gaji Pokok 	: %.2f\n",pokok);
		System.out.printf("T.Kesehatan	: %.2f\n",kesehatan);
		System.out.printf("Bonus		: %.2f\n",bonusbulan);
		System.out.printf("Lembur		: %.2f\n",lembur);
		System.out.printf("\nPPH		: %.2f\n",pph);
		System.out.println("===============================");
		System.out.printf("Take Home Pay	: %.2f\n",mei);
		System.out.println("===============================");

		double juni;
		bonusbulan=0;
		pokok=umkJ*120.0/100.0;
		kesehatan=2.0/100.0*pokok;
		bonusbulan=1*bonus;
		lembur=1.5*(1.0/173.0)*pokok*12;
		juni=pokok+kesehatan+bonusbulan+lembur+transport;
		pph=5.0/100.0*juni;
		juni=juni-pph;
		System.out.println("\nSalary Bulan Juni");
		System.out.println("*******************************");
		System.out.println("Nama : Nurwan");
		System.out.println("Posisi : Programmer");
		System.out.println("*******************************");
		System.out.printf("Gaji Pokok 	: %.2f\n",pokok);
		System.out.printf("T.Kesehatan	: %.2f\n",kesehatan);
		System.out.printf("Bonus		: %.2f\n",bonusbulan);
		System.out.printf("Lembur		: %.2f\n",lembur);
		System.out.printf("\nPPH		: %.2f\n",pph);
		System.out.println("===============================");
		System.out.printf("Take Home Pay	: %.2f\n",juni);
		System.out.println("===============================");

		total=april+mei+juni;
		System.out.printf("\nTotal Take Home Pay 3 Bulan: %.2f\n",total);
	}
}
