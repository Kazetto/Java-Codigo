package exercicios;

import java.util.Scanner;

import filasEncadeadas.FilaInt;

public class Exer1 {

	public static void main(String[] args) {

		FilaInt fila = new FilaInt();
		fila.init();
		Scanner leitor = new Scanner(System.in);
		// fila.enqueue(1);
		// System.out.println(fila.dequeue());
		int numero;

		System.out.println("Digitar o valor numero inteiro");
		numero = leitor.nextInt();

		while (numero >= 0) {
			fila.enqueue(numero);
			System.out.println("Digitar o valor numero inteiro");
			numero = leitor.nextInt();
		}

		if (!fila.isEmpty())
			System.out.println(fila.dequeue());

	}

}
