
public interface DiscountRate {
	public static final double servicePremium = 0.2;
	public static final double serviceGold = 0.15;
	public static final double serviceSilver = 0.1;

	public static final double productPremium = 0.1;
	public static final double productGold = 0.1;
	public static final double productSilver = 0.1;
	
	public double serviceDiscount(String type);
	public double productDiscount(String type);
}
