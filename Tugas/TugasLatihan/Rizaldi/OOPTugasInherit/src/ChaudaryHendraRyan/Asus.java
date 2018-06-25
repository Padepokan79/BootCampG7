package ChaudaryHendraRyan;

public class Asus extends Laptop{
	private String typing, gaming, cooling;
	Laptop laptop = new Laptop();
	public Asus() {
		
	}
	public Asus(String nama, String merek, String processor, int harga, int ukuranRAM, int ukuranHardDisk, Double ukuranLayar, Double clockSpeed, String typing, String gaming, String cooling) {
		super(nama, merek, processor, harga, ukuranRAM, ukuranHardDisk, ukuranLayar, clockSpeed);
		this.typing = typing;
		this.gaming = gaming;
		this.cooling = cooling;
	}
	
	// getter
	String getTypign() {
		return typing;
	}
	String getGaming() {
		return gaming;
	}
	String getCooling() {
		return cooling;
	}
	//setter
	void setType(String typing) {
		this.typing = typing;
	}
	void setGaming(String gaming) {
		this.gaming = gaming;
	}
	void setCooler(String cooling) {
		this.cooling = cooling;
	}
	
	void cooler() {
		System.out.println("punya sistem pendinginan yahud");
	}
	public String toString() {
		return "\nNama barang\t\t: "+getName()+"\nmerek\t\t\t: "+getMerek()+"\njenis processor\t\t: "+getProcessor()+"\nharga\t\t\t: "+getHarga()+"\nukuran ram\t\t: "+getRam()+
				   "\nukuran Hard Disk\t: "+getHD()+"\nukuran Layar\t\t: "+getLayar()+"\nClock Speed\t\t: "+getClockSpeed()+"\nfitur\t\t\t: "+"\n\t\t\t- "+getTypign()+"\n\t\t\t- "+getGaming()+"\n\t\t\t- "+getCooling();
	}
}
