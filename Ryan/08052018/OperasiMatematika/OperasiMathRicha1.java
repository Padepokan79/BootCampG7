/*
     * Operasi Matematika 07
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 08 May 2018 22:26
     * Updated By : 
     * Updated At : 
*/

public class OperasiMathRicha1{
	public static void main(String[] args) {
		int kecepatanAwalPerjam, keterlambatan, kmPerMenit, kmTamabahn, kecepatanAkhir;

          kecepatanAwalPerjam = 30; //km perjam
          keterlambatan = 10; //dalam menit
          kmPerMenit = 60/kecepatanAwalPerjam;
          kmTamabahn = keterlambatan/kmPerMenit;
          kecepatanAkhir = kecepatanAwalPerjam+kmTamabahn;

          System.out.println("Kecepatan Yang harus ditempuh agar tepat waktu adalah : "+kecepatanAkhir+" km/jam");
	}
}