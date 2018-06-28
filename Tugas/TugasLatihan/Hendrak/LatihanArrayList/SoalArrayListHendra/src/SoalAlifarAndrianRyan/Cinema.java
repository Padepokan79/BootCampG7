package SoalAlifarAndrianRyan;

public class Cinema {
	private int hargaWeekdays, hargaWeekend;
	String jenisTicket;
	int kapasitas, terjualHari1,terjualHari2,terjualHari3,terjualHari4,terjualHari5,terjualHari6,terjualHari7;

	public Cinema() {
		
	}
	
	public Cinema(String ticket, int hargaWeekdays, int hargaWeekend, int kapasitas, int hari1, int hari2, int hari3, int hari4, int hari5, int hari6, int hari7) {
		jenisTicket = ticket;
		this.hargaWeekdays = hargaWeekdays;
		this.hargaWeekend = hargaWeekend;
		this.kapasitas = kapasitas;
		terjualHari1 = hari1;
		terjualHari2 = hari2;
		terjualHari3 = hari3;
		terjualHari4 = hari4;
		terjualHari5 = hari5;
		terjualHari6 = hari6;
		terjualHari7 = hari7;
		
	}

	public int getHargaWeekdays() {
		return hargaWeekdays;
	}

	public int getHargaWeekend() {
		return hargaWeekend;
	}
}
