package filasEncadeadas;

public class FilaInt {
	
	private class NO{
			int dado; //supondo fila armazena valor inteiro
			NO prox;
 	}
	
	private NO ini, fim;
	
	public void init() {
		ini = fim = null;
	}
	
	public boolean isEmpty() {
		return (ini==null && fim==null);
	}
	
	public void enqueue(int valor) {
		NO novo = new NO();
		novo.dado = valor;
		novo.prox = null;
		if(isEmpty())
			ini = novo;
		else
			fim.prox = novo;
		fim = novo;
		
	}

	public int dequeue() {
		int v = ini.dado;
		ini = ini.prox;
		return v;
	}
	
}

