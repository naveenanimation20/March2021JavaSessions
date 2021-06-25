package OOP_Encapsulation;

public class Company {

	private String name;
	private int sharePrice;
	private String HQ;
	
	public Company(String name, int sharePrice, String hQ) {
		this.name = name;
		this.sharePrice = sharePrice;
		this.HQ = hQ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	public String getHQ() {
		return HQ;
	}

	public void setHQ(String hQ) {
		HQ = hQ;
	}

}
