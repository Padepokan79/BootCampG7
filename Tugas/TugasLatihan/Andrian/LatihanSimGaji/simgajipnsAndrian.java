/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;


	public class simgajipnsAndrian {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			Scanner key1 = new Scanner(System.in);
			Scanner numb = new Scanner(System.in);
			double gajiPokok, tunjanganPasangan, tunjanganAnak, tunjanganUmum, tunjanganTaUmum, tunjanganPapua, tunjanganLainTemp1, tunjanganLainTemp2, tunjanganLainTemp3, tunjanganPotBeras,
				tunjanganTerpencil=0, tunjanganStruktur, tunjanganFungsi, tunjanganBulat, tunggakanI, tunggakanIn=0, utangI, tunjanganLainI, penghasilanKotorBulan, penghasilanNettoBulan, penghasilanNettoTahun,
				tunjanganBeras, tunjanganPajak, iuranWajibPegawai, hutang, sewaRumahI, sum=0, index=0, indexValidasi=1, anakAnak, istri, user, pkp, pkp1, pkp2, pkp3, pkp4, ptkp, nilaiPengurang, iuranPensiun, 
				biayaJabatan, taperum, jumlahPotongan, potBeras, potLain, jumlahBersih, bebanPph;

			gajiPokok=0; tunjanganPasangan= 0; tunjanganAnak=0; istri=0; user=1; anakAnak=0; tunjanganLainTemp1 = 0; tunjanganLainTemp2 =0; tunjanganLainTemp3 = 0;
			tunjanganStruktur=0; tunjanganFungsi=0; tunjanganUmum=0; tunjanganPapua=0; tunjanganBulat=0; tunjanganTaUmum=0; ptkp=0;
			taperum=0; jumlahPotongan=0; potBeras=0; potLain=0; jumlahBersih=0; hutang=0; sewaRumahI=0; pkp1=0; pkp2=0; pkp3=0; pkp4=0;



			int [] ia = {1486500, 1486500, 1533400, 1533400, 1581700, 1581700, 1631500, 1631500, 1682900, 1682900, 1735900, 1735900, 1790500, 1790500, 1846900, 1846900, 1905100, 1905100, 1965100, 1965100, 2027000, 2027000, 2090800, 2090800, 2156700, 2156700, 2224600, 2224600};
			int [] ib = {0, 0, 0, 1623400, 1623400, 1674500, 1674500, 1727300, 1727300, 1781700, 1781700, 1837800, 1837800, 1895700, 1895700, 1955400, 1955400, 2016900, 2016900, 2080500, 2080500, 2146000, 2146000, 2213600, 2213600, 2283300, 2283300, 2355200};
			int [] ic = {0, 0, 0, 1692100, 1692100, 1745400, 1745400, 1800300, 1800300, 1857000, 1857000, 1915500, 1915500, 1975800, 1975800, 2038100, 2038100, 2102300, 2102300, 2168500, 2168500, 2236800, 2236800, 2307200, 2307200, 2379900, 2379900, 2454800};
			int [] id = {0, 0, 0, 1763600, 1763600, 1819200, 1819200, 1876500, 1876500, 1935600, 1935600, 1996500, 1996500, 2059400, 2059400, 2124300, 2124300, 2191200, 2191200, 2260200, 2260200, 2331400, 2331400, 2404800, 2404800, 2480500, 2480500, 2558700};
			int [] iia = {1926000, 1956300, 1956300, 2017900, 2017900, 2081500, 2081500, 2147000, 2147000, 2214700, 2214700, 2284400, 2284400, 2356400, 2356400, 2430600, 2430600, 2507100, 2507100, 2586100, 2586100, 2667500, 2667500, 2751600, 2751600, 2838200, 2838200, 2927600, 2927600, 3019800, 3019800, 3114900, 3114900, 3213100};
			int [] iib = {0, 0, 0, 2103300, 2103300, 2169500, 2169500, 2237900, 2237900, 2308300, 2308300, 2381100, 2381100, 2456000, 2456000, 2533400, 2533400, 2613200, 2613200, 2695500, 2695500, 2780400, 2780400, 2867900, 2867900, 2958300, 2958300, 3051400, 3051400, 3147600, 3147600, 3246700, 3246700, 3348900};
			int [] iic = {0, 0, 0, 2192300, 2192300, 2261300, 2261300, 2332500, 2332500, 2406000, 2406000, 2481800, 2481800, 2559900, 2559900, 2640600, 2640600, 2723700, 2723700, 2809500, 2809500, 2898000, 2898000, 2989300, 2989300, 3083400, 3083400, 3180500, 3180500, 3280700, 3280700, 3384000, 3384000, 3490600};
			int [] iid = {0, 0, 0,2285000, 2285000, 2357000, 2357000, 2431200, 2431200, 2507800, 2507800, 2586700, 2586700, 2668200, 2668200, 2752300, 2752300, 2838900, 2838900, 2928300, 2928300, 3020600, 3020600, 3115700, 3115700, 3213800, 3213800, 3315100, 3315100, 3419500, 3419500, 3527200, 3527200, 3638200};
			int [] iiia = {2456700, 2456700, 2534000, 2534000, 2613800, 2613800, 2696200, 2696200, 2781100, 2781100, 2868700, 2868700, 2959000, 2959000, 3052200, 3052200, 3148300, 3148300, 3247500, 3247500, 3349800, 3349800, 3455300, 3455300, 3564100, 3564100, 3676400, 3676400, 3792100, 3792100, 3911600, 3911600, 4034800};
			int [] iiib = {2560600, 2560600, 2641200, 2641200, 2724400, 2724400, 2810200, 2810200, 2898700, 2898700, 2990000, 2990000, 3084200, 3084200, 3181300, 3181300, 3281500, 3281500, 3384900, 3384900, 3491500, 3491500, 3601400, 3601400, 3714900, 3714900, 3831900, 3831900, 3952600, 3952600, 4007000, 4007000, 4205400};
			int [] iiic = {2668900, 2668900, 2752900, 2752900, 2839700, 2839700, 2929100, 2929100, 3021300, 3021300, 3116500, 3116500, 3214700, 3214700, 3315900, 3315900, 3420300, 3420300, 3528100, 3528100, 3639200, 3639200, 3753800, 3753800, 3872000, 3872000, 3994200, 3994200, 4119700, 4119700, 4249500, 4249500, 4383300};
			int [] iiid = {2781800, 2781800, 2869400, 2869400, 2959800, 2959800, 3053000, 3053000, 3149100, 3149100, 3248300, 3248300, 3350600, 3350600, 3456200, 3456200, 3565000, 3565000, 3677300, 3677300, 3912600, 3912600, 3912600, 3912600, 4035800, 4035800, 4162900, 4162900, 4294000, 4294000, 4429300, 4429300, 4568800};
			int [] iva = {2899500, 2899500, 2990800, 2990800, 3085000, 3085000, 3182100, 3182100, 3282400, 3282400, 3385700, 3385700, 3492400, 3492400, 3602400, 3602400, 3715800, 3715800, 3832800, 3832800, 3953600, 3953600, 4078100, 4078100, 4206500, 4206500, 4339000, 4339000, 4475700, 4475700, 4616600, 4616600, 4762000};
			int [] ivb = {3022100, 3022100, 3117300, 3117300, 3215500, 3215500, 3316700, 3316700, 3421200, 3421200, 3528900, 3528900, 3640100, 3640100, 3754700, 3754700, 3873000, 3873000, 3995000, 3995000, 4120800, 4120800, 4250600, 4250600, 4384400, 4384400, 4522500, 4522500, 4665000, 4665000, 4811900, 4811900, 4963400};
			int [] ivc = {3149900, 3149900, 3249100, 3249100, 3351500, 3351500, 3457000, 3457000, 3565900, 3565900, 3678200, 3678200, 3794100, 3794100, 3913600, 3913600, 4036800, 4036800, 4164000, 4164000, 4295100, 4295100, 4430400, 4430400, 4569900, 4569900, 4713800, 4713800, 4862300, 4862300, 5015400, 5015400, 5173400};
			int [] ivd = {3283200, 3283200, 3386600, 3386600, 3493200, 3493200, 3603300, 3603300, 3716700, 3716700, 3833800, 3833800, 3954600, 3954600, 4079100, 4079100, 4207600, 4207600, 4340100, 4340100, 4476800, 4476800, 4617800, 4617800, 4763200, 4763200, 4913200, 4913200, 5068000, 5068000, 5227600, 5227600, 5392200};
			int [] ive = {3422100, 3422100, 3529800, 3529800, 3641000, 3641000, 3755700, 3755700, 3874000, 3874000, 3996000, 3996000, 4121800, 4121800, 4251600, 4251600, 4385600, 4385600, 4523700, 4523700, 4666100, 4666100, 4813100, 4813100, 4964700, 4964700, 5121100, 5121100, 5282300, 5282300, 5448700, 5448700, 5620300};

			String nama="", status="", anak="", golongan, lokasi, jabatan, jabatan2, struktural, fungsional, jenjangPendidikan,
					tunjanganLainS, tunjanganLainWord, tunjanganLainWordS1="", tunjanganLainWordS2="", tunjanganLainWordS, tunggakan, utang, sewaRumah, mmkg="", nip="";
			System.out.println("SLIP GAJI PNS");
			System.out.println("==================================================");

			do { //NIP  
				System.out.print("NIP\t\t\t\t\t: ");
				nip = key1.nextLine();
				if (nip.matches("[0-9 ]+") && nip.length()>=12)  {
					index+=1;
				}
				else {
					System.out.println("Input diharuskan angka");
					index=0;
				}

				if (nip.length()<=12 || nip.length()>=18)  {
					System.out.println("Input minimal 12, maksimal 18!");
					index=0;
				}


			} while (index<indexValidasi);


			do { //Nama 
				System.out.print("Nama\t\t\t\t\t: ");
				nama = key1.nextLine();
				if (nama.matches("[A-Z a-z]+")) {
					index+=1;
				} else {
					System.out.println("Input diharuskan huruf");
					index=0;
				}
				if (nama.length()>32) {
					System.out.println("Input invalid");
					index=0;
				}
			} while (index<indexValidasi);
			

			do { //Golongan
				System.out.print("Golongan Anda\t\t\t\t: ");
				golongan = key1.nextLine();
				if (golongan.matches("[A-EIV ]+")) {
					if (golongan.matches("[IE]+")) {
						System.out.println("Golongan yang anda inputkan tidak sesuai !");
						index = 0;	
					}
					else {
						index+=1;
					}
				}
				else {
					System.out.println("Golongan yang anda inputkan tidak sesuai !");
					index = 0;
				}				
			} while (index<indexValidasi);

			
			do { //MKG
				System.out.print("MKG anda\t\t\t\t: ");
				mmkg = key1.nextLine();
				if (mmkg.matches("[0-9 ]+")) {
					int mkg = Integer.parseInt(mmkg);
					if (golongan.equals("IA")) {
						if (mkg>ia.length) {
							gajiPokok = ia[27];
						}
						else {
							gajiPokok = ia[mkg];
						}
					}
					else if (golongan.equals("IB")) {
						if (mkg>ib.length) {
							gajiPokok = ib[27];
						}
						else {
							gajiPokok = ib[mkg];
						}
					}
					else if (golongan.equals("IC")) {
						if (mkg>ic.length) {
							gajiPokok = ic[27];
						}
						else {
							gajiPokok = ic[mkg];
						}
					}
					else if (golongan.equals("ID")) {
						if (mkg>id.length) {
							gajiPokok = id[27];
						}
						else {
							gajiPokok = id[mkg];
						}
					}
					else if (golongan.equals("IIA")) {
						if (mkg>iia.length) {
							gajiPokok = iia[33];
						}
						else {
							gajiPokok = iia[mkg];
						}
					}
					else if (golongan.equals("IIB")) {
						if (mkg>iib.length) {
							gajiPokok = iib[33];
						}
						else {
							gajiPokok = iib[mkg];
						}
					}
					else if (golongan.equals("IIC")) {
						if (mkg>iia.length) {
							gajiPokok = iic[33];
						}
						else {
							gajiPokok = iic[mkg];
						}
					}
					else if (golongan.equals("IID")) {
						if (mkg>iia.length) {
							gajiPokok = iid[33];
						}
						else {
							gajiPokok = iid[mkg];
						}
					}
					else if (golongan.equals("IIIA")) {
						if (mkg>iia.length) {
							gajiPokok = iiia[32];
						}
						else {
							gajiPokok = iiia[mkg];
						}
					}
					else if (golongan.equals("IIIB")) {
						if (mkg>iiib.length) {
							gajiPokok = iiib[32];
						}
						else {
							gajiPokok = iiib[mkg];
						}
					}
					else if (golongan.equals("IIIC")) {
						if (mkg>iiic.length) {
							gajiPokok = iiic[32];
						}
						else {
							gajiPokok = iiic[mkg];
						}
					}
					else if (golongan.equals("IIID")) {
						if (mkg>iiid.length) {
							gajiPokok = iiid[32];
						}
						else {
							gajiPokok = iiid[mkg];
						}
					}
					else if (golongan.equals("IVA")) {
						if (mkg>iva.length) {
							gajiPokok = iva[32];
						}
						else {
							gajiPokok = iva[mkg];
						}
					}
					else if (golongan.equals("IVB")) {
						if (mkg>ivb.length) {
							gajiPokok = ivb[32];
						}
						else {
							gajiPokok = ivb[mkg];
						}
					}
					else if (golongan.equals("IVC")) {
						if (mkg>ivc.length) {
							gajiPokok = ivc[32];
						}
						else {
							gajiPokok = ivc[mkg];
						}
					}
					else if (golongan.equals("IVD")) {
						if (mkg>ivd.length) {
							gajiPokok = ivd[32];
						}
						else {
							gajiPokok = ivd[mkg];
						}
					}
					else if (golongan.equals("IVE")) {
						if (mkg>iva.length) {
							gajiPokok = ive[32];
						}
						else {
							gajiPokok = ive[mkg];
						}
					}
					index+=1;
				}
					else if (mmkg.matches("[a-zA-Z]+")) {
						System.out.println("Masa kerja golongan anda inputkan tidak sesuai !");
						index = 0 ;
					}
					else {
						System.out.println("Masa kerja golongan anda inputkan tidak sesuai !");
						index = 0 ;
					}

			} while (index<indexValidasi);

			//System.out.println(gajiPokok);


			do  { //Status perkawinan
				System.out.println("Tuliskan status anda (tidak Kawin/kawin)");
				System.out.print("Status\t\t\t\t\t: ");
				status = key1.nextLine();
					if (status.equals("tidak kawin")) {
						tunjanganPasangan=0;
						tunjanganAnak=0;
						istri = 0;	
					}
					else if (status.equals("kawin")) {
						tunjanganPasangan=gajiPokok*10/100;
						istri = 1;
					}
					else {
						System.out.println("Input invalid");
					}
			} while ( !status.equals("tidak kawin") && !status.equals("kawin"));

			//System.out.println(tunjanganPasangan);


			do { //jumlah anak
				System.out.println("Tuliskan jumlah anak");
				System.out.print("Anak\t\t\t\t\t: ");
				anak = key1.nextLine();
				if (anak.matches("[0-9 ]+")) {
					anakAnak = Integer.parseInt(anak);
					if (anakAnak==0) {
						tunjanganAnak=0;
						index+=1;
					}
					else if (anakAnak==1) {
						tunjanganAnak=gajiPokok*2/100;
						index+=1;
					}
					else if (anakAnak>2) {
						tunjanganAnak=(gajiPokok*2/100)*2;
						index+=1;
					}
					else {
						System.out.println("Input invalid");
						index=0;
					}
				}
				else {
					System.out.println("Input diharuskan angka!");	
					index = 0;
					}
			} while (index<indexValidasi);

			//System.out.println(tunjanganAnak);
			


			do { //Tunjungan Struktural, Fungsional, Umum	
				System.out.print("Menduduki suatu jabatan\t\t\t: ");
				jabatan = key1.nextLine();
				if (jabatan.matches("[YTyt]")) {
					if (jabatan.equals("y")||jabatan.equals("Y")) {
						do {
							System.out.print("\tJabatan struktural atau fungsional\t: ");
							jabatan2 = key1.nextLine();
							if (jabatan2.matches("[A-Za-z ]+")) {
								if (jabatan2.equals("struktural")) {
									do {
										System.out.println("\tMasukan pangkat eselon anda : ");
										struktural = key1.nextLine(); 
										if (struktural.matches("[A-BIV]+")) {
											if (struktural.equals("IA")) {
												tunjanganStruktur = 5500000;
											}
											else if (struktural.equals("IB")) {
												tunjanganStruktur = 4375000;
											}
											else if (struktural.equals("IIA")) {
												tunjanganStruktur = 3250000;
											}
											else if (struktural.equals("IIB")) {
												tunjanganStruktur = 2025000;
											}
											else if (struktural.equals("IIIA")) {
												tunjanganStruktur = 1260000;
											}
											else if (struktural.equals("IIIB")) {
												tunjanganStruktur = 980000;
											}
											else if (struktural.equals("IVA")) {
												tunjanganStruktur = 540000;
											}
											else if (struktural.equals("IVB")) {
												tunjanganStruktur = 490000;
											}
											else if (struktural.equals("VA")) {
												tunjanganStruktur = 360000;
											}
										//System.out.println(tunjanganStruktur);
										tunjanganFungsi = 0;
										tunjanganUmum = 0;
										index+=1;
										}
										else {
											System.out.println("Input invalid");
											index=0;
										}
									} while (index<indexValidasi) ; //Validasi Struktural
								}
								else if (jabatan2.equals("fungsional")) {
									do { 
										System.out.println("\tJenjang pendidikan anda : ");
										jenjangPendidikan = key1.nextLine();
										if (jenjangPendidikan.matches("[A-Za-z]+")) {
											if (jenjangPendidikan.equals("sarjana") || jenjangPendidikan.equals("Sarjana") || jenjangPendidikan.equals("s1") || jenjangPendidikan.equals("S1")) {
												if ( golongan.equals("IVD") || golongan.equals("IVE") ) {
													tunjanganFungsi = 1000000;
												}
												else if ( golongan.equals("IVA") || golongan.equals("IVB") || golongan.equals("IVC") ) {
													tunjanganFungsi = 900000;
												}
												else if ( golongan.equals("IIIC") || golongan.equals("IIID") ) {
													tunjanganFungsi = 800000;
												}
												else if ( golongan.equals("IIIA") || golongan.equals("IIIB") ) {
													tunjanganFungsi = 700000;	
												}
											System.out.println(tunjanganFungsi);
											}
											else if (jenjangPendidikan.equals("sma") || jenjangPendidikan.equals("SMA") || jenjangPendidikan.equals("smk") || jenjangPendidikan.equals("SMK") || jenjangPendidikan.equals("D3") || jenjangPendidikan.equals("diploma") ||jenjangPendidikan.equals("Diploma") ) {
												if ( golongan.equals("IIIC") || golongan.equals("IIID") ) {
													tunjanganFungsi = 600000;
												}
												else if ( golongan.equals("IIIA") || golongan.equals("IIIB") ) {
													tunjanganFungsi = 500000;
												}
												else if ( golongan.equals("IIB") || golongan.equals("IIC") || golongan.equals("IID") ) {
													tunjanganFungsi = 400000;
												}
												else if ( golongan.equals("IIA") ) {
													tunjanganFungsi = 300000;
												}
											//System.out.println(tunjanganFungsi);
											}
											tunjanganStruktur=0;
											tunjanganUmum = 0;
											index+=1;
										}
										else {
											System.out.println("Input Invalid");
											index=0;
										}
									} while (index<indexValidasi);
								}

								index+=1;
							}
							else {
								System.out.println("Input invalid");
								index=0;
							}
						} while(index<indexValidasi);  //Validasi y / t untuk struktural, fungsional dan umum
 					}
					else {
						if (golongan.equals("IA") || golongan.equals("IB") || golongan.equals("IC") || golongan.equals("ID")) {
							tunjanganUmum = 175000;
						}
						else if (golongan.equals("IIA") || golongan.equals("IIB") || golongan.equals("IIC") || golongan.equals("IID")) {
							tunjanganUmum = 180000;
						}
						else if (golongan.equals("IIIA") || golongan.equals("IIIB") || golongan.equals("IIIC") || golongan.equals("IIID")) {
							tunjanganUmum = 185000;
						}
						else if (golongan.equals("IVA") || golongan.equals("IVB") || golongan.equals("IVC") || golongan.equals("IVD") || golongan.equals("IVE")) {
							tunjanganUmum = 190000;
						}
						//System.out.println(tunjanganUmum);
					}
					index+=1;
				}
				else {
					System.out.println("Input invalid");
					index=0;
				}

			} while (index<indexValidasi);




			do { //Lokasi
				System.out.print("Lokasi Anda\t\t\t\t: ");
				lokasi = key1.nextLine();
				if (lokasi.matches("[A-Za-z]+")) {
					if (lokasi.equals("papua")) {
						if (golongan.equals("IA")) {
							tunjanganPapua = 200000;
						}
						else if (golongan.equals("IB")) {
							tunjanganPapua = 225000;
						}
						else if (golongan.equals("IC")) {
							tunjanganPapua = 250000;
						}
						else if (golongan.equals("ID")) {
							tunjanganPapua = 275000;
						}
						else if (golongan.equals("IIA")) {
							tunjanganPapua = 300000;
						}
						else if (golongan.equals("IIB")) {
							tunjanganPapua = 325000;
						}
						else if (golongan.equals("IIC")) {
							tunjanganPapua = 350000;
						}
						else if (golongan.equals("IID")) {
							tunjanganPapua = 375000;
						}
						else if (golongan.equals("IIIA")) {
							tunjanganPapua = 425000;
						}
						else if (golongan.equals("IIIB")) {
							tunjanganPapua = 450000;
						}
						else if (golongan.equals("IIIC")) {
							tunjanganPapua = 475000;
						}
						else if (golongan.equals("IIID")) {
							tunjanganPapua = 500000;
						}
						else if (golongan.equals("IVA")) {
							tunjanganPapua = 525000;
						}
						else if (golongan.equals("IVB")) {
							tunjanganPapua = 550000;
						}
						else if (golongan.equals("IVC")) {
							tunjanganPapua = 575000;
						}
						else if (golongan.equals("IVD")) {
							tunjanganPapua = 600000;
						}
						else if (golongan.equals("IVE")) {
							tunjanganPapua = 625000;
						}
					}
					else {
						tunjanganPapua = 0;
					}
					index+=1;
				}
				else {
					System.out.println("Input invalid");
					index=0;
				}
			} while (index<indexValidasi);


			do { //Tunjangan lain
				System.out.print("Tunjangan lain\t\t\t\t: ");
				tunjanganLainS = key1.nextLine();
				if (tunjanganLainS.matches("[YTyt]+")) {
					if (tunjanganLainS.equals("y")||tunjanganLainS.equals("Y")) {
						System.out.print("Tuliskan nama tunjangan lain tersebut : ");
						tunjanganLainWord = key1.nextLine();
						System.out.print("Tuliskan besar tunjangan lain tersebut : ");
						tunjanganLainTemp1 = key.nextInt();
						System.out.println("Apakah masih ada tunjangan lain yang akan dimasukan : ");
						tunjanganLainWordS1 = key.next();
					}
					if (tunjanganLainWordS1.equals("y")||tunjanganLainWordS1.equals("Y")) {
						System.out.print("Tuliskan nama tunjangan lain tersebut : ");
						tunjanganLainWord = key1.nextLine();
						System.out.print("Tuliskan besar tunjangan lain tersebut : ");
						tunjanganLainTemp2 = key.nextInt();
						System.out.println("Apakah masih ada tunjangan lain yang akan dimasukan : ");
						tunjanganLainWordS2 = key.next();
					}
					if  (tunjanganLainWordS2.equals("y")||tunjanganLainWordS2.equals("Y")) {
						System.out.print("Tuliskan nama tunjangan lain tersebut : ");
						tunjanganLainWord = key1.nextLine();
						System.out.print("Tuliskan besar tunjangan lain tersebut : ");
						tunjanganLainTemp3 = key.nextInt();
					}
					else {
						tunjanganLainI = 0;
					}
					index+=1;
				}
				else {
					System.out.println("Input invalid");
					index=0;
				}
			} while (index<indexValidasi);

			tunjanganLainI = tunjanganLainTemp1+tunjanganLainTemp2+tunjanganLainTemp3;
		
	
			do { //Utang
				System.out.print("Memiliki Utang\t\t\t\t: ");
				utang = key1.nextLine();
				if (utang.matches("[YTyt]+")) {
					if (utang.equals("y")||utang.equals("Y")) {
						System.out.println("Masukan besaran hutang yang anda miliki ");
						utangI = key.nextInt();
						hutang = Integer.parseInt(utang);
					}
					else {
						hutang = 0;
					}
					index+=1;
				}
				else {
					System.out.println("Input invalid");
					index=0;
				}
			} while (index<indexValidasi);


			do { //tungggakan
				System.out.print("Memiliki tunggakan\t\t\t: ");
				tunggakan = key1.nextLine();
				if (tunggakan.matches("[YTyt]+")) {
					if (tunggakan.equals("y")||tunggakan.equals("Y")) {
						System.out.println("Masukan besaran tunggakan yang anda miliki ");
						tunggakanI = key.nextInt();
						tunggakanI = tunggakanIn ;
					}
					else {
						tunggakanI = 0;
					}
					index+=1;
				}
				else {
					System.out.println("Input invalid");
					index=0;
				}
			} while (index<indexValidasi);

		
			do { //RUmah dinas
				System.out.print("Menggunakan rumah dinas\t\t\t: ");
				sewaRumah = key1.nextLine();
				if (sewaRumah.matches("[YTyt]+")) {
					if (sewaRumah.equals("y")||sewaRumah.equals("Y")) {
						sewaRumahI = 450000;
					}
					else {
						sewaRumahI = 0;
					}
					index+=1;
				}
				else {
					System.out.println("Input invalid");
					index=0;
				}
			} while (index<indexValidasi);


			tunjanganBeras = 14000*10*(user+istri+anakAnak);
			//System.out.println("Tunjangan Beras "+tunjanganBeras);


			if (golongan.equals("IA") || golongan.equals("IB") || golongan.equals("IC") || golongan.equals("ID")){
				taperum = 3000;
			}
			else if (golongan.equals("IIA") || golongan.equals("IIB") || golongan.equals("IIC") || golongan.equals("IID")) {
				taperum = 5000;
			}
			else if (golongan.equals("IIIA") || golongan.equals("IIIB") || golongan.equals("IIIC") || golongan.equals("IIID")) {
				taperum = 7000;
			}
			else if (golongan.equals("IVA") || golongan.equals("IVB") || golongan.equals("IVC") || golongan.equals("IVD")) {
				taperum = 10000;
			}

			
			iuranWajibPegawai = (gajiPokok+tunjanganPasangan+tunjanganAnak)*10/100;

			//menghitung penghasilan kotor perbulan
			penghasilanKotorBulan = gajiPokok + tunjanganAnak + tunjanganPasangan + tunjanganTaUmum + tunjanganUmum + tunjanganPapua + tunjanganTerpencil + tunjanganStruktur + tunjanganFungsi + tunjanganLainI + tunjanganBulat + tunjanganBeras;

			//menghitung biaya jabatan
			biayaJabatan = penghasilanKotorBulan*5/100;
			iuranPensiun = (gajiPokok + tunjanganPasangan + tunjanganAnak) *4.75/100;

			//nilai pengurang
			nilaiPengurang = biayaJabatan + iuranPensiun ;

			//menghitung netto bulan dan tahun
			penghasilanNettoBulan = penghasilanKotorBulan - nilaiPengurang;
			penghasilanNettoTahun = penghasilanNettoBulan*12;

			//PTKP
			if (status.equals("tidak kawin")) {
				ptkp = 36000000;
			}
			else if ((status.equals("kawin") && anakAnak==0) || (status.equals("tidak kawin") && anakAnak==1) ) {
				ptkp = 36000000+3000000;
			}
			else if ((status.equals("kawin") && anakAnak==1) || (status.equals("tidak kawin") && anakAnak==2)) {
				ptkp = 36000000+3000000+3000000;
			}
			else if ((status.equals("kawin") && anakAnak==2) || (status.equals("tidak kawin") && anakAnak==3)) {
				ptkp = 36000000+3000000+3000000+3000000;
			}
			else if (status.equals("kawin") && anakAnak==3) {
				ptkp = 36000000+3000000+3000000+3000000+3000000;
			}

			if (penghasilanNettoBulan<ptkp) {
				ptkp = 0;
			}

			//PKP
			pkp = penghasilanNettoTahun - ptkp;

			double pph1=0, pph2=0, pph3=0, pph4=0;

			if (pkp>=0 && pkp<=50000000) {
				bebanPph = 5/100 * pkp ;
			}
			else if (pkp1>50000000 && pkp1<=250000000) {
				pph1 = 5/100 * 50000000;
				pph2 = 15/100 * (pkp - pph1);
				bebanPph = pph1 + pph2;
			}
			else if (pkp2>250000000 && pkp2<= 500000000) {
				pph1 = 5/100 * 50000000;
				pph2 = 15/100 * 250000000;
				pph3 = 25/100 * (pkp -  (pph1+pph2));
				bebanPph = pph1 + pph2 + pph3;
			}
			else if (pkp3>500000000) {
				pph1 = 5/100 * 50000000;
				pph2 = 15/100 * 250000000;
				pph3 = 25/100 * 500000000;
				pph4 = 30/100 * (pkp - (pph3));
				bebanPph = pph1 + pph2 + pph3;
			}


			tunjanganPajak = pph1+pph2+pph3+pph4;

			jumlahPotongan = potBeras + iuranWajibPegawai + tunjanganPajak + sewaRumahI + tunggakanIn + hutang + potLain + taperum;

			jumlahBersih = penghasilanKotorBulan - jumlahPotongan;



			System.out.println();
			System.out.println();
			//Output
			System.out.println("==================================");
			System.out.println("         SLIP GAJI PNS");
			System.out.println("==================================");
			System.out.println("NIP "+ nip);
			System.out.println("Nama " + nama);
			System.out.println("==================================");
			System.out.println("Gaji Pokok\t\t"+ gajiPokok);
			System.out.println("T. Istri/Suami\t\t"+tunjanganPasangan);
			System.out.println("T. Anak\t\t\t"+tunjanganAnak);
			System.out.println("T. Umum\t\t\t" +tunjanganUmum);
			System.out.println("T.TA. Umum\t\t" +tunjanganTaUmum);
			System.out.println("T. Papua\t\t" +tunjanganPapua);
			System.out.println("T. Terpencil\t\t" +tunjanganTerpencil);
			System.out.println("T. Struktur\t\t" +tunjanganStruktur);
			System.out.println("T. Fungsional\t\t" +tunjanganFungsi);
			System.out.println("T. Lain\t\t\t" +tunjanganLainI);
			System.out.println("T. Beras\t\t" +tunjanganBeras);
			System.out.println("T. Pajak\t\t" +tunjanganPajak);
			System.out.println("==================================");
			System.out.println("juml. Kotor\t\t" +penghasilanKotorBulan);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("PotBeras\t\t" +potBeras);
			System.out.println("IWP\t\t\t" +iuranWajibPegawai);
			System.out.println("Pot. PPh\t\t" +tunjanganPajak);
			System.out.println("Sewa Rmh\t\t" +sewaRumahI);
			System.out.println("Tunggakan\t\t" +tunggakanIn);
			System.out.println("Utang\t\t\t" +hutang);
			System.out.println("Pot. Lain\t\t" +potLain);
			System.out.println("Taperum\t\t\t" +taperum);
			System.out.println("==================================");
			System.out.println("jml Pot\t\t\t" +jumlahPotongan);
			System.out.println();
			System.out.println("jml. Bersih\t\t"+jumlahBersih);





		}
	}