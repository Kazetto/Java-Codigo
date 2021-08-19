package Sprint;

public class Mensagem {

	Cliente cliente;
	String msg;

	public Cliente getCliente() {
		return cliente;
	}

	public String getMsg() {
		return msg;
	}

	public Mensagem(Cliente cliente, String msg) {
		super();
		this.cliente = cliente;
		this.msg = msg;
	}

}
