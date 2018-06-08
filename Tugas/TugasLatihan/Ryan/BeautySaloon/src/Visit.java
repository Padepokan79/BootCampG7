
public class Visit extends Costumer implements DisconRate{
	Costumer costumer;
	String date;
	int pilih1;
	
	private double serviceExpense, productExpense, totalExpense, diskon=0;
	
	public Visit(String name, String date) {
		super(name);
		this.date = date;
	}
	
	public String getName() {
		return super.getName();
	}

	void cekMember(char pilih) {
		if(pilih == 'y') {
			setMember(true);
		}
	}
	void pilihMember(int pilih1) {
		if(pilih1 == 1) {
			setMemberType("Premium");
		}
		else if(pilih1 == 2) {
			setMemberType("Gold");
		}
		else {
			setMemberType("Silver");
		}
		this.pilih1 = pilih1;
	}
	
	double getServiceExpense() {
		return serviceExpense;
	}
	void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}
	double getProductExpense() {
		return productExpense;
	}
	void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}
	@Override
	public double getServiceDiscountRate(String memberType) {
		if(memberType.equals("Gold")) {
			diskon = serviceExpense*serviceDiscountGold;
		}
		else if(memberType.equals("Premium")) {
			diskon = serviceExpense*serviceDiscountPremium;
		}
		else if(memberType.equals("Silver")) {
			diskon = serviceExpense*serviceDiscountSilver;
		}
		return diskon;
	}
	@Override
	public double getProductDiscountRate(String memberType) {
		if(memberType.equals("Gold")) {
			diskon = productExpense*productDiscountGold;
		}
		else if(memberType.equals("Premium")) {
			diskon = productExpense*productDiscountPremium;
		}
		else if(memberType.equals("Silver")) {
			diskon = productExpense*productDiscountSilver;
		}
		return diskon;
	}

	public double getTotalExpense() {
		totalExpense = (getServiceExpense()-getServiceDiscountRate(super.getMemberType()))+(getProductExpense()-getProductDiscountRate(super.getMemberType()));
		return totalExpense;
	}
	
	public String toString() {
		return super.toString()+"\nTanggal : "+date+"\n----------------";
	}
}
