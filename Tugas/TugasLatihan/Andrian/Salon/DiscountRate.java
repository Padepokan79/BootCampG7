package Salon;

public interface DiscountRate {
	double seviceDiscountPremium = 0.2;
	double seviceDiscountGold = 0.15;
	double seviceDiscountSilver = 0.1;
	double productDiscountPremium = 0.1;
	double productDiscountGold = 0.1;
	double productDiscountSilver = 0.1;
	
	double getServiceDiscountRate(String type);
	double getProductDiscountRate(String type);
}
