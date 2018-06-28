import java.util.ArrayList;
import java.util.Arrays;

public interface Gapok {
	String 	bdg			= "Bandung",
			jkt			= "Jakarta",
			krw			= "Karawang",
			jnr			= "Junior",
			mdl			= "Middle",
			snr			= "Senior";
	double umkBandung 	= 3091345.56;
	double umkJakarta	= 3648035.82;
	double umkKarawang	= 3919291.19;
	double[] pgJunior 	= {1, 1, 1.2, 1.2, 1.5};
	double[] pgMiddle	= {1.7, 1.7, 1.7, 1.8, 1.8, 2.1};
	double[] pgSenior 	= {2.5, 2.5, 2.5, 2.7, 2.7, 2.8};
	double[] saJunior 	= {1.2, 1.2, 1.3, 1.3, 1.6};
	double[] saMiddle	= {1.8, 1.8, 1.8, 1.9, 1.9, 2.2};
	double[] saSenior 	= {2.7, 2.7, 2.7, 2.9, 2.9, 3};
	double[] tsJunior 	= {1.1, 1.1, 1.2, 1.2, 1.5};
	double[] tsMiddle	= {1.8, 1.8, 1.8, 1.9, 1.9, 2.1};
	double[] tsSenior 	= {2.6, 2.6, 2.6, 2.7, 2.7, 2.8};
	int 	maxJunior	= 4;
	int 	maxMiddle	= 5;
	int		maxSenior	= 5;

	ArrayList<Double> listPgJunior = new ArrayList(Arrays.asList(1, 1, 1.2, 1.2, 1.5));
	ArrayList<Double> listPgMiddle = new ArrayList(Arrays.asList(1.7, 1.7, 1.7, 1.8, 1.8, 2.1));
	ArrayList<Double> listPgSenior = new ArrayList(Arrays.asList(2.5, 2.5, 2.5, 2.7, 2.7, 2.8));
	ArrayList<Double> listSaJunior = new ArrayList(Arrays.asList(1.2, 1.2, 1.3, 1.3, 1.6));
	ArrayList<Double> listSaMiddle = new ArrayList(Arrays.asList(1.8, 1.8, 1.8, 1.9, 1.9, 2.2));
	ArrayList<Double> listSaSenior = new ArrayList(Arrays.asList(2.7, 2.7, 2.7, 2.9, 2.9, 3));
	ArrayList<Double> listTsJunior = new ArrayList(Arrays.asList(1.1, 1.1, 1.2, 1.2, 1.5));
	ArrayList<Double> listTsMiddle = new ArrayList(Arrays.asList(1.8, 1.8, 1.8, 1.9, 1.9, 2.1));
	ArrayList<Double> listTsSenior = new ArrayList(Arrays.asList(2.6, 2.6, 2.6, 2.7, 2.7, 2.8));
	
	
	double getUMK();
	double getGapok(int masaKerja);
}
