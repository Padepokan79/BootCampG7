package Salon;
import java.util.*;
public class TestSubject {

	private static Scanner key, key1;

	public static void main(String[] args) {
		key = new Scanner(System.in);
		key1 = new Scanner(System.in);
		String umur, nama, jk, member, jnsMmbr="", tanggal, hargaService, hargaProduk;
		int umurInt, valid=0, validasi=1;
		double hargaServiceDouble=0, hargaProdukDouble=0;
		boolean memberBoolean;
		
		Validasi acc = new Validasi ();
		Costumer cstmr = new Costumer("","",0);
		Visit vst = new Visit(cstmr,0,0);
		Date date= new Date();
		
		

		do {
		System.out.print("Masukan nama anda \t\t: ");
		nama = key1.nextLine();
		valid = acc.menuValidasiHuruf(nama, valid);
		} while (valid<validasi);
		
		do {
			System.out.print("Masukan jenis kelamin anda \t: ");
			jk = key.next();
			valid = acc.menuValidasiHuruf(jk, valid);
		} while (valid<validasi);
		
		do {
			System.out.print("Masukan umur anda \t\t: ");
			umur = key.next();
			valid = acc.menuValidasiAngka(umur, valid);
		} while (valid<validasi);
		umurInt = Integer.parseInt(umur);
		
		do {
			System.out.print("Apakah anda member (y/t)\t: ");
			member = key.next();
			valid = acc.menuValidasiHuruf(member, valid);
			if (member.equals("y") || member.equals("Y")) {
				valid++;
			} else if (member.equals("n") || member.equals("N")) {
				valid++;
			} else {
				valid=0;
			}
		} while (valid<validasi);
		

		if (member.equals("y")) {
			memberBoolean = true;
		} else {
			memberBoolean = false;
		}
		
		if (memberBoolean==true) {
			do {
				System.out.print("Jenis member yang digunakan \t: ");
				jnsMmbr = key.next();
				valid = acc.menuValidasiHuruf(jnsMmbr, valid);
				if (!jnsMmbr.equals("gold")||!jnsMmbr.equals("gold")||!jnsMmbr.equals("gold")) {
					System.out.print("That member dosen't exsist");
					valid=0;
				}
			} while (valid<validasi);
			
		}
		
		do {
			System.out.print("Masukan total serivice \t\t: ");
			hargaService = key.next();
			valid = acc.menuValidasiAngka(hargaService, valid);
		} while (valid<validasi);
		hargaServiceDouble = Double.parseDouble(hargaService);
		
		do {
			System.out.print("Masukan total serivice \t\t: ");
			hargaProduk = key.next();
			valid = acc.menuValidasiAngka(hargaProduk, valid);
		} while (valid<validasi);
		hargaProdukDouble = Double.parseDouble(hargaProduk);
		
		
		
		cstmr = new Costumer(nama,jk,umurInt);
		cstmr.setMember(memberBoolean);
		cstmr.setMemberType(jnsMmbr);
		vst = new Visit(cstmr,hargaServiceDouble,hargaProdukDouble);
		System.out.println();
		System.out.println("===========================================");
		vst.getServiceDiscountRate(cstmr.getMemberType());
		vst.getProductDiscountRate(cstmr.getMemberType());
		vst.totalExpense();
		vst.totalAfterDiscount();
		System.out.print(date);
		System.out.println("===========================================");
		System.out.println(vst.toString());
	}

}
