
public class Account {
	
	
	public static void printMenu () {
		System.out.println("Menu:\r\n" + 
				"1. Untuk Mengecek Saldo.\r\n" + 
				"2. Deposit/Menabung.\r\n" + 
				"3. Withdraw/Mengambil.\r\n" + 
				"000. exit");
	}
	
	public static int converttoInt (String pilihMenu) {
		return Integer.parseInt(pilihMenu);
	}
}
