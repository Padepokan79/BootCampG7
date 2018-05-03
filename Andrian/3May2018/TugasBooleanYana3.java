/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanYana3{
		public static void main (String[]args){
			Scanner key = new Scanner(System.in);
			Scanner key1 = new Scanner(System.in);
			int semester, semesterminimun, semestermaksimum;
			String jenisK, beasiswa, status;
			double ipk, matkulAlgoritma, matkulDatabase, matkulPemrograman, rata2, rata2Minimum, matkulAlgoritmaMinimum, ipkppa, ipkppb;
			boolean hasil;

			semesterminimun = 3 ;
			semestermaksimum = 5 ;
			ipkppa = 2.75 ;
			ipkppb = 3.00 ; 
			matkulAlgoritmaMinimum = 8;
			rata2Minimum = 8 ;


			System.out.println("Jenis kelamin(laki-laki/perempuan): ");
			jenisK = key.next();

			System.out.println("Semester: ");
			semester = key.nextInt();

			System.out.println("Jenis beasiswa: ");
			beasiswa = key.next();

			System.out.println("IPK: ");
			ipk = key.nextDouble();

			System.out.println("Nilai matakuliah algoritma: ");
			matkulAlgoritma = key.nextInt();			

			System.out.println("Nilai matakuliah database: ");
			matkulDatabase = key.nextInt();

			System.out.println("Nilai matakuliah pemrograman: ");
			matkulPemrograman = key.nextInt();

			System.out.println("Status(mampu/tidak mampu): ");
			status = key1.nextLine();

			rata2 = (matkulDatabase+matkulPemrograman)/2;

			hasil = (jenisK.equals("laki-laki")||jenisK.equals("perempuan")) && (semester>=semesterminimun && semester<=semestermaksimum) && ( (beasiswa.equals("ppa") && ipk>=ipkppa && status.equals("tidak mampu") )||( beasiswa.equals("ppb") && ipk>=ipkppb && matkulAlgoritma>=matkulAlgoritmaMinimum && rata2>=rata2Minimum ));

			System.out.println("Apakah anda diterima: " +hasil);

		}
	}