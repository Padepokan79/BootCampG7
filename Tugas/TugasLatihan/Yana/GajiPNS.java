/*
Created by 	: Yana
TIme		: 23 Mei 2018 10.54
Project		: Gaji PNS
*/

import java.util.Scanner;

public class GajiPNS{
	public static void main(String[] args) {
		
		Scanner keyboard 	= new Scanner(System.in);
		Scanner line 		= new Scanner(System.in);

		int[]	gapok1A = { 1486500, 1486500, 1533400, 1533400, 1581700, 1581700, 1631500, 1631500, 1682900, 1682900, 1735900, 1735900, 
							1790500, 1790500, 1846900, 1846900, 1905100, 1965100, 2027000, 2027000, 2090800, 2090800, 2156700, 2156700, 
							2224600, 2224600};
		int[]	gapok1B = {      0,        0,       0, 1623400, 1623400, 1674500, 1674500, 1727300, 1727300, 1781700, 1781700, 1837800,
							1837800, 1895700, 1895700, 1955400, 1955400, 2016900, 2016900, 2080500, 2080500, 2146000, 2146000, 2213600,
							2213600, 2283300, 2283300, 2355200};
		int[] 	gapok1C = {      0,        0,       0, 1692100, 1692100, 1745400, 1745400, 1800300, 1800300, 1857000, 1857000, 1915500, 
							1915500, 1975800, 1975800, 2038100, 2038100, 2102300, 2102300, 2168500, 2168500, 2236800, 2236800, 2307200, 
							2307200, 2379900, 2379900, 2454800};
		int[] 	gapok1D = {      0,       0,        0, 1763600, 1763600, 1819200, 1819200, 1876500, 1876500, 1935600, 1935600, 1996500, 
							1996500, 2059400, 2059400, 2124300, 2124300, 2191200, 2191200, 2260200, 2260200, 2331400, 2331400, 2404800, 
							2404800, 2480500, 2480500, 2558700};
		int[]	gapok2A = { 1926000, 1956300, 1956300, 2017900, 2017900, 2081500, 2081500, 2147000, 2147000, 2214700, 2214700, 2284400, 
							2284400, 2356400, 2356400, 2430600, 2430600, 2507100, 2507100, 2586100, 2586100, 2667500, 2667500, 2751600, 
							2751600, 2838200, 2838200, 2927600, 2927600, 3019800, 3019800, 3114900, 3114900, 3213100};
		int[]	gapok2B = {       0,       0,       0, 2103300, 2103300, 2169500, 2169500, 2237900, 2237900, 2308300, 2308300, 2381100, 
							2381100, 2456000, 2456000, 2533400, 2533400, 2613200, 2613200, 2695500, 2695500, 2780400, 2780400, 2867900, 
							2867900, 2958300, 2958300, 3051400, 3051400, 3147600, 3147600, 3246700, 3246700, 3348900};
		int[]	gapok2C = {       0,       0,       0, 2192300, 2192300, 2261300, 2261300, 2332500, 2332500, 2406000, 2406000, 2481800, 
							2481800, 2559900, 2559900, 2640600, 2640600, 2723700, 2723700, 2809500, 2809500, 2898000, 2898000, 2989300, 
							2989300, 3083400, 3083400, 3180500, 3180500, 3280700, 3280700, 3384000, 3384000, 3490600};
		int[]	gapok2D = {       0,       0,       0, 2285000, 2285000, 2357000, 2357000, 2431200, 2431200, 2507800, 2507800, 
							2586700, 2586700, 2668200, 2668200, 2752300, 2752300, 2838900, 2838900, 2928300, 2928300, 3020600, 3020600, 
							3115700, 3115700, 3213800, 3213800, 3315100, 3315100, 3419500, 3419500, 3527200, 3527200};
		int[]	gapok3A = { 2456700, 2456700, 2534000, 2534000, 2613800, 2613800, 2696200, 2696200, 2781100, 2781100, 2868700, 2868700, 
							2959000, 2959000, 3052200, 3052200, 3148300, 3148300, 3247500, 3247500, 3349800, 3349800, 3455300, 3455300, 
							3564100, 3564100, 3676400, 3676400, 3792100, 3792100, 3911600, 3911600, 4034800};
		int[]	gapok3B = { 2560600, 2560600, 2641200, 2641200, 2724400, 2724400, 2810200, 2810200, 2898700, 2898700, 2990000, 2990000, 
							3084200, 3084200, 3181300, 3181300, 3281500, 3281500, 3384900, 3384900, 3491500, 3491500, 3601400, 3601400, 
							3714900, 3714900, 3831900, 3831900, 3952600, 3952600, 4007000, 4007000, 4205400};
		int[]	gapok3C = { 2668900, 2668900, 2752900, 2752900, 2839700, 2839700, 2929100, 2929100, 3021300, 3021300, 3116500, 3116500, 
							3214700, 3214700, 3315900, 3315900, 3420300, 3420300, 3528100, 3528100, 3639200, 3639200, 3753800, 3753800, 
							3872000, 3872000, 3994200, 3994200, 4119700, 4119700, 4249500, 4249500, 4383300};
		int[]	gapok3D = { 2781800, 2781800, 2869400, 2869400, 2959800, 2959800, 3053000, 3053000, 3149100, 3149100, 3248300, 3248300, 
							3350600, 3350600, 3456200, 3456200, 3565000, 3565000, 3677300, 3677300, 3912600, 3912600, 4035800, 4035800, 
							4162900, 4162900, 4294000, 4294000, 4429300, 4429300, 4568800};
		int[]	gapok4A = { 2899500, 2899500, 2990800, 2990800, 3085000, 3085000, 3182100, 3182100, 3282400, 3282400, 3385700, 3385700, 
							3492400, 3492400, 3602400, 3602400, 3715800, 3715800, 3832800, 3832800, 3953600, 3953600, 4078100, 4078100, 
							4206500, 4206500, 4339000, 4339000, 4475700, 4475700, 4616600, 4616600, 4762000};
		int[]	gapok4B = { 3022100, 3022100, 3117300, 3117300, 3215500, 3215500, 3316700, 3316700, 3421200, 3421200, 3528900, 3528900, 
							3640100, 3640100, 3754700, 3754700, 3873000, 3873000, 3995000, 3995000, 4120800, 4120800, 4250600, 4250600, 
							4384400, 4384400, 4522500, 4522500, 4665000, 4665000, 4811900, 4811900, 4963400};
		int[]	gapok4C = { 3149900, 3149900, 3249100, 3249100, 3351500, 3351500, 3457000, 3457000, 3565900, 3565900, 3678200, 3678200, 
							3794100, 3794100, 3913600, 3913600, 4036800, 4036800, 4164000, 4164000, 4295100, 4295100, 4430400, 4430400, 
							4569900, 4569900, 4713800, 4713800, 4862300, 4862300, 5015400, 5015400, 5173400};
		int[]	gapok4D = { 3283200, 3283200, 3386600, 3386600, 3493200, 3493200, 3603300, 3603300, 3716700, 3716700, 3833800, 3833800, 
							3954600, 3954600, 4079100, 4079100, 4207600, 4207600, 4340100, 4340100, 4476800, 4476800, 4617800, 4617800, 
							4763200, 4763200, 4913200, 4913200, 5068000, 5068000, 5227600, 5227600, 5392200};
		int[]	gapok4E = { 3422100, 3422100, 3529800, 3529800, 3641000, 3641000, 3755700, 3755700, 3874000, 3874000, 3996000, 3996000, 
							4121800, 4121800, 4251600, 4251600, 4385600, 4385600, 4523700, 4523700, 4666100, 4666100, 4813100, 4813100, 
							4964700, 4964700, 5121100, 5121100, 5282300, 5282300, 5448700, 5448700, 5620300};

		String	nip="", namaLengkap="", golA="", golB="", golongan="", strmkg="", status="", strjumlahAnak="", tunjEselon="", eselon="", 
				tunjUmum="", tunjFungsi="", tunjPapua="", sewaRumah="", potonganLainnya="", strnominalLainnya="", pendidikan="", 
				tunjLain="", strtunjanganLain="";
		int 	mkg, jumlahAnak, nominalLainnya;
		int 	gajiPokok, tunjanganIstSm, tunjanganAnak, tunjanganEselon, tunjanganUmum, tunjanganFungsi, tunjanganPapua,
				jumlahKeluarga, hargaBeras, tunjanganBeras, gajiKotor, biayaJabatan, iuranPensiun, pengurangan, 
				penghasilanNetto, penghasilanNettoTahun, ptkp, pkp, pphTahun, pphTahun1, pphTahun2, pphTahun3, pphTahun4,
				tunjanganPajak, gajiBersih, tunjanganLain;
		int 	potonganTaperum, potonganIWP, potonganSewaRumah, potonganPajak, jumlahPotongan;
		double 	dbiuranPensiun;
		String 	mtNIP = "[^0-9]+", mtNama = "[^a-z A-Z,.]+", mtGolongan = "[^1234]+", mtRuang = "[^ABCDE]+", mtMKG = "[^0-9]+";

		gajiPokok 			= 0;
		tunjanganIstSm 		= 0;
		tunjanganAnak 		= 0;
		tunjanganFungsi 	= 0;
		tunjanganUmum 		= 0;
		tunjanganEselon 	= 0;
		tunjanganPapua 		= 0;
		potonganTaperum 	= 0;
		potonganIWP			= 0;
		potonganSewaRumah 	= 0;
		gajiKotor 			= 0;
		biayaJabatan 		= 0;
		iuranPensiun 		= 0;
		pengurangan 		= 0;
		penghasilanNetto 	= 0;
		penghasilanNettoTahun = 0;
		ptkp 				= 0;
		pkp 				= 0;
		pphTahun = pphTahun1 = pphTahun2 = pphTahun3 = pphTahun4 = 0;
		tunjanganLain 		= 0;

		System.out.println("+---------------------------------------------+");
		System.out.println("|               PENGGAJIAN PNS                |");
		System.out.println("+---------------------------------------------+");
	 
		while(nip.length() < 12 || nip.length() > 18 || nip.matches(mtNIP)) {
			System.out.print("| NIP : ");
			nip = keyboard.nextLine();
			if (nip.length() < 12 || nip.length() > 18) {				
				System.out.println("| Masukkan NIP dengan benar");
			}
			else if (nip.matches("[^0-9]")) {
				System.out.println("| Hanya dapat memasukkan angka");
			}
		}
		while(namaLengkap.length() > 32 || namaLengkap.length() < 1 || namaLengkap.matches(mtNama)){
			System.out.print("| Nama Lengkap : ");
			namaLengkap = line.nextLine();
			if (namaLengkap.length() > 32) {
				System.out.println("| Nama Terlalu panjang. Max. 32");
			}
			else if (namaLengkap.matches(mtNama)) {
				System.out.println("| Gunakan huruf");
			}
		}
		while(golA.equals("") || golongan.equals("1E") || golongan.equals("2E") || golongan.equals("3E") || golB.equals("") || golA.matches(mtGolongan) || golB.matches(mtRuang)){
			System.out.print("| Golongan : ");
			golA = keyboard.nextLine();
			System.out.print("| ruang : ");
			golB = line.nextLine();
			golongan = golA+golB;
			if (golA.matches(mtGolongan)) {
				System.out.println("| Gunakan angka 1-4 untuk golongan");
			}
			else if (golB.matches(mtRuang)) {
				System.out.println("| Gunakan huruf kapital A-E untuk ruang");
			}
		}
		while(strmkg.equals("") || strmkg.matches(mtNIP)){
			System.out.print("| MKG : ");
			strmkg = line.nextLine();
			if (strmkg.matches(mtNIP)) {
				System.out.println("| Masukkan nilai 0 - 32");				
			}
		}
		mkg = Integer.parseInt(strmkg);
		while(status.equals("") || ( !status.equals("K") &&  !status.equals("BK") &&  !status.equals("DD") &&  !status.equals("JD"))){
			System.out.print("| Status (K, BK, DD, JD): ");
			status = keyboard.nextLine();
		}
		while(strjumlahAnak.equals("") || strjumlahAnak.matches(mtNIP)){
			System.out.print("| Jumlah Anak : ");
			strjumlahAnak = line.nextLine();
			if (strjumlahAnak.matches(mtNIP)) {
				System.out.println("| Gunakan angka");
			}
			else if(strjumlahAnak.equals("")){
				System.out.println("| Tidak boleh kosong");
			}
		}
		jumlahAnak = Integer.parseInt(strjumlahAnak);
	  	while(tunjEselon.equals("") || (!tunjEselon.equals("Y") && !tunjEselon.equals("T"))){
		  	System.out.print("| Tunjangan Eselon (Y/T): ");
		  	tunjEselon = keyboard.next();
	  	}
	  	if (tunjEselon.equals("Y")){
	  		// eselon = "IVA";
	  		while(eselon.equals("") || (!eselon.equals("IA") && !eselon.equals("IB") && !eselon.equals("IIA") && !eselon.equals("IIB") && !eselon.equals("IIIA") && !eselon.equals("IIIB") && !eselon.equals("IVA") && !eselon.equals("IVB") && !eselon.equals("VA"))){
	  			System.out.println("| Masukkan jabatan Eselon ");
	  			System.out.print("| (IA/IB/IIA/IIB/IIIA/IIIB/IVA/IVB/VA): ");
	  			eselon = keyboard.next();
	  			if (!eselon.equals("IA") && !eselon.equals("IB") && !eselon.equals("IIA") && !eselon.equals("IIB") && !eselon.equals("IIIA") && !eselon.equals("IIIB") && !eselon.equals("IVA") && !eselon.equals("IVB") && !eselon.equals("VA")) {
	  				System.out.println("| Masukkan jabatan Eselon sesuai pilihan");
	  			}
	  		}
	  	} 
	  	else if (tunjEselon.equals("T")){
		  	while(tunjFungsi.equals("") || (!tunjFungsi.equals("Y") && !tunjFungsi.equals("T"))){
		  		System.out.print("| Tunjangan Fungsional (Y/T): ");
		  		tunjFungsi = keyboard.next();
		  	}
		  	if (tunjFungsi.equals("Y")) {
		  		while(pendidikan.equals("") || (!pendidikan.equals("SMA") && !pendidikan.equals("D1") && !pendidikan.equals("D2") && !pendidikan.equals("D3") && !pendidikan.equals("S1") && !pendidikan.equals("S2") && !pendidikan.equals("S3"))){
		  			System.out.print("| Pendidikan terakhir (SMA/D1/D2/D3/S1/S2/S3): ");
		  			pendidikan = keyboard.next();
		  		}
		  	}
		  	else if (tunjFungsi.equals("T")) {
			  	tunjUmum = "Y";
		  	}	
	  	}
	  	while(tunjPapua.equals("") || (!tunjPapua.equals("Y") && !tunjPapua.equals("T"))){
	  		System.out.print("| Tunjangan Papua (Y/T): ");
	  		tunjPapua = keyboard.next();
	  	}
	  	while(tunjLain.equals("") || (!tunjLain.equals("Y") && !tunjLain.equals("T"))){
	  		System.out.print("| Tunjangan Lainnya (Y/T): ");
	  		tunjLain = keyboard.next();
	  	}
	  	if (tunjLain.equals("Y")) {
	  		System.out.print("| - Jumlah nominal tunjangan lainnya : ");
	  		strtunjanganLain = keyboard.next();
	  		tunjanganLain = Integer.parseInt(strtunjanganLain);
	  	}

	  	while(sewaRumah.equals("") || (!sewaRumah.equals("Y") && !sewaRumah.equals("T"))){
		  	System.out.print("| Sewa Rumah (Y/T): ");
		  	sewaRumah = keyboard.next();
	  	}
	  	while(!potonganLainnya.equals("Y") && !potonganLainnya.equals("T")){
		  	System.out.print("| Potongan Lainnya (Y/T): ");
		  	potonganLainnya = keyboard.next();
	  	}
	  	if (potonganLainnya.equals("Y")) {
		  	System.out.print("| - Jumlah nominal potongan lainnya : ");
	  		strnominalLainnya = keyboard.next();
	  	}
	  	else{
	  		strnominalLainnya = "0";
	  	}
	  	nominalLainnya = Integer.parseInt(strnominalLainnya);

		System.out.println("+---------------------------------------------+");
		System.out.println();	System.out.println();	System.out.println();	System.out.println();
		System.out.println("+---------------------------------------------+");
		System.out.println("|                  GAJI PNS                   |");
		System.out.println("+---------------------------------------------+");
		System.out.println("| Nama Lengkap         : "+namaLengkap);
		System.out.println("| NIP                  : "+nip);
		System.out.println("| Golongan             : "+golongan);
		System.out.println("| MKG                  : "+mkg);
		System.out.println("| Status               : "+status);
		System.out.println("| Jumlah Anak          : "+jumlahAnak);
		System.out.println("| Jabatan Eselon       : "+tunjEselon+" "+eselon);
		System.out.println("| Tunjangan Fungsional : "+tunjFungsi+" "+pendidikan);
		System.out.println("| Tunjangan Papua      : "+tunjPapua);
		System.out.println("| Tunjangan Lainnya    : "+tunjLain+" Rp. "+tunjanganLain);
		System.out.println("| Sewa Rumah           : "+sewaRumah);
		System.out.println("| Potongan Lainnya     : "+potonganLainnya+" Rp. "+nominalLainnya);
		System.out.println("+---------------------------------------------+");
		System.out.println("|               PENGHASILAN                   |");
		System.out.println("+---------------------------------------------+");

		//gaji pokok
			mkg = Integer.parseInt(strmkg);
		if (golongan.equals("1A")) {
			gajiPokok = gapok1A[mkg];
		}
		else if (golongan.equals("1A") && mkg > 27) {
			gajiPokok = gapok1A[27];
		}
		else if (golongan.equals("1B")) {
			gajiPokok = gapok1B[mkg];
		}
		else if (golongan.equals("1B") && mkg > 27) {
			gajiPokok = gapok1B[27];
		}
		else if (golongan.equals("1C")) {
			gajiPokok = gapok1C[mkg];
		}
		else if (golongan.equals("1C") && mkg > 27) {
			gajiPokok = gapok1C[27];
		}
		else if (golongan.equals("1D")) {
			gajiPokok = gapok1D[mkg];
		}
		else if (golongan.equals("1D") && mkg > 27) {
			gajiPokok = gapok1D[27];
		}
		else if (golongan.equals("2A")) {
			gajiPokok = gapok2A[mkg];
		}
		else if (golongan.equals("2A") && mkg > 33) {
			gajiPokok = gapok2A[33];
		}
		else if (golongan.equals("2B")) {
			gajiPokok = gapok2B[mkg];
		}
		else if (golongan.equals("2B") && mkg > 33) {
			gajiPokok = gapok2B[33];
		}
		else if (golongan.equals("2C")) {
			gajiPokok = gapok2C[mkg];
		}
		else if (golongan.equals("2C") && mkg > 33) {
			gajiPokok = gapok2C[33];
		}
		else if (golongan.equals("2D")) {
			gajiPokok = gapok2D[mkg];
		}
		else if (golongan.equals("2D") && mkg > 33) {
			gajiPokok = gapok2D[33];
		}
		else if (golongan.equals("3A")) {
			gajiPokok = gapok3A[mkg];
		}
		else if (golongan.equals("3A") && mkg > 32) {
			gajiPokok = gapok3A[32];
		}
		else if (golongan.equals("3B")) {
			gajiPokok = gapok3B[mkg];
		}
		else if (golongan.equals("3B") && mkg > 32) {
			gajiPokok = gapok3B[32];
		}
		else if (golongan.equals("3C")) {
			gajiPokok = gapok3C[mkg];
		}
		else if (golongan.equals("3C") && mkg > 32) {
			gajiPokok = gapok3C[32];
		}
		else if (golongan.equals("3D") && mkg > 32) {
			gajiPokok = gapok3D[32];
		}
		else if (golongan.equals("3D")) {
			gajiPokok = gapok3D[mkg];
		}
		else if (golongan.equals("4A")) {
			gajiPokok = gapok4A[mkg];
		}
		else if (golongan.equals("4A") && mkg > 32) {
			gajiPokok = gapok4A[32];
		}
		else if (golongan.equals("4B")) {
			gajiPokok = gapok4B[mkg];
		}
		else if (golongan.equals("4B") && mkg > 32) {
			gajiPokok = gapok4B[mkg];
		}
		else if (golongan.equals("4C")) {
			gajiPokok = gapok4C[mkg];
		}
		else if (golongan.equals("4C") && mkg > 32) {
			gajiPokok = gapok4C[mkg];
		}
		else if (golongan.equals("4D")) {
			gajiPokok = gapok4D[mkg];
		}
		else if (golongan.equals("4D") && mkg > 32) {
			gajiPokok = gapok4D[mkg];
		}
		else if (golongan.equals("4E")) {
			gajiPokok = gapok4E[mkg];
		}
		else if (golongan.equals("4E") && mkg > 32) {
			gajiPokok = gapok4E[mkg];
		}
		System.out.println("| Gaji Pokok           : "+gajiPokok);

		//tunjangan suami/istri
		if (status.equals("K")) {
			tunjanganIstSm = 10 * gajiPokok / 100;
		}
		if (status.equals("BK") || status.equals("DD") || status.equals("JD")) {
			tunjanganIstSm = 0;
		}
		System.out.println("| Tunjangan Istri/Suami: "+tunjanganIstSm);

		//tunjangan anak
		jumlahAnak = Integer.parseInt(strjumlahAnak);
		if ( jumlahAnak > 2) {
			jumlahAnak = 2;
			tunjanganAnak = (2 * gajiPokok / 100) * jumlahAnak;
		}
		else if ( jumlahAnak >= 0) {
			tunjanganAnak = (2 * gajiPokok / 100) * jumlahAnak;
		}
		System.out.println("| Tunjangan Anak       : "+tunjanganAnak);

		//tunjangan eselon
		if (tunjEselon.equals("Y")) {
			if (eselon.equals("IA")) {
				tunjanganEselon = 5500000;
			}
			else if (eselon.equals("IB")) {
				tunjanganEselon = 4350000;
			}
			else if (eselon.equals("IIA")) {
				tunjanganEselon = 3250000;
			}
			else if (eselon.equals("IIB")) {
				tunjanganEselon = 2025000;
			}
			else if (eselon.equals("IIIA")) {
				tunjanganEselon = 1260000;
			}
			else if (eselon.equals("IIIB")) {
				tunjanganEselon = 980000;
			}
			else if (eselon.equals("IVA")) {
				tunjanganEselon = 540000;
			}
			else if (eselon.equals("IVB")) {
				tunjanganEselon = 490000;
			}
			else if (eselon.equals("VA")) {
				tunjanganEselon = 360000;
			}
			else{
				tunjanganEselon = 0;
			}
		}else{
			tunjanganEselon = 0;
		}
		System.out.println("| Tunjangan eselon     : "+tunjanganEselon);

		//tunjangan umum
		if (tunjUmum.equals("Y")) {
			if (golA.equals("1")) {
				tunjanganUmum = 175000;
			}
			else if (golA.equals("2")) {
				tunjanganUmum = 180000;
			}
			else if (golA.equals("3")) {
				tunjanganUmum = 185000;
			}
			else if (golA.equals("4")) {
				tunjanganUmum = 190000;
			}
			else{
				tunjanganUmum = 0;
			}
		}
		else if (tunjUmum.equals("T")) {
			tunjanganUmum = 0;
		}
		System.out.println("| Tunjangan umum       : "+tunjanganUmum);

		// tunjangan fungsional
		if (tunjFungsi.equals("Y")) {
			if(pendidikan.equals("SMA") || pendidikan.equals("D1") || pendidikan.equals("D2") || pendidikan.equals("D3")){
				if (golongan.equals("3C") || golongan.equals("3D")) {
					tunjanganFungsi = 6000000;
				}
				else if (golongan.equals("3A") || golongan.equals("3B")) {
					tunjanganFungsi = 500000;
				}
				else if (golongan.equals("2B") || golongan.equals("2D")) {
					tunjanganFungsi = 400000;
				}
				else if (golongan.equals("2A")) {
					tunjanganFungsi = 300000;
				}
				else{
					tunjanganFungsi = 0;
				}
			}
			else if (pendidikan.equals("S1") || pendidikan.equals("S2") || pendidikan.equals("S3")) {
				if (golongan.equals("4D") || golongan.equals("4E")) {
					tunjanganFungsi = 1000000;
				}
				else if (golongan.equals("4A") || golongan.equals("4C")) {
					tunjanganFungsi = 900000;
				}
				else if (golongan.equals("3C") || golongan.equals("3D")) {
					tunjanganFungsi = 800000;
				}
				else if (golongan.equals("3A") || golongan.equals("3B")) {
					tunjanganFungsi = 700000;
				}				
				else{
					tunjanganFungsi = 0;
				}
			}
		}
		else{
			tunjanganFungsi = 0;
		}
		System.out.println("| Tunjangan fungsional : "+tunjanganFungsi);

		//tunjangan papua
		if (tunjPapua.equals("Y")) {
			if (golongan.equals("1A")) {
				tunjanganPapua = 200000;
			}
			else if (golongan.equals("1B")) {
				tunjanganPapua = 225000;
			}
			else if (golongan.equals("1C")) {
				tunjanganPapua = 250000;
			}
			else if (golongan.equals("1D")) {
				tunjanganPapua = 275000;
			}
			else if (golongan.equals("2A")) {
				tunjanganPapua = 300000;
			}
			else if (golongan.equals("2B")) {
				tunjanganPapua = 325000;
			}
			else if (golongan.equals("2C")) {
				tunjanganPapua = 350000;
			}
			else if (golongan.equals("2D")) {
				tunjanganPapua = 375000;
			}
			else if (golongan.equals("3A")) {
				tunjanganPapua = 425000;
			}
			else if (golongan.equals("3B")) {
				tunjanganPapua = 450000;
			}
			else if (golongan.equals("3C")) {
				tunjanganPapua = 475000;
			}
			else if (golongan.equals("3D")) {
				tunjanganPapua = 500000;
			}
			else if (golongan.equals("4A")) {
				tunjanganPapua = 525000;
			}
			else if (golongan.equals("4B")) {
				tunjanganPapua = 550000;
			}
			else if (golongan.equals("4C")) {
				tunjanganPapua = 575000;
			}
			else if (golongan.equals("4D")) {
				tunjanganPapua = 600000;
			}
			else if (golongan.equals("4E")) {
				tunjanganPapua = 625000;
			}
		}
		else{
			tunjanganPapua = 0;
		}
		System.out.println("| Tunjangan papua      : "+tunjanganPapua);
		
		//jumlah keluarga
		jumlahAnak = Integer.parseInt(strjumlahAnak);
		if (jumlahAnak > 2) {
			jumlahAnak = 2;
		}
		if (status.equals("K")) {
			jumlahKeluarga = jumlahAnak + 2;
		}
		else{
			jumlahKeluarga = jumlahAnak + 1;
		}

		//tunjangan beras
		hargaBeras 		= 14000;
		tunjanganBeras 	= 10 * jumlahKeluarga * hargaBeras;
		System.out.println("| Tunjangan beras      : " +tunjanganBeras);

		//tunjangan lainnya
		if (tunjLain.equals("Y")) {
  			tunjanganLain = Integer.parseInt(strtunjanganLain);
		}

		//tunjangan pajak pph
		gajiKotor 		= gajiPokok + tunjanganIstSm + tunjanganAnak + tunjanganEselon + tunjanganFungsi + tunjanganUmum + tunjanganPapua + tunjanganBeras + tunjanganLain;
		biayaJabatan 	= 5 * gajiKotor / 100;
		dbiuranPensiun 	= 4.75 * (gajiPokok + tunjanganIstSm + tunjanganAnak) / 100.0;
		Double db 		= new Double(dbiuranPensiun);
		iuranPensiun 	= db.intValue();
		pengurangan		= biayaJabatan + iuranPensiun;
		penghasilanNetto= gajiKotor - pengurangan;
		penghasilanNettoTahun = 12 * penghasilanNetto;

		ptkp 			= 36000000 + ((jumlahKeluarga-1)*3000000);
		// System.out.println("| PTKP: "+ptkp);

		pkp 			= penghasilanNettoTahun - ptkp;
		// System.out.println("| PKP : "+pkp);

		if ( pkp < 0) {
			tunjanganPajak = 0;
		}
		else{
			if (pkp <= 50000000) {
				pphTahun = 5  * pkp / 100;
			}
			else if (pkp > 50000000 && pkp <= 250000000) {
				pphTahun = ( 5 * 50000000 / 100) + (15 * (pkp - 50000000) / 100);
			}
			else if (pkp > 250000000 && pkp <= 500000000) {
				pphTahun = ( 5 * 50000000 / 100) + (15 * 200000000 / 100) + (25 * (pkp - 50000000 - 250000000) / 100);
			}
			else if (pkp > 500000000) {
				pphTahun = ( 5 * 50000000 / 100) + (15 * 200000000 / 100) + (25 * 250000000 / 100) + (30 * (pkp - 50000000 - 250000000 - 500000000) / 100);
			}
			tunjanganPajak = pphTahun / 12;
		}
		// pphTahun = pphTahun1 + pphTahun2 + pphTahun3 + pphTahun4;
		// System.out.println("| PPH Tahun: "+pphTahun);
		System.out.println("| Tunjangan pajak      : "+tunjanganPajak);

		//gaji kotor
		gajiKotor = gajiKotor + tunjanganPajak;
		System.out.println("| GAJI KOTOR           : "+gajiKotor);

		System.out.println("+---------------------------------------------+");
		System.out.println("|                 POTONGAN                    |");
		System.out.println("+---------------------------------------------+");

		//potongan taperum
		if (golA.equals("1")) {
			potonganTaperum = 3000;
		}
		else if (golA.equals("2")) {
			potonganTaperum = 5000;
		}
		else if (golA.equals("3")) {
			potonganTaperum = 7000;
		}
		else if (golA.equals("4")) {
			potonganTaperum = 10000;
		}
		System.out.println("| Potongan Taperum     : "+potonganTaperum);

		//potonganIWP
		potonganIWP = 10 * (gajiPokok + tunjanganIstSm + tunjanganAnak) / 100;
		System.out.println("| Potongan IWP         : "+potonganIWP);

		//potongan sewa rumah

		if (sewaRumah.equals("Y")) {
			potonganSewaRumah = 450000;
		}else{
			potonganSewaRumah = 0;
		}
		System.out.println("| Potongan sewa rumah  : "+potonganSewaRumah);

		//potongan pajak
		potonganPajak = tunjanganPajak;

		//potongan lain-lain
	  	nominalLainnya = Integer.parseInt(strnominalLainnya);

		//jumlah potongan
	  	jumlahPotongan = potonganPajak + potonganTaperum + potonganIWP + potonganSewaRumah + nominalLainnya;
	  	System.out.println("| TOTAL POTONGAN       : "+jumlahPotongan);

		//gaji bersih
		gajiBersih = gajiKotor - jumlahPotongan;
		System.out.println("+---------------------------------------------+");
		System.out.println("| GAJI BERSIH          : "+gajiBersih);
		System.out.println("+---------------------------------------------+");
		System.out.println();	System.out.println();	System.out.println();	System.out.println();	System.out.println();
	}
}