/*
     * Operasi Matematika 08
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 08 May 2018 22:40
     * Updated By : 
     * Updated At : 
*/

public class OperasiMathRicha2{
	public static void main(String[] args) {
          double kelilingLapangan,waktuMengelilingiPerhari;
          int banyakMemutari, kecepatanLari;
		
          kelilingLapangan = 0.5; //Km
          banyakMemutari = 5;
          kecepatanLari = 5/1; //km/jam

          waktuMengelilingiPerhari = (banyakMemutari*kelilingLapangan)/kecepatanLari;

          System.out.println("Waktu Oni Mengelilingi Lapangan Adalah : "+waktuMengelilingiPerhari+" Jam");
	}
}