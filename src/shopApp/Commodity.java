package shopApp;

import java.io.Serializable;

public class Commodity implements Serializable {
	private String name;
	private Integer count;
	private Double price;

	public Commodity(String name, Integer count, Double price) {
		this.name = name;
		this.count = count;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
