/*
Created by : Hendra Kurniawan
Date 	   : 20 Juni 2018
Modified   :	
*/

package SistemGaji;
import java.util.*;
public class MainGaji {

	public static void main(String[] args) {
		String pilih;
		double gapok = 0;
		
		HashMap<Integer, Double> hmPgJunior = new HashMap<>();
		hmPgJunior.put(1, 1.0);
		hmPgJunior.put(2, 1.2);
		hmPgJunior.put(3, 1.5);
		
		HashMap<Integer, Double> hmPgMiddle = new HashMap<>();
		hmPgMiddle.put(1, 1.7);
		hmPgMiddle.put(2, 1.8);
		hmPgMiddle.put(3, 2.1);
		
		HashMap<Integer, Double> hmPgSenior = new HashMap<>();
		hmPgSenior.put(1, 2.5);
		hmPgSenior.put(2, 2.7);
		hmPgSenior.put(3, 2.8);
		
		HashMap<Integer, Double> hmProgrammer = new HashMap<>();
		
		
		
		Karyawan karya = new Karyawan("Hendra" , "10111681", "bandung");
		Programmer obj = new Programmer("Budi", "10111682", "jakarta");
		Scanner key = new Scanner(System.in);
		
		
		//System.out.print("Tempat Kerja : ");
		//pilih = key.next();
		obj.setPenempatanKerja("jakarta");
		//System.out.print("Tingkatan    : ");
		//pilih = key.next();
		
		obj.setTingkatan("junior");
		//System.out.print("Lama Kerja   : ");
		//pilih = key.next();
		
		obj.setLamaKerja(Integer.parseInt("10"));
		//System.out.print("Menikah(y/n) : ");
		pilih = "y";// key.next();
		
		obj.setMenikah(pilih);
		System.out.print("Jumlah fixing bug : ");
		//pilih = key.next();
		
		obj.setFixingBug(Integer.parseInt("10"));
		System.out.print("Jam lembur  : ");
		//pilih = key.next();
		obj.setLembur(Integer.parseInt("10"));
		
		
		obj.hitungBonus(obj.getFixingBug());
		obj.hitungUmk(obj.getPenempatanKerja());
		obj.hitungGapok(obj.getUmk(), obj.getTingkatan(), obj.getLamaKerja());
		
		
		System.out.println();
		System.out.println(obj.toString());
	}

}



/*
//hitung Gapok
		for (Map.Entry entry : hmProgrammer.entrySet()){
			int k = (int) entry.getKey();
			Double d = (Double) entry.getValue();
			if(obj.getTingkatan().equals("junior")) {
				if(obj.getLamaKerja() >=0 && obj.getLamaKerja() <=1 ) {
					gapok = obj.getUmk() * hmProgrammer.get(1);
				}
				else if(obj.getLamaKerja() >=2 && obj.getLamaKerja() <=3 ) {
					gapok = obj.getUmk() * hmProgrammer.get(2);
				}
				else if(obj.getLamaKerja() >3) {
					gapok = obj.getUmk() * hmProgrammer.get(3);
				}
			} else if(obj.getTingkatan().equals("middle")) {
				if(obj.getLamaKerja() >=0 && obj.getLamaKerja() <=2 ) {
					gapok = obj.getUmk() * hmProgrammer.get(4);
				}
				else if(obj.getLamaKerja() >=3 && obj.getLamaKerja() <=4 ) {
					gapok = obj.getUmk() * hmProgrammer.get(5);
				}
				else if(obj.getLamaKerja() >4) {
					gapok = obj.getUmk() * hmProgrammer.get(6);
				}
			
			} else if(obj.getTingkatan().equals("senior")) {
				if(obj.getLamaKerja() >=0 && obj.getLamaKerja() <=2 ) {
					gapok = obj.getUmk() * hmProgrammer.get(4);
				}
				else if(obj.getLamaKerja() >=3 && obj.getLamaKerja() <=4 ) {
					gapok = obj.getUmk() * hmProgrammer.get(5);
				}
				else if(obj.getLamaKerja() >4) {
					gapok = obj.getUmk() * hmProgrammer.get(6);
				}
			}
		}
		obj.setGapok(gapok);
		System.out.println("Hash map gapok " + gapok);
*/