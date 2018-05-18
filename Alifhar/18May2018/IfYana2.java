/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	06.44
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfYana2{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int kode, semester;
		double ipk;
		String jar, rak, alg, bas, struk;

		System.out.print("Jurusan : ");
		kode=scan.nextInt();	
		System.out.print("Semester : ");
		semester=scan.nextInt();
		System.out.print("IPK : ");
		ipk=scan.nextDouble();

		if(kode==345 || kode==321){
			System.out.print("Nilai prak. Algoritma : ");
			alg=scan.next();
			System.out.print("Nilai prak. Basis Data : ");
			bas=scan.next();
			System.out.print("Nilai prak. Struktur Data : ");
			struk=scan.next();
			if(semester>=3 && semester<=5 && ipk>=3 && alg.equals("A") && (bas.equals("A")||struk.equals("A")))
				System.out.println("Anda memenuhi persyaratan mendaftar beasiswa jurusan Apalah");
		}

		if(kode==532){
			System.out.print("Nilai prak. Jaringan : ");
			jar=scan.next();
			System.out.print("Nilai prak. Rakitan : ");
			rak=scan.next();
			if(semester>=3 && semester<=5 && ipk>=3.25 && jar.equals("A") && (rak.equals("A")||rak.equals("A")))
				System.out.println("Anda memenuhi persyaratan mendaftar beasiswa jurusan Teknik Komputer");
		}
	}
}
