/*
	Created By Vikri
	16/05/2018
	8:54	
*/
import java.util.Scanner;
public class soalIfRizaldi{
	public static void main(String[] args) {
		double gabungan, ipa, ipb, ipc, ipd, ipe, ipf, ipg, iph;
		boolean a,b,c,d,e,f,g,h;
		Scanner input = new Scanner(System.in);

		System.out.print("Nilai IPA: ");
		ipa = input.nextInt();

		System.out.print("Nilai IPB: ");
		ipb = input.nextInt();

		System.out.print("Nilai IPC: ");
		ipc = input.nextInt();

		System.out.print("Nilai IPD: ");
		ipd = input.nextInt();

		System.out.print("Nilai IPE: ");
		ipe = input.nextInt();

		System.out.print("Nilai IPF: ");
		ipf = input.nextInt();

		System.out.print("Nilai IPG: ");
		ipg = input.nextInt();
		
		System.out.print("Nilai IPH: ");
		iph = input.nextInt();

		gabungan = ipa+ipb+ipc+ipd+ipe+ipf+ipg+iph;
		gabungan = gabungan/8;

		e=ipa<6||ipb<6||ipc<6||ipd<6||ipe<6||ipf<6||ipg<6||iph<6;
		d=(ipa>=6&&ipa<7)||(ipb>=6&&ipb<7)||(ipc>=6&&ipc<7)||(ipd>=6&&ipd<7)||(ipe>=6&&ipe<7)||(ipf>=6&&ipf<7)||(ipg>=6&&ipg<7)||(iph>=6&&iph<7);
		c=(ipa>=7&&ipa<8)||(ipb>=7&&ipb<8)||(ipc>=7&&ipc<8)||(ipd>=7&&ipd<8)||(ipe>=7&&ipe<8)||(ipf>=7&&ipf<8)||(ipg>=7&&ipg<8)||(iph>=7&&iph<8);
		b=(ipa>=8&&ipa<9)||(ipb>=8&&ipb<9)||(ipc>=8&&ipc<9)||(ipd>=8&&ipd<9)||(ipe>=8&&ipe<9)||(ipf>=8&&ipf<9)||(ipg>=8&&ipg<9)||(iph>=8&&iph<9);
		a=(ipa>=9&&ipa<=10)||(ipb>=9&&ipb<=10)||(ipc>=6&&ipc<7)||(ipd>=9&&ipd<=10)||(ipe>=9&&ipe<=10)||(ipf>=9&&ipf<=10)||(ipg>=9&&ipg<=10)||(iph>=9&&iph<=10);

		if (!e&&!d&&!c&&!b&&a) {
			System.out.println("Anda Dinyatakan tidak lulus dengan keterangan Musthahil");
		} else if (!e) {
			if (!e&&(d||c||b||a)) {
				System.out.println("Anda Dinyatakan Lulus");
			} else {
				System.out.println("Anda Dinyatakan Tidak Lulus");
			}
		} else if (gabungan>=8&&gabungan<=9) {
			if (e) {
				System.out.println("Anda Dinyatakan tidak lulus karna ada nilai e");
			} else {
				System.out.println("Anda Dinyatakan lulus karna tidak ada nilai e");
			}
		} else if (e&&!d&&!c&&!b&&!a) {
			System.out.println("Anda Dinyatakan DO dengan keterangan genius");
		} else if (!e&&!d&&!c&&!b&&a) {
			System.out.println("Anda Dinyatakan DO dengan keterangan Musthahil");
		} else if (gabungan<8) {
			System.out.println("Anda Dinyatakan Tidak lulus karna dibawah rata-rata");
		} else {
			System.out.println("gajelas");
		}
	}
}