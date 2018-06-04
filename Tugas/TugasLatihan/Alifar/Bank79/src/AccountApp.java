import java.util.Scanner;

public class AccountApp {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nama, id;
		int uang, input;
		
		System.out.println("================================\n");
		System.out.println("Selamat Datang di Bank 79\n");
		System.out.println("Untuk pembuatan Akun Baru.");
		
		nama=inputvalidasi("Silahkan Masukan Nama anda           : ");
		id=inputvalidasi("Silahkan Masukan nomor identitas     : ");
		uang=inputvalidasi("Silahkan masukkan besar deposit anda : ",0);
		Account user=new Account(nama, id, uang);
		
		do {
			System.out.println("\nMenu:");
			System.out.println("1. Untuk Mengecek Saldo");
			System.out.println("2. Deposit/Menabung");
			System.out.println("3. Withdraw/Mengambil");
			System.out.println("0. Exit");
			
			input=inputvalidasi("\nPilihan : ",0,3);
			
			if(input==1) {
				user.cekSaldo();
			}
			else if(input==2) {
				uang=inputvalidasi("Masukkan besar uang yang akan ditabung : ", 0);
				user.deposit(uang);
			}
			else if(input==3) {
				uang=inputvalidasi("Masukkan besar uang yang akan diambil : ", 0);
				user.withdraw(uang);
			}
		}while(input!=0);
	}
	
	public static String inputvalidasi(String menu) {
		String input;
		boolean cek=false;
		
		do {
			System.out.print(menu);
			input=scan.nextLine();
			cek=validasiHuruf(input);
		}while(!cek);
		
		return input;
	}

	public static int inputvalidasi(String menu, int batas) {
		String input;
		int angka=0;
		boolean cek=false;
		
		do {
			System.out.print(menu);
			input=scan.nextLine();
			cek=validasiAngka(input,batas);
		}while(!cek);
		angka=Integer.parseInt(input);
		
		return angka;
	}
	
	public static int inputvalidasi(String menu, int batasBawah, int batasAtas) {
		String input;
		int angka=0;
		boolean cek=false;
		
		do {
			System.out.print(menu);
			input=scan.nextLine();
			cek=validasiAngka(input, batasBawah, batasAtas);
		}while(!cek);
		angka=Integer.parseInt(input);
		
		return angka;
	}
	
	public static boolean validasiHuruf(String input){
		boolean cek=false;
		if(input.matches("[a-zA-Z., 0-9]+"))
			cek=true;
		else 
			System.out.println("Inputan tidak sesuai");
		return cek;
	}

	public static boolean validasiAngka(String input, int batas) {
		boolean cek=false;
		if(input.matches("-?[0-9]+")) {
			int angka=Integer.parseInt(input);
			if(angka>=batas)
				cek=true;
			else
				System.out.println("Masukkan harus lebih dari "+batas);
		}
		else
			System.out.println("Masukkan harus berupa angka");
		return cek;
	}

	public static boolean validasiAngka(String input, int batasBawah, int batasAtas) {
		boolean cek=false;
		if(input.matches("-?[0-9]+")) {
			int angka=Integer.parseInt(input);
			if(angka>=batasBawah && angka<=batasAtas)
				cek=true;
			else
				System.out.println("Masukkan harus berkisar antara "+batasBawah+" dan "+batasAtas);
		}
		else
			System.out.println("Masukkan harus berupa angka");
		return cek;
	}

}
