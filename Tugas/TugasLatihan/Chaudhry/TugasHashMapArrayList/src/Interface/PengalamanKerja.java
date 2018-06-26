/*
 * DATE CREATED : 25 Juni 2018
 * AUTHOR       : NURDHIAT CHAUDHARY MALIK
 * */

package Interface;

import java.util.ArrayList;
import java.util.Arrays;

public interface PengalamanKerja {
	
	ArrayList<Double> arrPgJunior = new ArrayList<Double>(Arrays.asList(1.0, 1.0, 1.2, 1.2, 1.5));
	ArrayList<Double> arrPgMiddle = new ArrayList<Double>(Arrays.asList(1.7, 1.7, 1.7, 1.8, 1.8, 2.1));
	ArrayList<Double> arrPgSenior = new ArrayList<Double>(Arrays.asList(2.5, 2.5, 2.5, 2.7, 2.7, 2.8));
	
	ArrayList<Double> arrSaJunior = new ArrayList<Double>(Arrays.asList(1.2, 1.2, 1.3, 1.3, 1.6));
	ArrayList<Double> arrSaMiddle = new ArrayList<Double>(Arrays.asList(1.8, 1.8, 1.8, 1.9, 1.9, 2.2));
	ArrayList<Double> arrSaSenior = new ArrayList<Double>(Arrays.asList(2.7, 2.7, 2.7, 2.9, 2.9, 3.0));

	ArrayList<Double> arrTsJunior = new ArrayList<Double>(Arrays.asList(1.1, 1.1, 1.2, 1.2, 1.5));
	ArrayList<Double> arrTsMiddle = new ArrayList<Double>(Arrays.asList(1.8, 1.8, 1.8, 1.9, 1.9, 2.1));
	ArrayList<Double> arrTsSenior = new ArrayList<Double>(Arrays.asList(2.6, 2.6, 2.6, 2.7, 2.7, 2.8));
}
