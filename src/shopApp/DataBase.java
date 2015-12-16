package shopApp;

import java.io.Serializable;
import java.util.ArrayList;

public class DataBase implements Serializable{
	 private ArrayList<Shop> shops;
	    public DataBase() {
	        shops = new ArrayList<Shop>();
	    }
	    public void addShop(Shop shop) {
	         shops.add(shop);
	    }
	    public void removeShop(int index) {
	        shops.remove(index);
	    }
	    public Shop getShop(int index) {
	        return shops.get(index);
	    }
	    public Integer getShopsCount() {
	        return shops.size();
	    }
	    public boolean containsShop(String name) {
	        for (Shop shop : shops)
	            if (shop.getShopName().equals(name))
	                return true;
	        return false;
	    }
	}
