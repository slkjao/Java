package ex001;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static Date sdf(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.parse(date);
	}

	public static void main(String args[]) throws ParseException {

		List<Produto> listaProduto = new ArrayList<>();
		
		
		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);

		System.out.println("Quantidade de produtos a serem cadastrados:");
		int totalProdutos = sc.nextInt();

		for (int i = 0; i < totalProdutos; i++) {
			System.out.println("INFORMACAO PRODUTO #" + (i + 1));
			System.out.println("Produto comum, usado ou importado?");
			char tipoProduto = sc.next().charAt(0);
			System.out.println("Nome: ");
			String nomeProduto = scString.nextLine();
			System.out.println("Preco: ");
			Double precoProduto = sc.nextDouble();

			switch (tipoProduto) {
			case 'c':
				Produto p = new Produto(nomeProduto, precoProduto);
				listaProduto.add(p);
				System.out.println(p.priceTag());
				break;
			case 'u':
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				System.out.println("Data de Fabricacao: (dd/MM/yyyy)");
				Date dataEntrada = sdf.parse(scString.nextLine());
				ProdutoUsado pu = new ProdutoUsado(nomeProduto, precoProduto, dataEntrada);
				listaProduto.add(pu);
				break;
			case 'i':
				System.out.println("Taxa de importacao: ");
				Double taxa = sc.nextDouble();
				ProdutoImportado pi = new ProdutoImportado(nomeProduto, precoProduto, taxa);
				listaProduto.add(pi);
				break;
			default:
				System.out.println("Dado nao registrado");
			}
		}


			for (Produto produto : listaProduto) {
				System.out.println(produto.priceTag());
			}

	}

}
