/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfRizald1 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			double ipa, ipb, ipc, ipd, ipe, ipf, ipg, iph, bobot;
			String nilaiBobot, nilaiIpa, nilaiIpb, nilaiIpc, nilaiIpd, nilaiIpe, nilaiIpf, nilaiIpg, nilaiIph;

			System.out.println("====================================================");
			System.out.print("nilai IPA :");
			ipa = key.nextDouble();
			System.out.print("nilai IPB :");
			ipb = key.nextDouble();
			System.out.print("nilai IPC :");
			ipc = key.nextDouble();
			System.out.print("nilai IPD :");
			ipd = key.nextDouble();
			System.out.print("nilai IPE :");
			ipe = key.nextDouble();
			System.out.print("nilai IPF :");
			ipf = key.nextDouble();
			System.out.print("nilai IPG :");
			ipg = key.nextDouble();
			System.out.print("nilai IPH :");
			iph = key.nextDouble();
			System.out.println("====================================================");
			System.out.print("Keterangan\t\t:");

			bobot = (ipa+ipb+ipc+ipd+ipe+ipf+ipg+iph)/8;
			if (bobot>=9 && bobot==10){
				nilaiBobot = "A";
			}
			else if (bobot>=8 && bobot<9){
				nilaiBobot = "B";
			}
			else if (bobot>=7 && bobot<8){
				nilaiBobot = "C";
			}
			else if (bobot>=6 && bobot<7){
				nilaiBobot = "D";
			}
			else {
				nilaiBobot = "E";
			}
							
			if (ipa>=9 && ipa==10){
				nilaiIpa = "A";
			}
			else if (ipa>=8 && ipa<9){
				nilaiIpa = "B";
			}
			else if (ipa>=7 && ipa<8){
				nilaiIpa = "C";
			}
			else if (ipa>=6 && ipa<7){
				nilaiIpa = "D";
				System.out.println("Tidak lulus mata pelajaran IPA");
			}
			else {
				nilaiIpa = "E";
				System.out.println("Tidak lulus mata pelajaran IPA");
			}
				
			//System.out.print(nilaiIpa);

			if (ipb>=9 && ipb==10){
				nilaiIpb = "A";
			}
			else if (ipb>=8 && ipb<9){
				nilaiIpb = "B";
			}
			else if (ipb>=7 && ipb<8){
				nilaiIpb = "C";
			}
			else if (ipb>=6 && ipb<7){
				nilaiIpb = "D";
				System.out.println("Tidak lulus mata pelajaran IPB");
			}
			else {
				nilaiIpb = "E";
				System.out.println("Tidak lulus mata pelajaran IPB");
			}
				
			//System.out.print(nilaiIpb);

			if (ipc>=9 && ipc==10){
				nilaiIpc = "A";
			}
			else if (ipc>=8 && ipc<9){
				nilaiIpc = "B";
			}
			else if (ipc>=7 && ipb<8){
				nilaiIpc = "C";
			}
			else if (ipc>=6 && ipc<7){
				nilaiIpc = "D";
				System.out.println("Tidak lulus mata pelajaran IPC");
			}
			else {
				nilaiIpc = "E";
				System.out.println("Tidak lulus mata pelajaran IPC");
			}

			//System.out.print(nilaiIpc);

			if (ipd>=9 && ipd==10){
				nilaiIpd = "A";
			}
			else if (ipd>=8 && ipd<9){
				nilaiIpd = "B";
			}
			else if (ipd>=7 && ipd<8){
				nilaiIpd = "C";
			}
			else if (ipd>=6 && ipd<7){
				nilaiIpd = "D";
				System.out.println("Tidak lulus mata pelajaran IPD");
			}
			else {
				nilaiIpd = "E";
				System.out.println("Tidak lulus mata pelajaran IPD");
			}
				
			//System.out.print(nilaiIpd);

			if (ipe>=9 && ipe==10){
				nilaiIpe = "A";
			}
			else if (ipe>=8 && ipe<9){
				nilaiIpe = "B";
			}
			else if (ipe>=7 && ipe<8){
				nilaiIpe = "C";
			}
			else if (ipe>=6 && ipe<7){
				nilaiIpe = "D";
				System.out.println("Tidak lulus mata pelajaran IPE");
			}
			else {
				nilaiIpe = "E";
				System.out.println("Tidak lulus mata pelajaran IPDE");
			}
			
			//System.out.print(nilaiIpe);

			if (ipf>=9 && ipf==10){
				nilaiIpf = "A";
			}
			else if (ipf>=8 && ipf<9){
				nilaiIpf = "B";
			}
			else if (ipf>=7 && ipf<8){
				nilaiIpf = "C";
			}
			else if (ipf>=6 && ipf<7){
				nilaiIpf = "D";
				System.out.println("Tidak lulus mata pelajaran IPF");
			}
			else {
				nilaiIpf = "E";
				System.out.println("Tidak lulus mata pelajaran IPF");
			}
			
			//System.out.print(nilaiIpf);

			if (ipg>=9 && ipg==10){
				nilaiIpg = "A";
			}
			else if (ipg>=8 && ipg<9){
				nilaiIpg = "B";
			}
			else if (ipg>=7 && ipg<8){
				nilaiIpg = "C";
			}
			else if (ipg>=6 && ipg<7){
				nilaiIpg = "D";
				System.out.println("Tidak lulus mata pelajaran IPG");
			}
			else {
				nilaiIpg = "E";
				System.out.println("Tidak lulus mata pelajaran IPG");
			}
							
			//System.out.print(nilaiIpg);

			if (iph>=9 && iph==10){
				nilaiIph = "A";
			}
			else if (iph>=8 && iph<9){
				nilaiIph = "B";
			}
			else if (iph>=7 && iph<8){
				nilaiIph = "C";
			}
			else if (iph>=6 && iph<7){
				nilaiIph = "D";
				System.out.println("Tidak lulus mata pelajaran IPH");
			}
			else {
				nilaiIph = "E";
				System.out.println("Tidak lulus mata pelajaran IPH");
			}

			
			//System.out.print(nilaiIph);


			System.out.print("\nKeterangan\t\t:");

				
			if (nilaiIpa.equals("D") || nilaiIpb.equals("D") || nilaiIpc.equals("D") || nilaiIpd.equals("D") || nilaiIpe.equals("D") || nilaiIpf.equals("D") || nilaiIpg.equals("D") || nilaiIph.equals("D")) {
				System.out.print("Tidak lulus mata pelajaran");
			}
			else if (nilaiIpa.equals("A") && nilaiIpb.equals("A") && nilaiIpc.equals("A") && nilaiIpd.equals("A") && nilaiIpe.equals("A") && nilaiIpf.equals("A") && nilaiIpg.equals("A") && nilaiIph.equals("A")) {
				System.out.print("Mustahil");
			}
			else if (nilaiIpa.equals("E") && nilaiIpb.equals("E") && nilaiIpc.equals("E") && nilaiIpd.equals("E") && nilaiIpe.equals("E") && nilaiIpf.equals("E") && nilaiIpg.equals("E") && nilaiIph.equals("E")) {
				System.out.print("Genius dude!");
			}
			else if (nilaiIpa.equals("E") || nilaiIpb.equals("E") || nilaiIpc.equals("E") || nilaiIpd.equals("E") || nilaiIpe.equals("E") || nilaiIpf.equals("E") || nilaiIpg.equals("E") || nilaiIph.equals("E") && (nilaiBobot.equals("A")||nilaiBobot.equals("B")) ) {
				System.out.print("Tidak lulus");
			}
			else if (nilaiBobot.equals("B")) {
				System.out.print("lulus");
			}
			else{
				System.out.print(".....");
			}

			System.out.println("\nBobot nilai\t\t:"+nilaiBobot);

		}
	} 