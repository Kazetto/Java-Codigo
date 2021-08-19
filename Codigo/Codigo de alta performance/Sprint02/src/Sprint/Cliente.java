package Sprint;

public class Cliente {

	int id;
	String nome;
	
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

	public Cliente(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public String toString() {
        return "Cliente: " + nome +"\n" + "ID: "+ id;
    }
	
	
}
