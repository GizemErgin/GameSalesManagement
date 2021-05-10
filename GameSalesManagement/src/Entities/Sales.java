package Entities;

public class Sales {
	private int id;
	private int userId;
	private int campaignId;
	private int campaignRate;
	private int productId;
	private double price;
	
	public Sales() {
		
	}

	public Sales(int id, int userId, int campaignId, int campaignRate, int productId, double price) {
		this.id = id;
		this.userId = userId;
		this.campaignId = campaignId;
		this.campaignRate = campaignRate;
		this.productId = productId;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getCampaignRate() {
		return campaignRate;
	}

	public void setCampaignRate(int campaignRate) {
		this.campaignRate = campaignRate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getPrice() {
		double total=0;
		if (campaignId == 1) {
			total = price;
		}else {
			total = price - (price*campaignRate/100);
		}
		return total;
	}

	
	
}
