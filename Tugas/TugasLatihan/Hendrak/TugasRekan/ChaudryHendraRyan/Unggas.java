package ChaudryHendraRyan;

public class Unggas {
	private String nama, warnaBulu, alatPernapasan,suara;
	private int lamaHidup, ukuran, lamaBertelur;
	
	public Unggas() {
		
	}
	
	public Unggas(String nama, String warna, String alatNapas, String suara, int lamaH, int ukuran, int lamaT) {
		this.nama = nama;
		warnaBulu = warna;
		alatPernapasan = alatNapas;
		this.suara = suara;
		lamaHidup = lamaH;
		lamaBertelur = lamaT;
		this.ukuran = ukuran;
	}
	
	public String getNama() {
		return nama;
	}
	
	public String getSuara() {
		return "" + suara;
	}
	
	public void bunyi() {
		System.out.println("Unggas ini bersuara " +suara);
	}
	
	public String toString() {
		return     "Nama Unggas      : " + nama + "\n" +
				   "Warna Bulu       : " + warnaBulu + "\n" +
				   "Alat Pernapasan  : " + alatPernapasan + "\n"+
				   "Suara            : " + suara + "\n"+
				   "Lama Hidup       : " + lamaHidup + " tahun\n" +
				   "Lama Bertelur    : " + lamaBertelur  + " hari \n" +
				   "Ukuran           : " + ukuran + " Cm \n"
				   ; 
	}
}