/*  Created By: Vikri 
	07/05/2018
	14:03
*/ 
public class Ex5Drills2{
	public static void main(String[] args) {
	int apelBudi, apelBima, apel;
		apelBima = 4;
		apelBudi = 6;
		System.out.print("Jumlah apel Bima adalah " + apelBima + "dan apel Budi adalah " + apelBudi + " Lalu ditukar");
		apel = apelBudi;
		apelBudi = apelBima;
		apelBima = apel;
		System.out.print("Jumlah apel Bima menjadi " + apelBima + " dan apel Budi menjadi " + apelBudi);
	}
}