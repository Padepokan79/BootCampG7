package rhc1;

public class Apple extends Laptop{

	private Laptop laptop;
	private String merk, processor;
	private int ram, harddisk;
	private double layar, clockspeed;
	
	public Apple(Laptop laptop, String merk, String processor, int ram, int harddisk, double layar, double clockspeed) {
		this.laptop = laptop;
		this.merk = merk;
		this.processor = processor;
		this.ram = ram;
		this.harddisk = harddisk;
		this.layar = layar;
		this.clockspeed = clockspeed;
	}
	
	public void setMerk(String merk) {
		this.merk = merk;
	}
	
	String getMerk() {
		return merk;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	String getProcessor() {
		return processor;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	int getRam() {
		return ram;
	}
	
	public void setHarddisk(int harddisk) {
		this.harddisk = harddisk;
	}
	
	int getHarddisk() {
		return harddisk;
	}
	
	public void setLayar(double layar) {
		this.layar = layar;
	}
	
	double getLayar() {
		return layar;
	}
	
	public void setClockspeed(double clockspeed) {
		this.clockspeed = clockspeed;
	}
	
	double getClockspeed() {
		return clockspeed;
	}
	
	Laptop laptop() {
		return laptop;
	}
	
	String printApple() {
		return laptop.printLaptop() + "\nMerk : " + merk + "\nProcessor : " + processor + "\nRAM : " + ram + "GB \nHard Disk " + harddisk + " GB \nLayar : "+ layar + " inch \nClock Speed : " + clockspeed;
	}

}
