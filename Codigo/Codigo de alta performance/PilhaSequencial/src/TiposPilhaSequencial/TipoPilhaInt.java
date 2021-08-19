package TiposPilhaSequencial;

public class TipoPilhaInt {

	public final int N = 10;
	int dados[] = new int[N];
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
	
	public void push(int valor) {
		if(isFull() == false) {
		dados[topo] = valor;
		topo++;
		
		}
		else
			System.out.println("Stack overflow");
	}
	public int pop() {
		topo--;
		return dados[topo];
	}
	
	public int top() {
		return dados[topo-1];
	}
	
	public void esvaziar() {
		
		while(!isEmpty())
			System.out.println("\t Valor retirado da pilha: "+ pop());
	}
	
	
}
