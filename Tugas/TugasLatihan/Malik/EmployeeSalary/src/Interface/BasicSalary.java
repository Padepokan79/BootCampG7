package Interface;

public interface BasicSalary {
	double umkBandung = 3091345.56,
		   umkJakarta = 3648035.82,
		   umkKarawang= 3919291.19;
		   
	
	double[] arrayPgJunior = {1, 1, 1.2, 1.2, 1.5},
			 arrayPgMiddle = {1.7, 1.7, 1.7, 1.8, 1.8, 2.1},
			 arrayPgSenior = {2.5, 2.5, 2.5, 2.7, 2.7, 2.8},
			 
	 		 arraySaJunior = {1.2, 1.2, 1.3, 1.3, 1.6},
			 arraySaMiddle = {1.8, 1.8, 1.8, 1.9, 1.9, 2.2},
			 arraySaSenior = {2.7, 2.7, 2.7, 2.9, 2.9, 3},
	
			 arrayTsJunior = {1.1, 1.1, 1.2, 1.2, 1.5},
			 arrayTsMiddle = {1.8, 1.8, 1.8, 1.9, 1.9, 2.1},
			 arrayTsSenior = {2.6, 2.6, 2.6, 2.7, 2.7, 2.8};

	
	void setUmk();
	void setBasicSalary(int masaKerja);



}
