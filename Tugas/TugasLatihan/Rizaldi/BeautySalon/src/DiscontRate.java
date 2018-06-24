
public interface DiscontRate {
	public static final Double servDiscPremium = 0.2;
	public static final Double servDiscGold	   = 0.15;
	public static final Double servDiscSilver  = 0.1;
	public static final Double proDiscPremium  = 0.1;
	public static final Double proDiscGold	   = 0.1;
	public static final Double proDiscSilver   = 0.1;
	
	public Double getServDiscRate(String memberType);
	public Double getProDiscRate(String memberType);
}
