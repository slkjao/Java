package ex001;

public  class Produto {
	protected String name;
	protected Double price;
	
	public Produto(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String priceTag() {
		return this.getName() + " / " +  String.format(" / R$ %.2f", this.getPrice());
	}
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}


}
