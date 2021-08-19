
public class PontoDeVenda{
	String loja;
	String bairro;
	int estoque;

	public PontoDeVenda(String loja, String bairro, int estoque) {
		super();
		this.loja = loja;
		this.bairro = bairro;
		this.estoque = estoque;
	}

	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	@Override
	public String toString() {
		return "loja: " + loja + "----- bairro: " + bairro + "----- estoque: " + estoque + "\n";
	}

}
