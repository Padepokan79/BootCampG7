package RichaRizaldiVikri;

public class Penyakit {
		private String namaPenyakit;
		private String tingkatKeparahan;
		private String gejala;
		private String bagianYangDiserang;
		private double biayaPengobatan;
		private char asuransi;
		
		public Penyakit () {
			
		}
		
		public Penyakit (String namaPenyakit, String tingkatKeparahan, String gejala, String bagianYangDiserang, double biayaPengobatan, char asuransi) {
			this.namaPenyakit = namaPenyakit; 
			this.tingkatKeparahan = tingkatKeparahan; //set
			this.gejala  = gejala;
			this.bagianYangDiserang = bagianYangDiserang;
			this.biayaPengobatan = biayaPengobatan; //set
			this.setAsuransi(asuransi); //set
		}

		String getNamaPenyakit() {
			return namaPenyakit;
		}

		public String getTingkatKeparahan() {
			return tingkatKeparahan;
		}

		public void setTingkatKeparahan(String tingkatKeparahan) {
			this.tingkatKeparahan = tingkatKeparahan;
		}

		public String getGejala() {
			return gejala;
		}

		public String getBagianYangDiserang() {
			return bagianYangDiserang;
		}

		public double getBiayaPengobatan() {
			return biayaPengobatan;
		}

		public void setBiayaPengobatan(double biayaPengobatan) {
			this.biayaPengobatan = biayaPengobatan;
		}

		public char getAsuransi() {
			return asuransi;
		}

		public void setAsuransi(char asuransi) {
			this.asuransi = asuransi;
		}
		
		
		
}
