package pilhaInteiro;

import java.util.Scanner;

import TiposPilhaSequencial.TipoPilhaInt;

public class PositivoPalidromo {

	public static void main(String[] args) {

		Scanner le = new Scanner(System.in);

		TipoPilhaInt pilha = new TipoPilhaInt();
		pilha.init();

		int numero[] = new int[pilha.N];
		int inverso[] = new int[pilha.N];

		System.out.println("Valor inteiro: ");
		int valor = le.nextInt();

		
		for(int i=0; (valor >= 0);i++) {
			numero[i] = valor;
			pilha.push(valor);
			System.out.println("Valor inteiro: ");
			valor = le.nextInt();
			
		}

		int x = 0;

		while (!pilha.isEmpty()) {
		
			inverso[x] = pilha.pop();
			System.out.println(numero[x]);
			x++;
			
		}

		boolean palindromo = true;

		for (int i = 0; i < x; i++) {
			System.out.println(numero[i]);
			
			if (numero[i] != inverso[i])
				palindromo = false;
		}

		if (palindromo) {
			System.out.println("É palíndromo");
			
		}else
			System.out.println("Não é um palíndromo");
		
	}

}
