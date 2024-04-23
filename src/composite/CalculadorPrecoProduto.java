package composite;

public class CalculadorPrecoProduto {

	public static void main(String[] args) {
		ProdutoSimples mouse = new ProdutoSimples("Mouse", 20.0);
		ProdutoSimples teclado = new ProdutoSimples("Teclado", 30.0);
		ProdutoSimples monitorBase = new ProdutoSimples("Base do monitor", 10.0);
		ProdutoSimples monitor = new ProdutoSimples("Monitor", 15.0);
		
		ProdutoComposto monitorCompleto = new ProdutoComposto("Monitor montado");
		monitorCompleto.adicionarComponente(monitor);
		monitorCompleto.adicionarComponente(monitorBase);
		
		ProdutoComposto computador = new ProdutoComposto("Computador");
		computador.adicionarComponente(monitorCompleto);
		computador.adicionarComponente(mouse);
		computador.adicionarComponente(teclado);
		
		System.out.println(computador.getPreco());
	}
}
