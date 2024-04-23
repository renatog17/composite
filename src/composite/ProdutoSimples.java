package composite;

public class ProdutoSimples implements Produto {

	private String nome;
	private Double preco;

	public ProdutoSimples(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public Double getPreco() {
		// TODO Auto-generated method stub
		return this.preco;
	}
}
