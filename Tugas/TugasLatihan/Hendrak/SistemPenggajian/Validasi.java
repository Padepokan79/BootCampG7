package SistemPenggajianKaryawanIT;
import java.util.Scanner;
public class Validasi {

	String valHuruf="h",valAngka="a",valMenu="m",valUlang = "u";
	public Validasi() {
		
	}
	
	public boolean validasiHuruf(String str, boolean cek, Scanner key) {
		
		if(str.matches("[A-Za-z ]+")) {
			cek = true;
		}
		else if(!str.matches("[A-Za-z]+")&&!str.matches("[0-9-]+")){
			System.out.println("Jangan Masukan Simbol");
		}
		else if(validasiAngka(str, cek, key)) {
			System.out.println("Jangan Masukan Angka");
		}
		
		return cek;
	}
	
	
	public boolean validasiAngka(String str, boolean cek, Scanner key) {
		
		if(str.matches("[0-9-]+"))
		{ 
			if(Integer.parseInt(str)>=0)
			{   
				cek=true;
			}
			else
			{
				System.out.println("Jangan Masukan Negatif");
				cek = false;
			}
		}
		else if(validasiHuruf(str, cek, key))
		{
			System.out.println("Jangan Masukan Huruf");
		}
		
		return cek;
	}
	
	public String inputDanValidasi(String pertanyaan, String str, boolean cek, Scanner key,String jenisVal) {
		cek=false;
		do {
			System.out.print(pertanyaan);
			str = key.next();
			if(jenisVal.equals(valHuruf)) {
				cek = validasiHuruf(str, cek, key);
			}
			else if(jenisVal.equals(valAngka)) {
				cek = validasiAngka(str, cek, key);	
			}
			else if(jenisVal.equals(valMenu)) {
				cek = validasiAngka(str, cek, key);
				if(cek==true && ((convertToInt(str)>0 && convertToInt(str)<4)))
				{
					cek=true;
				}
				else {
					System.out.println("Masukan dari angka 1 sd 3");
					cek=false;
				}
			}
			else if(jenisVal.equals(valUlang)) {
				cek = validasiHuruf(str, cek, key);
				if(cek==true && (str.equals("y") || str.equals("n")))
				{
					cek = true;
				}
				else {
					System.out.println("Masukan y atau n");
					cek=false;
				}
			}
		}while(cek==false);
		return str;
	}
	
	public int convertToInt(String s) {
		return Integer.parseInt(s);
	}
	
	public double convertoDouble(String s) {
		return Double.parseDouble(s);
	}
	
}
