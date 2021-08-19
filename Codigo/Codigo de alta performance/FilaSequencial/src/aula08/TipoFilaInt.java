package aula08;

public class TipoFilaInt {
	public final int N = 3;
	int dados[] = new int[N];
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

	public void enqueue(int valor) {
		if (isFull())
			System.out.println("Fila Cheia!!!");
		else {
			dados[fim] = valor;
			cont++;
			fim = (fim + 1) % N;
//			fim++;
//			if(fim==N)
//				fim = 0;
		}

	}
	
	public int first() {
		return dados[ini-1];
	}
	

	public int dequeue() {
		int valor = dados[ini];
		cont--;
		ini = (ini + 1) % N;
		return (valor);
	}

}

