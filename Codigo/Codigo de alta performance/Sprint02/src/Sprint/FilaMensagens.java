package Sprint;

public class FilaMensagens {

	public final int N = 50;
	Mensagem[] dados = new Mensagem[N];
	int ini, fim, cont;

	public void init() {
		ini = fim = cont = 0;
	}

	public boolean isEmpty() {
		return (cont == 0);
	}

	public boolean isFull() {
		return (cont == N);
	}

	public void enqueue(Mensagem m) {
		if (isFull())
			System.out.println("Fila Cheia!");
		else {
			dados[fim] = m;
			cont++;
			fim = (fim + 1) % N;
		}
	}

	public Mensagem dequeue() {
		Mensagem valor = dados[ini];
		cont--;
		ini = (ini + 1) % N;
		return (valor);
	}

	public Mensagem first() {
		return dados[ini];
	}

}
