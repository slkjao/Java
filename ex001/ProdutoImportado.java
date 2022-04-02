package ex001;

public class ProdutoImportado extends Produto{
	private Double customFee;

	public ProdutoImportado(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String priceTag() {
		return this.getName() + String.format(" / R$ %.2f", this.getPrice()) + String.format(" (Taxa de Importacao: R$ %.2f)", this.getCustomFee());
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	

}
