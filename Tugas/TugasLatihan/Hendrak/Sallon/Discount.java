
public interface Discount {
	public static final double serviceDiscountPremium=0.2, serviceDiscountGold=0.15, serviceDiscountSilver=0.1;
	public static final double productDiscountPremium=0.1, productDiscountGold=0.1, productDiscountSilver=0.1;

	public double getServiceDiscountRate(String type);
	public double getProductDiscountRate(String type);
}
