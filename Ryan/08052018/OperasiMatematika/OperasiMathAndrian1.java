/*
     * Operasi Matematika 03
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 08 May 2018 21:50
     * Updated By : 
     * Updated At : 
*/

public class OperasiMathAndrian1{
	public static void main(String[] args) {
		int jmlKarungBeras, beratKarungBeras, 
			terjualHari1, terjualHari2, jmlBerat, jmlTerjual, jmlSisa;

		jmlKarungBeras = 12;
		beratKarungBeras = 50;
		terjualHari1 = 175;
		terjualHari2 = 120;
		jmlBerat  = jmlKarungBeras*beratKarungBeras;
		jmlTerjual = terjualHari1 + terjualHari2;
		jmlSisa = jmlBerat - jmlTerjual;

		System.out.println("Sisa Beras di warung Bu Poniem adalah : "+jmlSisa+" Kg.");

	}
}