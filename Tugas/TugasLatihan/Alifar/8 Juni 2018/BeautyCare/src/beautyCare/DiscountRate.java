package beautyCare;

public interface DiscountRate {
	double serviceDiscountPremium=0.2, serviceDiscountGold=0.15, serviceDiscountSilver=0.1, 
			productDiscountPremium=0.1, productDiscountGold=0.1, productDiscountSilver=0.1;
	
	double getServiceDiscountRate(String type);
	
	double getProductDiscountRate(String type);
}
