package pilhaSequencial;

public class Usuario {
	int id;
	String nome;
	
	PilhaMensagens stack = new PilhaMensagens();
	
	public Usuario(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public void enviaMsg(String msg) {
		stack.enviaMsg(msg);
		
	}


	public String getStatus() {
		if(stack.isEmpty()==true) {
		
		return "ok";
		}else {
			return "não ok";
		}
	}


	public void leMsg() {
		stack.leiaMsg();
		
	}

	
	

	
	

	
	

	
	
}
