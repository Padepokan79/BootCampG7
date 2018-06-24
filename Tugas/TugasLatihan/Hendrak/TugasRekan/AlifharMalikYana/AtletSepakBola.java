package AlifharMalikYana;
import java.util.Random;

public class AtletSepakBola extends Atlet{
	private String posisi;
	private int power, stamina, accuary, speed;
	Random rand = new Random();
	Atlet atlet;
	public AtletSepakBola() {
		
	}
	
	public AtletSepakBola(int tinggi, int berat,int usia, String nama,String jenisKelamin,String id, String posisi, int power, int stamina,int accuary,int speed) {
		super(tinggi, berat, usia, nama,jenisKelamin, id);
		this.posisi = posisi;
		this.power = power;
		this.stamina = stamina;
		this.accuary = accuary;
		this.speed = speed;
	}
	
	public AtletSepakBola(Atlet atlet, String posisi, int power, int stamina,int accuary,int speed) {
		this.atlet = atlet;
		this.posisi = posisi;
		this.power = power;
		this.stamina = stamina;
		this.accuary = accuary;
		this.speed = speed;
	}
	
	public String toString() {
		return "" +super.toString() + 
			   "Posisi : " + posisi +
			   "\nPower  : " + power +
			   "\nStamina: " + stamina +
			   "\nAccuary: " + accuary +
			   "\nSpeed  : " + speed;
	}
	
	public String latihTendang(int jmlTendang) {
		int gol = 0, jmlhGol = 0;
		int hasil=0;
		for(int i=0;i < jmlTendang; i++) {
			gol = (accuary+ power)/2;
			hasil = rand.nextInt(10-gol);
			if(hasil < 2)
			{
				jmlhGol += 1;
			}
		}
		return "Gol yang kamu cetak adalah " +jmlhGol;
	}
	
	public String latihLari(int jarak) {
		int kekuatan = (stamina + power)/2;
		int totalJarak =jarak * 10;
		double waktu = totalJarak/kekuatan;
		
		return "Kamu berhasil menempuh jarak " + jarak + "Km dengan waktu " +waktu + " menit"; 
	}
}
