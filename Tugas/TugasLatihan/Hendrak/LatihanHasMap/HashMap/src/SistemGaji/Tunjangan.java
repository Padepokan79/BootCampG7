/*
Created by : Hendra Kurniawan
Date 	   : 20 Juni 2018
Modified   :	
*/
package SistemGaji;

import java.util.ArrayList;
import java.util.Arrays;

public interface Tunjangan {
	double ketLembur = 1.5 * 1/173, kettnjKeluarga = 0.2;
	double kettnjTransport = 1000000, tnjJunior=200000, tnjMiddle = 300000, tnjSenior = 500000;

	ArrayList<Double> tunjanganPegawai = new ArrayList<>(Arrays.asList(tnjJunior, tnjMiddle, tnjSenior));
	
	public double getTunjanganTransport(String penempatan);
	public double getTunjanganKeluarga(String menikah);
	public double getBpjsKesehatan(double totalPenghasilan);
	public double getBpjsKetenagaKerjaan(double totalPenghasilan);
}
