//Created by vikri
//08/06/2018

package gajiIt;

import java.util.ArrayList;
import java.util.Arrays;

public interface TunjanganPotongan {
	
	String kotaa[] = {"Jakarta", "Karawang", "Bandung"};
	String tingkatann[] = {"Junior", "Middle", "Senior"};
	String bagiann[] = {"PG", "SA", "TS"};
	
	ArrayList<Integer> pgJun = new ArrayList(Arrays.asList(100, 120, 150));
	ArrayList<Integer> pgMid = new ArrayList(Arrays.asList(170, 180, 210));
	ArrayList<Integer> pgSen = new ArrayList(Arrays.asList(250, 270, 280));
	
	ArrayList<Integer> SAJun = new ArrayList(Arrays.asList(120, 130, 160));
	ArrayList<Integer> SAMid = new ArrayList(Arrays.asList(180, 190, 220));
	ArrayList<Integer> SASen = new ArrayList(Arrays.asList(270, 290, 300));
	
	ArrayList<Integer> TSJun = new ArrayList(Arrays.asList(110, 120, 150));
	ArrayList<Integer> TSMid = new ArrayList(Arrays.asList(180, 190, 220));
	ArrayList<Integer> TSSen = new ArrayList(Arrays.asList(260, 270, 280));
	
	ArrayList<String> kota = new ArrayList(Arrays.asList(kotaa));
	ArrayList<String> tingkatan = new ArrayList(Arrays.asList(tingkatann));
	ArrayList<String> bagian = new ArrayList(Arrays.asList(bagiann));
	
	double lembur(double gaji, double lama);
	double tunjanganPegawai(String tingkatan);
	double tunjanganKeluarga(double gaji, boolean cek);
	double bonus(double fix);
	double pPH(double gaji);
	double bKesehatan(double gaji);
	double bKetenagakerjaan(double gaji);
	double tTransport(String penempatan);
	double total();
}
