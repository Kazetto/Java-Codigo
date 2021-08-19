package TiposPilhaSequencial;

import tipoAluno.TipoAluno;

public class TipoPilhaAluno {

	public final int N = 10;
	TipoAluno dados[] = new TipoAluno[N];
	int topo;

	public void init() {
		topo = 0;
	}

	public boolean isEmpty() {
		if(topo == 0)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(topo == N)
			return true;
		else
			return false;
	}
	
	public void push(TipoAluno valor) {
		if(isFull() == false) {
		dados[topo] = valor;
		topo++;
		
		}
		else
			System.out.println("Stack overflow");
	}
	public TipoAluno pop() {
		topo--;
		return dados[topo];
	}
	
	public TipoAluno top() {
		return dados[topo-1];
	}
	
	public void esvaziar() {
		
		while(!isEmpty())
			System.out.println("\t Valor retirado da pilha: "+ pop());
	}
	
}
