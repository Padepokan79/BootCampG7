import java.util.Scanner;
import backend.Validasi;
import backend.Account;

public class AccountApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Validasi vals = new Validasi();
		Account accs = new Account();
		String inputNama, inputNoId, inputDeposit, inputMenu, inputTabung, inputTarik;
		int deposits, saving, wd;
		Boolean step = false, anotherStep = false, inAccount = true, ahem = false;
		
		inputNama = inputNoId = inputDeposit = inputMenu = inputTabung = inputTarik = "";
		deposits = saving = wd = 0;
		
		System.out.println("Selamat Datang di Bank 79");
		System.out.println("Untuk Pembuatan Akun Bank Baru.");
		do {
			inputNama = vals.typeInputLog("Silahkan Masukan Nama anda : ", input);
			
			if(vals.mustString(inputNama, step)) {
				ahem = vals.mustFilled(inputNama, step);
				ahem = true;
			}
			else {
				System.out.println("Inputan harus huruf.");
				System.out.println("Coba lagi");				
				ahem = false;
			}				
		}
		while(ahem == false);
		
		do {
			inputNoId = vals.typeInputLog("Masukan Nomor identitas : ", input1);
			
			if(vals.mustNumber(inputNoId, step)) {
				ahem = vals.mustFilled(inputNoId, step);
				ahem = true;
			}
			else {
				System.out.println("Inputan harus angka.");
				System.out.println("Coba lagi");				
				ahem = false;
			}				
		}
		while(ahem == false);
		
		do {
			inputDeposit = vals.typeInputLog("Silahkan Besar Deposit pertama anda : ", input);
			
			if(vals.mustNumber(inputDeposit, step)) {
				ahem = vals.mustFilled(inputDeposit, step);
				ahem = true;
			}
			else {
				System.out.println("Inputan harus angka.");
				System.out.println("Coba lagi");				
				step = false;
			}
			deposits = vals.convertInt(inputDeposit);
			
		}
		while(ahem == false);
		
//		while(step == false) {
			
		System.out.println("Selamat Datang " + inputNama + ".");
		System.out.print("Akun anda adalah " + inputNoId + " a/n " + inputNama);
		accs.welcomeScreen(deposits);
			while(anotherStep == false) {
				accs.menuScreen();
				inputMenu = input.nextLine();
				
				if(vals.mustNumber(inputMenu, anotherStep)) {
					step = vals.mustFilled(inputMenu, anotherStep);
					if(inputMenu.equals("000")) {
						accs.logoutScreen(inputNama);
						anotherStep = true;
					}
					else {
//						while(inAccount == true) {
							int inputMenuInt = vals.convertInt(inputMenu);				
							if(inputMenuInt == 1) {
								accs.accountBalance(deposits);
//								inAccount = false;
								inputMenuInt = 0;
							}
							else if(inputMenuInt == 2) {
								inAccount = true;
								while(inAccount == true) {
									inputTabung = vals.typeInputLog("Masukan nominal deposit anda : ", input);

									if(vals.mustNumber(inputTabung, inAccount)) {
										inAccount = vals.mustFilled(inputTabung, inAccount);
										saving = vals.convertInt(inputTabung);
										accs.addDeposit(deposits, saving);
										deposits+=saving;
										anotherStep = false;
										inAccount = false;
									}
									else {
										System.out.println("Inputan harus angka.");
										System.out.println("Coba lagi");				
										inAccount = true;
									}
								}
							}
							else if(inputMenuInt == 3) {
								do {
									inputTarik = vals.typeInputLog("Masukan nominal withdraw anda : ", input1);
									
									if(vals.mustNumber(inputTarik, inAccount)) {
										inAccount = vals.mustFilled(inputTarik, inAccount);
										wd = vals.convertInt(inputTarik);
										if(wd > deposits) {
											System.out.println("Penarikan tidak dapat dilakukan");
											System.out.println("Maximal withdraw = Rp " + deposits);
											inAccount = true;
										}
										else {											
											accs.withdrawDeposit(deposits, wd);
											deposits-=wd;
											inAccount = false;
											anotherStep = false;
										}
									}
									else {
										System.out.println("Inputan harus angka.");
										System.out.println("Coba lagi");				
										inAccount = true;								
									}
								}
								while(inAccount == true);
							}
							else if(inputMenu.equals("000")) {
								inAccount = false;
								anotherStep = true;
							}
//						}
					}
				}
				else {
					if(vals.convertInt(inputMenu) < 1 && vals.convertInt(inputMenu) > 3) {
						System.out.println("Inputan salah.");
						System.out.println("Coba lagi");
						anotherStep = false;					
					}
					else {
						anotherStep = true;
					}
				
				}
			}
//		}
	}
}