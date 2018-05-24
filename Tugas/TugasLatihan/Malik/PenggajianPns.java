/*
Project Name	: Penggajian PNS
Created By 		: Malik Chaudhary
Time Created	: 2018-05-23 10:59AM
Time Update     : 2018-05-24 08:00AM
*/


import java.util.Scanner;
public class PenggajianPns{
	public static void main(String[] args){
		Scanner scan 	= new Scanner(System.in);
		Scanner scan2 	= new Scanner(System.in);
		
		// Array untuk gaji Golongan I A-D								  
		int[] gajiPokokGolSatuA = {
		   	1486500,1486500,1533400,1533400,1581700,1581700,1631500,1631500,1682900,1682900,
		   	1735900,1735900,1790500,1790500,1846900,1846900,1905100,1905100,1965100,1965100,
		   	2027000,2027000,2090800,2090800,2156700,2156700,2224600}; 

		int[] gajiPokokGolSatuB = {
			0,0,0,1623400,1623400,1674500,1674500,1727300,1727300,1781700,1781700,1837800,1837800,
			1895700,1895700,1955400,1955400,2016900,2016900,2080500,2080500,2146000,2146000,
			2213600,2213600,2283300,2283300,2355200};

		int[] gajiPokokGolSatuC = {
			0,0,0,1692100,1692100,1745400,1745400,1800300,1800300,1857000,1857000,1915500,1915500,1975800,1975800,
			2038100,2038100,2102300,2102300,2168500,2168500,2236800,2236800,2307200,2307200,2379900,2379900,2454800};

		int[] gajiPokokGolSatuD = {
			0,0,0,1763600,1763600,1819200,1819200,1876500,1876500,1935600,1935600,1996500,1996500,2059400,2059400,
			2124300,2124300,2191200,2191200,2260200,2260200,2331400,2331400,2404800,2404800,2480500,2480500,2558700};
		
		// Array untuk gaji Golongan II A-D	
		int[] gajiPokokGolDuaA = {
			1926000,1956300,1956300,2017900,2017900,2081500,2081500,2147000,2147000,2214700,2214700,2284400,2284400,
			2356400,2356400,2430600,2430600,2507100,2507100,2586100,2586100,2667500,2667500,2751600,2751600,2838200,2838200,
			2927600,2927600,3019800,3019800,3114900,3114900,3213100}; 

		int[] gajiPokokGolDuaB = {
			0,0,0,2103300,2103300,2169500,2169500,2237900,2237900,2308300,2308300,2381100,2381100,2456000,2456000,2533400,2533400,
			2613200,2613200,2695500,2695500,2780400,2780400,2867900,2867900,2958300,2958300,3051400,3051400,3147600,3147600,
			3246700,3246700,3348900};

		int[] gajiPokokGolDuaC = {
			0,0,0,2192300,2192300,2261300,2261300,2332500,2332500,2406000,2406000,2481800,2481800,2559900,2559900,2640600,2640600,
			2723700,2723700,2809500,2809500,2898000,2898000,2989300,2989300,3083400,3083400,3180500,3180500,3280700,3280700,
			3384000,3384000,3490600};

		int[] gajiPokokGolDuaD = {
			0,0,0,2285000,2285000,2357000,2357000,2431200,2431200,2507800,2507800,2586700,2586700,2668200,2668200,2752300,2752300,
			2838900,2838900,2928300,2928300,3020600,3020600,3115700,3115700,3213800,3213800,3315100,3315100,3419500,3419500,
			3527200,3527200,3638200};

		// Array untuk gaji Golongan III A-D	
		int[] gajiPokokGolTigaA = {
			2456700,2456700,2534000,2534000,2613800,2613800,2696200,2696200,2781100,2781100,2868700,2868700,2959000,2959000,
			3052200,3052200,3148300,3148300,3247500,3247500,3349800,3349800,3455300,3455300,3564100,3564100,3676400,3676400,
			3792100,3792100,3911600,3911600,4034800};

		int[] gajiPokokGolTigaB = {
			2560600,2560600,2641200,2641200,2724400,2724400,2810200,2810200,2898700,2898700,2990000,2990000,3084200,3084200,
			3181300,3181300,3281500,3281500,3384900,3384900,3491500,3491500,3601400,3601400,3714900,3714900,3831900,3831900,
			3952600,3952600,4007000,4007000,4205400};
								  
		int[] gajiPokokGolTigaC = {
			2668900,2668900,2752900,2752900,2839700,2839700,2929100,2929100,3021300,3021300,3116500,3116500,3214700,3214700,
			3315900,3315900,3420300,3420300,3528100,3528100,3639200,3639200,3753800,3753800,3872000,3872000,3994200,3994200,
			4119700,4119700,4249500,4249500,4383300};
								  
		int[] gajiPokokGolTigaD = {
			2781800,2781800,2869400,2869400,2959800,2959800,3053000,3053000,3149100,3149100,3248300,3248300,3350600,3350600,
			3456200,3456200,3565000,3565000,3677300,3677300,3912600,3912600,3912600,3912600,4035800,4035800,4162900,4162900,
			4294000,4294000,4429300,4429300,4568800};

		// Array untuk gaji Golongan IV A-E
		int[] gajiPokokGolEmpatA = {
			2899500,2899500,2990800,2990800,3085000,3085000,3182100,3182100,3282400,3282400,3385700,3385700,3492400,3492400,
			3602400,3602400,3715800,3715800,3832800,3832800,3953600,3953600,4078100,4078100,4206500,4206500,4339000,4339000,
			4475700,4475700,4616600,4616600,4762000};


		int[] gajiPokokGolEmpatB = {
			3022100,3022100,3117300,3117300,3215500,3215500,3316700,3316700,3421200,3421200,3528900,3528900,3640100,3640100,
			3754700,3754700,3873000,3873000,3995000,3995000,4120800,4120800,4250600,4250600,4384400,4384400,4522500,4522500,
			4665000,4665000,4811900,4811900,4963400};

								   
		int[] gajiPokokGolEmpatC = {
			3149900,3149900,3249100,3249100,3351500,3351500,3457000,3457000,3565900,3565900,3678200,3678200,3794100,3794100,
			3913600,3913600,4036800,4036800,4164000,4164000,4295100,4295100,4430400,4430400,4569900,4569900,4713800,4713800,
			4862300,4862300,5015400,5015400,5173400};

								   
		int[] gajiPokokGolEmpatD = {
			3283200,3283200,3386600,3386600,3493200,3493200,3603300,3603300,3716700,3716700,3833800,3833800,3954600,3954600,
			4079100,4079100,4207600,4207600,4340100,4340100,4476800,4476800,4617800,4617800,4763200,4763200,4913200,4913200,
			5068000,5068000,5227600,5227600,5392200};

								   
		int[] gajiPokokGolEmpatE = {
			3422100,3422100,3529800,3529800,3641000,3641000,3755700,3755700,3874000,3874000,3996000,3996000,4121800,4121800,
			4251600,4251600,4385600,4385600,4523700,4523700,4666100,4666100,4813100,4813100,4964700,4964700,5121100,5121100,
			5282300,5282300,5448700,5448700,5620300};


		/// Variable data	
		String nama,jmlAnakString, maskerString, golongan, status, jabatan, keterampilan, lokasi, rumahDinas, hutang, tunjLain, nip, eselon, pendidikan, namaTunjLain;
		int jmlAnak, masker;
		double biayaStruktur, biayaFungsi, biayaUmum, biayaSewaRumah, besarHutang, biayaTunjLain, gajiPokok, biayaJabatan;
		double tunjAnak, tunjKeluarga, tunjBeras, tunjPapua, biayaIwp, tunjTaperum, gajiKotor, iuranPensiun, nettoSebulan, penjumlahan;
		double nettoSetahun, ptkp, pkp, pphSetahun, pphSebulan, hitungan, potongan, gajiBersih, tunjPajak;
		boolean golSatu, golDua, golTiga, golEmpat, golLima;

		// inisialisasi variable
		jmlAnakString 	= "";
		tunjPajak 		= 0;
		gajiPokok 		= 0;
		biayaStruktur 	= 0;
		biayaFungsi 	= 0;
		biayaUmum 		= 0;
		biayaTunjLain 	= 0;
		tunjPapua 		= 0;
		gajiBersih 		= 0;
		pphSebulan 		= 0;
		tunjTaperum 	= 0;
		tunjKeluarga 	= 0;
		
		System.out.println();
		System.out.println();
		System.out.println("	===============================================================");
		System.out.println("	                       DATA DIRI PNS                           ");
		System.out.println("	===============================================================");

		// Inputan Nama Pegawai

		System.out.println();
		System.out.print("	Nama                                : ");
		nama = scan.nextLine();
		while( nama.length() > 32 || nama.matches("([0-9!@#$%^&()-_=])*")){
			if ( nama.matches("") ) {
				System.out.println();
				System.out.println("	!!! 	Nama tidak boleh kosong");
				System.out.println();
				System.out.print("	Nama                                : ");
				nama = scan.nextLine();
			}else if ( nama.matches("([0-9])*") ) {
				System.out.println();
				System.out.println("	!!! 	Nama tidak boleh ada angka");
				System.out.println();
				System.out.print("	Nama                                : ");
				nama = scan.nextLine();
			}else if ( nama.matches("([!@#$%^&*()-_=])*") ) {
				System.out.println();
				System.out.println("	!!! 	Nama tidak boleh ada simbol");
				System.out.println();
				System.out.print("	Nama                                : ");
				nama = scan.nextLine();
			}else{
				System.out.println();
				System.out.println("	!!! 	Nama Max 32 karakter");
				System.out.println();
				System.out.print("	Nama                                : ");
				nama = scan.nextLine();
			}   // Validasi inputan nama
		}

		// Inputan NIP Pegawai
		System.out.print("	NIP                                 : ");
		nip = scan.nextLine();
		while( nip.length() < 12 || nip.length() > 18 || nip.matches("([A-Z])||([a-z])*") ){
			if ( nip.matches("") ) {
				System.out.println();
				System.out.println("	!!! 	NIP tidak boleh kosong");
				System.out.println();
				System.out.print("	NIP                                 : ");
				nip = scan.next();
			}else if ( nip.matches("([A-Z])||([a-z])*") ) {
				System.out.println();
				System.out.println("	!!! 	NIP harus angka");
				System.out.println();
				System.out.print("	NIP                                 : ");
				nip = scan.next();
			}else if ( nip.length() < 12 ) {
				System.out.println();
				System.out.println("	!!! 	NIP Min 12 angka");
				System.out.println();
				System.out.print("	NIP                                 : ");
				nip = scan.next();
			}else if ( nip.length() > 18 ) {
				System.out.println();
				System.out.println("	!!! 	NIP Max 18 angka");
				System.out.println();
				System.out.print("	NIP                                 : ");
				nip = scan.next();
			}// else if ( nip.matches("([!@#$%^&*()-_=])*") ) {
			// 	System.out.println();
			// 	System.out.println("	!!! 	NIP tidak boleh ada simbol");
			// 	System.out.println();
			// 	System.out.print("	NIP                                 : ");
			// 	nip = scan.next();
			// }  // validasi inputan NIP
		}

		System.out.println();
		System.out.println("	---------------------------------------------------------------");
		System.out.println("	---------------------------------------------------------------");

		Scanner scanGol = new Scanner(System.in);
		// Inputan Golongan Pegawai
		System.out.println();
		System.out.println("	Golongan");
		System.out.print("	Opsi (1A - 4E)                      : ");
		golongan = scanGol.nextLine();
		while(!(golongan.matches("([A-D1-3a-d])*") || golongan.matches("([A-E4a-e])*"))){
		
				System.out.println();
				System.out.println("	!!! 	Golongan tidak ada");
				System.out.println();
				System.out.println("	Golongan");
				System.out.print("	Opsi (1A - 4E)                      : ");
				golongan = scanGol.nextLine();      // Validasi inputan golongan
			
		}while(golongan.matches("([!@#$%&])*")){
			if ( golongan.matches("") ) {
				System.out.println();
				System.out.println("	!!! 	Golongan tidak boleh kosong");
				System.out.println();
				System.out.println("	Golongan");
				System.out.print("	Opsi (1A - 4E)                      : ");
				golongan = scanGol.nextLine();
			}else{
				System.out.println();
				System.out.println("	!!! 	Golongan tidak simbol");
				System.out.println();
				System.out.println("	Golongan");
				System.out.print("	Opsi (1A - 4E)                      : ");
				golongan = scanGol.nextLine();
			}    // Validasi inputan golongan
		}
		
		Scanner scanKerja = new Scanner(System.in);
		// Inputan Masa Kerja
		System.out.print("	Masa kerja                          : ");
		maskerString = scanKerja.nextLine();
		while(maskerString.matches("")){
			if ( golongan.matches("") ) {
				
			}else{
				System.out.println();
				System.out.println("	!!! 	Masa kerja tidak boleh kosong");
				System.out.println();
				System.out.print("	Masa kerja                          : ");
				maskerString = scanKerja.nextLine();
			}    // Validasi inputan masa kerja
		}
		while(!maskerString.matches("([0-9])*")){
			System.out.println();
			System.out.println("	!!! 	Masa kerja harus angka");
			System.out.println();
			System.out.print("	Masa kerja                          : ");
			maskerString = scanKerja.nextLine();    // Validasi inputan masa kerja
		}

		masker = Integer.parseInt(maskerString);
		while( (golongan.equals("1B")||golongan.equals("1b")||golongan.equals("1C")||golongan.equals("1c")||golongan.equals("1D")||
			golongan.equals("1d")||golongan.equals("2B")||golongan.equals("2b")||golongan.equals("2C")||golongan.equals("2c")||
			  golongan.equals("2D")||golongan.equals("2d")) && masker < 3  ){

			System.out.println();
			System.out.println("	!!! 	Untuk Golongan "+golongan+", min 3 tahun masa kerja");
			System.out.println();
			System.out.print("	Masa kerja                          : ");
			maskerString = scanKerja.nextLine();
			masker = Integer.parseInt(maskerString);   // Validasi inputan min masa kerja
		}

		Scanner scanAnak = new Scanner(System.in);
		// Inputan Status Menikah
		System.out.print("	Status menikah?(Ya/Tidak/Janda/Duda): ");
		status = scan.next();  
		if ( status.matches("([yYayajandadudaJandaDuda])*") ) {
			System.out.print("     		*Jumlah anak                : ");
			jmlAnakString = scanAnak.nextLine();
			while(jmlAnakString.matches("([A-Za-z])*")){
				System.out.println();
				System.out.println("	!!! 	Jumlah harus angka");
				System.out.println();
				System.out.print("     		*Jumlah anak                : ");
				jmlAnakString = scanAnak.nextLine();
			}        // Validasi inputan Jumlah anak
		}else{
			jmlAnak = 0;
		}

		// Inputan Jabatan
		System.out.print("	Memiliki Jabatan(Ya/Tidak)          : ");
		jabatan = scan.next();
		if ( jabatan.matches("([Yayay])*") ) {
			System.out.print("     		*Eselon Pegawai (1A - 5A)   : ");
			eselon = scan.next();
			biayaUmum 	= 0;
			biayaFungsi = 0;
			if ( eselon.equals("1A")||eselon.equals("1a") ) {
				biayaStruktur = 5500000;
			}else if( eselon.equals("1B")||eselon.equals("1b") ){
				biayaStruktur = 4375000;
			}else if ( eselon.equals("2A")||eselon.equals("2a") ) {
				biayaStruktur = 3250000;
			}else if ( eselon.equals("2B")||eselon.equals("2b") ) {
				biayaStruktur = 2025000;
			}else if ( eselon.equals("3A")||eselon.equals("3a") ) {
				biayaStruktur = 1260000;
			}else if ( eselon.equals("3B")||eselon.equals("3b") ) {
				biayaStruktur = 980000;
			}else if ( eselon.equals("4A")||eselon.equals("4a") ) {
				biayaStruktur = 540000;
			}else if ( eselon.equals("4B")||eselon.equals("4b") ) {
				biayaStruktur = 490000;
			}else if ( eselon.equals("5A")||eselon.equals("5a") ) {
				biayaStruktur = 360000;
			}else{
				boolean esselon = (eselon.equals("1A")||eselon.equals("1a")||eselon.equals("1B")||eselon.equals("1b")||eselon.equals("2A")||eselon.equals("2a")||eselon.equals("2B")||eselon.equals("2b")||eselon.equals("3A")||eselon.equals("3a")||eselon.equals("3B")||eselon.equals("3b")||eselon.equals("4A")||eselon.equals("4a")||eselon.equals("4B")||eselon.equals("4b")||eselon.equals("5A")||eselon.equals("5a")) ;
				while( !esselon ){
					System.out.println();
					System.out.println("	!!! 	1A/1B/2A/2B/3A/3B/4A/4B/5A pilihan eselon tersedia");
					System.out.println();
					System.out.print("     		*Eselon Pegawai (1A - 5A)   : ");
					eselon = scan.next();
				}
			}
		}else if ( jabatan.matches("([Tidaktidakt])*") ) {
	    	System.out.print("	Memiliki Keterampilan(Ya/Tidak)     : ");
			keterampilan = scan.next();
			if ( keterampilan.matches("([Yayay])*") ) {
			System.out.print("     		*Pendidikan terakhir        : ");
			pendidikan = scan.next();
				biayaStruktur= 0;
				biayaUmum	= 0;
			if ( pendidikan.equals("SMA")||pendidikan.equals("sma")||pendidikan.equals("SMK")||pendidikan.equals("smk")||pendidikan.equals("D1")||pendidikan.equals("d1")||pendidikan.equals("D2")||pendidikan.equals("d2")||pendidikan.equals("D3")||pendidikan.equals("d3") ) {
					if ( golongan.equals("3C")||golongan.equals("3c")||golongan.equals("3D")||golongan.equals("3d")) {
						biayaFungsi = 600000;
					}else if ( golongan.equals("3A")||golongan.equals("3a")||golongan.equals("3B")||golongan.equals("3b") ) {
						biayaFungsi = 500000;
					}else if ( golongan.equals("2B")||golongan.equals("2b")||golongan.equals("2C")||golongan.equals("2c")||golongan.equals("2D")||golongan.equals("2d") ){
						biayaFungsi = 400000;
					}else if ( golongan.equals("2A")||golongan.equals("2a")){
						biayaFungsi = 300000;
					}
				}else if ( pendidikan.equals("S1")||pendidikan.equals("s1")||pendidikan.equals("S2")||pendidikan.equals("s2")||pendidikan.equals("S3")||pendidikan.equals("s3") ) {
					if ( golongan.equals("4D")||golongan.equals("4d")||golongan.equals("4E")||golongan.equals("4e")) {
						biayaFungsi = 1000000;
					}else if (  golongan.equals("4A")||golongan.equals("4a")||golongan.equals("4B")||golongan.equals("4b")||golongan.equals("4C")||golongan.equals("4c") ) {
						biayaFungsi = 900000;
					}else if (  golongan.equals("3C")||golongan.equals("3c")||golongan.equals("3D")||golongan.equals("3d") ) {
						biayaFungsi = 800000;
					}else if (  golongan.equals("3A")||golongan.equals("3a")||golongan.equals("3B")||golongan.equals("3b") ) {
						biayaFungsi = 700000;
					}
				}	
			while( !(pendidikan.equals("SMA")||pendidikan.equals("sma")||pendidikan.equals("SMK")||pendidikan.equals("smk")||pendidikan.equals("D1")||pendidikan.equals("d1")||pendidikan.equals("D2")||pendidikan.equals("d2")||pendidikan.equals("D3")||pendidikan.equals("d3")||pendidikan.equals("S1")||pendidikan.equals("s1")||pendidikan.equals("S2")||pendidikan.equals("s2")||pendidikan.equals("S3")||pendidikan.equals("s3")) ){
				System.out.println();
				System.out.println("	!!! 	Pendidikan min SMA/SMK(keterampilan) dan S1(keahlian)");
				System.out.println();
				System.out.print("     		*Pendidikan terakhir        : ");
				pendidikan = scan.next();
			}

			}else{
				biayaStruktur= 0;
				biayaFungsi	= 0;

				golSatu 	= (golongan.equals("1A")||golongan.equals("1a")||golongan.equals("1B")||golongan.equals("1b")||golongan.equals("1C")||golongan.equals("1c")||golongan.equals("1D")||golongan.equals("1d"));
				golDua 		= (golongan.equals("2A")||golongan.equals("2a")||golongan.equals("2B")||golongan.equals("2b")||golongan.equals("2C")||golongan.equals("2c")||golongan.equals("2D")||golongan.equals("2d"));
				golTiga 	= (golongan.equals("3A")||golongan.equals("3a")||golongan.equals("3B")||golongan.equals("3b")||golongan.equals("3C")||golongan.equals("3c")||golongan.equals("3D")||golongan.equals("3d"));
				golEmpat 	= (golongan.equals("4A")||golongan.equals("4a")||golongan.equals("4B")||golongan.equals("4b")||golongan.equals("4C")||golongan.equals("4c")||golongan.equals("4D")||golongan.equals("4d")||golongan.equals("4E")||golongan.equals("4e"));

				if ( golSatu ) {
					biayaUmum = 175000;
				}else if ( golDua ) {
					biayaUmum = 180000;
				}else if ( golTiga ) {
					biayaUmum = 185000;
				}else if ( golEmpat ) {
					biayaUmum = 190000;
				}
			}
		}

		// Inputan Lokasi Dinas
		System.out.print("	Lokasi dinas di Papua ? (Ya/Tidak)  : "); 
		lokasi = scan2.nextLine();
		if ( lokasi.matches("([Yayay])*") ) {
			if ( golongan.equals("1A")||golongan.equals("1a") ) {
				tunjPapua = 200000;
			}else if ( golongan.equals("1B")||golongan.equals("1b") ) {
				tunjPapua = 225000;
			}else if ( golongan.equals("1C")||golongan.equals("1c") ) {
				tunjPapua = 250000;
			}else if ( golongan.equals("1D")||golongan.equals("1d") ) {
				tunjPapua = 275000;
			}else if ( golongan.equals("2A")||golongan.equals("2a") ) {
				tunjPapua = 300000;
			}else if ( golongan.equals("2B")||golongan.equals("2b") ) {
				tunjPapua = 325000;
			}else if ( golongan.equals("2C")||golongan.equals("2c") ) {
				tunjPapua = 350000;
			}else if ( golongan.equals("2D")||golongan.equals("2d") ) {
				tunjPapua = 375000;
			}else if ( golongan.equals("3A")||golongan.equals("3a") ) {
				tunjPapua = 425000;
			}else if ( golongan.equals("3B")||golongan.equals("3b") ) {
				tunjPapua = 450000;
			}else if ( golongan.equals("3C")||golongan.equals("3c") ) {
				tunjPapua = 475000;
			}else if ( golongan.equals("3D")||golongan.equals("3d") ) {
				tunjPapua = 500000;
			}else if ( golongan.equals("4A")||golongan.equals("4a") ) {
				tunjPapua = 525000;
			}else if ( golongan.equals("4B")||golongan.equals("4b") ) {
				tunjPapua = 550000;
			}else if ( golongan.equals("4C")||golongan.equals("4c") ) {
				tunjPapua = 575000;
			}else if ( golongan.equals("4D")||golongan.equals("4d") ) {
				tunjPapua = 600000;
			}else if ( golongan.equals("4E")||golongan.equals("4e") ) {
				tunjPapua = 625000;
			}
		}else{
			tunjPapua = 0;
		}
		

		// Inputan status rumah dinas
		System.out.print("	Memakai rumah dinas?(Ya/Tidak)      : ");
		rumahDinas = scan.next();
		if ( rumahDinas.matches("([Yayay])") ) {
			biayaSewaRumah	= 450000;
		}else{
			biayaSewaRumah = 0;
		}

		// Inputan hutang
		System.out.print("	Memiliki hutang? (Ya/Tidak)         : ");
		hutang = scan.next();
		if ( hutang.matches("([Yayay])") ) {
			System.out.print("     		*Besar hutang                : Rp. ");
			besarHutang = scan.nextDouble();
		}else{
			besarHutang = 0;
		}
		
		// Inputan tunjangan lain
		System.out.print("	Ada tunjangan lain ? (Ya/Tidak)     : ");
		tunjLain = scan.next();
		if ( tunjLain.matches("([Yayay])") ) {
			System.out.print("     		*Masukan tunjangan          : ");
			namaTunjLain = scan.next();
			System.out.print("     		*Biaya "+namaTunjLain+"            : Rp. ");
			biayaTunjLain = scan.nextDouble();
		}

		System.out.println();
		System.out.println("	=========================================");

		masker = Integer.parseInt(maskerString);
		if ( golongan.equals("1A") || golongan.equals("1a") ) {
			if ( masker >= 26 ) {
				gajiPokok = gajiPokokGolSatuA[26];
			}else {
				gajiPokok = gajiPokokGolSatuA[masker];
			}
		}else if ( golongan.equals("1B") || golongan.equals("1b") ) {
			if ( masker >= 27 ) {
				gajiPokok = gajiPokokGolSatuB[27];
			}else{
				gajiPokok = gajiPokokGolSatuB[masker];
			}
		}else if (golongan.equals("1C") || golongan.equals("1c")) {
			if ( masker >= 27 ) {
				gajiPokok = gajiPokokGolSatuC[27];
			}else {
				gajiPokok = gajiPokokGolSatuC[masker];
			}
		}else if ( golongan.equals("1D") || golongan.equals("1d") ) {
			if ( masker >= 27) {
				gajiPokok = gajiPokokGolSatuD[27];
			}else{
				gajiPokok = gajiPokokGolSatuD[masker];
			}
		}else if ( golongan.equals("2A") || golongan.equals("2a") ) {
			if ( masker >= 33 ) {
				gajiPokok = gajiPokokGolDuaA[33];
			}else {
				gajiPokok = gajiPokokGolDuaA[masker];
			}
		}else if ( golongan.equals("2B") || golongan.equals("2b") ) {
			if ( masker >= 33) {
				gajiPokok = gajiPokokGolDuaB[33];
			}else {
				gajiPokok = gajiPokokGolDuaB[masker];
			}
		}else if ( golongan.equals("2C") || golongan.equals("2c") ) {
			if ( masker >= 33) {
				gajiPokok = gajiPokokGolDuaC[33];
			}else {
				gajiPokok = gajiPokokGolDuaC[masker];
			}
		}else if ( golongan.equals("2D") || golongan.equals("2d") ) {
			if ( masker >= 33) {
				gajiPokok = gajiPokokGolDuaD[33];
			}else {
				gajiPokok = gajiPokokGolDuaD[masker];
			}
		}else if ( golongan.equals("3A") || golongan.equals("3a") ) {
			if ( masker >= 32) {
				gajiPokok = gajiPokokGolTigaA[32];
			}else {
				gajiPokok = gajiPokokGolTigaA[masker];
			}
		}else if ( golongan.equals("3B") || golongan.equals("3b") ) {
			if ( masker >= 32) {
				gajiPokok = gajiPokokGolTigaB[32];
			}else {
				gajiPokok = gajiPokokGolTigaB[masker];
			}
		}else if ( golongan.equals("3C") || golongan.equals("3c") ) {
			if ( masker >= 32) {
				gajiPokok = gajiPokokGolTigaC[32];
			}else {
				gajiPokok = gajiPokokGolTigaC[masker];
			}
		}else if ( golongan.equals("3D") || golongan.equals("3d") ) {
			if ( masker >= 32) {
				gajiPokok = gajiPokokGolTigaD[32];
			}else {
				gajiPokok = gajiPokokGolTigaD[masker];
			}
		}else if ( golongan.equals("4A") || golongan.equals("4a") ) {
			if ( masker >= 32) {
				gajiPokok = gajiPokokGolEmpatA[32];
			}else {
				gajiPokok = gajiPokokGolEmpatA[masker];
			}
		}else if ( golongan.equals("4B") || golongan.equals("4b") ) {
			if ( masker >= 32) {
				gajiPokok = gajiPokokGolEmpatB[32];
			}else {
				gajiPokok = gajiPokokGolEmpatB[masker];
			}
		}else if ( golongan.equals("4C") || golongan.equals("4c") ) {
			if ( masker >= 32) {
				gajiPokok = gajiPokokGolEmpatC[32];
			}else {
				gajiPokok = gajiPokokGolEmpatC[masker];
			}
		}else if ( golongan.equals("4D") || golongan.equals("4d") ) {
			if ( masker >= 32) {
				gajiPokok = gajiPokokGolEmpatD[32];
			}else {
				gajiPokok = gajiPokokGolEmpatD[masker];
			}
		}else if ( golongan.equals("4E") || golongan.equals("4e") ) {
			if ( masker >= 32) {
				gajiPokok = gajiPokokGolEmpatE[32];
			}else {
				gajiPokok = gajiPokokGolEmpatE[masker];
			}
		}

		jmlAnak = Integer.parseInt(jmlAnakString);
		// Tunjangan Anak
		if ( jmlAnak >= 2 ) {
			jmlAnak = 2;
			tunjAnak= (2.0/100*gajiPokok)*jmlAnak;
		}else if(jmlAnak == 1){
			tunjAnak= (2.0/100*gajiPokok);
		}else{
			tunjAnak = 0;
		}

		// Tunjangan keluarga
		if ( status.equals("Janda")||status.equals("janda")||status.equals("Duda")||status.equals("duda")||status.equals("Tidak")||status.equals("tidak")||status.equals("t") ) {
			tunjKeluarga = 0;
		}else{
			tunjKeluarga = 10.0/100*gajiPokok;	
		}

		boolean booTunjBerasSatu 	= ( (status.equals("Ya")||status.equals("ya")||status.equals("y"))  && jmlAnak >= 2);
		boolean booTunjBerasEmpat 	= ( (status.equals("Ya")||status.equals("ya")||status.equals("y"))  && jmlAnak == 1);
		boolean booTunjBerasDua	 	= ( status.equals("Janda")||status.equals("janda")||status.equals("Duda")||status.equals("duda")  && jmlAnak >= 2 );
		boolean booTunjBerasTiga 	= ( status.equals("Janda")||status.equals("janda")||status.equals("Duda")||status.equals("duda") && jmlAnak == 1 );

		// Tunjangan beras
		if ( booTunjBerasSatu ) {
			tunjBeras= (10*14000)*4; 
		}else if ( booTunjBerasDua || booTunjBerasEmpat ) {
			tunjBeras= (10*14000)*3;
		}else if(booTunjBerasTiga){
			tunjBeras= (10*14000)*2;
		}else{
			tunjBeras= (10*14000);
		}

		// IWP (iuran wajib pajak)
		biayaIwp 	= 10.0/100*(gajiPokok+tunjKeluarga+tunjAnak);

		// Taperum
		golSatu 	= (golongan.equals("1A")||golongan.equals("1a")||golongan.equals("1B")||golongan.equals("1b")||golongan.equals("1C")||golongan.equals("1c")||golongan.equals("1D")||golongan.equals("1d"));
		golDua 		= (golongan.equals("2A")||golongan.equals("2a")||golongan.equals("2B")||golongan.equals("2b")||golongan.equals("2C")||golongan.equals("2c")||golongan.equals("2D")||golongan.equals("2d"));
		golTiga 	= (golongan.equals("3A")||golongan.equals("3a")||golongan.equals("3B")||golongan.equals("3b")||golongan.equals("3C")||golongan.equals("3c")||golongan.equals("3D")||golongan.equals("3d"));
		golEmpat 	= (golongan.equals("4A")||golongan.equals("4a")||golongan.equals("4B")||golongan.equals("4b")||golongan.equals("4C")||golongan.equals("4c")||golongan.equals("4D")||golongan.equals("4d")||golongan.equals("4E")||golongan.equals("4e"));

		if ( golSatu ) {
			tunjTaperum = 3000;
		}else if ( golDua ) {
			tunjTaperum = 5000;
		}else if ( golTiga ) {
			tunjTaperum = 7000;
		}else if ( golEmpat ) {
			tunjTaperum = 10000;
		}


		// PPh 21
		gajiKotor	= gajiPokok+tunjKeluarga+tunjAnak+tunjPapua+(biayaStruktur+biayaFungsi+biayaUmum)+biayaTunjLain+tunjBeras;

		biayaJabatan = 5.0/100*gajiKotor;
		iuranPensiun = 0.0475*(gajiPokok+tunjKeluarga+tunjAnak);
		penjumlahan  = biayaJabatan+iuranPensiun;
		nettoSebulan = gajiKotor-penjumlahan; 
		nettoSetahun = nettoSebulan*12;
		if ( status.equals("Ya")||status.equals("ya")||status.equals("y") && jmlAnak > 0 && jmlAnak <= 3) {
			ptkp	= 36000000+3000000+(3000000*jmlAnak);
		}else if ( (status.equals("Janda")||status.equals("janda")||status.equals("Duda")||status.equals("duda") ) && jmlAnak > 0 && jmlAnak <= 3 ) {
			ptkp	= 36000000+(3000000*jmlAnak);
		}else if ( status.equals("Ya")||status.equals("ya")||status.equals("y") && jmlAnak > 3 ) {
			ptkp	= 36000000+3000000+(3000000*3);
		}else if ( (status.equals("Janda")||status.equals("janda")||status.equals("Duda")||status.equals("duda")) && jmlAnak > 3 ) {
			ptkp	= 36000000+(3000000*3);
		}else{
			ptkp	= 36000000;
		}


		pkp = nettoSetahun-ptkp;
		if ( nettoSetahun < ptkp ) {
			pphSetahun 	= 0;
			pkp 		= 0;
			pphSebulan 	= 0;
			tunjPajak 	= 0;
		}else{
			if ( pkp <= 50000000 ) {
				pphSetahun 	= 5.0/100*pkp;
				pphSebulan 	= pphSetahun/12;
				tunjPajak 	= pphSebulan;
			}else if ( pkp <= 250000000 ) {
				hitungan 	= pkp - 50000000;
				hitungan 	= 15.0/100*hitungan;
				pphSetahun 	= (5.0/100*50000000)+hitungan;
				pphSebulan 	= pphSetahun/12;
				tunjPajak 	= pphSebulan;
			}else if ( pkp <= 500000000 ) {
				pphSetahun 	= (5.0/100*50000000)+(15.0/100*200000000);
				hitungan 	= pkp - 250000000;
				hitungan 	= 25.0/100*hitungan;
				pphSetahun 	= hitungan+pphSetahun;
				pphSebulan 	= pphSetahun/12;
				tunjPajak 	= pphSebulan;
			}else if ( pkp > 500000000 ) {
				pphSetahun 	= (5.0/100*50000000)+(15.0/100*200000000)+((500000000-250000000)*25.0/100);
				hitungan 	= pkp - 500000000;
				hitungan 	= 30.0/100*hitungan;
				pphSetahun 	= pphSetahun+hitungan;
				pphSebulan 	= pphSetahun/12;
				tunjPajak 	= pphSebulan;
			}
		}

		// Masih Ragu

		potongan = biayaIwp+biayaSewaRumah+besarHutang+tunjTaperum+pphSebulan;
		gajiBersih =gajiKotor-potongan;


		////// OUTPUT
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("	====================================================");
		System.out.println("	                   SLIP GAJI PNS                    ");
		System.out.println("	====================================================");
		System.out.println();
		System.out.println("	NIP           : "+nip);
		System.out.println("	Nama          : "+nama);
		System.out.println();
		System.out.println("	____________________________________________________");
		System.out.println();
		System.out.println("	                ---------------------               ");
		System.out.println("	                     Penghasilan                    ");
		System.out.println("	                ---------------------               ");
		System.out.println();
		System.out.println("	Gaji Pokok    : Rp. "+gajiPokok);
		System.out.println("	T.Istri/Suami : Rp. "+tunjKeluarga);
		System.out.println("	T.Anak        : Rp. "+tunjAnak);
		System.out.println("	T.Umum        : Rp. "+biayaUmum);
		System.out.println("	T.Papua       : Rp. "+tunjPapua);
		System.out.println("	T.Struktur    : Rp. "+biayaStruktur);
		System.out.println("	T.Fungsi      : Rp. "+biayaFungsi);
		System.out.println("	T.Lain        : Rp. "+biayaTunjLain);
		System.out.println("	T.Beras       : Rp. "+tunjBeras);
		System.out.println("	T.Pajak       : Rp. "+tunjPajak);
		System.out.println("	               ____________________");
		System.out.println();
		System.out.println("	Jml.Kotor       Rp. "+gajiKotor);
		System.out.println();
		System.out.println();
		System.out.println("	                ---------------------               ");
		System.out.println("	                     Potongan                       ");
		System.out.println("	                ---------------------               ");
		System.out.println();
		System.out.println("	IWP           : Rp. "+biayaIwp);
		System.out.println("	Pot.PPh       : Rp. "+pphSebulan);
		System.out.println("	Sewa Rumah    : Rp. "+biayaSewaRumah);
		System.out.println("	Hutang        : Rp. "+besarHutang);
		System.out.println("	Taperum       : Rp. "+tunjTaperum);
		System.out.println("	               ____________________");
		System.out.println();
		System.out.println("	Jml.Potongan    Rp. "+potongan);
		System.out.println();
		System.out.println("	Jml.Bersih      Rp. "+gajiBersih);
		System.out.println();
	}
}