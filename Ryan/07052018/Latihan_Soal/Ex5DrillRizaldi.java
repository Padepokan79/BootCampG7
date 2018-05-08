/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At :    
     * Updated By : 
     * Updated At : 
*/
public class Ex5DrillRizaldi{
	public static void main(String[] args) {
		int hargaMobil, pinjaman, tahunBeli, tahunPinjam;
		String nama1, nama2, kendaraan, dipinjam,hewan;

		hargaMobil=2000000;
		pinjaman=1000000;
		tahunBeli=2018;
		tahunPinjam=2019;

		nama1= "ani";
		nama2= "rubi";
		kendaraan= "mobil";
		dipinjam= "uang";
		hewan= "kucing";

		System.out.println(nama1 + " ingin membeli "+ kendaraan + " seharga Rp."+hargaMobil+" bulan november "+tahunBeli+",\nsedangkan "+nama2+" ingin meminjam "+dipinjam+" "+nama1+" sejumlah Rp."+pinjaman+" untuk membeli "+hewan+".\nsehingga "+nama1+" terpaksa menunda jadwal pembelian pada bulan januarin "+tahunPinjam);

	}
}