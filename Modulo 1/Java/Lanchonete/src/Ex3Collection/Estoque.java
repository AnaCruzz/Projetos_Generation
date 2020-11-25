

package Ex3Collection;

public class Estoque {
	private String nomeProduto;
	private int quantidade;
	private String localizacao;
	private double preco;
	
	public Estoque(String nomeProduto, int quantidade, String localizacao, double preco) {
		super();
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.localizacao = localizacao;
		this.preco = preco;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Estoque [nomeProduto=" + nomeProduto + "]" + "[quantidade="+ quantidade+"]";
	}
	
	public void calculaQuantidade(int quantidade) {
		this.quantidade -= quantidade;
	}

}
