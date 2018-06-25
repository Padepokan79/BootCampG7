
public class Visit extends Costumer implements DiscontRate{
	private String date;
	private Double serviceExpense, productExpense, totalExpense, discount;
	
	public Visit() {
		
	}
	public Visit(String nama, String gender, int usia, String memberType, Boolean isMember, String date, Double serviceExpense, Double productExpense, Double totalExpense, Double discount) {
		super(nama, gender, usia, memberType, isMember);
		this.date = date;
		this.setServiceExpense(serviceExpense);
		this.setProductExpense(productExpense);
		this.setTotalExpense(totalExpense);
		this.setDiscount(discount);
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getServiceExpense() {
		return serviceExpense;
	}
	public void setServiceExpense(Double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}
	public Double getProductExpense() {
		return productExpense;
	}
	public void setProductExpense(Double productExpense) {
		this.productExpense = productExpense;
	}
	public Double getTotalExpense() {
		Double totalExpense;
		totalExpense = getCalculatedProDisc()+getCalculatedServDisc();
		return totalExpense;
	}
	public void setTotalExpense(Double totalExpense) {
		this.totalExpense = totalExpense;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	public String triString() {
		return "\nTanggal\t\t\t: "+getDate()+"\nNama\t\t\t: "+getName()+"\nTipe Member\t\t: "+getMemberType()+"\nBiaya servis\t\t: "+getServiceExpense()+
				"\nBiaya Produk\t\t: "+getProductExpense()+"\nDiskon service\t\t: "+getServDiscAmount()+"\nDiskon produk\t\t: "+getProDiscAmount()+
				"\nTotal Biaya\t\t: "+getTotalExpense();
	}
	
	@Override
	public Double getServDiscRate(String memberType) {
		Double servDisc=0.0;
		if(memberType.equalsIgnoreCase("Premium")) {
			servDisc=DiscontRate.servDiscPremium;
		}
		else if(memberType.equalsIgnoreCase("Gold")) {
			servDisc=DiscontRate.servDiscGold;
		}
		else if(memberType.equalsIgnoreCase("Silver")) {
			servDisc=DiscontRate.servDiscSilver;
		}
		else {
			servDisc=0.0;
		}
		return servDisc;
	}

	@Override
	public Double getProDiscRate(String memberType) {
		Double proDisc=0.0;
		if(memberType.equalsIgnoreCase("Premium")) {
			proDisc=DiscontRate.proDiscPremium;
		}
		else if(memberType.equalsIgnoreCase("Gold")) {
			proDisc=DiscontRate.proDiscGold;
		}
		else if(memberType.equalsIgnoreCase("Silver")) {
			proDisc=DiscontRate.proDiscSilver;
		}
		else {
			proDisc=0.0;
		}
		return proDisc;
	}
	public Double getCalculatedServDisc() {
		Double servDiscAmount;
		servDiscAmount = getServDiscRate(getMemberType())*serviceExpense;
		serviceExpense -= servDiscAmount;
		return serviceExpense;
	}
	public Double getCalculatedProDisc() {
		Double proDiscAmount;
		proDiscAmount = getProDiscRate(getMemberType())*productExpense;
		productExpense -= proDiscAmount;
		return productExpense;
	}
	public Double getServDiscAmount() {
		Double servDiscAmount;
		servDiscAmount = getServDiscRate(getMemberType())*serviceExpense;
		return servDiscAmount;
	}
	public Double getProDiscAmount() {
		Double proDiscAmount;
		proDiscAmount = getProDiscRate(getMemberType())*productExpense;
		return proDiscAmount;
	}
	
	
	
}
