package SistemGaji;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public interface Umk {
	double umkBandung = 3100000, umkJakarta = 3700000, umkKarawang = 4000000;
	
	ArrayList<Double> listUmk = new ArrayList<Double>(Arrays.asList(umkBandung, umkJakarta, umkKarawang));
	public double hitungUmk(String penempatanKerja);
}
