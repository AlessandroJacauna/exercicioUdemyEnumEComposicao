package entidade;

public class ItensDoPedido {
	
	private Integer quantidade;
	private Double preco;
	private Produtos produto;
	
	public ItensDoPedido() {
	}

	public ItensDoPedido(Integer quantidade, Double preco, Produtos produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public double subTotal() {
		double soma = preco * quantidade;
		return soma;
	}
	
	@Override
	public String toString() {
		return produto + " Quantidade: " + quantidade + " Subtotal: R$" + String.format("%.2f", subTotal()); 
	}

//	public List<Produtos> getProduto() {
//		return produto;
//	}
//	
//	public void addProdutos(Produtos produto) {
//		this.produto.add(produto);
//	}
//	
//	public void removeProdutos(Produtos produto) {
//		this.produto.remove(produto);
//	}
//	

}
