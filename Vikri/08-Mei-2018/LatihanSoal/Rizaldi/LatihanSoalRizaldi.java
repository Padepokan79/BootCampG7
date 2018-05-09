public class LatihanSoalRizaldi{
	public static void main(String[] args) {
		double roti, air, makanRoti, lapar, minumAir, sisaRoti, sisaAir;
		
		roti = 20;
		air = 20;

		makanRoti = 1;
		minumAir = 0.5;

		lapar = 15;

		sisaRoti = makanRoti*lapar;
		sisaRoti = roti-sisaRoti;
		sisaAir  = minumAir*lapar;
		sisaAir  = air-sisaAir;

		System.out.println("Sisa Roti : "+sisaRoti);
		System.out.println("Sisa air : "+sisaAir);
	}
}