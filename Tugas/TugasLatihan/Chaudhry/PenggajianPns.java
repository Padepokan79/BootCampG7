/*
	DATE CREATED 	: 23 MEI 2018
	TIME 			: 10.58
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;	
public class PenggajianPns{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		Scanner key2 = new Scanner(System.in);

		String inputNama, inputGolongan, inputStruktural, inputFungsional, inputUmum;
		String inputNip, inputMasker, inputKelamin, pria, wanita, inputStatus, inputJmlAnak;
		String inputTerpencil, inputBesar, inputPendidikan, inputEselon, inputNamaTun, inputPapua, inputTunjangan, inputSewa, inputRuang;
		int duabelas, delapanbelas, tigadua, gajiPokok, nol, dua, satu;
		int tunSusis, tunPajak, gajiKotor, tunStruktur, tunBeras, tunLain, tunTerpencil, tunAnak, tunUmum, tunPapua, tunFungsi, umum01, umum02, umum03, umum04;
		int satuJuta, jmlAnggota, sembilanRatus, delapanRatus, tujuhRatus, enamRatus, limaRatus, empatRatus, tigaRatus;
		int potBeras, potIwp, potSewaRumah, potTaperum, potPph;

		int biayaJabatan = 0, jmlPotongan = 0, gajiBersih = 0;
		int ptkp = 36000000, potSetahun = 0, pphPerBulan = 0;
		double nettoSebulan = 0, pkp = 0, nettoSetahun = 0, iuranPensiun = 0, totalPengurang = 0;

		int[] arrayGolIA = {1486500, 1486500, 1533400, 1533400, 
							1581700, 1581700, 1631500, 1631500, 
							1682900, 1682900, 1735900, 1735900, 
							1790500, 1790500, 1846900, 1846900, 
							1905100, 1905100, 1965100, 1965100, 
							2027000, 2027000, 2090800, 2090800, 
							2156700, 2156700, 2224600, 2224600};
		int[] arrayGolIB = {0, 0, 0, 1623400, 1623400, 1674500, 
							1674500, 1727300, 1727300, 1781700,
							1781700, 1837800, 1837800, 1895700,
							1895700, 1955400, 1955400, 2016900,
							2016900, 2080500, 2080500, 2146000, 
							2146000, 2213600, 2213600, 2283300, 
							2283300, 2355200};
		int[] arrayGolIC = {0, 0, 0, 1692100, 1692100, 1745400, 
							1745400, 1800300, 1800300, 1857000,
							1857000, 1915500, 1915500, 1975800,
							1975800, 2038100, 2038100, 2102300,
							2102300, 2168500, 2168500, 2236800, 
							2236800, 2307200, 2307200, 2379900, 
							2379900, 2454800};
		int[] arrayGolID = {0, 0, 0, 1763600, 1763600, 1819200, 
							1819200, 1876500, 1876500, 1935600,
							1935600, 1996500, 1996500, 2059400,
							2059400, 2124300, 2124300, 2191200,
							2191200, 2260200, 2260200, 2331400, 
							2331400, 2404800, 2404800, 2480500, 
							2480500, 2558700};


		int[] arrayGol2A = {1926000, 1956300, 1956300, 2017900, 
							2017900, 2081500, 2081500, 2147000,
							2147000, 2214700, 2214700, 2284400,
							2284400, 2356400, 2356400, 2430600,
							2430600, 2507100, 2507100, 2586100,
							2586100, 2667500, 2667500, 2751600, 
							2751600, 2838200, 2838200, 2927600, 
							2927600, 3019800, 3019800, 3114900,
							3114900, 3213100};
		int[] arrayGol2B = {0, 0, 0, 2103300, 2103300, 2169500, 
							2169500, 2237900, 2237900, 2308300,
							2308300, 2381100, 2381100, 2456000,
							2456000, 2533400, 2533400, 2613200,
							2613200, 2695500, 2695500, 2780400, 
							2780400, 2867900, 2867900, 2958300, 
							2958300, 3051400, 3051400, 3147600,
							3147600, 3246700, 3246700, 3348900};
		int[] arrayGol2C = {0, 0, 0, 2192300, 2192300, 2261300, 
							2261300, 2332500, 2332500, 2406000,
							2406000, 2481800, 2481800, 2559900,
							2559900, 2640600, 2640600, 2723700,
							2723700, 2809500, 2809500, 2898000, 
							2898000, 2989300, 2989300, 3083400, 
							3083400, 3180500, 3180500, 3280700,
							3280700, 3384000, 3384000, 3490600};
		int[] arrayGol2D = {0, 0, 0, 2285000, 2285000, 2357000, 
							2357000, 2431200, 2431200, 2507800,
							2507800, 2586700, 2586700, 2668200,
							2668200, 2752300, 2752300, 2838900,
							2838900, 2928300, 2928300, 3020600, 
							3020600, 3115700, 3115700, 3213800, 
							3213800, 3315100, 3315100, 3419500,
							3419500, 3527200, 3527200, 3638200};


		int[] arrayGol3A = {2456700, 2456700, 2534000, 2534000, 
							2613800, 2613800, 2696200, 2696200,
							2781100, 2781100, 2868700, 2868700,
							2959000, 2959000, 3052200, 3052200,
							3148300, 3148300, 3247500, 3247500,
							3349800, 3349800, 3455300, 3455300, 
							3564100, 3564100, 3676400, 3676400, 
							3792100, 3792100, 3911600, 3911600, 
							4034800};
		int[] arrayGol3B = {2560600, 2560600, 2641200, 2641200, 
							2724400, 2724400, 2810200, 2810200,
							2898700, 2898700, 2990000, 2990000,
							3084200, 3084200, 3181300, 3181300,
							3281500, 3281500, 3384900, 3384900,
							3491500, 3491500, 3601400, 3601400, 
							3714900, 3714900, 3831900, 3831900, 
							3952600, 3952600, 4007000, 4007000, 
							4205400};
		int[] arrayGol3C = {2668900, 2668900, 2752900, 2752900, 
							2839700, 2839700, 2929100, 2929100,
							3021300, 3021300, 3116500, 3116500,
							3214700, 3214700, 3315900, 3315900,
							3420300, 3420300, 3528100, 3528100,
							3639200, 3639200, 3753800, 3753800, 
							3872000, 3872000, 3994200, 3994200, 
							4119700, 4119700, 4249500, 4249500, 
							4383300};
		int[] arrayGol3D = {2781800, 2781800, 2869400, 2869400, 
							2959800, 2959800, 3053000, 3053000,
							3149100, 3149100, 3248300, 3248300,
							3350600, 3350600, 3456200, 3456200,
							3565000, 3565000, 3677300, 3677300,
							3912600, 3912600, 3912600, 3912600, 
							4035800, 4035800, 4162900, 4162900, 
							4294000, 4294000, 4429300, 4429300, 
							4568800};


		int[] arrayGol4A = {2899500, 2899500, 2990800, 2990800, 
							3085000, 3085000, 3182100, 3182100,
							3282400, 3282400, 3385700, 3385700,
							3492400, 3492400, 3602400, 3602400,
							3715800, 3715800, 3832800, 3832800,
							3953600, 3953600, 4078100, 4078100, 
							4206500, 4206500, 4339000, 4339000, 
							4475700, 4475700, 4616600, 4616600, 
							4762000};
		int[] arrayGol4B = {3022100, 3022100, 3117300, 3117300, 
							3215500, 3215500, 3316700, 3316700,
							3421200, 3421200, 3528900, 3528900,
							3640100, 3640100, 3754700, 3754700,
							3873000, 3873000, 3995000, 3995000,
							4120800, 4120800, 4250600, 4250600, 
							4384400, 4384400, 4522500, 4522500, 
							4665000, 4665000, 4811900, 4811900, 
							4963400};
		int[] arrayGol4C = {3149900, 3149900, 3249100, 3249100, 
							3351500, 3351500, 3457000, 3457000,
							3565900, 3565900, 3678200, 3678200,
							3794100, 3794100, 3913600, 3913600,
							4036800, 4036800, 4164000, 4164000,
							4295100, 4295100, 4430400, 4430400, 
							4569900, 4569900, 4713800, 4713800, 
							4862300, 4862300, 5015400, 5015400, 
							5173400};
		int[] arrayGol4D = {3283200, 3283200, 3386600, 3386600, 
							3493200, 3493200, 3603300, 3603300,
							3716700, 3716700, 3833800, 3833800,
							3954600, 3954600, 4079100, 4079100,
							4207600, 4207600, 4340100, 4340100,
							4476800, 4476800, 4617800, 4617800, 
							4763200, 4763200, 4913200, 4913200, 
							5068000, 5068000, 5227600, 5227600, 
							5392200};
		int[] arrayGol4E = {3422100, 3422100, 3529800, 3529800, 
							3641000, 3641000, 3755700, 3755700,
							3874000, 3874000, 3996000, 3996000,
							4121800, 4121800, 4251600, 4251600,
							4385600, 4385600, 4523700, 4523700,
							4666100, 4666100, 4813100, 4813100, 
							4964700, 4964700, 5121100, 5121100, 
							5282300, 5282300, 5448700, 5448700, 
							5620300};

		duabelas = 12;
		delapanbelas = 18;
		tigadua = 32;
		gajiPokok = nol = potBeras = potIwp = potSewaRumah = potTaperum = potPph = 0;
		satu = jmlAnggota = 1;
		dua = 2;
		tunAnak = tunPapua = tunStruktur = tunSusis = tunFungsi = tunUmum = tunStruktur = tunPajak = 0;

		umum01 = 175000;	satuJuta 		= 1000000;	enamRatus 	= 600000;
		umum02 = 180000;	sembilanRatus 	= 900000;	limaRatus	= 500000;
		umum03 = 185000;	delapanRatus	= 800000;	empatRatus 	= 400000;
		umum04 = 190000;	tujuhRatus 		= 700000;	tigaRatus	= 300000;

		inputNip = inputMasker = inputJmlAnak = inputUmum = inputPapua = "";
		inputNamaTun = inputSewa = inputEselon = inputPendidikan = "";

		System.out.println("");
		System.out.println("\t--------------------------------------------");
		System.out.println("\t               PENGGAJIAN PNS               ");
		System.out.println("\t++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\t+");

		
		  	do{
		  		System.out.print("\t+ NIP\t\t: ");
				inputNip = key2.nextLine();
			  	
			  	while(!inputNip.matches("[0-9]*") || inputNip.matches("[ ]*")){
			  		if (inputNip.matches("[ ]*")) {
		  				System.out.println("\t--- NIP Harus diisi ---");
		  			}
		  			if (!inputNip.matches("[0-9]*")) {
		  				System.out.println("\t--- Input harus angka ---");
		  			}
			  		System.out.println("");
					System.out.print("\t+ NIP\t\t: ");
				  	inputNip = key2.nextLine();
			  	}

				if (inputNip.length() < duabelas) {
					System.out.println("\t--- NIP minimal 12 karakter ---");
				}
				else if (inputNip.length() > delapanbelas) {
					System.out.println("\t--- NIP maximal 18 karakter ---");
				}
					System.out.println("");
			}while((inputNip.length() < duabelas || inputNip.length() > delapanbelas) );
		  	
		  
		  do{
		  		System.out.print("\t+ Nama\t\t: ");
		  		inputNama = key2.nextLine();

		  		while(!inputNama.matches("[a-z A-Z , .]*") || inputNama.matches("[ ]*")){
		  			if (inputNama.matches("[ ]*")) {
		  				System.out.println("\t--- NAMA Harus diisi ---");
		  			}
		  			if (!inputNama.matches("[a-z A-Z , .]*")) {
		  				System.out.println("\t--- Input harus Huruf ---");
		  			}
			  		System.out.println("");
					System.out.print("\t+ Nama\t\t: ");
		  			inputNama = key2.nextLine();
		  		}

		  		if (inputNama.length() > tigadua) {
		  			System.out.println("\t--- Maksimal 32 Karakter ---");
		  		}
		  		System.out.println("");
		  	}while(inputNama.length() > tigadua);

		System.out.println("\t");
		System.out.println("\t+--------------------------------------------");
		System.out.println("\t+ L --> Pria");
		System.out.println("\t+ P --> Wanita");
		System.out.println("\t+ 0 --> Lewati");
		System.out.println("\t+--------------------------------------------");
		  
		do{
			System.out.print("\t+ Kelamin\t: ");
		  	inputKelamin = key.next();
		  			while(inputKelamin.length() > 1){
				  		System.out.println("\t--- Perintah tidak terkait ---");
				  		System.out.println("");
						System.out.print("\t+ Kelamin\t: ");
		  				inputKelamin = key.next();
				  	}
		  	if (!inputKelamin.matches("[L P 0]*")) {
		  		System.out.println("\t--- Perintah tidak sesuai ---");
		  	}
		  	System.out.println("");
		}while(!inputKelamin.matches("[L P 0]*"));
		  
		  if (inputKelamin.equals("L")) {
		  		pria 	= "Laki-Laki";	
		  }else if (inputKelamin.equals("P")) {
				wanita 	= "Perempuan";
		  }

		  System.out.println("\t");
		  System.out.println("\t+--------------------------------------------");
		  System.out.println("\t+ 1 / 2 / 3 / 4");
		  System.out.println("\t+--------------------------------------------");
		  
		  do{
			System.out.print("\t+ Golongan\t: ");
		  	inputGolongan = key2.nextLine();

		  	while(inputGolongan.length() > 1 || inputGolongan.matches("[ ]*")){
		  		if (inputGolongan.matches("[ ]*")) {
		  			System.out.println("\t--- Golongan Harus diisi ---");
		  		}
		  		if (inputGolongan.length() > 1) {
		  			System.out.println("\t--- Tidak ada golongan terkait ---");	
		  		}
				System.out.println("");
				System.out.print("\t+ Golongan\t: ");
		  		inputGolongan = key2.nextLine();
			}

		  	if (!inputGolongan.matches("[1 2 3 4]*")) {
		  		System.out.println("\t--- Tidak ada golongan terkait ---");
		  	}
		  	System.out.println("");
		}while(!inputGolongan.matches("[1 2 3 4]*"));
		  
		  System.out.println("\t");
		  System.out.println("\t+--------------------------------------------");
		  if (!inputGolongan.equals("4")) {
		  	System.out.println("\t+ A / B / C / D");
		  }else{
		  	System.out.println("\t+ A / B / C / D / E");
		  }
		  System.out.println("\t+--------------------------------------------");
		  if (!inputGolongan.equals("4")) {
			  	do{
					System.out.print("\t+ Ruang\t: ");
				  	inputRuang = key2.nextLine();

				  	while(inputRuang.length() > 1 || inputRuang.matches("[ ]*")){
				  		if (inputRuang.matches("[ ]*")) {
				  			System.out.println("\t--- Ruang Harus diisi ---");
				  		}
				  		if (inputRuang.length() > 1) {
				  			System.out.println("\t--- Tidak ada ruang terkait ---");
				  		}
						System.out.println("");
						System.out.print("\t+ Ruang\t: ");
				  		inputRuang = key2.nextLine();
					}

				  	if (!inputRuang.matches("[A B C D]*")) {
				  		System.out.println("\t--- Tidak ada ruang terkait ---");
				  	}
				  	System.out.println("");
			  }while(!inputRuang.matches("[A B C D]*"));
		  }else{
			  	do{
						System.out.print("\t+ Ruang\t: ");
					  	inputRuang = key2.nextLine();

					  	while(inputRuang.length() > 1 || inputRuang.matches("[ ]*")){
					  		if (inputRuang.matches("[ ]*")) {
					  			System.out.println("\t--- Ruang Harus diisi ---");
					  		}
					  		if (inputRuang.length() > 1) {
								System.out.println("\t--- Tidak ada ruang terkait ---");
					  		}
							System.out.println("");
							System.out.print("\t+ Ruang\t: ");
					  		inputRuang = key2.nextLine();
						}

					  	if (!inputRuang.matches("[A B C D E]*")) {
					  		System.out.println("\t--- Tidak ada ruang terkait ---");
					  	}
					  	System.out.println("");
				}while(!inputRuang.matches("[A B C D E]*"));
		  }

		  do{
				System.out.print("\t+ Masa Kerja\t: ");
		  		inputMasker = key2.nextLine();

		  		if (inputMasker.matches("[ ]*")) {
					System.out.println("\t--- MK Harus diisi ---");
				}
				if (!inputMasker.matches("[0-9]*")) {
				  	System.out.println("\t--- Input harus angka ---");
				}
				System.out.println("");
			}while(!inputMasker.matches("[0-9]*") || inputMasker.matches("[ ]*"));

		  System.out.println("\t");
		  System.out.println("\t+--------------------------------------------");
		  System.out.println("\t+ Y --> Ya");
		  System.out.println("\t+ T --> Tidak");
		  System.out.println("\t+--------------------------------------------");
		  do{
				System.out.print("\t+ PNS Struktural : ");
		  		inputStruktural = key2.nextLine();

		  		while(inputStruktural.length() > 1 || inputStruktural.matches("[ ]*")){
		  			if (inputStruktural.matches("[ ]*")) {
						System.out.println("\t--- Mohon Harus diisi ---");
					}
					if (inputStruktural.length() > 1) {
						System.out.println("\t--- Perintah tidak terkait ---");	
					}
						System.out.println("");
						System.out.print("\t+ PNS Struktural : ");
		  				inputStruktural = key2.nextLine();
				}

				if (!inputStruktural.matches("[Y T]*")) {
				  	System.out.println("\t--- Perintah tidak terkait ---");
				}
				System.out.println("");
			}while(!inputStruktural.matches("[Y T]*"));

		  if (!inputStruktural.equals("Y")) {
			  System.out.println("\t");
			  System.out.println("\t+--------------------------------------------");
			  System.out.println("\t+ Y --> Ya");
			  System.out.println("\t+ T --> Tidak");
			  System.out.println("\t+--------------------------------------------");
			  do{
					System.out.print("\t+ PNS Fungsional : ");
			  		inputFungsional = key2.nextLine();

			  		while(inputFungsional.length() > 1 || inputFungsional.matches("[ ]*")){
			  			if (inputFungsional.matches("[ ]*")) {
							System.out.println("\t--- Mohon Harus diisi ---");
						}
						if (inputFungsional.length() > 1) {
							System.out.println("\t--- Perintah tidak terkait ---");
						}
						System.out.println("");
						System.out.print("\t+ PNS Fungsional : ");
			  			inputFungsional = key2.nextLine();
					}

					if (!inputFungsional.matches("[Y T]*")) {
					  	System.out.println("\t--- Perintah tidak terkait ---");
					}
					System.out.println("");
				}while(!inputFungsional.matches("[Y T]*"));

			  if (!inputFungsional.equals("Y")) {
				  System.out.println("\t");
				  System.out.println("\t+--------------------------------------------");
				  System.out.print("\t+ PNS Umum : Y");
				  inputUmum = "Y";
				  inputStruktural = "0";
				  inputFungsional = "0";
			  }else{
			  	System.out.println("\t+--------------------------------------------");
				System.out.println("\t+ 1 -> SMA     5 -> DIII");
				System.out.println("\t+ 2 -> SMK     6 -> S1");
				System.out.println("\t+ 3 -> DI      7 -> S2");
				System.out.println("\t+ 4 -> DII     8 -> S3");
				System.out.println("\t+--------------------------------------------");
				do{
					System.out.print("\t+ Pendidikan : ");
					inputPendidikan = key2.nextLine();

					while(inputPendidikan.length() > 1 || inputPendidikan.matches("[ ]*")){
						if (inputPendidikan.matches("[ ]*")) {
							System.out.println("\t--- Mohon Harus diisi ---");
						}
						if (inputPendidikan.length() > 1) {
							System.out.println("\t--- Perintah tidak terkait ---");	
						}
				  		System.out.println("");
						System.out.print("\t+ Pendidikan : ");
						inputPendidikan = key2.nextLine();
				  	}
					if (!inputPendidikan.matches("[1 2 3 4 5 6 7 8]*")) {
					  	System.out.println("\t--- Perintah tidak terkait ---");
					}
					System.out.println("");
				}while(!inputPendidikan.matches("[1 2 3 4 5 6 7 8]*"));

			  	inputStruktural = "0";
			  	inputUmum = "0";
			  }
		  }else{

		  	System.out.println("\t+--------------------------------------------");
			System.out.println("\t+ 1 -> IA    5 -> IIIA    9 -> VA");
			System.out.println("\t+ 2 -> IB    6 -> IIIB");
			System.out.println("\t+ 3 -> IIA   7 -> IVA");
			System.out.println("\t+ 4 -> IIB   8 -> IVB");
			System.out.println("\t+--------------------------------------------");
			do{
					System.out.print("\t+ Eselon : ");
					inputEselon = key2.nextLine();

					while(inputEselon.length() > 1 || inputEselon.matches("[ ]*")){
						if (inputEselon.matches("[ ]*")) {
							System.out.println("\t--- Mohon Harus diisi ---");
						}
						if (inputEselon.length() > 1) {
				  			System.out.println("\t--- Perintah tidak terkait ---");
						}
				  		System.out.println("");
						System.out.print("\t+ Eselon : ");
						inputEselon = key2.nextLine();
				  	}
					if (!inputEselon.matches("[1 2 3 4 5 6 7 8 9]*")) {
					  	System.out.println("\t--- Perintah tidak terkait ---");
					}
					System.out.println("");
				}while(!inputEselon.matches("[1 2 3 4 5 6 7 8 9]*"));
		  	inputUmum = "0";
		  	inputFungsional = "0";
		  }

		  System.out.println("\t");
		  System.out.println("\t+--------------------------------------------");
		  System.out.println("\t+ S --> Sudah Kawin");
		  System.out.println("\t+ B --> Belum Kawin");
		  System.out.println("\t+ J --> Janda");
		  System.out.println("\t+ D --> Duda");
		  System.out.println("\t+--------------------------------------------");
		  do{
					System.out.print("\t+ Status Kawin : ");
		 			inputStatus = key2.nextLine();

					while(inputStatus.length() > 1 || inputStatus.matches("[ ]*")){
						if (inputStatus.matches("[ ]*")) {
							System.out.println("\t--- Mohon Harus diisi ---");
						}
						if (inputStatus.length() > 1) {
				  			System.out.println("\t--- Perintah tidak terkait ---");
						}
				  		System.out.println("");
						System.out.print("\t+ Status Kawin : ");
		 				inputStatus = key2.nextLine();
				  	}
					if (!inputStatus.matches("[S B J D]*")) {
					  	System.out.println("\t--- Perintah tidak terkait ---");
					}
					System.out.println("");
		}while(!inputStatus.matches("[S B J D]*"));

		  if (inputStatus.equals("S") || inputStatus.equals("J") || inputStatus.equals("D") || inputStatus.equals("B") ) {
		  		
		  		do{
					System.out.print("\t+ Jumlah Anak : ");
		  			inputJmlAnak = key2.nextLine();

		  			if (inputJmlAnak.matches("[ ]*")) {
						System.out.println("\t--- Mohon Harus diisi ---");
					}

					if (!inputJmlAnak.matches("[0-9]*")) {
					  	System.out.println("\t--- Inputan harus angka ---");
					}
					System.out.println("");
				}while(!inputJmlAnak.matches("[0-9]*") || inputJmlAnak.matches("[ ]*"));

		  }else{
		  		inputJmlAnak = "0";
		  }

		  System.out.println("\t");
		  System.out.println("\t+--------------------------------------------");
		  System.out.println("\t+ Y --> Ya");
		  System.out.println("\t+ T --> Tidak");
		  System.out.println("\t+--------------------------------------------");
		  do{
					System.out.print("\t+ Dinas di Papua : ");
		  			inputPapua = key2.nextLine();

					while(inputPapua.length() > 1 || inputPapua.matches("[ ]*")){
						if (inputPapua.matches("[ ]*")) {
							System.out.println("\t--- Input Harus diisi ---");
						}
						if (inputPapua.length() > 1) {
				  			System.out.println("\t--- Perintah tidak terkait ---");
						}
				  		System.out.println("");
						System.out.print("\t+ Dinas di Papua : ");
		  				inputPapua = key2.nextLine();
				  	}
					if (!inputPapua.matches("[Y T]*")) {
					  	System.out.println("\t--- Perintah tidak terkait ---");
					}
					System.out.println("");
		}while(!inputPapua.matches("[Y T]*"));
		  if (!inputPapua.equals("Y")) {
		  		inputPapua = "0";
		  }

		  System.out.println("\t");
		  System.out.println("\t+--------------------------------------------");
		  System.out.println("\t+ Y --> Ya");
		  System.out.println("\t+ T --> Tidak");
		  System.out.println("\t+--------------------------------------------");
		  do{
					System.out.print("\t+ Tunjangan Lain : ");
		  			inputTunjangan = key2.nextLine();

					while(inputTunjangan.length() > 1 || inputTunjangan.matches("[ ]*")){
						if (inputTunjangan.matches("[ ]*")) {
							System.out.println("\t--- Input Harus diisi ---");
						}
						if (inputTunjangan.length() > 1) {
							System.out.println("\t--- Perintah tidak terkait ---");
						}
				  		System.out.println("");
						System.out.print("\t+ Tunjangan Lain : ");
		  				inputTunjangan = key2.nextLine();
				  	}
					if (!inputTunjangan.matches("[Y T]*")) {
					  	System.out.println("\t--- Perintah tidak terkait ---");
					}
					System.out.println("");
			}while(!inputTunjangan.matches("[Y T]*"));
		  if (inputTunjangan.equals("Y")) {
		  		do{
					System.out.print("\t+ Nama Tunjangan : ");
		  			inputNamaTun = key2.nextLine();

		  			if (inputNamaTun.matches("[ ]*")) {
						System.out.println("\t--- Input Harus diisi ---");
					}

					if (!inputNamaTun.matches("[A-Z a-z]*")) {
					  	System.out.println("\t--- Inputan harus huruf ---");
					}
					System.out.println("");
				}while(!inputNamaTun.matches("[A-Z a-z]*") || inputNamaTun.matches("[ ]*"));

		  		
		  		do{
					System.out.print("\t+ Besaran : ");
		  			// inputBesaran = key.nextInt();
		  			inputBesar = key2.nextLine();
		  			if (inputBesar.matches("[ ]*")) {
						System.out.println("\t--- Input Harus diisi ---");
					}
					if (!inputBesar.matches("[0-9]*")) {
					  	System.out.println("\t--- Inputan harus angka ---");
					}
					System.out.println("");
				}while(!inputBesar.matches("[0-9]*") || inputBesar.matches("[ ]*"));

		  }else{
		  	inputBesar = "0";
		  }

		  System.out.println("\t");
		  System.out.println("\t+--------------------------------------------");
		  System.out.println("\t+ Y --> Ya");
		  System.out.println("\t+ T --> Tidak");
		  System.out.println("\t+--------------------------------------------");
		  	do{
					System.out.print("\t+ Sewa Rumah : ");
		 			inputSewa = key2.nextLine();

					while(inputSewa.length() > 1 || inputSewa.matches("[ ]*")){
						if (inputSewa.matches("[ ]*")) {
							System.out.println("\t--- Input Harus diisi ---");
						}
						if (inputSewa.length() > 1) {
							System.out.println("\t--- Perintah tidak terkait ---");	
						}
				  		System.out.println("");
						System.out.print("\t+ Sewa Rumah : ");
		 				inputSewa = key2.nextLine();
				  	}
					if (!inputSewa.matches("[Y T]*")) {
					  	System.out.println("\t--- Perintah tidak terkait ---");
					}
					System.out.println("");
			}while(!inputSewa.matches("[Y T]*"));

		  if (inputSewa.equals("Y")) {
		  		inputSewa = "450000";
		  }else{
		  		inputSewa = "0";
		  }



		System.out.println("");
		System.out.println("\t--------------------------------------------");
		System.out.println("\t                 SLIP GAJI                  ");
		System.out.println("\t++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\t+");
		System.out.println("\t+");
		System.out.println("\t+ Nama : "+inputNama+" ("+inputNip+")");
		System.out.println("\t+");
		System.out.println("\t--------------------------------------------");
		System.out.println("\t|\tPENGHASILAN");
		System.out.println("\t+-------------------------------------------");
		System.out.println("\t+");

		int masker = Integer.parseInt(inputMasker);
		if (inputGolongan.equals("1") && inputRuang.equals("A") && masker > 27) {
			gajiPokok = arrayGolIA[27];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("1") && inputRuang.equals("B") && masker > 27) {
			gajiPokok = arrayGolIB[27];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("1") && inputRuang.equals("C") && masker > 27) {
			gajiPokok = arrayGolIC[27];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("1") && inputRuang.equals("D") && masker > 27) {
			gajiPokok = arrayGolID[27];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("1") && inputRuang.equals("A")) {
			gajiPokok = arrayGolIA[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("1") && inputRuang.equals("B")) {
			gajiPokok = arrayGolIB[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("1") && inputRuang.equals("C")) {
			gajiPokok = arrayGolIC[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("1") && inputRuang.equals("D")) {
			gajiPokok = arrayGolID[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("2") && inputRuang.equals("A") && masker > 33) {
			gajiPokok = arrayGol2A[33];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("2") && inputRuang.equals("B") && masker > 33) {
			gajiPokok = arrayGol2B[33];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("2") && inputRuang.equals("C") && masker > 33) {
			gajiPokok = arrayGol2C[33];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("2") && inputRuang.equals("D") && masker > 33) {
			gajiPokok = arrayGol2D[33];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("2") && inputRuang.equals("A")) {
			gajiPokok = arrayGol2A[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("2") && inputRuang.equals("B")) {
			gajiPokok = arrayGol2B[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("2") && inputRuang.equals("C")) {
			gajiPokok = arrayGol2C[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("2") && inputRuang.equals("D")) {
			gajiPokok = arrayGol2D[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("3") && inputRuang.equals("A") && masker > 32) {
			gajiPokok = arrayGol3A[32];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("3") && inputRuang.equals("B") && masker > 32) {
			gajiPokok = arrayGol3B[32];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("3") && inputRuang.equals("C") && masker > 32) {
			gajiPokok = arrayGol3C[32];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("3") && inputRuang.equals("D") && masker > 32) {
			gajiPokok = arrayGol3D[32];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("3") && inputRuang.equals("A")) {
			gajiPokok = arrayGol3A[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("3") && inputRuang.equals("B")) {
			gajiPokok = arrayGol3B[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("3") && inputRuang.equals("C")) {
			gajiPokok = arrayGol3C[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("3") && inputRuang.equals("D")) {
			gajiPokok = arrayGol3D[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("4") && inputRuang.equals("A") && masker > 32) {
			gajiPokok = arrayGol4A[32];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("4") && inputRuang.equals("B") && masker > 32) {
			gajiPokok = arrayGol4B[32];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("4") && inputRuang.equals("C") && masker > 32) {
			gajiPokok = arrayGol4C[32];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("4") && inputRuang.equals("D") && masker > 32) {
			gajiPokok = arrayGol4D[32];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("4") && inputRuang.equals("E") && masker > 32) {
			gajiPokok = arrayGol4E[32];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("4") && inputRuang.equals("A")) {
			gajiPokok = arrayGol4A[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("4") && inputRuang.equals("B")) {
			gajiPokok = arrayGol4B[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("4") && inputRuang.equals("C")) {
			gajiPokok = arrayGol4C[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("4") && inputRuang.equals("D")) {
			gajiPokok = arrayGol4D[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}
		else if (inputGolongan.equals("4") && inputRuang.equals("E")) {
			gajiPokok = arrayGol4E[masker];
			System.out.println("\t+ Gaji Pokok : "+gajiPokok);
		}

		if (inputStatus.equals("S")) {
			tunSusis = ((gajiPokok*10)/100);
			System.out.println("\t+ T. Istri/Suami: "+tunSusis);
		}else{
			tunSusis = (0);
			System.out.println("\t+ T. Istri/Suami: "+tunSusis);
		}

		int jmlAnak = Integer.parseInt(inputJmlAnak);
		if (jmlAnak > dua) {
			tunAnak = (gajiPokok*2)/100;
			tunAnak = (tunAnak*dua);
			System.out.println("\t+ T. Anak : "+tunAnak);
		}
		else if(jmlAnak <= 2 && jmlAnak > 0){
			tunAnak = (gajiPokok*2)/100;
			tunAnak = (tunAnak*jmlAnak);
			System.out.println("\t+ T. Anak : "+tunAnak);
		}else if(jmlAnak == 0){
			tunAnak = 0;
			System.out.println("\t+ T. Anak : "+tunAnak);
		}

		if (inputUmum.equals("Y")) {
			if (inputGolongan.equals("1")) {
				tunUmum = umum01;
				System.out.println("\t+ T. Umum : "+tunUmum);
			}
			else if (inputGolongan.equals("2")) {
				tunUmum = umum02;
				System.out.println("\t+ T. Umum : "+tunUmum);
			}
			else if (inputGolongan.equals("3")) {
				tunUmum = umum03;
				System.out.println("\t+ T. Umum : "+tunUmum);
			}
			else if (inputGolongan.equals("4")) {
				tunUmum = umum04;
				System.out.println("\t+ T. Umum : "+tunUmum);
			}
			
		}else{
			int umum = Integer.parseInt(inputUmum);
			tunUmum = umum;
			System.out.println("\t+ T. Umum : "+tunUmum);
		}

		if (inputFungsional.equals("Y")) {
			if (inputGolongan.equals("4") && (inputPendidikan.equals("6") || inputPendidikan.equals("S2") || inputPendidikan.equals("8")) && (inputRuang.equals("D") || inputRuang.equals("E") )) {
				tunFungsi = satuJuta;
				System.out.println("\t+ T. Fungsional : "+tunFungsi);
			}
			else if (inputGolongan.equals("4") && (inputPendidikan.equals("6") || inputPendidikan.equals("S2") || inputPendidikan.equals("8")) && (inputRuang.equals("A") || inputRuang.equals("B") || inputRuang.equals("C") )) {
				tunFungsi = sembilanRatus;
				System.out.println("\t+ T. Fungsional : "+tunFungsi);
			}
			else if (inputGolongan.equals("3") && (inputPendidikan.equals("6") || inputPendidikan.equals("S2") || inputPendidikan.equals("8")) && (inputRuang.equals("C") || inputRuang.equals("D") )) {
				tunFungsi = delapanRatus;
				System.out.println("\t+ T. Fungsional : "+tunFungsi);
			}
			else if (inputGolongan.equals("3") && (inputPendidikan.equals("6") || inputPendidikan.equals("S2") || inputPendidikan.equals("8")) && (inputRuang.equals("A") || inputRuang.equals("B") )) {
				tunFungsi = tujuhRatus;
				System.out.println("\t+ T. Fungsional : "+tunFungsi);
			}
			else if (inputGolongan.equals("3") && (inputPendidikan.equals("1") || inputPendidikan.equals("2") || inputPendidikan.equals("3") || inputPendidikan.equals("4") || inputPendidikan.equals("5")) && (inputRuang.equals("C") || inputRuang.equals("D") )) {
				tunFungsi = enamRatus;
				System.out.println("\t+ T. Fungsional : "+tunFungsi);
			}
			else if (inputGolongan.equals("3") && (inputPendidikan.equals("1") || inputPendidikan.equals("2") || inputPendidikan.equals("3") || inputPendidikan.equals("4") || inputPendidikan.equals("5")) && (inputRuang.equals("A") || inputRuang.equals("B") )) {
				tunFungsi = limaRatus;
				System.out.println("\t+ T. Fungsional : "+tunFungsi);
			}
			else if (inputGolongan.equals("2") && (inputPendidikan.equals("1") || inputPendidikan.equals("2") || inputPendidikan.equals("3") || inputPendidikan.equals("4") || inputPendidikan.equals("5")) && (inputRuang.equals("B") || inputRuang.equals("C") || inputRuang.equals("D") )) {
				tunFungsi = empatRatus;
				System.out.println("\t+ T. Fungsional : "+tunFungsi);
			}
			else if (inputGolongan.equals("2") && (inputPendidikan.equals("1") || inputPendidikan.equals("2") || inputPendidikan.equals("3") || inputPendidikan.equals("4") || inputPendidikan.equals("5")) && inputRuang.equals("A") ) {
				tunFungsi = tigaRatus;
				System.out.println("\t+ T. Fungsional : "+tunFungsi);
			}
		}else{
			int fungsi = Integer.parseInt(inputFungsional);
			tunFungsi = fungsi;
			System.out.println("\t+ T. Fungsional : "+tunFungsi);
		}

		if (inputStruktural.equals("Y")) {
			if (inputEselon.equals("1")) {
				tunStruktur = 5500000;
				System.out.println("\t+ T. Struktural : "+tunStruktur);
			}
			else if (inputEselon.equals("2")) {
				tunStruktur = 4375000;
				System.out.println("\t+ T. Struktural : "+tunStruktur);
			}
			else if (inputEselon.equals("3")) {
				tunStruktur = 3250000;
				System.out.println("\t+ T. Struktural : "+tunStruktur);
			}
			else if (inputEselon.equals("4")) {
				tunStruktur = 2025000;
				System.out.println("\t+ T. Struktural : "+tunStruktur);
			}
			else if (inputEselon.equals("5")) {
				tunStruktur = 1260000;
				System.out.println("\t+ T. Struktural : "+tunStruktur);
			}
			else if (inputEselon.equals("6")) {
				tunStruktur = 980000;
				System.out.println("\t+ T. Struktural : "+tunStruktur);
			}
			else if (inputEselon.equals("7")) {
				tunStruktur = 540000;
				System.out.println("\t+ T. Struktural : "+tunStruktur);
			}
			else if (inputEselon.equals("8")) {
				tunStruktur = 490000;
				System.out.println("\t+ T. Struktural : "+tunStruktur);
			}
			else if (inputEselon.equals("9")) {
				tunStruktur = 360000;
				System.out.println("\t+ T. Struktural : "+tunStruktur);
			}
		}else{
			int struktural = Integer.parseInt(inputStruktural);
			tunStruktur = struktural;
			System.out.println("\t+ T. Struktural : "+tunStruktur);
		}

		if (inputPapua.equals("Y")) {
			if (inputGolongan.equals("1") && inputRuang.equals("A")) {
				tunPapua = 200000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
			else if (inputGolongan.equals("1") && inputRuang.equals("B")) {
				tunPapua = 225000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
			else if (inputGolongan.equals("1") && inputRuang.equals("C")) {
				tunPapua = 250000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
			else if (inputGolongan.equals("1") && inputRuang.equals("D")) {
				tunPapua = 275000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
			else if (inputGolongan.equals("2") && inputRuang.equals("A")) {
				tunPapua = 300000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
			else if (inputGolongan.equals("2") && inputRuang.equals("B")) {
				tunPapua = 325000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
			else if (inputGolongan.equals("2") && inputRuang.equals("C")) {
				tunPapua = 350000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
			else if (inputGolongan.equals("2") && inputRuang.equals("D")) {
				tunPapua = 375000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
			else if (inputGolongan.equals("3") && inputRuang.equals("A")) {
				tunPapua = 425000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
			else if (inputGolongan.equals("3") && inputRuang.equals("B")) {
				tunPapua = 450000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
			else if (inputGolongan.equals("3") && inputRuang.equals("C")) {
				tunPapua = 475000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
			else if (inputGolongan.equals("3") && inputRuang.equals("D")) {
				tunPapua = 500000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
			else if (inputGolongan.equals("4") && inputRuang.equals("A")) {
				tunPapua = 525000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
			else if (inputGolongan.equals("4") && inputRuang.equals("B")) {
				tunPapua = 550000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
			else if (inputGolongan.equals("4") && inputRuang.equals("C")) {
				tunPapua = 575000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
			else if (inputGolongan.equals("4") && inputRuang.equals("D")) {
				tunPapua = 600000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
			else if (inputGolongan.equals("4") && inputRuang.equals("E")) {
				tunPapua = 625000;
				System.out.println("\t+ T. Papua : "+tunPapua);
			}
		}else{
			int papua = Integer.parseInt(inputPapua);
			tunPapua = papua;
			System.out.println("\t+ T. Papua : "+tunPapua);
		}

		tunTerpencil = 0;
		System.out.println("\t+ T. Terpencil : "+tunTerpencil);

		int inputBesaran = Integer.parseInt(inputBesar);
		if (inputTunjangan.equals("Y")) {
			System.out.println("\t+ T. Lainnya : ");	
			tunLain = inputBesaran;
			System.out.println("\t+\t "+inputNamaTun+" : "+tunLain);		
		}
		else{
			tunLain = inputBesaran;
			System.out.println("\t+ T. Lainnya : " + tunLain);
		}
		
		if (inputStatus.equals("S")) {
			jmlAnggota += 1;
		}
		else if (inputStatus.equals("J") || inputStatus.equals("D")) {
			jmlAnggota += 0;
		}
		if (jmlAnak > 2) {
			jmlAnggota += 2;
		}else if (jmlAnak <= 2) {
			jmlAnggota += jmlAnak;
		}

		tunBeras = (10*jmlAnggota)*14000;
		System.out.println("\t+ T. Beras : " + tunBeras);

		tunPajak = pphPerBulan;
		// System.out.println("\t+ T. Pajak : " + tunPajak);



		System.out.println("");
		System.out.println("\t+--------------------------------------------");
		gajiKotor = gajiPokok + tunSusis + tunAnak + tunPapua + tunTerpencil + tunStruktur + tunFungsi + tunUmum + tunLain + tunBeras;
		System.out.println("\t+ Gaji Kotor : "+gajiKotor);

		System.out.println("");
		System.out.println("\t");
		System.out.println("\t--------------------------------------------");
		System.out.println("\t|\tPOTONGAN");
		System.out.println("\t+-------------------------------------------");
		System.out.println("\t+");
		System.out.println("\t+ Pot. Beras : "+potBeras);

		potIwp = ((gajiPokok + tunSusis + tunAnak)*10)/100;
		System.out.println("\t+ Pot. IWP : "+potIwp);

		int sewa = Integer.parseInt(inputSewa);
		potSewaRumah = sewa;
		System.out.println("\t+ Sewa Rmh : "+potSewaRumah);

		if (inputGolongan.equals("1")) {
			potTaperum = 3000;
			System.out.println("\t+ Pot. Taperum : "+potTaperum);
		}
		else if (inputGolongan.equals("2")) {
			potTaperum = 5000;
			System.out.println("\t+ Pot. Taperum : "+potTaperum);
		}
		else if (inputGolongan.equals("3")) {
			potTaperum = 7000;
			System.out.println("\t+ Pot. Taperum : "+potTaperum);
		}
		else if (inputGolongan.equals("4")) {
			potTaperum = 10000;
			System.out.println("\t+ Pot. Taperum : "+potTaperum);
		}


		biayaJabatan = (gajiKotor*5)/100;
		iuranPensiun = ((gajiPokok + tunSusis + tunAnak)*4.75)/100;
		totalPengurang = biayaJabatan + iuranPensiun;

		nettoSebulan = gajiKotor - totalPengurang;
		nettoSetahun = nettoSebulan*12;

		if (inputStatus.equals("S")) {
			ptkp += 3000000;
		}
		if (jmlAnak <= 3) {
			ptkp = ptkp + (3000000*jmlAnak);
		}else if (jmlAnak > 3) {
			ptkp = ptkp + (3000000*3);
		}

		pkp = nettoSetahun - ptkp;
		Double d = new Double(pkp);
		int hasilPkp = d.intValue();

		if (hasilPkp <= 0) {
			potPph = 0;
			System.out.println("\t+ Pot. Pph : "+potPph);
		}
		else{
			if (hasilPkp <= 50000000) {
				potSetahun = (hasilPkp*5)/100;
			}
			else if (hasilPkp > 50000000 && hasilPkp <= 250000000) {
				potSetahun = ((50000000*5)/100) + ( ((hasilPkp-50000000)*15)/100 );
			}
			else if (hasilPkp > 250000000 && hasilPkp <= 500000000) {
				potSetahun = ((50000000*5)/100) + ((200000000*15)/100) + ( ((hasilPkp - (50000000 + 200000000))*25)/100 );
			}
			else if (hasilPkp > 500000000) {
				potSetahun = ((50000000*5)/100) + ((200000000*15)/100) + ((250000000*25)/100) + ( ((hasilPkp - (50000000 + 20000000 + 250000000))*30)/100 );
			}
			pphPerBulan = potSetahun / 12;
			System.out.println("\t+ Pot. Pph : "+pphPerBulan);
		}

		// pphPerBulan
		jmlPotongan = potBeras + potIwp + potSewaRumah + potTaperum;
		System.out.println("\t--------------------------------------------");
		System.out.println("\t Total Potongan : "+jmlPotongan);
		System.out.println(""); 
		gajiBersih = gajiKotor - jmlPotongan;
		System.out.println("\t--------------------------------------------");
		System.out.println("\t Gaji Bersih : "+gajiBersih);
	}
}