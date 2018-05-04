/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanRizaldi1 {
		public static void main(String[]args){
			Scanner key = new Scanner(System.in);
			int matkulA, matkulB, matkulC, matkulD,  matkulE, matkulF, matkulG, matkulH,syaratlulus;
			boolean hasil;

			syaratlulus = 7 ;

			System.out.println("Nilai matakuliah A: ");
			matkulA = key.nextInt();

			System.out.println("Nilai matakuliah B: ");
			matkulB = key.nextInt();

			System.out.println("Nilai matakuliah C: ");
			matkulC = key.nextInt();

			System.out.println("Nilai matakuliah D: ");
			matkulD = key.nextInt();

			System.out.println("Nilai matakuliah E: ");
			matkulE = key.nextInt();	

			System.out.println("Nilai matakuliah F: ");
			matkulF = key.nextInt();		

			System.out.println("Nilai matakuliah G: ");
			matkulG = key.nextInt();

			System.out.println("Nilai matakuliah H: ");
			matkulH = key.nextInt();

			hasil = matkulC>=syaratlulus && matkulD>=syaratlulus && matkulE>=syaratlulus && matkulA>=syaratlulus && ( (matkulB>=syaratlulus) && (matkulF>=syaratlulus) || (matkulB>=syaratlulus) && (matkulG>=syaratlulus) || (matkulB>=syaratlulus) && (matkulH>=syaratlulus) || (matkulF>=syaratlulus) && (matkulG>=syaratlulus) || (matkulF>=syaratlulus) && (matkulH>=syaratlulus) || (matkulG>=syaratlulus) && (matkulH>=syaratlulus) );

			System.out.println("Apakah Kamu lulus: " + hasil);

		}
	}