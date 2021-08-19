package Teste;

import TiposPilhaSequencial.TipoPilhaInt;

public class MainTeste {

	public static void main(String[] args) {

		TipoPilhaInt stack = new TipoPilhaInt();

		stack.init();

		stack.push(10);
		stack.push(12);
		System.out.println("Valor retirado da pilha: " + stack.pop());
		System.out.println("Valor que está no topo da pilha " + stack.top());

		
		stack.push(23);
		stack.push(33);
		stack.push(44);
		stack.push(55);
		stack.push(66);
		stack.push(77);
		
		
		System.out.println("\t Retirando tds os elementos da pilha");
	
		stack.esvaziar();
		
		
	}

}
