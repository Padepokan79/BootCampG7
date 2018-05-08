/*  Created By: Vikri 
	07/05/2018
	15:15
*/ 
public class Ex6Drills2{
	public static void main(String[] args) {
		int untung2, untung = 0,total = 0,jumlah = 0, uangkini = 0 ,uang = 700000, baju = 12;
		uangkini = baju * 56000;
		jumlah = uang - uangkini;
		System.out.println("Ade mempunyai uang sebesar 700.000."+
			"kemudian ia membeli baju sebanyak 12 setel untuk dijual kembali."+
			"\n Setiap setelnya ia beli dengan harga Rp. 56.000.\n Jika ia berhasil "+
			"menjual baju itu sebanyak 10 setel dan mendapat untung 20%,\n berapa uang yang dimiliki Ade saat ini?.");
		untung = 56000*1/5; 
		untung2 = 56000+untung;
		total = untung2*10+jumlah;
		System.out.println("\nUangnya kini adalah Rp. " + total);
	}
}