/*
 * DATE CREATED : 25 Juni 2018
 * AUTHOR       : NURDHIAT CHAUDHARY MALIK
 * */

package Interface;

import java.util.ArrayList;
import java.util.Arrays;

public interface UmkKota {
	
	public static final double umkBandung  = 3091345.0;
	public static final double umkJakarta  = 3648035.0;
	public static final double umkKarawang = 3919291.0;

	ArrayList<Double> arrUmr = new ArrayList<Double>(Arrays.asList(umkBandung, umkJakarta, umkKarawang));
	public double getUmk();
}
