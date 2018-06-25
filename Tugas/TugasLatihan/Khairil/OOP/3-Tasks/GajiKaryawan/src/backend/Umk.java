package backend;

public interface Umk {
		double[] pgJunior = {1.0, 1.0, 1.2, 1.2, 1.5},
				 pgMiddle = {1.7, 1.7, 1.7, 1.8, 1.8, 2.1},
				 pgSenior = {2.5, 2.5, 2.5, 2.7, 2.7, 2.8},
				 saJunior = {1.2, 1.2, 1.3, 1.3, 1.6},
				 saMiddle = {1.8, 1.8, 1.8, 1.9, 1.9, 2.2},
				 saSenior = {2.7, 2.7, 2.7, 2.9, 2.9, 3.0},
				 tsJunior = {1.1, 1.1, 1.2, 1.2, 1.5},
				 tsMiddle = {1.8, 1.8, 1.8, 1.9, 1.9, 2.1},
				 tsSenior = {2.6, 2.6, 2.6, 2.7, 2.7, 2.8};
	
        double umkBandung = 3091345.56;
        double umkKarawang = 3919291.0;
        double umkJakarta = 3648035.82;
        
        double setUmkKerja(String penempatanKerja);
        double setUmkKerja(int masKer);
        String setUmkKerja(String posisi, String grade);
}
