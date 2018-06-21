package laptop;

public class Asus extends Laptop{
	
	String processor, merk;
	double ukuranLayar, clockSpeed;
	int ukuranRAM, ukuranHardisk, harga;
	Laptop lpt = new Laptop();
	
	public Asus() {
		// TODO Auto-generated constructor stub
	}
	
	public Asus(Laptop lpt, String processor, String merk, double ukuranLayar, double clockSpeed, int ukuranRAM, int ukuranHardisk, int harga) {
		this.lpt = lpt;
		this.processor = processor;
		this.merk = merk;
		this.ukuranLayar = ukuranLayar;
		this.clockSpeed = clockSpeed;
		this.ukuranRAM = ukuranRAM;
		this.ukuranHardisk = ukuranHardisk;
		this.harga = harga;
	}
	
	String printLaptop() {
		return lpt.printLaptop() + ", procie " + processor + ", seri " + merk +
				", layar " + ukuranLayar + ", kecepatan " + clockSpeed + ", RAM " + ukuranRAM +
				" GB, HDD " + ukuranHardisk + " MB, Rp " + harga; 
	}

	String typing() {
		return "Kemampuan tambahan laptop " + lpt.typing();
	}
	String gaming() {
		return typing() + " dan main game";
	}
	
	void behave() {
		if (clockSpeed > 4) {
			System.out.println(gaming());
		} else {
			System.out.println(typing());
		}
	}

}
