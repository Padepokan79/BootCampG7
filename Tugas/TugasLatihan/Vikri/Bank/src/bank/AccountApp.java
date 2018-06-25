package bank;
public class AccountApp {
	public static void main(String[] args) {
		String nama, id;
		int dep, exit = 1, menu, saldoSaya = 0;
		
		Account acc = new Account();
		
		acc.validAng(false, "Masukan id: ");
		nama = acc.ans;
		
		acc.validHuruf(false, "Masukan Nama: ");
		id = acc.ans;
		
		acc.validAng(false, "Masukan Deposit pertama: ");
		dep = Integer.parseInt(acc.ans);
		
		acc.garis();

		System.out.println("akun anda adalah "+id+" atas nama "+nama+" dengan saldo Rp. "+dep);
		saldoSaya += dep;
		
		do {
			int stop = 1;
			do {
				acc.validAng(false, "Masukan Menu: ");
				acc.conv();
				menu = acc.conv;
				stop = 1;
			}while(stop == 0);
			
			if(menu < 0) {
				System.out.println("Angka tidak boleh kurang dari 0");
			} else if (menu > 3) {
				System.out.println("menu hanya ada 3");
				exit = 1;
			} else if (menu == 0){
				exit = 3;
			} else {
				if(menu == 1) {
					acc.tampilSaldo(saldoSaya);
					saldoSaya = acc.saldo;
				} else if(menu == 2) {
					acc.tambahSaldo(false, saldoSaya);
					saldoSaya = acc.saldo;
				} else {
					acc.tarikSaldo(false, saldoSaya);
					saldoSaya = acc.saldo;
				} 
			} exit -= 1;
		}while(exit < 2);
		System.out.println("thx :)");
	}
}
