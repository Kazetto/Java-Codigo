package pilhaSequencial;

import pilhaSequencial.Usuario;


public class PilhaMensagens {
	
	// Armazena dados da mensagens em um vetor
	
	
	public final int N = 10;
	String dados[] = new String[N];
	int topo=0;
	
	
	
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
	
		

	public void enviaMsg(String valor) {
		if (!isFull()) {
			dados[topo] = valor;
			topo++;
		}
		else
			System.out.println("Stack Overflow");
	}

	
	public void leiaMsg() {
		
		for (int i = topo - 1; i >= 0; i--) {
			System.out.println("Mensagem enviada: "+ dados[i]);
			System.out.println("                  "+"Problema resolvido");
		}
			
	}
	
	
}
