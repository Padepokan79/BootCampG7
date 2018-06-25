package Interface;

public interface SalaryCuts {
	public double bpjs 		 = 0.01,
				  posPph 	 = 0.05,
				  pensiunPph = 0.0475,
				  wpPribadi  = 36000000,
				  wpKawin    = 3000000;
	
	public void bpjsKesehatan();
	public void bpjsKetenagakerja();
	public void potonganPph(boolean married);
}
