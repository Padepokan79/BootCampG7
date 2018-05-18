//createby:Hendra Kurniawan 
//Date:17 Mei 2018 Time:2:24
//Modified by :
public class AdeBaju{
	public static void main(String[] args) {
		double modalAwal,modalTerpakai,hargaPerBaju,sisaModal,keuntunganPenjualan,jumlahUang;

		modalAwal = 700000;
		hargaPerBaju = 56000;
		modalTerpakai = 12 * hargaPerBaju;
		sisaModal = modalAwal- modalTerpakai;
		keuntunganPenjualan = modalTerpakai + modalTerpakai * 0.2;

		jumlahUang = sisaModal + keuntunganPenjualan;
		System.out.println("Sisa Uang : " + jumlahUang );
	}
}