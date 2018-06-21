package customer;

public interface DiscountRate {
	double servDiscPremium  = 0.2, servDiscGold = 0.15, servDiscSilver = 0.1, prodDiscPremium = 0.2, prodDiscGold = 0.15, prodDiscSilver = 0.1;
	
	public double getServiceRate(String memberType);
	public double getProductRate(String memberType);
}
