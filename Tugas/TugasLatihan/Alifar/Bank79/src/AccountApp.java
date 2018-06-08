import inputValidation.Input;
import java.util.Scanner;

public class AccountApp {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input inp=new Input();
		String nama, id;
		int uang, input;
		boolean cek;
		
		System.out.println("================================\n");
		System.out.println("Selamat Datang di Bank 79\n");
		System.out.println("Untuk pembuatan Akun Baru.");
		
		nama=inp.string("Silahkan Masukan Nama anda           : ");
		id=inp.string2("Silahkan Masukan nomor identitas     : ");
		uang=inp.integerAbove("Silahkan masukkan besar deposit anda : ",0);
		Account user=new Account(nama, id, uang);
		
		do {
			System.out.println("\nMenu:");
			System.out.println(" 1.  Untuk Mengecek Saldo");
			System.out.println(" 2.  Deposit/Menabung");
			System.out.println(" 3.  Withdraw/Mengambil");
			System.out.println("000. Exit");
			
			cek=false;
			do {
				input=inp.integer("\nPilihan : ",0,3);
				if(input==0)
					if(inp.data.equals("000"))
						cek=true;
					else
						System.out.println("The input for exit is 000");
				else
					cek=true;
			}while(!cek);
			
			if(input==1) {
				user.cekSaldo();
			}
			else if(input==2) {
				uang=inp.integerAbove("Masukkan besar uang yang akan ditabung : ", 0);
				user.deposit(uang);
			}
			else if(input==3) {
				uang=inp.integerAbove("Masukkan besar uang yang akan diambil : ", 0);
				user.withdraw(uang);
			}
		}while(input!=0);
	}
	
}
