
public interface DiscountRate {
	double 	serviceDiscountPremium 	= 0.2,
			serviceDiscountGold		= 0.15,
			serviceDiscountSilver	= 0.1,
			productDiscountPremium	= 0.1,
			productDiscountGold		= 0.1,
			productDiscountSilver	= 0.1;
	
	public double getServiceDiscountRate(String type);
	public double getProductDiscountRate(String type);
//	public String getServiceDiscountRate(); // untuk versi 2
//	public String getProductDiscountRate();
}
