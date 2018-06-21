package customer;
import java.util.Date;

public class Visit extends Customer implements DiscountRate{
	private double servExp, prodExp;
	double servRate, prodRate, total;
	
	public Visit(String name, String gender, int usia, boolean member, String memberType, double servExp, double prodExp) {
		super(name, gender, usia, member, memberType);
		this.setServExp(servExp);
		this.setProdExp(prodExp);
	}
	double getProdExp() {
		return prodExp;
	}

	void setProdExp(double prodExp) {
		this.prodExp = prodExp;
	}

	public double getServExp() {
		return servExp;
	}

	public void setServExp(double servExp) {
		this.servExp = servExp;
	}
	@Override
	public double getProductRate(String memberType) {
		if (memberType.equals("Premium")) {
			prodRate = getProdExp() * prodDiscPremium;
		} else if(memberType.equals("Gold")) {
			prodRate = getProdExp() * prodDiscGold;
		} else if (memberType.equals("Silver")){
			prodRate = getProdExp() * prodDiscSilver;
		} else {
			servRate = getServExp() * 0;
		}
		return prodRate;
	}
	@Override
	public double getServiceRate(String memberType) {
		if (memberType.equals("Premium")) {
			servRate = getServExp() * servDiscPremium;
		} else if(memberType.equals("Gold")) {
			servRate = getServExp() * servDiscGold;
		} else if(memberType.equals("Silver")){
			servRate = getServExp() * servDiscSilver;
		} else {
			servRate = getServExp() * 0;
		}
		return servRate;
	}
	
	public double total() {
		total = (getServExp()+getProdExp())-(servRate+prodRate);
		return total;
	}
	Date date = new Date();
	public String toString() {
		return 	"Date: "+date.toString()+
				"\n\n"+super.toString()+
				"Harga Service: "+(int)getServExp()+"\n"+
				"Harga Produk: "+(int)getProdExp()+"\n\n"+
				"Disc rate service: "+(int)getServiceRate(getMemberType())+"\n"+
				"Disc rate Product: "+(int)getProductRate(getMemberType())+"\n\n"+
				"Total Price: "+(int)total();
	}

}
