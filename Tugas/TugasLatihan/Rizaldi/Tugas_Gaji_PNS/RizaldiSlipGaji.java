/*
 * File           : RizaldiSlipGaji.java
 * Project Name   : Tugas_Gaji_PNS
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_Gaji_PNS
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Thursday, 24th May 2018 1:20:41 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 28th May 2018 7:43:37 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class RizaldiSlipGaji{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Scanner keybline=new Scanner (System.in);
        Random rand = new Random();

        String nip, name, periode, group, isStructural, isFunctional, isPublic, locOfficial, isMarried, isOtherSubsidy,
        strQtyChild, strValOtherSubsidy, strHouseRentVal, isHouseRent, isDebt, strDebtVal, isOtherCut, strOtherCutVal,
        eselon, eduBackground, isCoupleWork, isChild, isAddingFamily, descOtherSubsidy;

        Boolean structural, functional, fublic, sma, sarjana, checkEselon, jab1, jab2, jab3,// validasi untuk jabatan
        checkMarried, checkJandaDuda, checkCoupleWork, checkCoupleNoWork, checkCoupleSalary, checkChild, checkNoChild, checkQtyChild,// validasi untuk status menikah, punya anak, dan penghasilan pasangan
        checkRent, checkNoRent, checkValHouseRent, checkDebt, checkNoDebt, checkValDebt, checkOtherCut, checkNoOtherCut, checkValOtherCut,// validasi untuk input potongan
        checkOtherSubsidy, checkNoOtherSubsody, checkDescOtherSubsidy, checkValOtherSubsidy,// validasi untuk inputan tunjangan lainnya
        checkAddingFamily, checkQtyAddingFamily, checkNoAddingFamily,// validasi untuk tambahan anggota keluarga
        checkNip, checkName, checkPeriode, checkGroup, checkLoc;
        
        Double doublePeriode, coupleSalary, doubleQtyChild, qtyAddingFamily, doubleValOtherSubsidy, doubleValHousRent,
        doubleValDebt,doubleOtherCutVal, familySubsidy, childSubsidy, otherSubsidy, riceSubsidy, qtyFamily, qtyChild,
        houseRentCut, taperumCut, otherCut, iwp, totalNetto, totalCut, cleanSalary, ptkp, pkp, pph, nettoSalary,
        dirtSalary, pensiCut, res1, res2, res3, res4, wpPerson, wpMaried, wpChild;
                
        doubleValOtherSubsidy   =0.0;
        doubleValHousRent       =0.0;
        doubleOtherCutVal       =0.0;
        doubleQtyChild          =0.0;
        doublePeriode           =0.0;
        doubleValDebt           =0.0;
        familySubsidy           =0.0;
        childSubsidy            =0.0;
        otherSubsidy            =0.0;
        houseRentCut            =0.0;
        riceSubsidy             =0.0;
        cleanSalary             =0.0;
        nettoSalary             =0.0;
        dirtSalary              =0.0;
        taperumCut              =0.0;
        totalNetto              =0.0;
        qtyFamily               =0.0;
        qtyChild                =0.0;
        otherCut                =0.0;
        totalCut                =0.0;
        pensiCut                =0.0;
        wpPerson                =36000000.0;
        wpMaried                =0.0;
        wpChild                 =0.0;
        ptkp                    =0.0;
        iwp                     =0.0;
        pkp                     =0.0;
        pph                     =0.0;
        
        int number, primSalary, functionalSubsidy, papuaSubsidy, priceRiceKg, husWife, structuralSubsidy, fublicSubsidy,
        cekTunjangan, cekTunjStruk, cekTunjFung, cekTunjFub, cekSma, cekSarjana, cekPotRent, cekPotLain, valOtherSubsidy,
        valHouseRent, valDebt, valOtherCut;
        structuralSubsidy   =0;
        functionalSubsidy   =0;
        valOtherSubsidy     =0;
        qtyAddingFamily     =0.0;
        fublicSubsidy       =0;
        papuaSubsidy        =0;
        cekTunjangan        =0;
        cekTunjStruk        =0;
        priceRiceKg         =14000;
        cekTunjFung         =0;
        cekSarjana          =0;
        cekTunjFub          =0;
        cekPotRent          =0;
        cekPotLain          =0;
        primSalary          =0;
        husWife             =0;
        cekSma              =0;
        number              =0;
        //====================================================


        int[] 	arr1A   = {1486500, 1486500, 1533400, 1533400, 1581700, 1581700, 1631500, 1631500, 1682900, 1682900, 1735900, 1735900, 1790500, 1790500, 1846900, 1846900, 1905100, 1905100, 1965100, 1965100, 2027000, 2027000, 2090800, 2090800, 2156700, 2156700, 2224600, 2224600},
				arr1B   = {0, 0, 0, 1623400, 1623400, 1674500, 1674500, 1727300, 1727300, 1781700, 1781700, 1837800, 1837800, 1895700, 1895700, 1955400, 1955400, 2016900, 2016900, 2080500, 2080500, 2146000, 2146000, 2213600, 2213600, 2283300, 2283300, 2355200},
				arr1C   = {0, 0, 0, 1692100, 1692100, 1745400, 1745400, 1800300, 1800300, 1857000, 1857000, 1915500, 1915500, 1975800, 1975800, 2038100, 2038100, 2102300, 2102300, 2168500, 2168500, 2236800, 2236800, 2307200, 2307200, 2379900, 2379900, 2454800},
				arr1D   = {0, 0, 0, 1763600, 1763600, 1819200, 1819200, 1876500, 1876500, 1935600, 1935600, 1996500, 1996500, 2059400, 2059400, 2124300, 2124300, 2191200, 2191200, 2260200, 2260200, 2331400, 2331400, 2404800, 2404800, 2480500, 2480500, 2558700},

				arr2A   = {1926000, 1956300, 1956300, 2017900, 2017900, 2081500, 2081500, 2147000, 2147000, 2214700, 2214700, 2284400, 2284400, 2356400, 2356400, 2430600, 2430600, 2507100, 2507100, 2586100, 2586100, 2667500, 2667500, 2751600, 2751600, 2838200, 2838200, 2927600, 2927600, 3019800, 3019800, 3114900, 3114900, 3213100},
				arr2B   = {0, 0, 0, 2103300, 2103300, 2169500, 2169500, 2237900, 2237900, 2308300, 2308300, 2381100, 2381100, 2456000, 2456000, 2533400, 2533400, 2613200, 2613200, 2695500, 2695500, 2780400, 2780400, 2867900, 2867900, 2958300, 2958300, 3051400, 3051400, 3147600, 3147600, 3246700, 3246700, 3348900},
				arr2C   = {0, 0, 0, 2192300, 2192300, 2261300, 2261300, 2332500, 2332500, 2406000, 2406000, 2481800, 2481800, 2559900, 2559900, 2640600, 2640600, 2723700, 2723700, 2809500, 2809500, 2898000, 2898000, 2989300, 2989300, 3083400, 3083400, 3180500, 3180500, 3280700, 3280700, 3384000, 3384000, 3490600},
				arr2D   = {0, 0, 0, 2285000, 2285000, 2357000, 2357000, 2431200, 2431200, 2507800, 2507800, 2586700, 2586700, 2668200, 2668200, 2752300, 2752300, 2838900, 2838900, 2928300, 2928300, 3020600, 3020600, 3115700, 3115700, 3213800, 3213800, 3315100, 3315100, 3419500, 3419500, 3527200, 3527200, 3638200},

				arr3A   = {2456700, 2456700, 2534000, 2534000, 2613800, 2613800, 2696200, 2696200, 2781100, 2781100, 2868700, 2868700, 2959000, 2959000, 3052200, 3052200, 3148300, 3148300, 3247500, 3247500, 3349800, 3349800, 3455300, 3455300, 3564100, 3564100, 3676400, 3676400, 3792100, 3792100, 3911600, 3911600, 4034800},
				arr3B   = {2560600, 2560600, 2641200, 2641200, 2724400, 2724400, 2810200, 2810200, 2898700, 2898700, 2990000, 2990000, 3084200, 3084200, 3181300, 3181300, 3281500, 3281500, 3384900, 3384900, 3491500, 3491500, 3601400, 3601400, 3714900, 3714900, 3831900, 3831900, 3952600, 3952600, 4007000, 4007000, 4205400},
				arr3C   = {2668900, 2668900, 2752900, 2752900, 2839700, 2839700, 2929100, 2929100, 3021300, 3021300, 3116500, 3116500, 3214700, 3214700, 3315900, 3315900, 3420300, 3420300, 3528100, 3528100, 3639200, 3639200, 3753800, 3753800, 3872000, 3872000, 3994200, 3994200, 4119700, 4119700, 4249500, 4249500, 4383300},
				arr3D   = {2781800, 2781800, 2869400, 2869400, 2959800, 2959800, 3053000, 3053000, 3149100, 3149100, 3248300, 3248300, 3350600, 3350600, 3456200, 3456200, 3565000, 3565000, 3677300, 3677300, 3912600, 3912600, 3912600, 3912600, 4035800, 4035800, 4162900, 4162900, 4294000, 4294000, 4429300, 4429300, 4568800},

				arr4A   = {2899500, 2899500, 2990800, 2990800, 3085000, 3085000, 3182100, 3182100, 3282400, 3282400, 3385700, 3385700, 3492400, 3492400, 3602400, 3602400, 3715800, 3715800, 3832800, 3832800, 3953600, 3953600, 4078100, 4078100, 4206500, 4206500, 4339000, 4339000, 4475700, 4475700, 4616600, 4616600, 4762000},
				arr4B   = {3022100, 3022100, 3117300, 3117300, 3215500, 3215500, 3316700, 3316700, 3421200, 3421200, 3528900, 3528900, 3640100, 3640100, 3754700, 3754700, 3873000, 3873000, 3995000, 3995000, 4120800, 4120800, 4250600, 4250600, 4384400, 4384400, 4522500, 4522500, 4665000, 4665000, 4811900, 4811900, 4963400},
				arr4C   = {3149900, 3149900, 3249100, 3249100, 3351500, 3351500, 3457000, 3457000, 3565900, 3565900, 3678200, 3678200, 3794100, 3794100, 3913600, 3913600, 4036800, 4036800, 4164000, 4164000, 4295100, 4295100, 4430400, 4430400, 4569900, 4569900, 4713800, 4713800, 4862300, 4862300, 5015400, 5015400, 5173400},
				arr4D   = {3283200, 3283200, 3386600, 3386600, 3493200, 3493200, 3603300, 3603300, 3716700, 3716700, 3833800, 3833800, 3954600, 3954600, 4079100, 4079100, 4207600, 4207600, 4340100, 4340100, 4476800, 4476800, 4617800, 4617800, 4763200, 4763200, 4913200, 4913200, 5068000, 5068000, 5227600, 5227600, 5392200},
				arr4E   = {3422100, 3422100, 3529800, 3529800, 3641000, 3641000, 3755700, 3755700, 3874000, 3874000, 3996000, 3996000, 4121800, 4121800, 4251600, 4251600, 4385600, 4385600, 4523700, 4523700, 4666100, 4666100, 4813100, 4813100, 4964700, 4964700, 5121100, 5121100, 5282300, 5282300, 5448700, 5448700, 5620300};


        // INPUT AND VALIDATING PROCESS ============================================================
        // =========================================================================================
                System.out.println("|===================================================================|");
                System.out.println("|                               Gaji                                |");
                System.out.println("|===================================================================|");
                System.out.println("|Penghasilan                                                        |");
                System.out.println("|===================================================================|");
                
                checkNip=true;
                do{// Validasi untuk inputan NIP 
                    System.out.print("|NIP (12-18)                        : ");
                    nip= keyboard.next();
                    if(nip.matches("([0-9])+")&&(nip.length()>=12&&nip.length()<=18)){
                        checkNip=true;
                    }
                    else{
                        checkNip=false;
                        System.out.println("Input harus angka dengan kisaran = 12-18 ! ");
                    }          
                }while(!checkNip);
                
                checkName=true;
                do{// validasi inputan Nama
                    System.out.print("|Nama Pegawai (32 char)             : ");
                    name= keybline.nextLine();
                    if(name.matches("([A-Z a-z,.])+")&&(name.length()<=32)){
                        checkName=true;
                    }
                    else{
                        checkName=false;
                        System.out.println("Input harus huruf max 32 karakter tidak boleh kosong ! ");
                    }
                }while(!checkName);
                
                checkGroup=true;
                do{// validasi inputan golongan
                    System.out.print("|Golongan (Gol I, II, III, IV)      : ");
                    group= keyboard.next();
                    if(group.matches("([1-3a-dA-D])+")||group.matches("([4a-eA-E])+")){
                        checkGroup=true;
                    }
                    else{
                        checkGroup=false;
                        System.out.println("Input harus benar !");
                        System.out.println("Golongan yang tersedia : ");
                        System.out.println("1A 1B 1C 1D");
                        System.out.println("2A 2B 2C 2D");
                        System.out.println("3A 3B 3C 3D");
                        System.out.println("4A 4B 4C 4D 4E");
                    }
                }while(!checkGroup);        
                
                checkPeriode=true;
                do{// validasi inputan masa kerja
                    System.out.print("|Masa Kerja                         : ");
                    periode= keyboard.next();
                    if(periode.matches("([0-9])+")){
                        if(Double.parseDouble(periode)>32){
                            checkPeriode=true;
                            periode=Double.toString(32);
                        }
                        else{
                            checkPeriode=true;
                        }
                    }
                    else{
                        System.out.println("Input harus angka ! ");
                    }
                    doublePeriode=Double.parseDouble(periode);// variable ini menyimpan masa kerja dalam double !!!
                }while(!checkPeriode);
                
                structural=true;    functional=true;    fublic=true;
                do{// Validasi untuk inputan Strutural, Fungsional, atau Umuum
                    System.out.print("|Jabatan Struktural (Ya/Tidak)      : ");
                    isStructural= keyboard.next();            
                    if(isStructural.matches("([yaYA])+")){// jika pilih struktural
                        cekTunjStruk=1;
                        structural=true;
                        functional=false;
                        fublic=false;
                        System.out.println("    > Jabatan anda PNS Struktural !!!"); 
                        checkEselon=true;
                        do{
                            System.out.print("| - Masukkan Eselon                    : ");
                            eselon= keyboard.next();
                            if(eselon.matches("([1-4a-bA-B])+")||eselon.matches("([5aA])+")){
                                checkEselon=true;
                            }
                            else{
                                checkEselon=false;
                                System.out.println("Input harus benar !");
                            }
                        }while(!checkEselon);
                    }
                    else if(isStructural.matches("([tidakTIDAK])+")){
                        // functional=true;
                        do{
                            System.out.print  ("|Jabatan Fungsional (Ya/Tidak)      : ");
                            isFunctional       = keyboard.next();
                            if(isFunctional.matches("([yaYA])+")){// jika pilih fungsional
                                cekTunjFung=1;
                                functional=true;
                                structural=false;
                                fublic=false;
                                // structural=true;
                                sarjana=true;
                                sma=true;
                                System.out.println("    > Jabatan anda PNS Fungsional !!!");
                                do{
                                    System.out.print("| - Masukkan Latar Pendidikan (SMA/Sarjana) :");
                                    eduBackground       = keyboard.next();
                                    if(eduBackground.matches("([smakpSMAKP])+")){// jika pilih sma/smk
                                        cekSma=1;
                                        sma=true;
                                        sarjana=false;
                                        System.out.println("    > Latar Pendidikan Anda SMA !!!");
                                    }
                                    else if(eduBackground.matches("([sarjanaSARJANA])+")){// jika pilih sarjana
                                        cekSarjana=1;
                                        sarjana=true;
                                        sma=false;
                                        System.out.println("    > Latar Pendidikan Anda Sarjana !!!");
                                    }
                                    else{
                                        sma=false;
                                        sarjana=false;
                                        System.out.println("Input harus benar !");
                                    }
                                }while(!sma&&!sarjana);
                            }
                            else if(isFunctional.matches("([tidakTIDAK])+")){
                                // fublic=true;
                                do{
                                    System.out.print  ("|Jabatan Umum (Ya/Tidak)            : ");
                                    isPublic       = keyboard.next();
                                    if(isPublic.matches("([yaYA])+")){// jika pilih jabatan PNS umum
                                        cekTunjFub=1;
                                        fublic=true;
                                        functional=false;
                                        structural=false;
                                        System.out.println("    > Jabatan anda PNS Umum !!!");
                                    }
                                    else{
                                        fublic=false;
                                        System.out.println("Input harus benar ! ");
                                    }
                                }while(!fublic&&!structural&&!functional);
                            }
                            else{
                                functional=false;
                                System.out.println("Input harus Ya/Tidak !");
                            }
                        }while(!functional&&!fublic&&!structural);
                    }
                    else{
                        structural=false;
                        System.out.println("Input harus Ya/Tidak !");
                    }
                }while(!structural&&!functional&&!fublic);

                checkLoc=true;
                do{// validasi untuk inputan lokasi dinas
                    System.out.print  ("|Lokasi Dinas                       : ");
                    locOfficial         = keybline.nextLine();
                    if(locOfficial.matches("([A-Z a-z])+")&&(name.length()<=32)){
                        checkLoc=true;
                    }
                    else{
                        checkLoc=false;
                        System.out.println("Input harus huruf ! ");
                    }
                }while(!checkLoc);

                checkMarried=true; checkJandaDuda=true; cekTunjangan=0;
                do{// validasi untuk inputan status menikah
                    System.out.print  ("|Status Menikah (Ya/Tidak)          : ");
                    isMarried           = keyboard.next();
                    if(isMarried.matches("([yaYA])+")){// jika menikah ya
                        cekTunjangan=1;
                        checkMarried=true;
                        checkJandaDuda=false;

                        checkCoupleWork=true;
                        checkCoupleNoWork=true;
                        do{ // ditanya penghasilan pasangan
                            System.out.print  ("|Pasangan Anda Bekerja ? (Ya/Tidak) : ");
                            isCoupleWork        = keyboard.next();
                            if(isCoupleWork.matches("([yaYA])+")){// jika pasangan bekerja
                                checkCoupleWork=true;
                                checkCoupleNoWork=false;
                                checkCoupleSalary=true;
                                do{
                                    System.out.print  ("|Berapa Penghasilan Pasangan Anda   : ");
                                    coupleSalary        = keyboard.nextDouble();
                                    if(coupleSalary>=0.0){
                                        checkCoupleSalary=true;
                                    }
                                    else{
                                        checkCoupleSalary=false;
                                        System.out.println("Input harus angka dan lebih dari 0! ");
                                    }                          
                                }while(!checkCoupleSalary);
                            }
                            else if(isCoupleWork.matches("([tidakTIDAK])+")){// jika pasangan tidak bekerja
                                checkCoupleNoWork=true;
                                checkCoupleWork=false;
                                System.out.println("    > Pasangan anda tidak bekerja !!!");
                            }
                            else{
                                checkCoupleWork=false;
                                checkCoupleNoWork=false;
                                System.out.println("Input harus benar ! ");
                            }
                        }while(!checkCoupleWork&&!checkCoupleNoWork);

                        checkChild=true;
                        checkNoChild=true;
                        do{ // ditanya punya anak untuk status menikah
                            System.out.print  ("|Anda Punya Anak ? (Ya/Tidak)       : ");
                            isChild             = keyboard.next();
                            if(isChild.matches("([yaYA])+")){
                                checkChild=true;
                                checkNoChild=false;

                                checkQtyChild=true;
                                do{
                                    System.out.print  ("|Berapa Jumlah Anak Anda            : ");
                                    strQtyChild         = keyboard.next();
                                    if(strQtyChild.matches("([0-9])+")){
                                        Double.parseDouble(strQtyChild);
                                        checkQtyChild=true;                                
                                    }
                                    else{
                                        checkQtyChild=false;
                                        System.out.println("Input harus angka dan lebih dari 0! ");
                                    }
                                    doubleQtyChild=Double.parseDouble(strQtyChild);// variable ini menyimpan data jumlah anak dalam double !!!
                                }while(!checkQtyChild);
                            }
                            else if(isChild.matches("([tidakTIDAK])+")){
                                checkNoChild=true;
                                checkChild=false;
                                System.out.println("    > Anda Tidak Punya Anak !!!");
                            }
                            else{
                                checkChild=false;
                                checkNoChild=false;
                                System.out.println("Input harus benar ! ");
                            }
                            
                        }while(!checkChild&&!checkNoChild);
                    }
                    else if(isMarried.matches("([tidakTIDAK])+")){// jika menikah tidak
                        cekTunjangan=0;
                        checkJandaDuda=true;
                        checkMarried=false;
                        System.out.println("    > Status Anda Jomblo !!!");

                        do{ // ditanya punya anak untuk status janda
                            System.out.print  ("|Anda Punya Anak ? (Ya/Tidak)       : ");
                            isChild             = keyboard.next();
                            if(isChild.matches("([yaYA])+")){
                                checkChild=true;
                                checkNoChild=false;

                                checkQtyChild=true;
                                do{
                                    System.out.print  ("|Berapa Jumlah Anak Anda            : ");
                                    strQtyChild         = keyboard.next();
                                    if(strQtyChild.matches("([0-9])+")){
                                        Double.parseDouble(strQtyChild);
                                        checkQtyChild=true;                                
                                    }
                                    else{
                                        checkQtyChild=false;
                                        System.out.println("Input harus angka dan lebih dari 0! ");
                                    }
                                    doubleQtyChild=Double.parseDouble(strQtyChild);// variable ini menyimpan data jumlah anak dalam double !!!
                                }while(!checkQtyChild);
                            }
                            else if(isChild.matches("([tidakTIDAK])+")){
                                checkNoChild=true;
                                checkChild=false;
                                System.out.println("    > Anda Tidak Punya Anak !!!");
                            }
                            else{
                                checkChild=false;
                                checkNoChild=false;
                                System.out.println("Input harus benar ! ");
                            }
                            
                        }while(!checkChild&&!checkNoChild);
                    }
                    else{// jika jawaban ngaco looping terus
                        checkMarried=false;
                        checkJandaDuda=false;
                        System.out.println("Input harus benar ! ");
                    }
                }while(!checkMarried&&!checkJandaDuda);

                checkAddingFamily=true;
                checkNoAddingFamily=true;
                do{// validasi untuk inputan tambahan anggota keluarga
                    System.out.print  ("|Tambahan Anggota Keluarga (Ya/Tidak)       : ");
                    isAddingFamily      = keyboard.next();
                    if(isAddingFamily.matches("([yaYA])+")){// jika tambahan keluarga ya
                        checkAddingFamily=true;
                        checkNoAddingFamily=false;

                        checkQtyAddingFamily=true;
                        do{
                            System.out.print  ("|Berapa jumlah anggota tambahan     : ");
                            qtyAddingFamily     = keyboard.nextDouble();
                            if(qtyAddingFamily>=0.0){
                                checkQtyAddingFamily=true;
                            }
                            else{
                                checkQtyAddingFamily=false;
                            }

                        }while(!checkQtyAddingFamily);
                    }
                    else if(isAddingFamily.matches("([tidakTIDAK])+")){// jika tambahan keluarga tidak
                        checkNoAddingFamily=true;
                        checkAddingFamily=false;
                        System.out.println("    > Anda tidak punya tambahan anggota keluarga ! ");
                    }
                    else{// jika jawaban ngaco akan terus di looping
                        checkAddingFamily=false;
                        checkNoAddingFamily=false;
                        System.out.println("Input harus benar ! ");
                    }

                }while(!checkAddingFamily&&!checkNoAddingFamily);

                checkOtherSubsidy=true;
                checkNoOtherSubsody=true;
                do{// validasi untuk inputan tunjangan lainnya
                    System.out.print  ("|Tunjangan Lain (Ya/Tidak)          : ");
                    isOtherSubsidy      = keyboard.next();
                    if(isOtherSubsidy.matches("([yaYA])+")){// jika tunjangan lainnya ya
                        checkOtherSubsidy=true;
                        checkNoOtherSubsody=false;

                        checkDescOtherSubsidy=true; 
                        checkValOtherSubsidy=true;
                        do{
                            System.out.print  ("|Sebutkan deskripsi Tunjangan lain-lain     : ");
                            descOtherSubsidy    = keybline.nextLine();                    
                            System.out.print  ("|Sebutkan jumlah Tunjangan lain-lain     : ");
                            strValOtherSubsidy  = keyboard.next();
                            if(strValOtherSubsidy.matches("([0-9])+")){
                                checkValOtherSubsidy=true;
                                Double.parseDouble(strValOtherSubsidy);
                            }
                            else{
                                checkValOtherSubsidy=false;
                                System.out.println("Input harus angka minimum nilai 0 ! ");
                            }
                            doubleValOtherSubsidy=Double.parseDouble(strValOtherSubsidy);// variable ini menyimpan nilai tunjangan lain-lain dalam bentuk double
                        }while(!checkValOtherSubsidy);
                    }
                    else if(isOtherSubsidy.matches("([tidakTIDAK])+")){// jika tunjangan lainnya tidak
                        checkNoOtherSubsody=true;
                        checkOtherSubsidy=false;
                        System.out.println("    > Anda tidak punya tunjangan lainnya ! ");
                    }
                    else{// jika inputan ngaco akan terus dilooping
                        checkOtherSubsidy=false;
                        checkNoOtherSubsody=false;
                        System.out.println("Input harus benar ! ");
                    }
                }while(!checkOtherSubsidy&&!checkNoOtherSubsody);

                System.out.println("|===================================================================|");
                System.out.println("|Potongan                                                           |");
                System.out.println("|===================================================================|");
                
                checkRent=true;
                checkNoRent=true;
                do{// validasi untuk inputan potongan sewa rumah
                    System.out.print  ("|Sewa Rumah                         : ");
                    isHouseRent         = keyboard.next();
                    if(isHouseRent.matches("([yaYA])+")){
                        cekPotRent=1;
                        checkRent=true;
                        checkNoRent=false;

                        checkValHouseRent=true;
                        do{
                            System.out.print  ("|Sebutkan jumlah sewa rumah             : ");
                            strHouseRentVal     = keyboard.next();
                            if(strHouseRentVal.matches("([0-9])+")){
                                checkValHouseRent=true;
                                Double.parseDouble(strHouseRentVal);
                                
                            }
                            else{
                                checkValHouseRent=false;
                                System.out.println("Input harus angka minimum nilai 0 ! ");
                            }
                            doubleValHousRent=Double.parseDouble(strHouseRentVal);// variable ini berisi nilai sewa rumah dalam double
                        }while(!checkValHouseRent);
                    }
                    else if(isHouseRent.matches("([tidakTIDAK])+")){
                        cekPotRent=0;
                        checkNoRent=true;
                        checkRent=false;
                        System.out.println("    > Anda tidak sewa rumah ! ");
                    }
                    else{
                        checkRent=false;
                        checkNoRent=false;
                        System.out.println("Input harus benar ! ");
                    }    
                }while(!checkRent&&!checkNoRent);

                checkDebt=true;
                checkNoDebt=true;
                do{// validasi untuk inputan potongan utang
                    System.out.print  ("|Utang                              : ");
                    isDebt              = keyboard.next();
                    if(isDebt.matches("([yaYA])+")){
                        checkDebt=true;
                        checkNoDebt=false;
                        checkValDebt=false;
                        do{
                            System.out.print  ("|Sebutkan jumlah utang                  : ");
                            strDebtVal          = keyboard.next();
                            if(strDebtVal.matches("([0-9])+")){
                                checkValDebt=true;
                                Double.parseDouble(strDebtVal);
                            }
                            else{
                                checkValDebt=false;
                                System.out.println("Input harus angka minimum nilai 0 ! ");
                            }
                            doubleValDebt=Double.parseDouble(strDebtVal);// varable ini berisi nilai utang dalam double
                        }while(!checkValDebt);
                    }
                    else if(isDebt.matches("([tidakTIDAK])+")){
                        checkNoDebt=true;
                        checkDebt=false;
                        System.out.println("    > Anda tidak punya utang ! ");
                    }
                    else{
                        checkDebt=false;
                        checkNoDebt=false;
                        System.out.println("Input harus benar ! ");
                    }
                }while(!checkDebt&&!checkNoDebt);

                checkOtherCut=true;
                checkNoOtherCut=true;
                do{// validasi untuk inputan potongan lain- lain
                    System.out.print  ("|Potongan Lain-Lain                 : ");
                    isOtherCut            = keyboard.next();
                    if(isOtherCut.matches("([yaYA])+")){
                        cekPotLain=1;
                        checkOtherCut=true;
                        checkNoOtherCut=false;
                        checkValOtherCut=false;
                        do{
                            System.out.print  ("|Sebutkan jumlah Potongan Lain-lain     : ");
                            strOtherCutVal      = keyboard.next();
                            if(strOtherCutVal.matches("([0-9])+")){
                                checkValOtherCut=true;
                                Double.parseDouble(strOtherCutVal);
                            }
                            else{
                                checkValOtherCut=false;
                                System.out.println("Input harus angka minimum nilai 0 ! ");
                            }
                            doubleOtherCutVal=Double.parseDouble(strOtherCutVal);// variable ini berisi nilai potongan lain lain dalam bentuk daouble
                        }while(!checkValOtherCut);
                    }
                    else if(isOtherCut.matches("([tidakTIDAK])+")){
                        cekPotLain=0;
                        checkNoOtherCut=true;
                        checkOtherCut=false;
                        System.out.println("    > Anda tidak punya Potongan lain- lain ! ");
                    }
                    else{
                        checkOtherCut=false;
                        checkNoOtherCut=false;
                        System.out.println("Input harus benar ! ");
                    }
                }while(!checkOtherCut&&!checkNoOtherCut);

                System.out.println("|===================================================================|");

        // END OF INPUT AND VALIDATING PROCESS =====================================================
        // =========================================================================================


        // OPERATION PROCESS =======================================================================
        // =========================================================================================
            // PROCESS Untuk Gaji Pokok sesuai Golongan
            // =====================================================================================
                    // Pemisahahan golongan agar bisa dipanggil sesuai masa jabatan nantinya
                    if(group.substring(0,1).equals("1")){
                        if(group.substring(1,2).equals("A")||group.substring(1,2).equals("a")){
                            number=arr1A.length-1;                
                        }
                        else if(group.substring(1,2).equals("B")||group.substring(1,2).equals("b")){
                            number=arr1B.length-1;                
                        }
                        else if(group.substring(1,2).equals("C")||group.substring(1,2).equals("c")){
                            number=arr1C.length-1;
                        }
                        else if(group.substring(1,2).equals("D")||group.substring(1,2).equals("d")){
                            number=arr1D.length-1;
                        }
                    }
                    else if(group.substring(0,1).equals("2")){
                        if(group.substring(1,2).equals("A")||group.substring(1,2).equals("a")){
                            number=arr2A.length-1;                
                        }
                        else if(group.substring(1,2).equals("B")||group.substring(1,2).equals("b")){
                            number=arr2B.length-1;                
                        }
                        else if(group.substring(1,2).equals("C")||group.substring(1,2).equals("c")){
                            number=arr2C.length-1;
                        }
                        else if(group.substring(1,2).equals("D")||group.substring(1,2).equals("d")){
                            number=arr2D.length-1;
                        }
                    }
                    else if(group.substring(0,1).equals("3")){
                        if(group.substring(1,2).equals("A")||group.substring(1,2).equals("a")){
                            number=arr3A.length-1;                
                        }
                        else if(group.substring(1,2).equals("B")||group.substring(1,2).equals("b")){
                            number=arr3B.length-1;                
                        }
                        else if(group.substring(1,2).equals("C")||group.substring(1,2).equals("c")){
                            number=arr3C.length-1;
                        }
                        else if(group.substring(1,2).equals("D")||group.substring(1,2).equals("d")){
                            number=arr3D.length-1;
                        }
                    }
                    else if(group.substring(0,1).equals("4")){
                        if(group.substring(1,2).equals("A")||group.substring(1,2).equals("a")){
                            number=arr4A.length-1;                
                        }
                        else if(group.substring(1,2).equals("B")||group.substring(1,2).equals("b")){
                            number=arr4B.length-1;                
                        }
                        else if(group.substring(1,2).equals("C")||group.substring(1,2).equals("c")){
                            number=arr4C.length-1;
                        }
                        else if(group.substring(1,2).equals("D")||group.substring(1,2).equals("d")){
                            number=arr4D.length-1;
                        }
                    }
                    // pengisian variabel gaji pokok berdasar array yang dipanggil oleh masa kerja
                    if(group.substring(0,1).equals("1")){
                        if(group.substring(1,2).equals("A")||group.substring(1,2).equals("a")){
                            primSalary=arr1A[Integer.parseInt(periode)];
                        }
                        else if(group.substring(1,2).equals("B")||group.substring(1,2).equals("b")){
                            primSalary=arr1B[Integer.parseInt(periode)];
                        }
                        else if(group.substring(1,2).equals("C")||group.substring(1,2).equals("c")){
                            primSalary=arr1C[Integer.parseInt(periode)];
                        }
                        else if(group.substring(1,2).equals("D")||group.substring(1,2).equals("d")){
                            primSalary=arr1D[Integer.parseInt(periode)];
                        }
                    }
                    else if(group.substring(0,1).equals("2")){
                        if(group.substring(1,2).equals("A")||group.substring(1,2).equals("a")){
                            primSalary=arr2A[Integer.parseInt(periode)];
                        }
                        else if(group.substring(1,2).equals("B")||group.substring(1,2).equals("b")){
                            primSalary=arr2B[Integer.parseInt(periode)];
                        }
                        else if(group.substring(1,2).equals("C")||group.substring(1,2).equals("c")){
                            primSalary=arr2C[Integer.parseInt(periode)];
                        }
                        else if(group.substring(1,2).equals("D")||group.substring(1,2).equals("d")){
                            primSalary=arr2D[Integer.parseInt(periode)];
                        }
                    }
                    else if(group.substring(0,1).equals("3")){
                        if(group.substring(1,2).equals("A")||group.substring(1,2).equals("a")){
                            primSalary=arr3A[Integer.parseInt(periode)];
                        }
                        else if(group.substring(1,2).equals("B")||group.substring(1,2).equals("b")){
                            primSalary=arr3B[Integer.parseInt(periode)];
                        }
                        else if(group.substring(1,2).equals("C")||group.substring(1,2).equals("c")){
                            primSalary=arr3C[Integer.parseInt(periode)];
                        }
                        else if(group.substring(1,2).equals("D")||group.substring(1,2).equals("d")){
                            primSalary=arr3D[Integer.parseInt(periode)];
                        }
                    }
                    else if(group.substring(0,1).equals("4")){
                        if(group.substring(1,2).equals("A")||group.substring(1,2).equals("a")){
                            primSalary=arr4A[Integer.parseInt(periode)];
                        }
                        else if(group.substring(1,2).equals("B")||group.substring(1,2).equals("b")){
                            primSalary=arr4B[Integer.parseInt(periode)];
                        }
                        else if(group.substring(1,2).equals("C")||group.substring(1,2).equals("c")){
                            primSalary=arr4C[Integer.parseInt(periode)];
                        }
                        else if(group.substring(1,2).equals("D")||group.substring(1,2).equals("d")){
                            primSalary=arr4D[Integer.parseInt(periode)];
                        }
                    }
            // PROCESS Untuk tunjangan keluarga
            // =====================================================================================
                    if(cekTunjangan>0){
                        familySubsidy=primSalary*10.0/100.0;
                    }
                    else if(cekTunjangan==0){
                        familySubsidy=0.0;
                    }
                    else{
                        System.out.println("Terjadi kesalahan data !!!");
                    }
            // PROCESS Untuk tunjangan Anak
            // =====================================================================================
                    qtyChild=doubleQtyChild;
                    if(qtyChild>2.0){
                        qtyChild=2.0;
                    }
                    childSubsidy=qtyChild*((primSalary*2)/100);
            // PROCESS Untuk tunjangan papua
            // =====================================================================================
                    if(locOfficial.equals("papua")||locOfficial.equals("PAPUA")||locOfficial.equals("Papua")){
                        if(group.substring(0,1).equals("1")){
                            if(group.substring(1,2).equals("A")||group.substring(1,2).equals("a")){
                                papuaSubsidy=arr1A[Integer.parseInt(periode)];
                            }
                            else if(group.substring(1,2).equals("B")||group.substring(1,2).equals("b")){
                                papuaSubsidy=arr1B[Integer.parseInt(periode)];
                            }
                            else if(group.substring(1,2).equals("C")||group.substring(1,2).equals("c")){
                                papuaSubsidy=arr1C[Integer.parseInt(periode)];
                            }
                            else if(group.substring(1,2).equals("D")||group.substring(1,2).equals("d")){
                                papuaSubsidy=arr1D[Integer.parseInt(periode)];
                            }
                        }
                        else if(group.substring(0,1).equals("2")){
                            if(group.substring(1,2).equals("A")||group.substring(1,2).equals("a")){
                                papuaSubsidy=arr2A[Integer.parseInt(periode)];
                            }
                            else if(group.substring(1,2).equals("B")||group.substring(1,2).equals("b")){
                                papuaSubsidy=arr2B[Integer.parseInt(periode)];
                            }
                            else if(group.substring(1,2).equals("C")||group.substring(1,2).equals("c")){
                                papuaSubsidy=arr2C[Integer.parseInt(periode)];
                            }
                            else if(group.substring(1,2).equals("D")||group.substring(1,2).equals("d")){
                                papuaSubsidy=arr2D[Integer.parseInt(periode)];
                            }
                        }
                        else if(group.substring(0,1).equals("3")){
                            if(group.substring(1,2).equals("A")||group.substring(1,2).equals("a")){
                                papuaSubsidy=arr3A[Integer.parseInt(periode)];
                            }
                            else if(group.substring(1,2).equals("B")||group.substring(1,2).equals("b")){
                                papuaSubsidy=arr3B[Integer.parseInt(periode)];
                            }
                            else if(group.substring(1,2).equals("C")||group.substring(1,2).equals("c")){
                                papuaSubsidy=arr3C[Integer.parseInt(periode)];
                            }
                            else if(group.substring(1,2).equals("D")||group.substring(1,2).equals("d")){
                                papuaSubsidy=arr3D[Integer.parseInt(periode)];
                            }
                        }
                        else if(group.substring(0,1).equals("4")){
                            if(group.substring(1,2).equals("A")||group.substring(1,2).equals("a")){
                                papuaSubsidy=arr4A[Integer.parseInt(periode)];
                            }
                            else if(group.substring(1,2).equals("B")||group.substring(1,2).equals("b")){
                                papuaSubsidy=arr4B[Integer.parseInt(periode)];
                            }
                            else if(group.substring(1,2).equals("C")||group.substring(1,2).equals("c")){
                                papuaSubsidy=arr4C[Integer.parseInt(periode)];
                            }
                            else if(group.substring(1,2).equals("D")||group.substring(1,2).equals("d")){
                                papuaSubsidy=arr4D[Integer.parseInt(periode)];
                            }
                        }
                    }
            // PROCESS Untuk tunjangan struktural, fungsional atau umum :
            // =====================================================================================
                    if(cekTunjStruk>0){// harusnya berdasar eselon tapi eselon tidak bisa dipanggil isi variablenya !!!
                        if(group.equals("1a")||group.equals("1A")){
                            structuralSubsidy=5500000;
                        }
                        else if(group.equals("1b")||group.equals("1B")){
                            structuralSubsidy=4375000;
                        }
                        else if(group.equals("2a")||group.equals("2A")){
                            structuralSubsidy=3250000;
                        }
                        else if(group.equals("2b")||group.equals("2B")){
                            structuralSubsidy=2025000;
                        }
                        else if(group.equals("3a")||group.equals("3A")){
                            structuralSubsidy=1260000;
                        }
                        else if(group.equals("3b")||group.equals("3B")){
                            structuralSubsidy=980000;
                        }
                        else if(group.equals("4a")||group.equals("4A")){
                            structuralSubsidy=540000;
                        }
                        else if(group.equals("4b")||group.equals("4B")){
                            structuralSubsidy=480000;
                        }
                        else if(group.equals("5a")||group.equals("5B")){
                            structuralSubsidy=360000;
                        }
                        else{
                            structuralSubsidy=0;
                        }
                    }
                    else if(cekTunjFung>0){
                        if(cekSma>0){
                            if(group.equals("2a")||group.equals("2A")){
                                functionalSubsidy=300000;
                            }
                            else if((group.equals("2b")||group.equals("2B"))||(group.equals("2c")||group.equals("2C"))||(group.equals("2d")||group.equals("2D"))){
                                functionalSubsidy=400000;
                            }
                            else if((group.equals("3a")||group.equals("3A"))||(group.equals("3b")||group.equals("3B"))){
                                functionalSubsidy=500000;
                            }
                            else if((group.equals("3c")||group.equals("3C"))||(group.equals("3d")||group.equals("3D"))){
                                functionalSubsidy=600000;
                            }
                            else{
                                functionalSubsidy=0;
                            }
                        }
                        else if(cekSarjana>0){
                            if((group.equals("3a")||group.equals("3A"))||(group.equals("3b")||group.equals("3B"))){
                                functionalSubsidy=700000;
                            }
                            else if((group.equals("3c")||group.equals("3C"))||(group.equals("3d")||group.equals("3D"))){
                                functionalSubsidy=800000;
                            }
                            else if((group.equals("4a")||group.equals("4A"))||(group.equals("4b")||group.equals("4B"))||(group.equals("4c")||group.equals("4C"))){
                                functionalSubsidy=900000;
                            }
                            else if((group.equals("4d")||group.equals("4D"))||(group.equals("4e")||group.equals("4E"))){
                                functionalSubsidy=1000000;
                            }
                            else{
                                functionalSubsidy=0;
                            }
                        }
                        else{
                            functionalSubsidy=0;
                        }
                    }
                    else if(cekTunjFub>0){            
                        if(group.substring(0,1).equals("1")){
                            fublicSubsidy=175000;
                        }
                        else if(group.substring(0,1).equals("2")){
                            fublicSubsidy=180000;
                        }
                        else if(group.substring(0,1).equals("3")){
                            fublicSubsidy=185000;
                        }
                        else if(group.substring(0,1).equals("4")){
                            fublicSubsidy=190000;
                        }
                        else{
                            fublicSubsidy=0;
                        }
                    }
                    else{
                        System.out.println("Terjadi kesalahan data jabatan!!!");
                    }
            // PROCESS Untuk tunjangan Lain-Lain
            // =====================================================================================
                    otherSubsidy=doubleValOtherSubsidy;
            // PROCESS Untuk tunjangan beras
            // =====================================================================================
                    if(cekTunjangan>0){
                        husWife=2;
                    }else{
                        husWife=1;
                    }
                    qtyFamily=doubleQtyChild+qtyAddingFamily+husWife;
                    riceSubsidy=qtyFamily*(priceRiceKg*10);        
            // PROCESS Untuk potongan sewa rumah
            // =====================================================================================
                    if(cekPotRent>0){
                        houseRentCut=doubleValHousRent;
                    }
                    else{
                        houseRentCut=0.0;
                    }
            // PROCESS Untuk potongan taperum
            // =====================================================================================
                    if(group.substring(0,1).equals("1")){
                        taperumCut=3000.0;
                    }
                    else if(group.substring(0,1).equals("2")){
                        taperumCut=5000.0;
                    }
                    else if(group.substring(0,1).equals("3")){
                        taperumCut=7000.0;
                    }
                    else if(group.substring(0,1).equals("4")){
                        taperumCut=10000.0;
                    }
                    else{
                        taperumCut=0.0;
                    }
            // PROCESS Untuk potongan Lain-lain
            // =====================================================================================
                    if(checkValOtherCut=true){
                        otherCut=doubleOtherCutVal;
                    }
                    else{
                        otherCut=0.0;
                    }
            // PROCESS Untuk potongan IWP
            // =====================================================================================
                    iwp=(primSalary+familySubsidy+childSubsidy)*10/100;
            // PROCESS Untuk potongan PPH
            // =====================================================================================
                    // prnghasilan kotor = gapok + all tunjangan
                    dirtSalary=(primSalary+familySubsidy+childSubsidy+papuaSubsidy+structuralSubsidy+functionalSubsidy+fublicSubsidy+otherSubsidy+riceSubsidy);
                    // potongan pensiun = (gapok + tunj keluarga + tunj anak)*4,75%
                    pensiCut=(primSalary+familySubsidy+childSubsidy)*4.75/100.0;
                    // netto salary = penghasilan kotor - potongan pensiun
                    nettoSalary=(dirtSalary-pensiCut)*12.0;
                    
                    if(cekTunjangan>0){
                        wpMaried=3000000.0;
                    }else{
                        wpMaried=0.0;
                    }
                    if(doubleQtyChild>0){
                        wpChild=doubleQtyChild*3000000.0;
                    }else{
                        wpChild=0.0;
                    }

                    ptkp=wpPerson+wpMaried+wpChild;// hitung PTKP
                    
                    pkp=nettoSalary-ptkp;// hitung pkp

                    // hitung pph
                    res1=0.0;
                    res2=0.0;
                    res3=0.0;
                    res4=0.0;
                    if(pkp>0&&pkp<=50000000.0){
                        pph=0.0;
                        pph=pkp*5.0/100.0;
                    }
                    else if(pkp>=50000000.0&&pkp<=250000000.0){
                        pph=0.0;
                        res1=50000000.0*5.0/100.0;
                        res2=(pkp-50000000.0)*15.0/100.0;
                        pph=res1+res2;
                    }
                    else if(pkp>=250000000.0&&pkp<=500000000.0){
                        pph=0.0;
                        res1=50000000.0*5.0/100.0;
                        res2=200000000.0*15.0/100.0;
                        res3=(pkp-50000000.0-200000000.0)*25.0/100.0;
                        pph=res1+res2+res3;
                    }
                    else if(pkp>500000000.0){
                        pph=0.0;
                        res1=50000000.0*5.0/100.0;
                        res2=200000000.0*15.0/100.0;
                        res3=250000000.0*25.0/100.0;
                        res4=(pkp-50000000.0-200000000.0-250000000.0)*30.0/100.0;
                        pph=res1+res2+res3+res4;
                    }
            // PROCESS Total Penghasilan
            // =====================================================================================
                    totalNetto=primSalary+familySubsidy+childSubsidy+papuaSubsidy+structuralSubsidy+functionalSubsidy+fublicSubsidy+otherSubsidy+riceSubsidy;
            // PROCESS Total Potongan
            // =====================================================================================
                    totalCut=houseRentCut+doubleValDebt+otherCut+taperumCut+pph;
            // PROCESS GAJI BERSIH
            // =====================================================================================
                    cleanSalary=totalNetto-totalCut;
        // END OPERATION PROCESS ===================================================================
        // =========================================================================================



        // PRINTING PROCESS ========================================================================
        // =========================================================================================
            System.out.println("\n");
            System.out.println("|===================================================================|");
            System.out.println("|HASIL PERHITUGNAN                                                  |");
            System.out.println("|===================================================================|");
            System.out.println("|Nama Pegawai               : "+name);// integer
            System.out.println("|NIP Pegawai                : "+nip);// integer
            System.out.println("|Jumlah Anak                : "+doubleQtyChild);// integer
            System.out.println("|Jumlah Tambahan Keluarga   : "+qtyAddingFamily);// integer
            System.out.println("|===================================================================|");
            System.out.println("|Penghasilan + + +                                                  |");
            System.out.println("|===================================================================|");
            System.out.println("|gaji pokok                 : "+primSalary);// integer
            System.out.println("|Tunj Keluarga              : "+familySubsidy);// double
            System.out.println("|Tunj Anak                  : "+childSubsidy);// double
            System.out.println("|Tunj Papua                 : "+papuaSubsidy);// integer
            System.out.println("|Tunj Struktural            : "+structuralSubsidy);// double
            System.out.println("|Tunj Fungsional            : "+functionalSubsidy);// double
            System.out.println("|Tunj Umum                  : "+fublicSubsidy);// double
            System.out.println("|Tunj Lain-lain             : "+otherSubsidy);// double
            // System.out.println("|Deskripsi Tunj Lain-lain   : "+descOtherSubsidy);
            System.out.println("|Tunj Beras                 : "+riceSubsidy);
            System.out.printf("|Tunj Pajak                 : %.2f",(pph/12.0));
            System.out.printf("\n");
            System.out.println("|+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
            System.out.printf("|Total Penghasilan          : %.2f",totalNetto);
            System.out.printf("\n");
            System.out.println("|===================================================================|");
            System.out.println("|Potongan - - -                                                     |");
            System.out.println("|===================================================================|");
            System.out.printf("|Potongan Sewa Rumah        : %.2f",houseRentCut);
            System.out.printf("\n");
            System.out.printf("|Potongan Utang             : %.2f",doubleValDebt);
            System.out.printf("\n");
            System.out.printf("|Potongan Lain-lain         : %.2f",otherCut);
            System.out.printf("\n");
            System.out.printf("|Potongan Taperum           : %.2f",taperumCut);
            System.out.printf("\n");
            System.out.printf("|Potongan IWP               : %.2f",iwp);
            System.out.printf("\n");
            // System.out.printf("|Potongan ptkp              : %.2f",ptkp);
            // System.out.printf("\n");
            // System.out.printf("|Potongan pkp               : %.2f",pkp);
            // System.out.printf("\n");
            System.out.printf("|Potongan Pajak             : %.2f",(pph/12.0));
            System.out.printf("\n");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.printf("|Total Potongan          : %.2f",totalCut);
            System.out.printf("\n");
            System.out.println("|===================================================================|");
            System.out.printf("|JUMLAH BERSIH           : %.2f",cleanSalary);
            System.out.printf("\n");
            System.out.println("|===================================================================|");
        // END OF  PRINTING PROCESS ================================================================
        // =========================================================================================

    }
}