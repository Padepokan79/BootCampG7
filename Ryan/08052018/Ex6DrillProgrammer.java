/*
     * Penghitungan gaji Programmer.
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 08 May 2018 14:18  
     * Updated By : 
     * Updated At : 
*/
public class Ex6DrillProgrammer{
	public static void main(String[] args) {
		String nama;
		int		bonus, tunjanganTransport, 
				jmlBonusApril, jmlProjectApril, jmlLemburApril,
				jmlBonusMei, jmlProjectMei, jmlLemburMei,
				jmlBonusJuni, jmlProjectJuni, jmlLemburJuni;
		double  gajiPokokBandung, gajiPokokJakarta, umkBandung, umkjakarta, 
				tunjanganKesehatanBandung, tunjanganKesehatanJakarta, 
				uangLemburApril, takeHomePayApril, gajiApril, pphApril,
				uangLemburMei, takeHomePayMei, gajiMei, pphMei,
				uangLemburJuni, takeHomePayJuni, gajiJuni, pphJuni;

		nama = "Nurwan";
		bonus = 500000; //per Project
		tunjanganTransport = 750000; //Jika bekerja diluar kota
		umkjakarta = 3648035;
		umkBandung = 3091446;
		gajiPokokBandung = umkBandung/100*120;
		gajiPokokJakarta = umkjakarta/100*120;
		tunjanganKesehatanJakarta = gajiPokokJakarta/100*2;
		tunjanganKesehatanBandung = gajiPokokBandung/100*2;

		//April
		jmlProjectApril = 2;
		jmlLemburApril = 10;
		jmlBonusApril = jmlProjectApril*bonus;
		uangLemburApril = (1.5*1/173*gajiPokokBandung)*jmlLemburApril;
		gajiApril = gajiPokokBandung+jmlBonusApril+uangLemburApril+tunjanganKesehatanBandung;
		pphApril = gajiApril/100*5;
		takeHomePayApril = gajiApril - pphApril;

		//Mei
		jmlProjectMei = 0;
		jmlLemburMei = 5;
		jmlBonusMei = jmlProjectMei*bonus;
		uangLemburMei = (1.5*1/173*gajiPokokBandung)*jmlLemburMei;
		gajiMei = gajiPokokBandung+jmlBonusMei+uangLemburMei+tunjanganKesehatanBandung;
		pphMei = gajiMei/100*5;
		takeHomePayMei = gajiMei - pphMei;

		//Juni
		jmlProjectJuni = 1;
		jmlLemburJuni = 12;
		jmlBonusJuni = jmlProjectJuni*bonus;
		uangLemburJuni = (1.5*1/173*gajiPokokJakarta)*jmlLemburJuni;
		gajiJuni = gajiPokokJakarta+jmlBonusJuni+uangLemburJuni+tunjanganKesehatanJakarta+tunjanganTransport;
		pphJuni = gajiJuni/100*5;
		takeHomePayJuni = gajiJuni - pphJuni;


		System.out.println("Sallary Bulan April");
		System.out.println("**************************");
		System.out.println("Nama\t : "+nama);
		System.out.println("Posisi\t : Programmer");
		System.out.println("**************************");
		System.out.printf("Gaji Pokok\t :%.2f",gajiPokokBandung);
		System.out.printf("\nT.Kesehatan\t : %.2f",tunjanganKesehatanBandung);
		System.out.printf("\nLembur\t\t : %.2f",uangLemburApril);
		System.out.printf("\n\nPPH\t\t : %.2f",pphApril);
		System.out.println("\n===========================");
		System.out.printf("Take Home Pay\t : %.2f",takeHomePayApril);
		System.out.println("\n===========================");

		System.out.println("\n\nSallary Bulan Mei");
		System.out.println("**************************");
		System.out.println("Nama\t : "+nama);
		System.out.println("Posisi\t : Programmer");
		System.out.println("**************************");
		System.out.printf("Gaji Pokok\t :%.2f",gajiPokokBandung);
		System.out.printf("\nT.Kesehatan\t : %.2f",tunjanganKesehatanBandung);
		System.out.printf("\nLembur\t\t : %.2f",uangLemburMei);
		System.out.printf("\n\nPPH\t\t : %.2f",pphMei);
		System.out.println("\n===========================");
		System.out.printf("Take Home Pay\t : %.2f",takeHomePayMei);
		System.out.println("\n===========================");

		System.out.println("\n\nSallary Bulan Juni");
		System.out.println("**************************");
		System.out.println("Nama\t : "+nama);
		System.out.println("Posisi\t : Programmer");
		System.out.println("**************************");
		System.out.printf("Gaji Pokok\t :%.2f",gajiPokokJakarta);
		System.out.printf("\nT.Kesehatan\t : %.2f",tunjanganKesehatanJakarta);
		System.out.printf("\nLembur\t\t : %.2f",uangLemburJuni);
		System.out.printf("\n\nPPH\t\t : %.2f",pphJuni);
		System.out.println("\n===========================");
		System.out.printf("Take Home Pay\t : %.2f",takeHomePayJuni);
		System.out.println("\n===========================");
	}
}