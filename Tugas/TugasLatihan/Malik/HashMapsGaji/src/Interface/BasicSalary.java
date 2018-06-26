package Interface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public interface BasicSalary {
	double umkBandung = 3091345.56,
		   umkJakarta = 3648035.82,
		   umkKarawang= 3919291.19;

	ArrayList<Double> arrayPgJunior = new ArrayList<Double>(Arrays.asList(1.0, 1.0, 1.2, 1.2, 1.5));
	ArrayList<Double> arrayPgMiddle = new ArrayList<Double>(Arrays.asList(1.7, 1.7, 1.7, 1.8, 1.8, 2.1));
	ArrayList<Double> arrayPgSenior = new ArrayList<Double>(Arrays.asList(2.5, 2.5, 2.5, 2.7, 2.7, 2.8));
	
	ArrayList<Double> arraySaJunior = new ArrayList<Double>(Arrays.asList(1.2, 1.2, 1.3, 1.3, 1.6));
	ArrayList<Double> arraySaMiddle = new ArrayList<Double>(Arrays.asList(1.8, 1.8, 1.8, 1.9, 1.9, 2.2));
	ArrayList<Double> arraySaSenior = new ArrayList<Double>(Arrays.asList(2.7, 2.7, 2.7, 2.9, 2.9, 3.0));
	
	ArrayList<Double> arrayTsJunior = new ArrayList<Double>(Arrays.asList(1.1, 1.1, 1.2, 1.2, 1.5));
	ArrayList<Double> arrayTsMiddle = new ArrayList<Double>(Arrays.asList(1.8, 1.8, 1.8, 1.9, 1.9, 2.1));
	ArrayList<Double> arrayTsSenior = new ArrayList<Double>(Arrays.asList(2.6, 2.6, 2.6, 2.7, 2.7, 2.8));
		
	void setUmk();
	void setBasicSalary(int masaKerja);



}
