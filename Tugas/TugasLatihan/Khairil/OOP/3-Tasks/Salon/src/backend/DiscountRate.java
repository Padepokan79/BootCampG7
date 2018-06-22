package backend;

public interface DiscountRate {
	double serviceDiscountPremium = 0.2;
	double serviceDiscountGold = 0.15;
	double serviceDiscountSilver = 0.1;
	double productDiscoutPremium = 0.1;
	double productDiscoutGold = 0.1;
	double productDiscoutSilver = 0.1;
	double getServiceDiscountRate(String memberType);	
	double getProductDiscountRate(String memberType);
}
