/*
	 Program     : Soal 3 - Local Train Route 
     Creator     : Khairil
     Created At  : 16 Mei 2018 02:15 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class LocalTrainRoute {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputAsal, inputTujuan, kodeA, kodeB, kodeC, kodeD, kodeE, kodeF, kodeG, kodeH, kodeI, kodeJ, ccl, hrp, rck, cmk, gdb, kac, cth, bd, cry, cmd, cmi, gk, pdl;
		Boolean cclhrp, cclrck, cclcmk, cclgdb, cclkac, cclcth, cclbd, cclcry, cclcmd, cclcmi, cclgk, cclpdl, hrprck, hrpcmk, hrpgdb, hrpkac, hrpcth, hrpbd, hrpcry, hrpcmd, hrpcmi, hrpgk, hrppdl, rckcmk, rckgdb, rckkac, rckcth, rckbd, rckcry, rckcmd, rckcmi, rckgk, rckpdl, cmkgdb, cmkkac, cmkcth, cmkbd, cmkcry, cmkcmd, cmkcmi, cmkgk, cmkpdl, gdbkac, gdbcth, gdbbd, gdbcry, gdbcmd, gdbcmi, gdbgk, gdbpdl, kaccth, kacbd, kaccry, kaccmd, kaccmi, kacgk, kacpdl, cthbd, cthcry, cthcmd, cthcmi, cthgk, cthpdl, bdcry, bdcmd, bdcmi, bdgk, bdpdl, crycmd, crycmi, crygk, crypdl, cmdcmi, cmdgk, cmdpdl, cmigk, cmipdl, gkpdl, pdlgk, pdlcmi, pdlcmd, pdlcry, pdlbd, pdlcth, pdlkac, pdlgdb, pdlcmk, pdlrck, pdlhrp, pdlccl, gkcmi, gkcmd, gkcry, gkbd, gkcth, gkkac, gkgdb, gkcmk, gkrck, gkhrp, gkccl, cmicmd, cmicry, cmibd, cmicth, cmikac, cmigdb, cmicmk, cmirck, cmihrp, cmiccl, cmdcry, cmdbd, cmdcth, cmdkac, cmdgdb, cmdcmk, cmdrck, cmdhrp, cmdccl, crybd, crycth, crykac, crygdb, crycmk, cryrck, cryhrp, cryccl, bdcth, bdkac, bdgdb, bdcmk, bdrck, bdhrp, bdccl, cthkac, cthgdb, cthcmk, cthrck, cthhrp, cthccl, kacgdb, kaccmk, kacrck, kachrp, kacccl, gdbcmk, gdbrck, gdbhrp, gdbccl, cmkrck, cmkhrp, cmkccl, rckhrp, rckccl, hrpccl, rangeA, rangeB, rangeC, rangeD, rangeE, rangeF, rangeG, rangeH, rangeI, rangeJ; 

		System.out.println();
		System.out.println("CEK KODE TIKET ============================");
		System.out.print("Inputan Asal  : ");
		inputAsal = keyboard.next();
		System.out.print("Inputan Tujuan: ");
		inputTujuan = keyboard.next();

		ccl = "CCL"; hrp = "HRP"; rck = "RCK"; cmk = "CMK"; gdb = "GDB";
		kac = "KAC"; cth = "CTH"; bd = "BD"; cry = "CRY"; cmd = "CMD";
		cmi = "CMI"; gk = "GK"; pdl = "PDL";

		//asal CCL - PDL
		cclhrp = inputAsal.equals(ccl) && inputTujuan.equals(hrp); 
		cclrck = inputAsal.equals(ccl) && inputTujuan.equals(rck); 
		cclcmk = inputAsal.equals(ccl) && inputTujuan.equals(cmk);
		cclgdb = inputAsal.equals(ccl) && inputTujuan.equals(gdb);
		cclkac = inputAsal.equals(ccl) && inputTujuan.equals(kac);
		cclcth = inputAsal.equals(ccl) && inputTujuan.equals(cth);
		cclbd  = inputAsal.equals(ccl) && inputTujuan.equals(bd);
		cclcry = inputAsal.equals(ccl) && inputTujuan.equals(cry);
		cclcmd = inputAsal.equals(ccl) && inputTujuan.equals(cmd);
		cclcmi = inputAsal.equals(ccl) && inputTujuan.equals(cmi);
		cclgk  = inputAsal.equals(ccl) && inputTujuan.equals(gk);
		cclpdl = inputAsal.equals(ccl) && inputTujuan.equals(pdl);
		//asal HRP - PDL
		hrprck = inputAsal.equals(hrp) && inputTujuan.equals(rck); 
		hrpcmk = inputAsal.equals(hrp) && inputTujuan.equals(cmk);
		hrpgdb = inputAsal.equals(hrp) && inputTujuan.equals(gdb);
		hrpkac = inputAsal.equals(hrp) && inputTujuan.equals(kac);
		hrpcth = inputAsal.equals(hrp) && inputTujuan.equals(cth);
		hrpbd  = inputAsal.equals(hrp) && inputTujuan.equals(bd);
		hrpcry = inputAsal.equals(hrp) && inputTujuan.equals(cry);
		hrpcmd = inputAsal.equals(hrp) && inputTujuan.equals(cmd);
		hrpcmi = inputAsal.equals(hrp) && inputTujuan.equals(cmi);
		hrpgk  = inputAsal.equals(hrp) && inputTujuan.equals(gk);
		hrppdl = inputAsal.equals(hrp) && inputTujuan.equals(pdl);
		//asal RCK - PDL
		rckcmk = inputAsal.equals(rck) && inputTujuan.equals(cmk);
		rckgdb = inputAsal.equals(rck) && inputTujuan.equals(gdb);
		rckkac = inputAsal.equals(rck) && inputTujuan.equals(kac);
		rckcth = inputAsal.equals(rck) && inputTujuan.equals(cth);
		rckbd  = inputAsal.equals(rck) && inputTujuan.equals(bd);
		rckcry = inputAsal.equals(rck) && inputTujuan.equals(cry);
		rckcmd = inputAsal.equals(rck) && inputTujuan.equals(cmd);
		rckcmi = inputAsal.equals(rck) && inputTujuan.equals(cmi);
		rckgk  = inputAsal.equals(rck) && inputTujuan.equals(gk);
		rckpdl = inputAsal.equals(rck) && inputTujuan.equals(pdl);
		//asal CMK - PDL
		cmkgdb = inputAsal.equals(cmk) && inputTujuan.equals(gdb);
		cmkkac = inputAsal.equals(cmk) && inputTujuan.equals(kac);
		cmkcth = inputAsal.equals(cmk) && inputTujuan.equals(cth);
		cmkbd  = inputAsal.equals(cmk) && inputTujuan.equals(bd);
		cmkcry = inputAsal.equals(cmk) && inputTujuan.equals(cry);
		cmkcmd = inputAsal.equals(cmk) && inputTujuan.equals(cmd);
		cmkcmi = inputAsal.equals(cmk) && inputTujuan.equals(cmi);
		cmkgk  = inputAsal.equals(cmk) && inputTujuan.equals(gk);
		cmkpdl = inputAsal.equals(cmk) && inputTujuan.equals(pdl);
		//asal GDB - PDL
		gdbkac = inputAsal.equals(gdb) && inputTujuan.equals(kac);
		gdbcth = inputAsal.equals(gdb) && inputTujuan.equals(cth);
		gdbbd  = inputAsal.equals(gdb) && inputTujuan.equals(bd);
		gdbcry = inputAsal.equals(gdb) && inputTujuan.equals(cry);
		gdbcmd = inputAsal.equals(gdb) && inputTujuan.equals(cmd);
		gdbcmi = inputAsal.equals(gdb) && inputTujuan.equals(cmi);
		gdbgk  = inputAsal.equals(gdb) && inputTujuan.equals(gk);
		gdbpdl = inputAsal.equals(gdb) && inputTujuan.equals(pdl);
		//asal KAC - PDL
		kaccth = inputAsal.equals(kac) && inputTujuan.equals(cth);
		kacbd  = inputAsal.equals(kac) && inputTujuan.equals(bd);
		kaccry = inputAsal.equals(kac) && inputTujuan.equals(cry);
		kaccmd = inputAsal.equals(kac) && inputTujuan.equals(cmd);
		kaccmi = inputAsal.equals(kac) && inputTujuan.equals(cmi);
		kacgk  = inputAsal.equals(kac) && inputTujuan.equals(gk);
		kacpdl = inputAsal.equals(kac) && inputTujuan.equals(pdl);
		//asal CTH - PDL
		cthbd  = inputAsal.equals(cth) && inputTujuan.equals(bd);
		cthcry = inputAsal.equals(cth) && inputTujuan.equals(cry);
		cthcmd = inputAsal.equals(cth) && inputTujuan.equals(cmd);
		cthcmi = inputAsal.equals(cth) && inputTujuan.equals(cmi);
		cthgk  = inputAsal.equals(cth) && inputTujuan.equals(gk);
		cthpdl = inputAsal.equals(cth) && inputTujuan.equals(pdl);
		//asal BD - PDL
		bdcry  = inputAsal.equals(bd) && inputTujuan.equals(cry);
		bdcmd  = inputAsal.equals(bd) && inputTujuan.equals(cmd);
		bdcmi  = inputAsal.equals(bd) && inputTujuan.equals(cmi);
		bdgk   = inputAsal.equals(bd) && inputTujuan.equals(gk);
		bdpdl  = inputAsal.equals(bd) && inputTujuan.equals(pdl);
		//asal CRY - PDL
		crycmd = inputAsal.equals(cry) && inputTujuan.equals(cmd);
		crycmi = inputAsal.equals(cry) && inputTujuan.equals(cmi);
		crygk  = inputAsal.equals(cry) && inputTujuan.equals(gk);
		crypdl = inputAsal.equals(cry) && inputTujuan.equals(pdl);
		//asal CMD - PDL
		cmdcmi = inputAsal.equals(cmd) && inputTujuan.equals(cmi);
		cmdgk  = inputAsal.equals(cmd) && inputTujuan.equals(gk);
		cmdpdl = inputAsal.equals(cmd) && inputTujuan.equals(pdl);
		//asal CMI - PDL
		cmigk  = inputAsal.equals(cmi) && inputTujuan.equals(gk);
		cmipdl = inputAsal.equals(cmi) && inputTujuan.equals(pdl);
		//asal GK - PDL
		gkpdl  = inputAsal.equals(gk) && inputTujuan.equals(pdl);
		//asal PDL - CCL
		pdlgk  = inputAsal.equals(pdl) && inputTujuan.equals(gk); 
		pdlcmi = inputAsal.equals(pdl) && inputTujuan.equals(cmi); 
		pdlcmd = inputAsal.equals(pdl) && inputTujuan.equals(cmd);
		pdlcry = inputAsal.equals(pdl) && inputTujuan.equals(cry);
		pdlbd  = inputAsal.equals(pdl) && inputTujuan.equals(bd);
		pdlcth = inputAsal.equals(pdl) && inputTujuan.equals(cth);
		pdlkac = inputAsal.equals(pdl) && inputTujuan.equals(kac);
		pdlgdb = inputAsal.equals(pdl) && inputTujuan.equals(gdb);
		pdlcmk = inputAsal.equals(pdl) && inputTujuan.equals(cmk);
		pdlrck = inputAsal.equals(pdl) && inputTujuan.equals(rck);
		pdlhrp = inputAsal.equals(pdl) && inputTujuan.equals(hrp);
		pdlccl = inputAsal.equals(pdl) && inputTujuan.equals(ccl);
		//asal GK - CCL
		gkcmi  = inputAsal.equals(gk) && inputTujuan.equals(cmi); 
		gkcmd  = inputAsal.equals(gk) && inputTujuan.equals(cmd);
		gkcry  = inputAsal.equals(gk) && inputTujuan.equals(cry);
		gkbd   = inputAsal.equals(gk) && inputTujuan.equals(bd);
		gkcth  = inputAsal.equals(gk) && inputTujuan.equals(cth);
		gkkac  = inputAsal.equals(gk) && inputTujuan.equals(kac);
		gkgdb  = inputAsal.equals(gk) && inputTujuan.equals(gdb);
		gkcmk  = inputAsal.equals(gk) && inputTujuan.equals(cmk);
		gkrck  = inputAsal.equals(gk) && inputTujuan.equals(rck);
		gkhrp  = inputAsal.equals(gk) && inputTujuan.equals(hrp);
		gkccl  = inputAsal.equals(gk) && inputTujuan.equals(ccl);
		//asal CMI - CCL
		cmicmd = inputAsal.equals(cmi) && inputTujuan.equals(cmd);
		cmicry = inputAsal.equals(cmi) && inputTujuan.equals(cry);
		cmibd  = inputAsal.equals(cmi) && inputTujuan.equals(bd);
		cmicth = inputAsal.equals(cmi) && inputTujuan.equals(cth);
		cmikac = inputAsal.equals(cmi) && inputTujuan.equals(kac);
		cmigdb = inputAsal.equals(cmi) && inputTujuan.equals(gdb);
		cmicmk = inputAsal.equals(cmi) && inputTujuan.equals(cmk);
		cmirck = inputAsal.equals(cmi) && inputTujuan.equals(rck);
		cmihrp = inputAsal.equals(cmi) && inputTujuan.equals(hrp);
		cmiccl = inputAsal.equals(cmi) && inputTujuan.equals(ccl);
		//asal CMD - CCL
		cmdcry = inputAsal.equals(cmd) && inputTujuan.equals(cry);
		cmdbd  = inputAsal.equals(cmd) && inputTujuan.equals(bd);
		cmdcth = inputAsal.equals(cmd) && inputTujuan.equals(cth);
		cmdkac = inputAsal.equals(cmd) && inputTujuan.equals(kac);
		cmdgdb = inputAsal.equals(cmd) && inputTujuan.equals(gdb);
		cmdcmk = inputAsal.equals(cmd) && inputTujuan.equals(cmk);
		cmdrck = inputAsal.equals(cmd) && inputTujuan.equals(rck);
		cmdhrp = inputAsal.equals(cmd) && inputTujuan.equals(hrp);
		cmdccl = inputAsal.equals(cmd) && inputTujuan.equals(ccl);
		//asal CRY - CCL
		crybd  = inputAsal.equals(cry) && inputTujuan.equals(bd);
		crycth = inputAsal.equals(cry) && inputTujuan.equals(cth);
		crykac = inputAsal.equals(cry) && inputTujuan.equals(kac);
		crygdb = inputAsal.equals(cry) && inputTujuan.equals(gdb);
		crycmk = inputAsal.equals(cry) && inputTujuan.equals(cmk);
		cryrck = inputAsal.equals(cry) && inputTujuan.equals(rck);
		cryhrp = inputAsal.equals(cry) && inputTujuan.equals(hrp);
		cryccl = inputAsal.equals(cry) && inputTujuan.equals(ccl);
		//asal BD - CCL
		bdcth  = inputAsal.equals(bd) && inputTujuan.equals(cth);
		bdkac  = inputAsal.equals(bd) && inputTujuan.equals(kac);
		bdgdb  = inputAsal.equals(bd) && inputTujuan.equals(gdb);
		bdcmk  = inputAsal.equals(bd) && inputTujuan.equals(cmk);
		bdrck  = inputAsal.equals(bd) && inputTujuan.equals(rck);
		bdhrp  = inputAsal.equals(bd) && inputTujuan.equals(hrp);
		bdccl  = inputAsal.equals(bd) && inputTujuan.equals(ccl);
		//asal CTH - CCL
		cthkac  = inputAsal.equals(cth) && inputTujuan.equals(kac);
		cthgdb  = inputAsal.equals(cth) && inputTujuan.equals(gdb);
		cthcmk  = inputAsal.equals(cth) && inputTujuan.equals(cmk);
		cthrck  = inputAsal.equals(cth) && inputTujuan.equals(rck);
		cthhrp  = inputAsal.equals(cth) && inputTujuan.equals(hrp);
		cthccl  = inputAsal.equals(cth) && inputTujuan.equals(ccl);
		//asal KAC - CCL
		kacgdb  = inputAsal.equals(kac) && inputTujuan.equals(gdb);
		kaccmk  = inputAsal.equals(kac) && inputTujuan.equals(cmk);
		kacrck  = inputAsal.equals(kac) && inputTujuan.equals(rck);
		kachrp  = inputAsal.equals(kac) && inputTujuan.equals(hrp);
		kacccl  = inputAsal.equals(kac) && inputTujuan.equals(ccl);
		//asal GDB - CCL
		gdbcmk  = inputAsal.equals(gdb) && inputTujuan.equals(cmk);
		gdbrck  = inputAsal.equals(gdb) && inputTujuan.equals(rck);
		gdbhrp  = inputAsal.equals(gdb) && inputTujuan.equals(hrp);
		gdbccl  = inputAsal.equals(gdb) && inputTujuan.equals(ccl);
		//asal CMK - CCL
		cmkrck  = inputAsal.equals(cmk) && inputTujuan.equals(rck);
		cmkhrp  = inputAsal.equals(cmk) && inputTujuan.equals(hrp);
		cmkccl  = inputAsal.equals(cmk) && inputTujuan.equals(ccl);
		//asal RCK - CCL
		rckhrp  = inputAsal.equals(rck) && inputTujuan.equals(hrp);
		rckccl  = inputAsal.equals(rck) && inputTujuan.equals(ccl);
		//asal HRP - CCL
		hrpccl  = inputAsal.equals(hrp) && inputTujuan.equals(ccl);

		rangeA  = pdlgk || pdlcmi || pdlcmd || pdlcry || pdlbd || pdlcth || pdlkac || pdlgdb || pdlcmk || pdlrck || pdlhrp || pdlccl || gkcmi || gkcmd || gkcry || gkbd || gkcth || gkkac || gkgdb || gkcmk || gkrck || gkhrp || gkccl || cmicmd || cmicry || cmibd || cmicth || cmikac || cmigdb || cmicmk || cmirck || cmihrp || cmiccl || cmdcry || cmdbd || cmdcth || cmdkac || cmdgdb || cmdcmk || cmdrck || cmdhrp || cmdccl || crybd || crycth || crykac || crygdb || crycmk || cryrck || cryhrp || cryccl || bdcth || bdkac || bdgdb || bdcmk || bdrck || bdhrp || bdccl || cthkac || cthgdb || cthcmk || cthrck || cthhrp || cthccl || kacgdb || kaccmk || kacrck || kachrp || kacccl || gdbcmk || gdbrck || gdbhrp || gdbccl || cmkrck || cmkhrp || cmkccl || rckhrp || rckccl || hrpccl;
		
		rangeB = pdlgk || pdlcmi || pdlcmd || pdlcry || pdlbd || pdlcth || pdlkac || gkcmi || gkcmd || gkcry || gkbd || gkcth || gkkac || cmicmd || cmicry || cmibd || cmicth || cmikac || cmdcry || cmdbd || cmdcth || cmdkac || crybd || crycth || crykac || bdcth || bdkac || cthkac;

		rangeC = bdcth || bdkac || bdgdb || bdcmk || bdrck || bdhrp || bdccl || cthkac || cthgdb || cthcmk || cthrck || cthhrp || cthccl || kacgdb || kaccmk || kacrck || kachrp || kacccl || gdbcmk || gdbrck || gdbhrp || gdbccl || cmkrck || cmkhrp || cmkccl || rckhrp || rckccl || hrpccl;

		rangeD = cclhrp || cclrck || cclcmk || cclgdb || cclkac || cclcth || cclbd || hrprck || hrpcmk || hrpgdb || hrpkac || hrpcth || hrpbd || rckcmk || rckgdb || rckkac || rckcth || rckbd || cmkgdb || cmkkac || cmkcth || cmkbd || gdbkac || gdbcth || gdbbd || cthbd;

		rangeE = bdcry || bdcmd || bdcmi || bdgk || bdpdl || crycmd || crycmi || crygk || crypdl || cmdcmi || cmdgk || cmdpdl || cmigk || cmipdl || gkpdl;

		rangeF = pdlgk || pdlcmi || pdlcmd || pdlcry || pdlbd || gkcmi || gkcmd || gkcry || gkbd || cmicmd || cmicry || cmibd || cmdcry || cmdbd || crybd;

		rangeG = kacgdb || kaccmk || kacrck || kachrp || kacccl || gdbcmk || gdbrck || gdbhrp || gdbccl || cmkrck || cmkhrp || cmkccl || rckhrp || rckccl || hrpccl;

		rangeH = cclhrp || cclrck || cclcmk || cclgdb || cclkac || hrprck || hrpcmk || hrpgdb || hrpkac || rckcmk || rckgdb || rckkac || cmkgdb || cmkkac || gdbkac;

		rangeI = kaccth || kacbd || kaccry || kaccmd || kaccmi || kacgk || kacpdl || cthbd || cthcry || cthcmd || cthcmi || cthgk || cthpdl || bdcry || bdcmd || bdcmi || bdgk || bdpdl || crycmd || crycmi || crygk || crypdl || cmdcmi || cmdgk || cmdpdl || cmigk || cmipdl || gkpdl;

		rangeJ = cclhrp || cclrck || cclcmk || cclgdb || cclkac || cclcth || cclbd || cclcry || cclcmd || cclcmi || cclgk || cclpdl || hrprck || hrpcmk || hrpgdb || hrpkac || hrpcth || hrpbd || hrpcry || hrpcmd || hrpcmi || hrpgk || hrppdl || rckcmk || rckgdb || rckkac || rckcth || rckbd || rckcry || rckcmd || rckcmi || rckgk || rckpdl || cmkgdb || cmkkac || cmkcth || cmkbd || cmkcry || cmkcmd || cmkcmi || cmkgk || cmkpdl || gdbkac || gdbcth || gdbbd || gdbcry || gdbcmd || gdbcmi || gdbgk || gdbpdl || kaccth || kacbd || kaccry || kaccmd || kaccmi || kacgk || kacpdl || cthbd || cthcry || cthcmd || cthcmi || cthgk || cthpdl || bdcry || bdcmd || bdcmi || bdgk || bdpdl || crycmd || crycmi || crygk || crypdl || cmdcmi || cmdgk || cmdpdl || cmigk || cmipdl || gkpdl; 

		kodeA = "Kode A = PDL - CCL";
		kodeB = "Kode B = PDL - KAC";
		kodeC = "Kode C = BD  - CCL";
		kodeD = "kode D = CCL - BD";
		kodeE = "Kode E = BD  - PDL";
		kodeF = "Kode F = PDL - BD";
		kodeG = "Kode G = KAC - CCL";
		kodeH = "Kode H = CCL - KAC";
		kodeI = "Kode I = KAC - PDL";
		kodeJ = "Kode J = CCL - PDL";

		System.out.println();
		System.out.println("Kode Tiket yang dapat dibeli ==============");
		if(!inputAsal.equals("") && !inputTujuan.equals("") ) {
			if(rangeA) {
				System.out.println(kodeA);
			}
			if(rangeB) {
				System.out.println(kodeB);
			}
			if(rangeC) {
				System.out.println(kodeC);
			}
			if(rangeD) {
				System.out.println(kodeD);
			}
			if(rangeE) {
				System.out.println(kodeE);
			}
			if(rangeF) {
				System.out.println(kodeF);
			}
			if(rangeG) {
				System.out.println(kodeG);
			}
			if(rangeH) {
				System.out.println(kodeH);
			}
			if(rangeI) {
				System.out.println(kodeI);
			}
			if(rangeJ) {
				System.out.println(kodeJ);
			}
		}
		else {
			if(inputAsal.equals("")) {
				System.out.println("Inputan Asal Kosong. Error");
			}
			else if(inputTujuan.equals("")) {
				System.out.println("Inputan Tujuan Kosong. Error");	
			}
			else {
				System.out.println("Inputan Keduanya Kosong. Error");		
			}
		}
	}
}