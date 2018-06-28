package karyawan;

import java.util.ArrayList;
import java.util.Arrays;

public interface BasicSalary {
	double umkBandung=3091345.56, umkJakarta=3648035.82, umkKarawang=3919291.19;
	ArrayList<Double> pgJunior= new ArrayList<Double>(Arrays.asList(1.0, 1.0, 1.2, 1.2, 1.5));
	ArrayList<Double> pgMiddle= new ArrayList<Double>(Arrays.asList(1.7, 1.7, 1.7, 1.8, 1.8, 2.1));
	ArrayList<Double> pgSenior= new ArrayList<Double>(Arrays.asList(2.5, 2.5, 2.5, 2.7, 2.7, 2.8));
	ArrayList<Double> saJunior= new ArrayList<Double>(Arrays.asList(1.2, 1.2, 1.3, 1.3, 1.6));
	ArrayList<Double> saMiddle= new ArrayList<Double>(Arrays.asList(1.8, 1.8, 1.8, 1.9, 1.9, 2.2));
	ArrayList<Double> saSenior= new ArrayList<Double>(Arrays.asList(2.7, 2.7, 2.7, 2.9, 2.9, 3.0));
	ArrayList<Double> tsJunior= new ArrayList<Double>(Arrays.asList(1.1, 1.1, 1.2, 1.2, 1.5));
	ArrayList<Double> tsMiddle= new ArrayList<Double>(Arrays.asList(1.8, 1.8, 1.8, 1.9, 1.9, 2.1));
	ArrayList<Double> tsSenior= new ArrayList<Double>(Arrays.asList(2.6, 2.6, 2.6, 2.7, 2.7, 2.8));
	
	void setUMK();
	void setGapok(int masaKerja);

}
