package TiposPilhaSequencial;

public class TipoPilhaChar {

	public final int N = 10;
	char dados[] = new char[N];
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
	
	public void push(char valor) {
		if(isFull() == false) {
		dados[topo] = valor;
		topo++;
		
		}
		else
			System.out.println("Stack overflow");
	}
	public char pop() {
		topo--;
		return dados[topo];
	}
	
	public char top() {
		return dados[topo-1];
	}
	
	public void esvaziar() {
		
		while(!isEmpty())
			System.out.println("\t Valor retirado da pilha: "+ pop());
	}
	
	
}
