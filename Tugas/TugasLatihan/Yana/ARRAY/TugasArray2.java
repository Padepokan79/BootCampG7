/*
Creted by	: Yana
Time		: 21 Mei 2018 14.47
*/

public class TugasArray2{
	public static void main(String[] args){

		int[] angka 	= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int	jumlah=0, rataan;

		for (int index = 0; index < angka.length; index++) {
			jumlah = jumlah + angka[index];
			// System.out.println("Jumlah periodik : " +jumlah);
		}
		rataan = jumlah / angka.length();
		System.out.println("Jumlah : " +jumlah);
		System.out.println("Rataan : " +rataan);
	}
}