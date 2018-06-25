package SistemGaji;
import java.util.*;

public interface pengalamanKerja {
	
	ArrayList<Double> pgJunior = new ArrayList<Double>(Arrays.asList(1.0, 1.0, 1.2, 1.2, 1.5));
	ArrayList<Double> pgMiddle = new ArrayList<Double>(Arrays.asList(1.7, 1.7, 1.7, 1.8, 1.8, 2.1));
	ArrayList<Double> pgSenior = new ArrayList<Double>(Arrays.asList(2.5, 2.5, 2.7, 2.7, 2.7, 2.8));

	HashMap<Integer, Double> pgJuniorHs = new HashMap<>();
	HashMap<Integer, Double> pgMiddleHs = new HashMap<>(); 
	HashMap<Integer, Double> pgSeniorHs = new HashMap<>(); 
}
