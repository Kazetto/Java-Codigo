package PalindromoPalavra;

import java.util.Scanner;

import TiposPilhaSequencial.TipoPilhaChar;


public class PositivoPalidromo {

	public static void main(String[] args) {

		Scanner le = new Scanner(System.in);

		TipoPilhaChar pilha = new TipoPilhaChar();
		pilha.init();

		char palavra[] = new char[pilha.N];
		char inverso[] = new char[pilha.N];

		System.out.println("Valor Palavra: ");
		String word = le.next();

		for(int i = 0;i <word.length();i++ ){
			palavra[i] = word.charAt(i);
			pilha.push(palavra[i]);
			
		}

		int x = 0;

		while (!pilha.isEmpty()) {
			inverso[x] = pilha.pop();
			x++;
		}

		boolean palindromo = true;

		for (int i = 0; i < x; i++) {
			if (palavra[i] != inverso[i])
				palindromo = false;
		}

		if (palindromo)
			System.out.println("É palíndromo");
		else
			System.out.println("Não é um palíndromo");
		
		le.close();
	}

}
