package teamChauOOP;

public class Asus extends Laptop {
	private String nama, os;
	
	public Asus(Laptop laptop, String nama, String os) {
		setProcessor(laptop.getProcessor());
		setClockspeed(laptop.getClockspeed());
		setUkuranLayar(laptop.getUkuranLayar());
		setHarga(laptop.getHarga());
		setUkuranRAM(laptop.getUkuranRAM());
		setUkuranHardisk(laptop.getUkuranHardisk());
		this.nama=nama;
		this.os=os;
	}
	
	String gaming() {
		if(os.equals("windows") && getClockspeed()>3 && getUkuranRAM()>4)
			return "Direkomendasikan untuk Gaming";
		else
			return "tidak direkomendasikan untuk Gaming";
	}

	@Override
	public String toString() {
		return "Asus [nama=" + nama +", "+super.toString()+ ", os=" + os + "]";
	}
	
	
	
}
