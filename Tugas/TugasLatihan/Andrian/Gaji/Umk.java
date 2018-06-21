package Gaji;

public interface Umk {
	double [] arrayPgJunior = {1, 1, 1.2, 1.2, 1.5, 1.5};
	double [] arraySAJunior = {1.2, 1.2, 1.2, 1.3, 1.3, 1.6};
	double [] arrayTtJunior = {1.1, 1.1 ,1.2, 1.2, 1.5,1.5};
	
	double [] arrayPgMiddle = {1.7, 1.7, 1.7, 1.8, 1.8, 2.1};
	double [] arraySaMiddle = {1.8, 1.8, 1.8, 1.9, 1.9, 2.2};
	double [] arrayTtMiddle = {1.8, 1.8, 1.8, 1.9, 1.9, 2.1};
	
	double [] arrayPgSenior = {2.5, 2.5, 2.5, 2.7, 2.7, 2.8};
	double [] arraySASenior = {2.7, 2.7, 2.7, 2.9, 2.9, 3.0};
	double [] arrayTtSenior = {2.6, 2.6, 2.6, 2.7, 2.7, 2.8};
	
    double umkBandung = 3091345.56;
    double umkKarawang = 3919291.0;
    double umkJakarta = 3648035.82;
    
    double setUmkKerja(String penempatanKerja);
    double setUmkKerja(int masaKerja);
    String setUmkKerja(String posisi, String grade);
    
}