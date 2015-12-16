package shopApp;

import java.io.Serializable;
import java.util.ArrayList;

public class Shop implements Serializable {
	private String shopName;
	private ArrayList<Commodity> commodities;

	public Shop(String shopName) {
		commodities = new ArrayList<Commodity>();
		this.shopName = shopName;
	}

	public void addCommodity(Commodity commodity) {
		commodities.add(commodity);
	}

	public Commodity getCommodity(int index) {
		return commodities.get(index);
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public int getCommodityCount() {
		return commodities.size();
	}

	public void removeCommodity(int index) {
		commodities.remove(index);
	}
}

