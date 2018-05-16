/*
	DATE CREATED 	: 16 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class vikri02{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		String inputNama, inputSpp;
		int nilaiMtk, inputMtk, nilaiAgama, inputAgama, inputHutang, nol; 
		boolean banding1, banding2;
		nilaiMtk   = 72;
		nilaiAgama = 75;
		nol   	   = 0;

		System.out.print("Siapa nama anda           : ");
		inputNama = key.next();

		System.out.print("Nilai MTK                 : ");
		inputMtk = key.nextInt();

		System.out.print("Nilai Agama               : ");
		inputAgama = key.nextInt();

		System.out.print("Apa SPP anda lunas (y/t)  : ");
		inputSpp = key.next();

		System.out.print("Berapa utang anda         : ");
		inputHutang = key.nextInt();


		banding1 = ( !inputNama.equals("andi") && inputMtk >= nilaiMtk && inputAgama >= nilaiAgama );
		banding2 = ( inputSpp.equals("y") && inputHutang == nol );
		if (banding1 || banding2) {
			System.out.println("Anda dinyatakan naik kelas");
		}else{
			System.out.println("Anda dinyatakan tidak naik kelas");
		}

	}
}