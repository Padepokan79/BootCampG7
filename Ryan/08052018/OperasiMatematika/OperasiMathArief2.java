/*
     * Operasi Matematika 06
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 08 May 2018 22:22
     * Updated By : 
     * Updated At : 
*/

public class OperasiMathArief2{
	public static void main(String[] args) {
          int banyakTokoHelm, penjualanHelmPerHari,
              hasilPenjualanPerHari, penjualanHelmPerMinggu, 
              hargaHelmA, hargaHelmB, hargaHelmC,
              hasilPenjualanPerMinggu;

          banyakTokoHelm = 5;
          penjualanHelmPerHari = 3;
          penjualanHelmPerMinggu = penjualanHelmPerHari*7; 
          hargaHelmA = 250000;
          hargaHelmB = 50000;
          hargaHelmC = 650000;
          hasilPenjualanPerHari = hargaHelmA + hargaHelmB + hargaHelmC;
          hasilPenjualanPerMinggu = hasilPenjualanPerHari*7;

          System.out.println( "Hasil Penjualan Helm dalam 1 Minggu adalah : ");
          System.out.println(penjualanHelmPerMinggu + " Helm");
          System.out.println("Rp."+hasilPenjualanPerMinggu);
	}
}