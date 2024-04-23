package composite;

import java.util.ArrayList;
import java.util.List;

public class ProdutoComposto implements Produto {

	private String nome;
	private List<Produto> componentes = new ArrayList<>();

	public ProdutoComposto(String nome) {
		super();
		this.nome = nome;
	}

	public void adicionarComponente(Produto componente) {
		this.componentes.add(componente);
	}
	
	public void removerComponente(Produto componente) {
		this.componentes.remove(componente);
	}
	
	@Override
	public Double getPreco() {
		Double precoTotal = 0.0;
		for (Produto produto : componentes) {
			precoTotal += produto.getPreco();
		}
		return precoTotal;
	}

}
