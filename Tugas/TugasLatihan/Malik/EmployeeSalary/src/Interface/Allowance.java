package Interface;

public interface Allowance {
	public double allowanceJunior = 200000,
				  allowanceMiddle = 300000,
				  allowanceSenior = 500000,
				  allowanceTrans  = 1000000,
				  allowanceFamily = 0.02;
	
	public void hitungTunjangan(boolean married);
}
