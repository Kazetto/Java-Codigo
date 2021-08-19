
package porto;

import tipoConteiner.TipoContainer;

public class TipoPilhaConteiner {

	public final int N = 6;
	int dados[] = new int[N];
	int topo;
	int ini, fim;

	public void init() {

		ini = fim = 0;

	}

	public boolean isEmpty() {
		if (topo == 0)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (topo == N)
			return true;
		else
			return false;
	}

	public void push(int valor) {
		if (isFull() == false) {
			dados[topo] = valor;
			topo++;

		} else
			System.out.println("Stack overflow");
	}

	public int pop() {
		topo--;
		return dados[topo];
	}

	public int top() {
		return dados[topo - 1];
	}

	public void esvaziar() {

		while (!isEmpty())
			;

	}

	public void ocupacao01(int vetor[],int contador ) {
		System.out.println("\n ************* Ocupação das pilhas de conteineres ****************** ");
		System.out.println("Pilha #1");

		for (int i = topo - 1; i >= 0; i--)
			System.out.println("       " + i + "]: " +"[contMove= "+ contador+", idConteiner=" + vetor[i]);
	}

	public void ocupacao02(int vetor[],int contador) {
		System.out.println("\n ************* Ocupação das pilhas de conteineres ****************** ");
		System.out.println("Pilha #2");
	
		for (int i = topo - 1; i >= 0; i--)
			System.out.println("       " + i + "]: " +"[contMove= "+ contador+", idConteiner=" + vetor[i]);
	}

	public void show(int vetor[],int contador) {
		System.out.println("Pilha #1");
		System.out.println("topo-> " + topo + "]: ");
		for (int i = topo - 1; i >= 0; i--)
			System.out.println("       " + i + "]: " +"[contMove= "+ contador+", idConteiner=" + vetor[i]);
	}

	public void show02(int vetor[],int contador) {
		System.out.println("Pilha #1");
		System.out.println("topo-> " + topo + "]: ");
		for (int i = topo - 1; i >= 0; i--)
			System.out.println("       " + i + "]: " +"[contMove= "+ contador+", idConteiner=" + vetor[i]);
	}

	public void planilha(int vetor[]) {
		System.out.println("\n********** Planilha de conteiners (pilha 1) **************");

		for (int i = 0; i <= vetor[i]; i++)
			System.out.println(vetor[i]);

	}

	public void planilha02(int vetor[]) {
		System.out.println("\n********** Planilha de conteiners (pilha 2) **************");

		for (int i = 0; i <= vetor[i]; i++)
			System.out.println(vetor[i]);

	}

	public void remove(int[] pilha01) {
		for (int i = 0; i < fim; i++)
			dados[i] = dados[i + 1];
		ini--;
		fim--;
	}

	public boolean busca(int x, int vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == x) {
				return true;
			}
		}
		return false;
	}

}
