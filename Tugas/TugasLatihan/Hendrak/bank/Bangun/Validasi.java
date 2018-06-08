package Bangun;
import java.util.Scanner;

public class Validasi {
	Scanner keyboard = new Scanner(System.in);
	String pilih;
	int minInput=0,maxInput=5;
	
	//buat konstraktor untuk inisialisasi agar saat buat objek bisa langsung diisi
	public Validasi(){
		
	}
	//parameter bisa ditambah String pertanyaan==> 
	public String validasiInput(String p, boolean cek, String m) {
		
		do {
			
			p= keyboard.nextLine();
			if(p.matches("[0-9-.]+")){
				if(m.equals("m")) {
					if(Integer.parseInt(p)>minInput&&Integer.parseInt(p)<maxInput)
					{
						cek=true;
					} else {
						System.out.println("Silahkan inputkan berupa angka dari 1.sd.4");
						cek= false;
					}
				}
				else if(m.equals("p")) {
					if(Double.parseDouble(p)>0)
					{
						cek=true;
					} else {
						System.out.println("Silahkan inputkan berupa angka mulai dari 1");
						cek= false;
					}
				}
			} else if(p.indexOf('-') == 0) {
				System.out.println("Maaf, inputan tidak boleh negatif.");
				cek = false;
			} 
			else {
				System.out.println("Maaf, inputan harus angka.");
				cek = false;
			}
		}while(cek == false);
		
		return p;
		}
}



/*
 do {
			System.out.print("Pilih Perhitungan : ");
			p= keyboard.nextLine();
			if(p.matches("[0-9]+")){
				if(Integer.parseInt(p)>0 && Integer.parseInt(p)<5){
					cek=true;
				} else {
					System.out.println("Silahkan inputkan berupa angka dari 1 s.d 4.");
					cek= false;
				}
			} else {
				System.out.println("Maaf, inputan harus angka");
				cek = false;
			}
		}while(cek == false);
		
		public static String validasi(String p, boolean cek) {
		Scanner keyboard = new Scanner(System.in);
		
		do {
			
			p= keyboard.nextLine();
			if(p.matches("[0-9]+")){
				if(Integer.parseInt(p)>0 && Integer.parseInt(p)<5){
					cek=true;
				} else {
					System.out.println("Silahkan inputkan berupa angka dari 1 s.d 4.");
					cek= false;
				}
			} else {
				System.out.println("Maaf, inputan harus angka");
				cek = false;
			}
		}while(cek == false);
		
	return p;
	}
	
	
		public String validasiMenu(String p, boolean cek) {

		do {
			p= keyboard.nextLine();
			if(p.matches("[0-9]+")){
				if(Integer.parseInt(p)>0 && Integer.parseInt(p)<5){
					cek=true;
				} else {
					System.out.println("Silahkan inputkan berupa angka dari 1 s.d 4.");
					cek= false;
				}
			} else {
				System.out.println("Maaf, inputan harus angka.");
				cek = false;
			
			}
		}while(cek == false);
		
	return p;
	}
	
*/
