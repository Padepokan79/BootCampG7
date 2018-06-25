package HendraChaudryRyan.Laptop;

public class MacBook extends Laptop{
	
	private String vga;

	public MacBook(String nama, String merk, int ram, int hdd, double layar, String processor, double clockSpeed, String vga) {
		super(nama, merk, ram, hdd, layar, processor, clockSpeed);
		this.vga = vga;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+
				"\nKelegihan : "+
				"\nVga "+vga+"\n------------------\n"+
				super.fungsi("Laptop Ini sangat cocok Untuk Gaming");
	}

}
