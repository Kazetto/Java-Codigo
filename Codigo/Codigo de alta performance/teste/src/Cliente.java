
public class Cliente {

	int idCliente;
	String bairroCliente;
	int quantidadeCliente;
	String modelo;

	

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getBairroCliente() {
		return bairroCliente;
	}

	public void setBairroCliente(String bairroCliente) {
		this.bairroCliente = bairroCliente;
	}

	public int getQuantidadeCliente() {
		return quantidadeCliente;
	}

	public void setQuantidadeCliente(int quantidadeCliente) {
		this.quantidadeCliente = quantidadeCliente;
	}

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Cliente(int idCliente, String bairroCliente, int quantidadeCliente, String modelo) {
		super();
		this.idCliente = idCliente;
		this.bairroCliente = bairroCliente;
		this.quantidadeCliente = quantidadeCliente;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return " idCliente:" + idCliente + "\n Bairro: " + bairroCliente + "\n Quantidade: "
				+ quantidadeCliente + "\n Modelo: " + modelo + "\n";
	}

}
