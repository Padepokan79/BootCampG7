public class Ex6Drills2{
	public static void main(String[] args){
		int uangAnto, hargaBaju, daftarLomba, hadiahLomba, hargaBoneka, sisaUang;

		uangAnto = 100000;
		hargaBaju = 20000;
		daftarLomba = 50000;
		hadiahLomba = 120000;
		hargaBoneka = 80000;
		sisaUang = 0;

		/*sisaUang = uangAnto - hargaBaju - daftarLomba - hargaBoneka +hadiahLomba;

		uangAnto = sisaUang;*/

		/*uangAnto = uangAnto - hargaBaju;
		uangAnto = uangAnto - daftarLomba;
		uangAnto = uangAnto + hadiahLomba;
		uangAnto = uangAnto - hargaBoneka;*/

		uangAnto = uangAnto - hargaBaju - daftarLomba - hargaBoneka;
		uangAnto = uangAnto + hadiahLomba;

		System.out.println("Total sisa uang Anto adalah Rp " +uangAnto);
	}
}