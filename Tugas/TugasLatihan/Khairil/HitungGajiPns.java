/*
	 Program     : Tugas - Sistem Perhitungan Gaji PNS
     Creator     : Khairil
     Created At  : 23 Mei 2018 10:56 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class HitungGajiPns {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		Scanner dualLine = new Scanner(System.in);
		String noLetter, noNum, tglPeriod, nip, namaPegawai, gol, eselon, statPegawai, masaKerja, jumAnak1, tunjTerpencil, tanyaTunjStruktural, tanyaTunjFungsional, inputNamaTunjLain, inputNomTunjLain, tanyaJenisFungsional, tunjPajak, tanyaTunjPapua, tanyaTunjLain, ambilAngka, ambilAngka1, tanyasewaRumah, bbnSeminar, bbnListrik, bbnAir, statInputNoBlank, statInputMustNum, statInputMustLetter, statInputOnlyYN;
		int jumAnak, keluarga, mmasaKerja, exp3, tunjTerpencilI, pkpLvl1, pkpLvl2, pkpLvl3, ptkpSingle, ptkpMarried, ptkpAnak, gapok, tunjBeras, tunjUmum, tunjPapua, tunjStruktur, tunjFungsi, tunjLain, transport, bbnPotBeras, bbnTaperum, sewaRumah, bbnSeminarI, bbnListrikI, bbnAirI, jumKotor, jumPot, jumBersih, countTunj, hargaBeras;
		double tier1, tier2, tier3, tier4, persenpkp1, persenpkp2, persenpkp3, persenpkp4, totalGajiKotor, totalBebanKotor, bbnPPh, totalGajiBersih, gajiSetelahPPh, ptkp, pkp, gajiBersihSetahun, tunjAnak, bbnIwp, tunjKel, bbnPphBln;
		boolean clap;

		masaKerja = ""; mmasaKerja = 0; gapok = 0; nip = ""; namaPegawai = ""; gol = ""; statPegawai = "";
		tunjAnak = 0; tunjBeras = 0; keluarga = 0; noNum = "[A-Za-z., ]+"; noLetter = "[0-9]+"; tunjStruktur = 0;
		tanyaJenisFungsional = ""; tglPeriod = ""; bbnPPh = 0; tunjUmum = 0; eselon = ""; tunjStruktur = 0;
		tanyaTunjFungsional = ""; tunjFungsi = 0; tunjPapua = 0; bbnTaperum = 0; countTunj = 0; inputNamaTunjLain = "";
		inputNomTunjLain = ""; tunjLain = 0; pkpLvl1 = 50000000; pkpLvl2 = 250000000; pkpLvl3 = 500000000;
		persenpkp1 = 0.05; persenpkp2 = 0.15; persenpkp3 = 0.25; persenpkp4 = 0.3; gajiSetelahPPh = 0;
		ptkpSingle = 36000000; ptkpMarried = ptkpAnak = 3000000; ptkp = 0; pkp = 0; gajiBersihSetahun = 0;
		totalGajiBersih = 0; clap = false; jumAnak = 0; hargaBeras = 14000; tanyaTunjStruktural = ""; tunjTerpencilI = 0;
		sewaRumah = 0; tanyaTunjPapua = ""; tunjTerpencil = ""; tanyaTunjLain = ""; bbnSeminar = ""; bbnAir = ""; bbnListrik = "";

		statInputNoBlank = "Inputan Tidak Boleh Kosong";
		statInputMustLetter = "Inputan hanya boleh huruf";
		statInputMustNum = "Inputan hanya boleh angka";
		statInputOnlyYN = "Inputan hanya Y (Ya) atau N (Tidak)";

		//golongan I
		int[] gapok1a = {1486500, 1486500, 1533400, 1533400, 1581700, 1581700, 1631500, 1631500, 1682900, 1682900, 1735900, 1735900, 1790500, 1790500, 1846900, 1846900, 1905100, 1905100, 1965100, 1965100, 2027000, 2027000, 2090800, 2090800, 2156700, 2156700, 2224600, 2224600};
		int[] gapok1b = {1623400, 1623400, 1674500, 1674500, 1727300, 1727300, 1781700, 1781700, 1837800, 1837800, 1895700, 1895700, 1955400, 1955400, 2016900, 2016900, 2080500, 2080500, 2146000, 2146000, 2213600, 2213600, 2283300, 2283300, 2355200};
		int[] gapok1c = {1692100, 1692100, 1745400, 1745400, 1800300, 1800300, 1857000, 1857000, 1915500, 1915500, 1975800, 1975800, 2038100, 2038100, 2102300, 2102300, 2168500, 2168500, 2236800, 2236800, 2307200, 2307200, 2379900, 2379900, 2454800};
		int[] gapok1d = {1763600, 1763600, 1819200, 1819200, 1876500, 1876500, 1935600, 1935600, 1996500, 1996500, 2059400, 2059400, 2124300, 2124300, 2191200, 2191200, 2260200, 2260200, 2331400, 2331400, 2404800, 2404800, 2480500, 2480500, 2558700};
		//golongan II
		int[] gapok2a = {1926000, 1956300, 1956300, 2017900, 2017900, 2081500, 2081500, 2147000, 2147000, 2214700, 2214700, 2284400, 2284400, 2356400, 2356400, 2430600, 2430600, 2507100, 2507100, 2586100, 2586100, 2667500, 2667500, 2751600, 2751600, 2838200, 2838200, 2927600, 2927600, 3019800, 3019800, 3114900, 3114900, 3213100};
		int[] gapok2b = {2103300, 2103300, 2169500, 2169500, 2237900, 2237900, 2308300, 2308300, 2381100, 2381100, 2456000, 2456000, 2533400, 2533400, 2613200, 2613200, 2695500, 2695500, 2780400, 2780400, 2867900, 2867900, 2958300, 2958300, 3051400, 3051400, 3147600, 3147600, 3246700, 3246700, 3348900};
		int[] gapok2c = {2192300, 2192300, 2261300, 2261300, 2332500, 2332500, 2406000, 2406000, 2481800, 2481800, 2559900, 2559900, 2640600, 2640600, 2723700, 2723700, 2809500, 2809500, 2898000, 2898000, 2989300, 2989300, 3083400, 3083400, 3180500, 3180500, 3280700, 3280700, 3384000, 3384000, 3490600};
		int[] gapok2d = {2285000, 2285000, 2357000, 2357000, 2431200, 2431200, 2507800, 2507800, 2586700, 2586700, 2668200, 2668200, 2752300, 2752300, 2838900, 2838900, 2928300, 2928300, 3020600, 3020600, 3115700, 3115700, 3213800, 3213800, 3315100, 3315100, 3419500, 3419500, 3527200, 3527200, 3638200};
		//golongan III
		int[] gapok3a = {2456700, 2456700, 2534000, 2534000, 2613800, 2613800, 2696200, 2696200, 2781100, 2781100, 2868700, 2868700, 2959000, 2959000, 3052200, 3052200, 3148300, 3148300, 3247500, 3247500, 3349800, 3349800, 3455300, 3455300, 3564100, 3564100, 3676400, 3676400, 3792100, 3792100, 3911600, 3911600, 4034800};
		int[] gapok3b = {2560600, 2560600, 2641200, 2641200, 2724400, 2724400, 2810200, 2810200, 2898700, 2898700, 2990000, 2990000, 3084200, 3084200, 3181300, 3181300, 3281500, 3281500, 3384900, 3384900, 3491500, 3491500, 3601400, 3601400, 3714900, 3714900, 3831900, 3831900, 3952600, 3952600, 4007000, 4007000, 4205400};
		int[] gapok3c = {2668900, 2668900, 2752900, 2752900, 2839700, 2839700, 2929100, 2929100, 3021300, 3021300, 3116500, 3116500, 3214700, 3214700, 3315900, 3315900, 3420300, 3420300, 3528100, 3528100, 3639200, 3639200, 3753800, 3753800, 3872000, 3872000, 3994200, 3994200, 4119700, 4119700, 4249500, 4249500, 4383300};
		int[] gapok3d = {2781800, 2781800, 2869400, 2869400, 2959800, 2959800, 3053000, 3053000, 3149100, 3149100, 3248300, 3248300, 3350600, 3350600, 3456200, 3456200, 3565000, 3565000, 3677300, 3677300, 3912600, 3912600, 3912600, 3912600, 4035800, 4035800, 4162900, 4162900, 4294000, 4294000, 4429300, 4429300, 4568800};
		//golongan IV
		int[] gapok4a = {2899500, 2899500, 2990800, 2990800, 3085000, 3085000, 3182100, 3182100, 3282400, 3282400, 3385700, 3385700, 3492400, 3492400, 3602400, 3602400, 3715800, 3715800, 3832800, 3832800, 3953600, 3953600, 4078100, 4078100, 4206500, 4206500, 4339000, 4339000, 4475700, 4475700, 4616600, 4616600, 4762000};
		int[] gapok4b = {3022100, 3022100, 3117300, 3117300, 3215500, 3215500, 3316700, 3316700, 3421200, 3421200, 3528900, 3528900, 3640100, 3640100, 3754700, 3754700, 3873000, 3873000, 3995000, 3995000, 4120800, 4120800, 4250600, 4250600, 4384400, 4384400, 4522500, 4522500, 4665000, 4665000, 4811900, 4811900, 4963400};
		int[] gapok4c = {3149900, 3149900, 3249100, 3249100, 3351500, 3351500, 3457000, 3457000, 3565900, 3565900, 3678200, 3678200, 3794100, 3794100, 3913600, 3913600, 4036800, 4036800, 4164000, 4164000, 4295100, 4295100, 4430400, 4430400, 4569900, 4569900, 4713800, 4713800, 4862300, 4862300, 5015400, 5015400, 5173400};
		int[] gapok4d = {3283200, 3283200, 3386600, 3386600, 3493200, 3493200, 3603300, 3603300, 3716700, 3716700, 3833800, 3833800, 3954600, 3954600, 4079100, 4079100, 4207600, 4207600, 4340100, 4340100, 4476800, 4476800, 4617800, 4617800, 4763200, 4763200, 4913200, 4913200, 5068000, 5068000, 5227600, 5227600, 5392200};
		int[] gapok4e = {3422100, 3422100, 3529800, 3529800, 3641000, 3641000, 3755703, 3755700, 3874000, 3874000, 3996000, 3996000, 4121800, 4121800, 4251600, 4251600, 4385600, 4385600, 4523700, 4523700, 4666100, 4666100, 4813100, 4813100, 4964700, 4964700, 5121100, 5121100, 5282300, 5282300, 5448700, 5448700, 5620300};

		System.out.println("----------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		while(clap == false) {
			System.out.print("NIP : ");
			nip = number.nextLine();	
			if(nip.matches("[0-9]+")) {
				if(nip.length() < 12) {
					System.out.println("Minimal 12 digit");
					clap = false;
				}
				else if(nip.length() > 18) {
					System.out.println("Maksimal 18 digit");
					clap = false;
				}
				else {
					clap = true;
				}
			}
			else if(nip.length() == 0) {
				System.out.println(statInputNoBlank);
				clap = false;				
			}
			else {
				System.out.println(statInputMustNum);
				clap = false;
			}
		}

		System.out.println();

		clap = false;

		while(clap == false)	{
			System.out.print("Nama	: ");
			namaPegawai = dualLine.nextLine();	
			if(namaPegawai.matches(noNum) ) {
				if(namaPegawai.length() > 32) {
					System.out.println("Maksimal Inputan 32 digit");
					clap = false;
				}
				else if(namaPegawai.length() > 0 && namaPegawai.length() <= 32) {
					clap = true;
				}				
			}
			else if(namaPegawai.length() == 0) {
				System.out.println(statInputNoBlank);
				clap = false;
			}
			else {
				System.out.println(statInputMustLetter);
				clap = false;
			}
		}

		System.out.println();

		clap = false;

		while(clap == false) {
			System.out.print("Status Perkawinan : ");
			System.out.println();
			System.out.println("TK = Tidak Kawin | K = Kawin | D = Duda | J = Janda");			
			statPegawai = keyboard.nextLine();
			if(statPegawai.matches("[KDJ]+") || statPegawai.matches("[TK]+")) {
				if(statPegawai.equals("D") || statPegawai.equals("J") || statPegawai.equals("TK")) {
					keluarga = 0;
					clap = true;
				}
				else if(statPegawai.equals("K")) {
					keluarga = 1; //tidak termasuk anak;
					clap = true;
				}
			}
			else if(statPegawai.length() == 0) {
				System.out.println(statInputNoBlank);
				clap = false;
			}
			else {
				System.out.println("Kode Input Tidak Dikenal. Case sensitive");
				clap = false;
			}
		}

		System.out.println();

		clap = false;

		while(clap == false)	{
			System.out.print("Golongan	: ");
			System.out.println();
			System.out.println("1A | 1B | 1C | 1D | 2A | 2B | 2C | 2D | 3A | 3B | 3C | 3D | 4A | 4B | 4C | 4D | 4E");
			gol = dualLine.nextLine();	
			if(gol.matches("[1-3A-Da-d]+") || gol.matches("[4A-Ea-e]+")) {
				clap = true;
			}
			else if(gol.length() == 0) {
				System.out.println(statInputNoBlank);
				clap = false;
			}
			else {
				System.out.println("Inputan Golongan " + gol + " Tidak Dikenal");
				clap = false;
			}
		}

		System.out.println();		

		clap = false;

		while(clap == false) {
			System.out.print("Masa Kerja : ");
			masaKerja = keyboard.nextLine();
			if(masaKerja.matches(noLetter)) {
				clap = true;
			}
			else if(masaKerja.length() == 0) {
				System.out.println(statInputNoBlank);
				clap = false;
			}
			else {
				System.out.println(statInputMustNum);
				clap = false;				
			}
		}

		System.out.println();

		mmasaKerja = Integer.parseInt(masaKerja);
		exp3  = mmasaKerja-3;

		if(gol.equals("1A")) {
			if(mmasaKerja <= gapok1a.length) {
				gapok = gapok1a[mmasaKerja];
			}
			else if(mmasaKerja > gapok1a.length) {
				gapok = gapok1a[gapok1a.length-1];
			}
		}

		else if(gol.equals("1B")) {
			if(mmasaKerja-3 <= gapok1b.length) {
				gapok = gapok1b[mmasaKerja-3];
			}
			else if(mmasaKerja > gapok1b.length) {
				gapok = gapok1b[gapok1b.length-1];
			}				
		}

		else if(gol.equals("1C")) {
			if(mmasaKerja-3 <= gapok1b.length) {
				gapok = gapok1c[mmasaKerja-3];
			}
			else if(mmasaKerja > gapok1c.length) {
				gapok = gapok1c[gapok1c.length-1];
			}				
		}

		else if(gol.equals("1D")) {
			if(mmasaKerja-3 <= gapok1c.length) {
				gapok = gapok1d[mmasaKerja-3];
			}
			else if(mmasaKerja > gapok1d.length) {
				gapok = gapok1d[gapok1d.length-1];
			}				
		}

		else if(gol.equals("2A")) {
			if(mmasaKerja <= gapok2a.length) {
				gapok = gapok2a[mmasaKerja];
			}
			else if(mmasaKerja > gapok2a.length) {
				gapok = gapok2a[gapok2a.length-1];
			}				
		}

		else if(gol.equals("2B")) {
			if(mmasaKerja-3 <= gapok2b.length) {
				gapok = gapok2b[mmasaKerja-3];
			}
			else if(mmasaKerja > gapok2b.length) {
				gapok = gapok2b[gapok2b.length-1];
			}								
		}

		else if(gol.equals("2C")) {
			if(mmasaKerja-3 == gapok2c.length) {
				gapok = gapok2c[mmasaKerja-3];
			}
			else if(mmasaKerja > gapok2c.length) {
				gapok = gapok2c[gapok2c.length-1];
			}
		}

		else if(gol.equals("2D")) {
			if(mmasaKerja-3 == gapok2d.length) {
				gapok = gapok2d[mmasaKerja-3];
			}
			else if(mmasaKerja > gapok2d.length) {
				gapok = gapok2d[gapok2d.length-1];
			}				
		}

		else if(gol.equals("3A")) {
			if(mmasaKerja <= gapok3a.length) {
				gapok = gapok3a[mmasaKerja];
			}
			else if(mmasaKerja > gapok3a.length) {
				gapok = gapok3a[gapok3a.length-1];
			}				
		}

		else if(gol.equals("3B")) {
			if(mmasaKerja <= gapok3b.length) {
				gapok = gapok3b[mmasaKerja];
			}
			else if(mmasaKerja > gapok3b.length) {
				gapok = gapok3b[gapok3b.length-1];
			}				
		}

		else if(gol.equals("3C")) {
			if(mmasaKerja <= gapok3c.length) {
				gapok = gapok3c[mmasaKerja];
			}
			else if(mmasaKerja > gapok3c.length) {
				gapok = gapok3c[gapok3c.length-1];
			}							
		}

		else if(gol.equals("3D")) {
			if(mmasaKerja <= gapok3d.length) {
				gapok = gapok3d[mmasaKerja];
			}
			else if(mmasaKerja > gapok3d.length) {
				gapok = gapok3d[gapok3d.length-1];
			}							
		}

		else if(gol.equals("4A")) {
			if(mmasaKerja <= gapok4a.length) {
				gapok = gapok4a[mmasaKerja];
			}
			else if(mmasaKerja > gapok4a.length) {
				gapok = gapok4a[gapok4a.length-1];
			}							
		}

		else if(gol.equals("4B")) {
			if(mmasaKerja <= gapok4b.length) {
				gapok = gapok4b[mmasaKerja];
			}
			else if(mmasaKerja > gapok4b.length) {
				gapok = gapok4b[gapok4b.length-1];
			}							
		}

		else if(gol.equals("4C")) {
			if(mmasaKerja <= gapok4c.length) {
				gapok = gapok4c[mmasaKerja];
			}
			else if(mmasaKerja > gapok4c.length) {
				gapok = gapok4c[gapok4c.length-1];
			}							
		}

		else if(gol.equals("4D")) {
			if(mmasaKerja <= gapok4d.length) {
				gapok = gapok4d[mmasaKerja];
			}
			else if(mmasaKerja > gapok4d.length) {
				gapok = gapok4d[gapok4d.length-1];
			}							
		}

		else if(gol.equals("4E")) {
			if(mmasaKerja <= gapok4e.length) {
				gapok = gapok4e[mmasaKerja];
			}
			else if(mmasaKerja > gapok4e.length) {
				gapok = gapok4e[gapok4e.length-1];
			}							
		}

		tunjKel = gapok * 0.1;

		clap = false;

		while(clap == false) {
			System.out.print("Jumlah Anak : ");
			jumAnak1 = keyboard.nextLine();

			if(jumAnak1.matches(noLetter)) {
				jumAnak = Integer.parseInt(jumAnak1);
				if(jumAnak <= 2) {
					tunjAnak = gapok * 0.02 * jumAnak;	
					clap = true;
				}
				else if(jumAnak > 2) {
					tunjAnak = gapok * 0.02 * 2;
					clap = true;
				}
			}
			else if(jumAnak1.length() == 0) {
				System.out.println(statInputNoBlank);
				clap = false;
			}		
			else {
				System.out.println(statInputMustNum);
				clap = false;
			}
			
		}


		System.out.println();

		tunjBeras = 10 * hargaBeras * (jumAnak + keluarga);

		clap = false;

		while(clap == false) {
			System.out.print("Tunjangan Struktural ");
			System.out.print("\t Y (Ya) | N (Tidak) : ");
			tanyaTunjStruktural = number.nextLine();

			if(tanyaTunjStruktural.matches("[YN]+")) {

				if(tanyaTunjStruktural.equals("Y")) {
					clap = false;
					while(clap == false) {
						System.out.print("Eselon : ");
						System.out.println();
						System.out.println("IA | IB | IIA | IIB | IIIA | IIIB | IVA | IVB | VA");
						eselon = dualLine.nextLine();

						if(eselon.matches("[IA-B]+") || eselon.matches("[IIA-B]+") || eselon.matches("[IIIA-B]+") || eselon.matches("[IVA-B]+") || eselon.matches("[VA]+") ) {

							if(eselon.equals("IA")) {
								tunjStruktur = 5500000;
								clap = true;
							}
							else if(eselon.equals("IB")) {
								tunjStruktur = 4375000;	
								clap = true;
							}
							else if(eselon.equals("IIA")) {
								tunjStruktur = 3250000;	
								clap = true;
							}
							else if(eselon.equals("IIB")) {
								tunjStruktur = 2025000;
								clap = true;
							}
							else if(eselon.equals("IIIA")) {
								tunjStruktur = 1260000;
								clap = true;
							}
							else if(eselon.equals("IIIB")) {
								tunjStruktur = 980000;
								clap = true;
							}
							else if(eselon.equals("IVA")) {
								tunjStruktur = 540000;
								clap = true;
							}
							else if(eselon.equals("IVB")) {
								tunjStruktur = 490000;
								clap = true;
							}
							else if(eselon.equals("VA")) {
								tunjStruktur = 380000;
								clap = true;
							}
						}

						else if(eselon.length() == 0) {
							System.out.println(statInputNoBlank);
							clap = false;
						}

						else {
							System.out.println("Inputan " + eselon + " tidak dikenal");
							clap = false;
						}
					}
				}

				else if(tanyaTunjStruktural.equals("N")) {
					clap = false;
					while(clap == false) {

						System.out.print("Tunjangan Fungsional ");
						System.out.print("\t Y (Ya) | N (Tidak) : ");
						tanyaTunjFungsional = keyboard.nextLine();

						System.out.println();

						if(tanyaTunjFungsional.matches("[YN]+")) {

							if(tanyaTunjFungsional.equals("Y")) {
								clap = false;
								while(clap == false) {

									System.out.print("Jenis Fungsional : ");
									System.out.println("Keahlian || Keterampilan");
									tanyaJenisFungsional = dualLine.nextLine();

									if(tanyaJenisFungsional.equals("Keahlian")) {
										if(gol.equals("4D") || gol.equals("4E")) {
											tunjFungsi = 1000000;
											clap = true;
										}
										else if(gol.equals("4A") || gol.equals("4B") || gol.equals("4C") ) {
											tunjFungsi = 900000;
											clap = true;
										}
										else if(gol.equals("3C") || gol.equals("3D") ) {
											tunjFungsi = 800000;
											clap = true;
										}
										else if(gol.equals("3A") || gol.equals("3B") ) {
											tunjFungsi = 700000;
											clap = true;
										}
										else {
											tunjFungsi = 0;
											clap = true;											
										}
									}

									else if(tanyaJenisFungsional.equals("Keterampilan") ) {
										if(gol.equals("3C") || gol.equals("3D") ) {
											tunjFungsi = 600000;
											clap = true;
										}
										else if(gol.equals("3A") || gol.equals("3B") ) {
											tunjFungsi = 500000;
											clap = true;
										}
										else if(gol.equals("2B") || gol.equals("2C") || gol.equals("2D") ) {
											tunjFungsi = 400000;
											clap = true;
										}
										else if(gol.equals("2A") ) {
											tunjFungsi = 300000;
											clap = true;
										}
										else {
											tunjFungsi = 0;
											clap = true;
										}
									}

									else {
										if(tanyaJenisFungsional.length() == 0) {
											System.out.println(statInputNoBlank);
											clap = false;											
										}
										else {
											System.out.println("Jenis Fungsional hanya Keahlian dan Keterampilan");
											clap = false;
										}
									}
								}
							}

							else if(tanyaTunjFungsional.equals("N")) {
								ambilAngka = gol.substring(0,1);
								if(ambilAngka.equals("1")) {
									tunjUmum = 175000;
									clap = true;
								}
								else if(ambilAngka.equals("2")) {
									tunjUmum = 180000;
									clap = true;
								}
								else if(ambilAngka.equals("3")) {
									tunjUmum = 185000;
									clap = true;
								}
								else if(ambilAngka.equals("4")) {
									tunjUmum = 190000;
									clap = true;
								}
							}	

						}

						else if(tanyaTunjFungsional.length() == 0) {
							System.out.println(statInputNoBlank);
							clap = false;
						}

						else {
							System.out.println(statInputOnlyYN);
							clap = false;
						}

					}					

				}

			}

			else if(tanyaTunjStruktural.length() == 0) {
				System.out.println(statInputNoBlank);
				clap = false;
			}

			else {
				System.out.println(statInputOnlyYN);
				clap = false;
			}

		}

		System.out.println();


		clap = false;
		while(clap == false) {

			System.out.print("Tunjangan Papua  ");
			System.out.print("\t Y (Ya) | N (Tidak) : ");
			tanyaTunjPapua = keyboard.nextLine();

			if(tanyaTunjPapua.matches("[YN]+")) {
				if(tanyaTunjPapua.equals("Y")) {
					if(gol.equals("1A")) {
						tunjPapua = 200000;
						clap = true;
					}
					else if(gol.equals("1B")) {
						tunjPapua = 225000;
						clap = true;
					}
					else if(gol.equals("1C")) {
						tunjPapua = 250000;
						clap = true;
					}
					else if(gol.equals("1D")) {
						tunjPapua = 275000;
						clap = true;
					}
					else if(gol.equals("2A")) {
						tunjPapua = 300000;
						clap = true;
					}
					else if(gol.equals("2B")) {
						tunjPapua = 325000;
						clap = true;
					}
					else if(gol.equals("2C")) {
						tunjPapua = 350000;
						clap = true;
					}
					else if(gol.equals("2D")) {
						tunjPapua = 375000;
						clap = true;
					}
					else if(gol.equals("3A")) {
						tunjPapua = 425000;
						clap = true;
					}
					else if(gol.equals("3B")) {
						tunjPapua = 450000;
						clap = true;
					}
					else if(gol.equals("3C")) {
						tunjPapua = 475000;
						clap = true;
					}
					else if(gol.equals("3D")) {
						tunjPapua = 500000;
						clap = true;
					}
					else if(gol.equals("4A")) {
						tunjPapua = 525000;
						clap = true;
					}
					else if(gol.equals("4B")) {
						tunjPapua = 550000;
						clap = true;
					}
					else if(gol.equals("4C")) {
						tunjPapua = 575000;
						clap = true;
					}
					else if(gol.equals("4D")) {
						tunjPapua = 600000;
						clap = true;
					}
					else if(gol.equals("4E")) {
						tunjPapua = 625000;
						clap = true;
					}
				}
				else {
					tunjPapua = 0;
					clap = true;
				}
			}
			else if(tanyaTunjStruktural.length() == 0) {
				System.out.println(statInputNoBlank);
				clap = false;
			}
			else {
				System.out.println(statInputOnlyYN);
				clap = false;				
			}
		}

		System.out.println();

		clap = false;
		while(clap == false) {
			System.out.print("Tunjangan Terpencil : ");
			tunjTerpencil = number.nextLine();

			if(tunjTerpencil.matches("[0-9]+")) {
				tunjTerpencilI = Integer.parseInt(tunjTerpencil);
				clap = true;
			}
			else if(tunjTerpencil.length() == 0) {
				System.out.println(statInputNoBlank);
				clap = false;
			}
			else {
				System.out.println(statInputMustNum);				
				clap = false;
			}
		}

		System.out.println();

		clap = false;
		while(clap == false) {
			System.out.print("Tunjangan Lain ");
			System.out.print("\t Y (Ya) | N (Tidak) : ");
			tanyaTunjLain = dualLine.nextLine();

			System.out.println();

			if(tanyaTunjLain.matches("[YN]+") ) {
				if(tanyaTunjLain.equals("Y")) {
					clap = false;
					while(clap == false) {
						System.out.print("Input Nama Tunjangan : ");
						inputNamaTunjLain = keyboard.nextLine();
						if(inputNamaTunjLain.matches(noNum)) {
							tunjLain = Integer.parseInt(inputNomTunjLain);
							clap = true;
						}
						else if(inputNamaTunjLain.length() == 0) {
							System.out.println("Inputan Nama Tunjangan tidak boleh kosong");							
							clap = false;
						}
						else {
							System.out.println(statInputMustLetter);
							clap = false;
						}						
						System.out.print("Nominal : ");
						inputNomTunjLain = number.nextLine();
						if(inputNomTunjLain.matches(noLetter)) {
							tunjLain = Integer.parseInt(inputNomTunjLain);
							clap = true;
						}
						else if(inputNomTunjLain.length() == 0) {
							System.out.println("Inputan nominal Tunjangan tidak boleh kosong");							
							clap = false;
						}
						else {
							System.out.println(statInputMustNum);
						}
					}
				}
				else if(tanyaTunjLain.equals("N")) {
					tunjLain = 0;
					clap = true;
				}
			}
			else if(tanyaTunjLain.length() == 0) {
				System.out.println(statInputNoBlank);
				clap = false;
			}
			else {
				System.out.println(statInputOnlyYN);
				clap = false;
			}
		}

		System.out.println();

		clap = false;
		while(clap == false) {
			System.out.print("Sewa Rumah : ");
			System.out.print("\t Y (Ya) | N (Tidak) : ");
			tanyasewaRumah = number.nextLine();
			if(tanyasewaRumah.matches("[YN]+")) {
				if(tanyasewaRumah.equals("Y")) {
					sewaRumah = 450000;
					clap = true;
				}
				else {
					sewaRumah = 0;
					clap = true;
				}				
			}
			else if(tanyasewaRumah.length() == 0) {
				System.out.println(statInputNoBlank);
				clap = false;
			}
			else {
				System.out.println(statInputOnlyYN);
				clap = false;
			}
		}

		clap = false;
		while(clap == false) { 		
			System.out.print("Seminar : ");
			bbnSeminar = keyboard.nextLine();
			if(bbnSeminar.matches("[0-9]+")) {
				clap = true;
			}
			else if(bbnSeminar.length() == 0) {
				System.out.println(statInputNoBlank);
				clap = false;
			}
			else {
				System.out.println(statInputMustNum);				
				clap = false;
			}			
		}

		clap = false;
		while(clap == false) { 		
			System.out.print("Listrik : ");
			bbnListrik = dualLine.nextLine();
			if(bbnListrik.matches("[0-9]+")) {
				clap = true;
			}
			else if(bbnListrik.length() == 0) {
				System.out.println(statInputNoBlank);
				clap = false;
			}
			else {
				System.out.println(statInputMustNum);				
				clap = false;
			}						
		}

		clap = false;
		while(clap == false) { 		
			System.out.print("Air : ");
			bbnAir = number.nextLine();
			if(bbnAir.matches("[0-9]+")) {
				clap = true;
			}
			else if(bbnAir.length() == 0) {
				System.out.println(statInputNoBlank);
				clap = false;
			}
			else {
				System.out.println(statInputMustNum);				
				clap = false;
			}									
		}

		ambilAngka1 = gol.substring(0,1);
		
		if(ambilAngka1.equals("1")) {
			bbnTaperum = 3000;
		}
		else if(ambilAngka1.equals("2")) {
			bbnTaperum = 5000;
		}
		else if(ambilAngka1.equals("3")) {
			bbnTaperum = 7000;
		}
		else if(ambilAngka1.equals("4")) {
			bbnTaperum = 10000;
		}

		//beban
		bbnSeminarI = Integer.parseInt(bbnSeminar);
		bbnAirI = Integer.parseInt(bbnAir);
		bbnListrikI = Integer.parseInt(bbnListrik);

		//gaji kotor
		totalGajiKotor = gapok + tunjKel + tunjAnak + tunjBeras + countTunj + tunjPapua + tunjTerpencilI + tunjLain;		

		//IWP
		bbnIwp = 0.1 * (gapok + tunjKel + tunjAnak);

		//beban kotor
		totalBebanKotor = bbnIwp + bbnTaperum + sewaRumah + bbnSeminarI + bbnAirI + bbnListrikI;

		totalGajiBersih = totalGajiKotor - totalBebanKotor;

		gajiBersihSetahun = totalGajiBersih * 12;

		if(statPegawai.equals("TK")) {
			if(gajiBersihSetahun < ptkpSingle) {
				ptkp = 0;
				pkp = 0;
			}
			else if(jumAnak < 3 && gajiBersihSetahun > ptkpSingle) {
				ptkp = ptkpSingle + (jumAnak * ptkpAnak);
				pkp = gajiBersihSetahun - ptkp;								
			}
			else if(jumAnak > 3 && gajiBersihSetahun > ptkpSingle) {
				jumAnak = 3;
				ptkp = ptkpSingle + (jumAnak * ptkpAnak);
				pkp = gajiBersihSetahun - ptkp;				
			}
		}

		else if(statPegawai.equals("K")) {
			if(jumAnak < 3 && gajiBersihSetahun > ptkpSingle) {
				ptkp = ptkpSingle + (keluarga * ptkpMarried) + (jumAnak * ptkpAnak);
				pkp = gajiBersihSetahun - ptkp;				
			}
			else if(jumAnak > 3 && gajiBersihSetahun > ptkpSingle) {
				jumAnak = 3;
				ptkp = ptkpSingle + (keluarga * ptkpMarried) + (jumAnak * ptkpAnak);
				pkp = gajiBersihSetahun - ptkp; 
			}
			else if(gajiBersihSetahun < ptkpSingle) {
				ptkp = 0;
				pkp = 0;
			}				
		}

		else if(statPegawai.equals("D") || statPegawai.equals("J") ) {
			if(gajiBersihSetahun < ptkpSingle) {
				ptkp = 0;
				pkp = 0;
			}
			else if(jumAnak < 3 && gajiBersihSetahun > ptkpSingle) {
				ptkp = ptkpSingle + (jumAnak * ptkpAnak);
				pkp = gajiBersihSetahun - ptkp;								
			}
			else if(jumAnak > 3 && gajiBersihSetahun > ptkpSingle) {
				jumAnak = 3;
				ptkp = ptkpSingle + (jumAnak * ptkpAnak);
				pkp = gajiBersihSetahun - ptkp;				
			}
		}

		if(pkp >= 0 && pkp <= pkpLvl1) {
			bbnPPh = (persenpkp1 * pkp);
		}
		else if(pkp > pkpLvl1 && pkp <= pkpLvl2) {
			tier1 = persenpkp1 * pkpLvl1;
			tier2 = persenpkp2 * (pkp - tier1);
			bbnPPh = (tier1 + tier2); 
		}
		else if(pkp > pkpLvl2 && pkp <= pkpLvl3) {
			tier1 = persenpkp1 * pkpLvl1;
			tier2 = persenpkp2 * pkpLvl2;
			tier3 = persenpkp3 * (pkp - (tier1 + tier2));
			bbnPPh = (tier1 + tier2 + tier3);
		}
		else if(pkp > pkpLvl3) {
			tier1 = persenpkp1 * pkpLvl1;
			tier2 = persenpkp2 * pkpLvl2;
			tier3 = persenpkp3 * pkpLvl3;
			tier4 = persenpkp4 * (pkp - tier3);
			bbnPPh = (tier1 + tier2 + tier3 + tier4);
		}

		System.out.println("==========================================");
		System.out.println("Berikut adalah Rincian Gaji "+ namaPegawai);
		System.out.println("==========================================");
		System.out.println("=====PENDAPATAN===== ");
		System.out.print("Gaji Pokok Anda "); System.out.print("\t : Rp " + gapok);
		System.out.println();
		System.out.print("Tunjangan Keluarga "); System.out.print("\t : Rp " + tunjKel);
		System.out.println();
		System.out.print("Tunjangan Anak "); System.out.print("\t : Rp " + tunjAnak);
		System.out.println();
		System.out.print("Tunjangan Beras "); System.out.print("\t : Rp " + tunjBeras);
		System.out.println();		
		if(tanyaTunjStruktural.equals("Y")) {
			countTunj = tunjStruktur;	
			System.out.print("Eselon "); System.out.print("\t : Rp " + eselon);
			System.out.println();
			System.out.print("Tunjangan Struktural "); System.out.print("\t : Rp " + tunjStruktur);
			System.out.println();
		}
		else if(tanyaTunjFungsional.equals("Y")) {
			countTunj = tunjFungsi;
			System.out.print("Jenis Fungsional "); System.out.print("\t : Rp " + tanyaJenisFungsional);
			System.out.println();
			System.out.print("Tunjangan Fungsional "); System.out.print("\t : Rp " + tunjFungsi);	
			System.out.println();
		}
		else {
			countTunj = tunjUmum;
			System.out.print("Tunjangan Umum "); System.out.print("\t : Rp " + tunjUmum);
			System.out.println();
		}

		if(tanyaTunjPapua.equals("Y")) {
			System.out.print("Tunjangan Papua "); System.out.print("\t : Rp " + tunjPapua);
			System.out.println();
		}
		else if(tanyaTunjPapua.equals("N")) {
			tunjPapua = 0;
			System.out.print("Tunjangan Papua "); System.out.print("\t : Rp " + tunjPapua);
			System.out.println();
		}
		System.out.print("Tunjangan Terpencil "); System.out.print("\t : Rp " + tunjTerpencil);
		System.out.println();

		if(tanyaTunjLain.equals("Y")) {
			System.out.print(inputNamaTunjLain + " "); System.out.print("\t : Rp " + tunjLain);
			System.out.println();
		}

		System.out.println();
		System.out.println("=====PENGELUARAN===== ");
		System.out.print("IWP 10 % "); System.out.print("\t : Rp " + bbnIwp);
		System.out.println();
		System.out.print("Potongan Taperum "); System.out.print("\t : Rp " + bbnTaperum);
		System.out.println();
		System.out.print("Sewa Rumah "); System.out.print("\t : Rp " + sewaRumah);
		System.out.println();
		System.out.print("Seminar "); System.out.print("\t : Rp " + bbnSeminar);
		System.out.println();
		System.out.print("Air "); System.out.print("\t : Rp " + bbnAir);
		System.out.println();
		System.out.print("Listrik "); System.out.print("\t : Rp " + bbnListrik);	
		System.out.println(); 
		System.out.print("Total Gaji Kotor "); System.out.print("\t : Rp " + totalGajiKotor);
		System.out.println();
		System.out.print("Total Beban "); System.out.print("\t : Rp " + totalBebanKotor);
		System.out.println();		
		System.out.print("Gaji Bersih "); System.out.print("\t : Rp " + totalGajiBersih);
		System.out.println();
		// System.out.println("PKTP " + ptkp);
		// System.out.println("PKP " + pkp);
		bbnPphBln = bbnPPh / 12;

		System.out.print("PPh "); System.out.print("\t : Rp " + bbnPphBln);
		System.out.println();
		gajiSetelahPPh = totalGajiBersih - bbnPphBln;
		System.out.println("=================================================");
		System.out.println("=================================================");
		System.out.println("=================================================");				
		System.out.printf("Gaji yang anda terima : Rp %.2f", gajiSetelahPPh);
		System.out.println();
		System.out.println("=================================================");
		System.out.println("=================================================");
		System.out.println("=================================================");
	}
}