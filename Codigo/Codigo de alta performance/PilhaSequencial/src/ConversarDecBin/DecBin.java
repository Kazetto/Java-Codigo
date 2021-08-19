package ConversarDecBin;

import java.util.Scanner;

import TiposPilhaSequencial.TipoPilhaInt;



public class DecBin {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		TipoPilhaInt restos = new TipoPilhaInt();
		restos.init();
		
		System.out.println("Valor decimal: ");
		int decimal = leitor.nextInt();
		
		while (decimal != 0) {
			int resto = decimal % 2;
			restos.push(resto);
			decimal = decimal /2;
		}
		System.out.println("\t Valorem binário é: ");
		while(!restos.isEmpty()) {
			System.out.println(restos.pop()+ " ");
		}
			
		
		
		leitor.close();
	}
}
