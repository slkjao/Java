package ex001;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class ProdutoUsado extends Produto {
	Date dataFab;
	
	public ProdutoUsado(String name, Double price, Date dataFab) {
		super(name, price);
		this.dataFab = dataFab;
		// TODO Auto-generated constructor stub
	}
	

	
	public String priceTag() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return this.getName() + " (usado) R$ " + this.getPrice() + "/ (Data de Fabricacao: " + df.format(this.getDataFab()) +")" ;
	}
	

	public Date getDataFab() {
		return dataFab;
	}

	public void setDataFab(Date dataFab) {
		this.dataFab = dataFab;
	}
	
	


	

}
